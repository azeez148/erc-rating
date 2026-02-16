package com.nest.erc.domain.alg.impl.expressional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.alg.inter.Expressional;
import com.nest.erc.domain.alg.impl.Argument;
import com.nest.erc.domain.alg.impl.XmlElement;

public class Ratetable extends XmlElement implements Expressional {
	String code;
	List<Argument> args;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Argument> getArgs() {
		return args;
	}

	public void setArgs(List<Argument> args) {
		this.args = args;
	}

	public void addChildren(XmlConstruct xmlConstruct) {
		if (xmlConstruct instanceof Argument) {
			if (this.getArgs() == null) {
				this.setArgs(new ArrayList<Argument>());
			}
			xmlConstruct.setParent(this);
			this.getArgs().add((Argument) xmlConstruct);
		}

	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setCode(attribs.getOrDefault("code",null));
	}

}
