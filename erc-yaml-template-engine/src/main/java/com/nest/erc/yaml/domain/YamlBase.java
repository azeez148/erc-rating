package com.nest.erc.yaml.domain;

import java.io.Serializable;

public class YamlBase implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5221258136597741771L;
	private String schema_version;
	private Product product;
	
	
	public YamlBase() {
		
	}
	public YamlBase(YamlBase yamlBase) {
		this.product = yamlBase.getProduct();
		this.schema_version = yamlBase.getSchema_version();		
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getSchema_version() {
		return schema_version;
	}
	public void setSchema_version(String schema_version) {
		this.schema_version = schema_version;
	}

}
