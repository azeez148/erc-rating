package com.nest.erc.java.template.engine.utils;

import java.io.IOException;

import org.springframework.stereotype.Component;

import freemarker.template.Configuration;
import freemarker.template.Template;

@Component
public class BaseControllerListenerTemplate {
	private static BaseControllerListenerTemplate instance = null;
	private Template engine = null;
	
	private BaseControllerListenerTemplate() {
		freemarker.template.Configuration cfg = new Configuration();
		cfg.setClassForTemplateLoading(this.getClass(), "/templates/");
		try {
			engine = cfg.getTemplate("baseControllerListener.ftl");
									  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public Template getEngine() {
        return engine;
    }

    public static BaseControllerListenerTemplate getInstance()  {
        if (instance == null) {
        	instance = new BaseControllerListenerTemplate();
        } 

        return instance;
    }

}
