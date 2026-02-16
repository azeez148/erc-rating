package com.nest.erc.domain.reader.xml.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;


/**
 * Class for the implementation of serial xml parser
 * @author
 *
 */
public class XmlStaxParser {
	private XMLEventReader eventReader;
	private XMLEvent currentEvent;
	StartElement startElement;
	EndElement endElement;
	Characters characters;;
	
	/**
	 * 
	 * @param fileName
	 * @throws FileNotFoundException
	 * @throws XMLStreamException
	 */
	public void setInputFile(String fileName) throws FileNotFoundException, XMLStreamException {
		XMLInputFactory factory = XMLInputFactory.newInstance();
		FileReader xmlFileReader = null;
		try {
			xmlFileReader = new FileReader(fileName);
			eventReader = factory.createXMLEventReader(xmlFileReader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw e;
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
	
	public boolean hasNext() {
		return eventReader.hasNext();
	}
	
	public XMLEvent getNext() throws XMLStreamException {
		try {
			currentEvent = eventReader.nextEvent();
		} catch (XMLStreamException e) {
			e.printStackTrace();
			throw e;
		}
		return currentEvent;
	}
	
	public boolean isStartElement()  {
		return currentEvent.getEventType() == XMLStreamConstants.START_ELEMENT;
	}
	
	public StartElement getStartElement()  {
		startElement = currentEvent.asStartElement();
		return startElement;
	}
	
	public EndElement getEndElement()  {
		endElement = currentEvent.asEndElement();
		return endElement;
	}
	
	public String getCharacters()  {
		characters = currentEvent.asCharacters();
		return characters.getData().replaceAll(System.getProperty("line.separator"), "");
	}
	
	public Map<String,String> getXmlElmentAttributeValue(){
		Map<String,String> attributesMap = new HashMap<String,String>();
		Iterator<Attribute> attributes = startElement.getAttributes();
		while (attributes.hasNext()) {
			Attribute attribute = (attributes.next());
			attributesMap.put(attribute.getName().getLocalPart(), attribute.getValue());
		}
		return attributesMap;
	}
	
	
	
	public String getStartElementName(){
		//no start element
		return startElement.getName().getLocalPart();
	}
	
	public String getEndElementName(){
		//no end element
		return endElement.getName().getLocalPart();
	}
	
	public boolean isEndElement()  {
		return currentEvent.getEventType() == XMLStreamConstants.END_ELEMENT;
	}
	
	public boolean isCharacters()  {
		return currentEvent.getEventType() == XMLStreamConstants.CHARACTERS;
	}
	
	
}
