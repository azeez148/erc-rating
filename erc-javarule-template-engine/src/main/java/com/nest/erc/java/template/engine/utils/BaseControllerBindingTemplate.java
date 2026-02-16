package com.nest.erc.java.template.engine.utils;

import java.io.IOException;

import org.springframework.stereotype.Component;

import freemarker.template.Configuration;
import freemarker.template.Template;

@Component
public class BaseControllerBindingTemplate {
	private static BaseControllerBindingTemplate instance = null;
	private Template engine = null;
	
	private BaseControllerBindingTemplate() {
		freemarker.template.Configuration cfg = new Configuration();
		cfg.setClassForTemplateLoading(this.getClass(), "/templates/");
		try {
			engine = cfg.getTemplate("baseControllerBinding.ftl");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public Template getEngine() {
        return engine;
    }

    public static BaseControllerBindingTemplate getInstance()  {
        if (instance == null) {
        	instance = new BaseControllerBindingTemplate();
        } 

        return instance;
    }
}
