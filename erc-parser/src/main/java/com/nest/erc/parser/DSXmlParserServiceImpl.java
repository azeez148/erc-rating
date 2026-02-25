package com.nest.erc.parser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Stack;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.ds.Column;
import com.nest.erc.domain.alg.ds.DSWrapper;
import com.nest.erc.domain.alg.ds.Table;
import com.nest.erc.domain.alg.ds.Tables;
import com.nest.erc.domain.constants.ERCConstants;

@Component
public class DSXmlParserServiceImpl implements DSXmlParserService  {
	static Stack<XmlConstruct> elements = new Stack<XmlConstruct>();
	@Autowired
	private ERCParserProjectProperties projectProperties;
	public static void main(String[] args) {
        String fileName = "DS-BP-AL-09012019-V01.xml";
        DSXmlParserServiceImpl parser = new DSXmlParserServiceImpl();
        DSWrapper dsWrapper= parser.parseXML(fileName);
        
    }
	
	
	@Override
	public DSWrapper parseXML(String dsfileName) {
		DSWrapper dsWrapper = null;
    	Tables tables = null;
    	Table table = null;
    	String inputFilePath = projectProperties.getInputFilelocation();
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(inputFilePath+"/"+dsfileName));
            while(xmlEventReader.hasNext()){
	            XMLEvent xmlEvent = xmlEventReader.nextEvent();
	            if (xmlEvent.isStartElement()){
	                   StartElement startElement = xmlEvent.asStartElement();
	                   
	                   if(startElement.getName().getLocalPart().equals(ERCConstants.RootNode)){
	                	   dsWrapper = new DSWrapper();
	                	   elements.push(dsWrapper); 
	                   }
	                   else if(startElement.getName().getLocalPart().equals(ERCConstants.Tables)){
	                	   tables = new Tables();
	                	   elements.push(tables); 
	                   }
	                   else if(startElement.getName().getLocalPart().equals(ERCConstants.Table)){
	                	   table = new Table();
	                	   elements.push(table); 
	                   }
	                   if( elements.peek() instanceof Table){
	                	   xmlEvent = processTableElements(xmlEventReader, xmlEvent, startElement);
	                   }
	                   if(elements.peek() instanceof Column){
	                	   xmlEvent = processColumnElements(xmlEventReader, xmlEvent, startElement);
	                   }
	               }
	               
	               if(xmlEvent.isEndElement()){
	                   processEndElement(xmlEvent);
	               }
            }
            
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return dsWrapper;
	}

	
    /**
     * 
     * @param xmlEventReader
     * @param xmlEvent
     * @param startElement
     * @return
     * @throws XMLStreamException
     */
	private  XMLEvent processColumnElements(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		if(startElement.getName().getLocalPart().equals(ERCConstants.Comment)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Column)elements.peek()).setComment(xmlEvent.asCharacters().getData());
		       }
		   }
		   else if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Column)elements.peek()).setId(xmlEvent.asCharacters().getData());
		       }
		   }
		   else if(startElement.getName().getLocalPart().equals(ERCConstants.DataType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Column)elements.peek()).setDataType(xmlEvent.asCharacters().getData());
		       }
		   }
		   else if(startElement.getName().getLocalPart().equals(ERCConstants.Name)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Column)elements.peek()).setName(xmlEvent.asCharacters().getData());
		       }
		   }
		   else if(startElement.getName().getLocalPart().equals(ERCConstants.DataSize)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Column)elements.peek()).setDataSize(Integer.parseInt(xmlEvent.asCharacters().getData()));
		       }
		   }
		   else if(startElement.getName().getLocalPart().equals(ERCConstants.Encrypted)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Column)elements.peek()).setEncrypted(Integer.parseInt(xmlEvent.asCharacters().getData()));
		       }
		   }
		   else if(startElement.getName().getLocalPart().equals(ERCConstants.Distortion)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Column)elements.peek()).setDistortion(xmlEvent.asCharacters().getData());
		       }
		   }
		return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private  XMLEvent processTableElements(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		   Column column;
		   if(startElement.getName().getLocalPart().equals(ERCConstants.Name)){
		       xmlEvent = xmlEventReader.nextEvent();
			   ((Table)elements.peek()).setName(xmlEvent.asCharacters().getData());
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Description)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Table)elements.peek()).setDescription(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Comment)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Table)elements.peek()).setComment(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Table)elements.peek()).setId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Type)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Table)elements.peek()).setType(xmlEvent.asCharacters().getData());
		       }
		   }
		   else if(startElement.getName().getLocalPart().equals(ERCConstants.OverridePremium)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Table)elements.peek()).setOverridePremium(Integer.parseInt(xmlEvent.asCharacters().getData()));
		       }
		   }
		   else if(startElement.getName().getLocalPart().equals(ERCConstants.Column)){
			   column = new Column();
			   elements.push(column); 
		   }
		return xmlEvent;
	}
    /**
     * 
     * @param xmlEvent
     */
	private  void processEndElement(XMLEvent xmlEvent) {
		EndElement endElement = xmlEvent.asEndElement();
		if(endElement.getName().getLocalPart().equals(ERCConstants.Column)){
			Column columnNode = ((Column)elements.pop());
			((Table)elements.peek()).addChildren(columnNode);
		}else if(endElement.getName().getLocalPart().equals(ERCConstants.Table)){
			Table tableNode= ((Table)elements.pop());
			((Tables)elements.peek()).addChildren(tableNode);
		}else if(endElement.getName().getLocalPart().equals(ERCConstants.Tables)){
			Tables tablesNode = ((Tables)elements.pop());
			if(elements.peek() instanceof Table){
				((Table)elements.peek()).addChildren(tablesNode);
			}else if(elements.peek() instanceof DSWrapper){
				((DSWrapper)elements.peek()).addChildren(tablesNode);
			}
		}
	}




	
}
