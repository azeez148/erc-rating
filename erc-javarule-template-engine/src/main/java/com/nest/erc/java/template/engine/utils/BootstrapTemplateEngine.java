package com.nest.erc.java.template.engine.utils;

import java.io.IOException;

import org.springframework.stereotype.Component;

import freemarker.template.Configuration;
import freemarker.template.Template;

@Component
public class BootstrapTemplateEngine {

	
	private static BootstrapTemplateEngine instance = null;
	private Template engine = null;
	
	private BootstrapTemplateEngine() {
		@SuppressWarnings("deprecation")
		freemarker.template.Configuration cfg = new Configuration();
		cfg.setClassForTemplateLoading(this.getClass(), "/templates/");
		try {
			engine = cfg.getTemplate("bootstrapproperties.ftl");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Template getEngine() {
        return engine;
    }

    public static BootstrapTemplateEngine getInstance()  {
        if (instance == null) {
        	instance = new BootstrapTemplateEngine();
        } 

        return instance;
    }


}
