package com.nest.erc.yaml.domain;

public class RiskFieldDefaultValue {

	private RiskFieldDefaultString fieldDefaultString;

	public RiskFieldDefault getFieldDefault(String type) {
		if(type.equals("String")){
			return fieldDefaultString;

		}
		return fieldDefaultString;
	
	}

	public void setFieldDefault(RiskFieldDefault fieldDefault,String type) {
		if(type.equals("String")) {
			this.fieldDefaultString =(RiskFieldDefaultString) fieldDefault;
		}
	}


}
