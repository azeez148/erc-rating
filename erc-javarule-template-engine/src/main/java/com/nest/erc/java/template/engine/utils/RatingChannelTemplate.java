package com.nest.erc.java.template.engine.utils;

import java.io.IOException;

import org.springframework.stereotype.Component;

import freemarker.template.Configuration;
import freemarker.template.Template;

@Component
public class  RatingChannelTemplate{

	private static RatingChannelTemplate instance = null;
	private Template engine = null;
	
	private RatingChannelTemplate() {
		freemarker.template.Configuration cfg = new Configuration();
		cfg.setClassForTemplateLoading(this.getClass(), "/templates/");
		try {
			engine = cfg.getTemplate("rateChannel.ftl");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public Template getEngine() {
        return engine;
    }

    public static RatingChannelTemplate getInstance()  {
        if (instance == null) {
        	instance = new RatingChannelTemplate();
        } 

        return instance;
    }


}
