package com.remove.ee.pack;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import javax.xml.stream.XMLStreamException;

import org.apache.commons.lang3.StringUtils;

import com.nest.erc.domain.reader.xml.impl.XmlStaxParser;

public class TestClass {
	public static void main(String args[])  {
		
		try {
			//getAllSubElements();
			//getStartElementProcessor();
			//getIfElse();
			//getParentElements();
			//generateAddChildMethods();
			//stackReturn();
			//generateDetailsExtraxtor();
			System.out.println("Testing matches:"+"asjhdghg787%%bh".matches("[A-Za-z0-9]*"));
			System.out.println("Testing matches:"+"asjhdghg787bh".matches("[A-Za-z0-9]*"));
			Map<String, String> algTypeToJavaType = new HashMap<String, String>();
			algTypeToJavaType.put("xsd:short", "int");
			algTypeToJavaType.put("xsd:unsignedByte", "String");
			algTypeToJavaType.put("xsd:string", "String");
			
			//algTypeToJavaType.getOrDefault(key, defaultValue)
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	static void getAllReferenceType() throws FileNotFoundException, XMLStreamException {
		XmlStaxParser xmlParser = new XmlStaxParser();
		xmlParser.setInputFile("/Users/user1/git/AREC/AREC/inputs/ALG-BP-AL-09012019-V01_MR.xml");
		Set<String> referenceType = new HashSet<String>();
		while (xmlParser.hasNext()) {
			xmlParser.getNext();
			if (xmlParser.isStartElement()) {
				xmlParser.getStartElement();
				String qName = xmlParser.getStartElementName();
				Map<String, String> attribs = xmlParser.getXmlElmentAttributeValue();
				if(qName.equals("reference")) {
					referenceType.add(attribs.get("type"));
				}
			} else if (xmlParser.isEndElement()) {
				
			} else if (xmlParser.isCharacters()) {
				
			}
		}
		System.out.println(referenceType);
	}
	
	
	static void getAllSubElements() throws FileNotFoundException, XMLStreamException {
		XmlStaxParser xmlParser = new XmlStaxParser();
		xmlParser.setInputFile("/Users/user1/Downloads/Algorithm_Schema.xsd");
		Set<String> attributeTypes = new HashSet<String>();
		boolean isInMainElement = false;
		boolean isSubElement = false;
		
		
		Map<String, String> algTypeToJavaType = new HashMap<String, String>();
		algTypeToJavaType.put("xsd:short", "int");
		algTypeToJavaType.put("xsd:unsignedByte", "String");
		algTypeToJavaType.put("xsd:string", "String");
		

		while (xmlParser.hasNext()) {
			xmlParser.getNext();
			
			if (xmlParser.isStartElement()) {
				xmlParser.getStartElement();
				String qName = xmlParser.getStartElementName();
				Map<String, String> attribs = xmlParser.getXmlElmentAttributeValue();
				
				if(qName.equals("element")  && attribs.containsKey("name")) {
					System.out.println("class "+StringUtils.capitalize(attribs.get("name"))+":");
				}
				
				if(qName.equals("element")  && attribs.containsKey("ref")) {
					//System.out.println("\t"+attribs.get("ref"));
					System.out.println("\tprivate List<"+StringUtils.capitalize(attribs.get("ref"))+"> "+attribs.get("ref")+"s;");
				}
				
				if(qName.equals("attribute") && attribs.containsKey("name")) {
					if(attribs.containsKey("type")) {
						System.out.println("\tprivate "+algTypeToJavaType.get(attribs.get("type"))+" "+attribs.get("name")+";");
					}
					else {
						System.out.println("\tprivate "+"***NO_TYPE***"+" "+attribs.get("name")+";");
					}
					
				}
				/*
				if(!isInMainElement && qName.equals("element")  && attribs.containsKey("name")) {
					System.out.println("class "+attribs.get("name")+":");
					isInMainElement = true;
				}
				if(isInMainElement && (qName.equals("sequence") || qName.equals("choice"))) {
					isSubElement = true;
				}
				if(isSubElement && qName.equals("element") && attribs.containsKey("ref") ) {
					System.out.println("\t"+attribs.get("ref"));
				}
				*/
				
			} else if (xmlParser.isEndElement()) {
				/*
				xmlParser.getEndElement();
				String qName = xmlParser.getStartElementName();
				if(isSubElement && (qName.equals("sequence") || qName.equals("choice"))) {
					isSubElement = false;
				}
				if(!isSubElement && qName.equals("element") ) {
					isInMainElement = false;
				}*/
			} else if (xmlParser.isCharacters()) {
				
			}
		}
	}
	
	
	
	static void getAttributesType() throws FileNotFoundException, XMLStreamException {
		XmlStaxParser xmlParser = new XmlStaxParser();
		xmlParser.setInputFile("/Users/user1/Downloads/Algorithm_Schema.xsd");
		Set<String> attributeTypes = new HashSet<String>();
		boolean isInMainElement = false;
		boolean isSubElement = false;
		

		while (xmlParser.hasNext()) {
			xmlParser.getNext();
			
			if (xmlParser.isStartElement()) {
				xmlParser.getStartElement();
				String qName = xmlParser.getStartElementName();
				Map<String, String> attribs = xmlParser.getXmlElmentAttributeValue();
				/*
				if(!isInMainElement && qName.equals("element")  && attribs.containsKey("name")) {
					System.out.println(attribs.get("name"));
				}
				if(isInMainElement && qName.equals("element")  && attribs.containsKey("name")) {
					System.out.println(attribs.get("name"));
				}*/
				if(!isInMainElement && qName.equals("attribute")  && attribs.containsKey("type")) {
					attributeTypes.add(attribs.get("type"));
				}
				
			} else if (xmlParser.isEndElement()) {
				
			} else if (xmlParser.isCharacters()) {
				
			}
		}
		System.out.println(attributeTypes);
	}
	
	
	static void getStartElementProcessor() throws FileNotFoundException, XMLStreamException {
		XmlStaxParser xmlParser = new XmlStaxParser();
		xmlParser.setInputFile("/Users/user1/Downloads/Algorithm_Schema.xsd");
		
		
		
		Map<String, String> algTypeToJavaType = new HashMap<String, String>();
		algTypeToJavaType.put("xsd:short", "int");
		algTypeToJavaType.put("xsd:unsignedByte", "String");
		algTypeToJavaType.put("xsd:string", "String");
		String classz = null;

		while (xmlParser.hasNext()) {
			xmlParser.getNext();
			
			if (xmlParser.isStartElement()) {
				xmlParser.getStartElement();
				String qName = xmlParser.getStartElementName();
				Map<String, String> attribs = xmlParser.getXmlElmentAttributeValue();
				/*
				public void processLobStartElement(String qName, Map<String, String> attribs) {
					Lob lob = new Lob();
					lob.setName(attribs.get("name"));
					lob.setRatebookId(attribs.get("RatebookId"));
					lob.setVersion(attribs.get("Version"));
					lob.setParentName(attribs.get("ParentName"));
					lob.setAssemblyId(attribs.get("AssemblyId"));
					elements.push(lob);
				}
				*/
				if(qName.equals("element")  && attribs.containsKey("name")) {
					//System.out.println("class "+StringUtils.capitalize(attribs.get("name"))+":");
					System.out.println("public void process"+StringUtils.capitalize(attribs.get("name"))+"StartElement(String qName, Map<String, String> attribs) {");
					System.out.println("\t"+StringUtils.capitalize(attribs.get("name"))+" "+StringUtils.uncapitalize(attribs.get("name"))+" = new "+StringUtils.capitalize(attribs.get("name"))+"();");
					classz = StringUtils.uncapitalize(attribs.get("name"));
				}
				
				if(qName.equals("element")  && attribs.containsKey("ref")) {
					//System.out.println("\t"+attribs.get("ref"));
					//System.out.println("\tprivate List<"+StringUtils.capitalize(attribs.get("ref"))+"> "+attribs.get("ref")+"s;");
				}
				
				if(qName.equals("attribute") && attribs.containsKey("name")) {
					if(attribs.containsKey("type")) {
						//System.out.println("\tprivate "+algTypeToJavaType.get(attribs.get("type"))+" "+attribs.get("name")+";");
						System.out.println("\t"+classz+".set"+StringUtils.capitalize(attribs.get("name"))+"(attribs.get(\""+attribs.get("name")+"\"));");
					}
					else {
						System.out.println("\t"+classz+".set"+StringUtils.capitalize(attribs.get("name"))+"(attribs.get(\""+attribs.get("name")+"\"));");
					}
					
				}
				
				
			} else if (xmlParser.isEndElement()) {
				
			} else if (xmlParser.isCharacters()) {
				
			}
		}
	}
	
	
	
	static void getIfElse() throws FileNotFoundException, XMLStreamException {
		XmlStaxParser xmlParser = new XmlStaxParser();
		xmlParser.setInputFile("/Users/user1/Downloads/Algorithm_Schema.xsd");
		
		
		
		Map<String, String> algTypeToJavaType = new HashMap<String, String>();
		algTypeToJavaType.put("xsd:short", "int");
		algTypeToJavaType.put("xsd:unsignedByte", "String");
		algTypeToJavaType.put("xsd:string", "String");
		String classz = null;

		while (xmlParser.hasNext()) {
			xmlParser.getNext();
			
			if (xmlParser.isStartElement()) {
				xmlParser.getStartElement();
				String qName = xmlParser.getStartElementName();
				Map<String, String> attribs = xmlParser.getXmlElmentAttributeValue();
				/*
				if ("LOB".equals(qName)) {
					processLobStartElement(qName, attribs);
				}
				*/
				if(qName.equals("element")  && attribs.containsKey("name")) {
					//System.out.println("class "+StringUtils.capitalize(attribs.get("name"))+":");
					System.out.println("else if (\""+attribs.get("name")+"\".equals(qName)) {");
					System.out.println("\tprocess"+StringUtils.capitalize(attribs.get("name"))+"StartElement(qName, attribs);");
					System.out.println("}");
					classz = StringUtils.uncapitalize(attribs.get("name"));
				}
				
				
				/*
				if(qName.equals("element")  && attribs.containsKey("ref")) {
					//System.out.println("\t"+attribs.get("ref"));
					//System.out.println("\tprivate List<"+StringUtils.capitalize(attribs.get("ref"))+"> "+attribs.get("ref")+"s;");
				}
				
				if(qName.equals("attribute") && attribs.containsKey("name")) {
					if(attribs.containsKey("type")) {
						//System.out.println("\tprivate "+algTypeToJavaType.get(attribs.get("type"))+" "+attribs.get("name")+";");
						System.out.println("\t"+classz+".set"+StringUtils.capitalize(attribs.get("name"))+"(attribs.get(\""+attribs.get("name")+"\"));");
					}
					else {
						System.out.println("\t"+classz+".set"+StringUtils.capitalize(attribs.get("name"))+"(attribs.get(\""+attribs.get("name")+"\"));");
					}
					
				}
				*/
				
				
			} else if (xmlParser.isEndElement()) {
				
			} else if (xmlParser.isCharacters()) {
				
			}
		}
	}
	
	static void getParentElements() throws FileNotFoundException, XMLStreamException {
		XmlStaxParser xmlParser = new XmlStaxParser();
		xmlParser.setInputFile("/Users/user1/Downloads/Algorithm_Schema.xsd");
		
		
		
		Map<String, Set<String>> childs = new HashMap<String, Set<String>>();
		String classz = null;

		while (xmlParser.hasNext()) {
			xmlParser.getNext();
			
			if (xmlParser.isStartElement()) {
				xmlParser.getStartElement();
				String qName = xmlParser.getStartElementName();
				Map<String, String> attribs = xmlParser.getXmlElmentAttributeValue();
				
				if(qName.equals("element")  && attribs.containsKey("name")) {
					
					classz = attribs.get("name");
				}
				
				
				
				if(qName.equals("element")  && attribs.containsKey("ref")) {
					if(childs.containsKey(attribs.get("ref"))) {
						childs.get(attribs.get("ref")).add(classz);
					}
					else {
						childs.put(attribs.get("ref"), new HashSet<String>());
						childs.get(attribs.get("ref")).add(classz);
					}
				}
				
				
				
				
			} else if (xmlParser.isEndElement()) {
				
			} else if (xmlParser.isCharacters()) {
				
			}
		}
		System.out.println(childs);
	}
	
	static void generateAddChildMethods() throws FileNotFoundException, XMLStreamException {
		XmlStaxParser xmlParser = new XmlStaxParser();
		xmlParser.setInputFile("/Users/user1/Downloads/Algorithm_Schema.xsd");
		
		/*
		String childMethodTemplate = "if(xmlConstruct instanceof Scope) {\n" + 
				"			if (this.getScopes() == null) {\n" + 
				"				this.setScopes(new ArrayList<Scope>());\n" + 
				"			}\n" + 
				"			xmlConstruct.setParent(this);\n" + 
				"			this.getScopes().add((Scope)xmlConstruct);\n" + 
				"		}";%1$s
				
		*/
		String childMethodTemplate = "if(xmlConstruct instanceof %1$s) {\n" + 
				"			if (this.get%1$ss() == null) {\n" + 
				"				this.set%1$ss(new ArrayList<%1$s>());\n" + 
				"			}\n" + 
				"			xmlConstruct.setParent(this);\n" + 
				"			this.get%1$ss().add((%1$s)xmlConstruct);\n" + 
				"		}";
		
		Map<String, Set<String>> childs = new HashMap<String, Set<String>>();
		String classz = null;

		while (xmlParser.hasNext()) {
			xmlParser.getNext();
			
			if (xmlParser.isStartElement()) {
				xmlParser.getStartElement();
				String qName = xmlParser.getStartElementName();
				Map<String, String> attribs = xmlParser.getXmlElmentAttributeValue();
				
				if(qName.equals("element")  && attribs.containsKey("name")) {
					
					classz = attribs.get("name");
					System.out.println("---------------------------------------");
					System.out.println("Class "+classz+":");
				}
				
				
				
				if(qName.equals("element")  && attribs.containsKey("ref")) {
					String childMethod = String.format(childMethodTemplate,StringUtils.capitalize(attribs.get("ref")));
					System.out.println(childMethod);
					/*
					if(childs.containsKey(attribs.get("ref"))) {
						childs.get(attribs.get("ref")).add(classz);
					}
					else {
						childs.put(attribs.get("ref"), new HashSet<String>());
						childs.get(attribs.get("ref")).add(classz);
					}
					*/
				}
				
				
				
				
			} else if (xmlParser.isEndElement()) {
				
			} else if (xmlParser.isCharacters()) {
				
			}
		}
		//System.out.println(childs);
		
		
	}
	public static void stackReturn() {
		Stack<String> elements1 = new Stack<String>();
		elements1.push("hi");
		elements1.pop();
		if(!elements1.empty()) {
			elements1.pop();
		}
		
	}
	
	
	static void generateDetailsExtraxtor() throws FileNotFoundException, XMLStreamException {
		XmlStaxParser xmlParser = new XmlStaxParser();
		xmlParser.setInputFile("/Users/user1/Downloads/Algorithm_Schema.xsd");
		Set<String> attributeTypes = new HashSet<String>();
		boolean isInMainElement = false;
		boolean isSubElement = false;
		

		while (xmlParser.hasNext()) {
			xmlParser.getNext();
			
			if (xmlParser.isStartElement()) {
				xmlParser.getStartElement();
				String qName = xmlParser.getStartElementName();
				Map<String, String> attribs = xmlParser.getXmlElmentAttributeValue();
				/*
				if(!isInMainElement && qName.equals("element")  && attribs.containsKey("name")) {
					System.out.println(attribs.get("name"));
				}
				if(isInMainElement && qName.equals("element")  && attribs.containsKey("name")) {
					System.out.println(attribs.get("name"));
				}*/
				if(qName.equals("element")  && attribs.containsKey("name")) {
					System.out.println("Class "+attribs.get("name")+":");
					System.out.println("\tthis.setElementName(elementName);");
				}
				if(!isInMainElement && qName.equals("attribute")  && attribs.containsKey("type")) {
					System.out.println("\tthis.set" + StringUtils.capitalize(attribs.get("name")) + "(attribs.getOrDefault(\""+attribs.get("name")+"\",null));");
				}
				
			} else if (xmlParser.isEndElement()) {
				
			} else if (xmlParser.isCharacters()) {
				
			}
		}
		
	}
	

}
