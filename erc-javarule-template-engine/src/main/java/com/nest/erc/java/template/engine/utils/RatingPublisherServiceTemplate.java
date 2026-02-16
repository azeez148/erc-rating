package com.nest.erc.java.template.engine.utils;

import java.io.IOException;

import org.springframework.stereotype.Component;

import freemarker.template.Configuration;
import freemarker.template.Template;

@Component
public class RatingPublisherServiceTemplate {
	private static RatingPublisherServiceTemplate instance = null;
	private Template engine = null;
	
	private RatingPublisherServiceTemplate() {
		freemarker.template.Configuration cfg = new Configuration();
		cfg.setClassForTemplateLoading(this.getClass(), "/templates/");
		try {
			engine = cfg.getTemplate("ratingPublisherService.ftl");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public Template getEngine() {
        return engine;
    }

    public static RatingPublisherServiceTemplate getInstance()  {
        if (instance == null) {
        	instance = new RatingPublisherServiceTemplate();
        } 

        return instance;
    }

}
