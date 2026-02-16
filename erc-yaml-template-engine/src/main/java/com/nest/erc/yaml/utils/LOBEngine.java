package com.nest.erc.yaml.utils;

import java.io.IOException;

import org.springframework.stereotype.Component;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateNotFoundException;

@Component
public class LOBEngine {

	private static LOBEngine instance = null;
	private Template engine = null;
	
	private LOBEngine() {
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_29);
		cfg.setClassForTemplateLoading(this.getClass(), "/templates/");
		
		try {
			engine = cfg.getTemplate("LOB.ftl");
		} catch (TemplateNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Template getEngine() {
        return engine;
    }

    public static LOBEngine getInstance()  {
        if (instance == null) {
        	instance = new LOBEngine();
        } 

        return instance;
    }
}
