package com.nest.res.bop.al01012026.mq.subscribe;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

import com.nest.res.bop.al01012026.mq.subscribe.BaseControllerListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FilePoller {

    @Value("${file.input.dir:./filemq/input/}")
    private String inputDir;
    @Value("${file.processed.dir:./filemq/processed/}")
    private String processedDir;
    @Value("${file.error.dir:./filemq/error/}")
    private String errorDir;

    @Autowired
    private BaseControllerListener baseControllerListener;

    @Scheduled(fixedDelayString = "${file.poll.ms:5000}")
    public void poll() {
        try {
            Path inDir = Paths.get(inputDir);
            if (!Files.exists(inDir)) {
                Files.createDirectories(inDir);
            }
            Path procDir = Paths.get(processedDir);
            if (!Files.exists(procDir)) {
                Files.createDirectories(procDir);
            }
            Path errDir = Paths.get(errorDir);
            if (!Files.exists(errDir)) {
                Files.createDirectories(errDir);
            }

            try (DirectoryStream<Path> stream = Files.newDirectoryStream(inDir)) {
                for (Path entry : stream) {
                    if (Files.isRegularFile(entry)) {
                        try {
                            byte[] bytes = Files.readAllBytes(entry);
                            String content = new String(bytes, StandardCharsets.UTF_8);
//                            System.out.println("******** content >> " + content);
                            baseControllerListener.processPolicyXml(content);
                            Path dest = procDir.resolve(entry.getFileName().toString() + ".processed_" + System.currentTimeMillis() + "_" + UUID.randomUUID());
                            Files.move(entry, dest, StandardCopyOption.ATOMIC_MOVE);
                        } catch (Exception e) {
                            Path dest = errDir.resolve(entry.getFileName().toString() + ".error_" + System.currentTimeMillis() + "_" + UUID.randomUUID());
                            try {
                                Files.move(entry, dest, StandardCopyOption.ATOMIC_MOVE);
                            } catch (IOException ex) {
                                // best-effort
                                ex.printStackTrace();
                            }
                            e.printStackTrace();
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

