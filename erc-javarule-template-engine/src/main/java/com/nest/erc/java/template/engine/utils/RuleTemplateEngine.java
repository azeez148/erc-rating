package com.nest.erc.java.template.engine.utils;

import java.io.IOException;

import org.springframework.stereotype.Component;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateNotFoundException;

@Component
public class RuleTemplateEngine {
	
	private static RuleTemplateEngine instance = null;
	private Template engine = null;
	
	private RuleTemplateEngine() {
		@SuppressWarnings("deprecation")
		freemarker.template.Configuration cfg = new Configuration();
		cfg.setClassForTemplateLoading(this.getClass(), "/templates/");
		try {
			
			engine = cfg.getTemplate("ruleClass.ftl");
		} catch (TemplateNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Template getEngine() {
        return engine;
    }

    public static RuleTemplateEngine getInstance()  {
        if (instance == null) {
        	instance = new RuleTemplateEngine();
        } 

        return instance;
    }

}
