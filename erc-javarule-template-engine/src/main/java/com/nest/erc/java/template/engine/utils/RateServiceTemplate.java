package com.nest.erc.java.template.engine.utils;

import java.io.IOException;

import org.springframework.stereotype.Component;

import freemarker.template.Configuration;
import freemarker.template.Template;

@Component
public class RateServiceTemplate {
	private static RateServiceTemplate instance = null;
	private Template engine = null;
	
	private RateServiceTemplate() {
		freemarker.template.Configuration cfg = new Configuration();
		cfg.setClassForTemplateLoading(this.getClass(), "/templates/");
		try {
			engine = cfg.getTemplate("rateService.ftl");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public Template getEngine() {
        return engine;
    }

    public static RateServiceTemplate getInstance()  {
        if (instance == null) {
        	instance = new RateServiceTemplate();
        } 

        return instance;
    }
}
