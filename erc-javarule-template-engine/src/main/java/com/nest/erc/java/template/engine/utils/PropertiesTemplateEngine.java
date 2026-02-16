package com.nest.erc.java.template.engine.utils;

import java.io.IOException;

import org.springframework.stereotype.Component;

import freemarker.template.Configuration;
import freemarker.template.Template;

@Component
public class PropertiesTemplateEngine {
	
	private static PropertiesTemplateEngine instance = null;
	private Template engine = null;
	
	private PropertiesTemplateEngine() {
		@SuppressWarnings("deprecation")
		freemarker.template.Configuration cfg = new Configuration();
		cfg.setClassForTemplateLoading(this.getClass(), "/templates/");
		try {
			engine = cfg.getTemplate("applicationproperties.ftl");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Template getEngine() {
        return engine;
    }

    public static PropertiesTemplateEngine getInstance()  {
        if (instance == null) {
        	instance = new PropertiesTemplateEngine();
        } 

        return instance;
    }

}
