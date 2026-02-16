package com.nest.erc.domain.alg.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;

/**
 * Class for storing the LOB element details
 * 
 * @author
 *
 */
public class Lob extends XmlElement implements XmlConstruct {
	private String name;
	private String ratebookId;
	private String version;
	private String parentName;
	private String assemblyId;
	private List<Reference> references;

	public List<Reference> getReferences() {
		return references;
	}

	public void setReferences(List<Reference> references) {
		this.references = references;
	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setName(attribs.getOrDefault("name",null));
		this.setRatebookId(attribs.getOrDefault("RatebookId",null));
		this.setVersion(attribs.getOrDefault("Version",null));
		this.setParentName(attribs.getOrDefault("ParentName",null));
		this.setAssemblyId(attribs.getOrDefault("AssemblyId",null));
	}

	public Reference getReferenceFromDbTablesAndType(String dbTables, String type) {
		if(null != type && type.equals("Policy Indicator")) {
			for (Reference reference : references) {
				if (type.equals(reference.getType())) {
					return reference;
				}
			}
		}else {
			for (Reference reference : references) {
				if (dbTables.equals(reference.getDbTables()) && type.equals(reference.getType())) {
					return reference;
				}
			}
		}
		return null;

	}
	public Reference getReferenceFromNameAndType(String name, String type) {
		for (Reference reference : references) {
			//System.out.println("Reference Name :" + reference.getName() + "Reference Type :" + reference.getType() );
			if (name.equals(reference.getName()) && type.equals(reference.getType())) {
				return reference;
			}
		}
		return null;

	}

	public void addChildren(XmlConstruct xmlConstruct) {
		if (xmlConstruct instanceof Reference) {
			if (this.getReferences() == null) {
				this.setReferences(new ArrayList<Reference>());
			}
			xmlConstruct.setParent(this);
			this.getReferences().add((Reference) xmlConstruct);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRatebookId() {
		return ratebookId;
	}

	public void setRatebookId(String ratebookId) {
		this.ratebookId = ratebookId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getAssemblyId() {
		return assemblyId;
	}

	public void setAssemblyId(String assemblyId) {
		this.assemblyId = assemblyId;
	}

}
