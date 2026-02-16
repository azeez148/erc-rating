package com.nest.erc.parser;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Stack;

import javax.xml.stream.XMLStreamException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.impl.Lob;
import com.nest.erc.domain.alg.re.constructs.impl.AlgParserOutput;
import com.nest.erc.domain.reader.xml.impl.XmlStaxParser;
import com.nest.erc.domain.util.Utils;

/**
 * Class to parse the ALG XML
 * 
 *
 */

@Component
public class ALGXMLParserServiceImpl implements ALGXMLParserService{
	static Logger logger = Logger.getLogger(ALGXMLParserServiceImpl.class);
	ALGDetailsExtractor algDetailsExtractor = new ALGDetailsExtractor();
	XmlStaxParser xmlParser = new XmlStaxParser();
	Stack<XmlConstruct> elements = new Stack<XmlConstruct>();
	@Autowired
	private ERCParserProjectProperties projectProperties;
	
	@Override
	public AlgParserOutput parseAlg(String algFileName) throws XMLStreamException, FileNotFoundException {
		AlgParserOutput algParserOutput = new AlgParserOutput();
		String inputFilePath = projectProperties.getInputFilelocation();
		
		xmlParser.setInputFile(inputFilePath+algFileName);
		Lob lob = null;
		while (xmlParser.hasNext()) {
			xmlParser.getNext();
			if (xmlParser.isStartElement()) {
				processingXmlStartElement();
			} else if (xmlParser.isEndElement()) {
				XmlConstruct xmlConstruct = processingXmlEndElement();

				if (xmlConstruct.getParent() == null) {
					lob = (Lob) xmlConstruct;
					algParserOutput.setXmlDetails(lob);
					//Json
					Utils utils = new Utils();
					utils.writeObjectToJson("lob.json", "./output/", lob);
				}
			} else if (xmlParser.isCharacters()) {
				processCharacter();
			}
		}
		algParserOutput.setFlowChart(lob.getReferenceFromNameAndType("FlowChart", "Execution Flow"));
		algParserOutput.setTables(lob.getReferenceFromNameAndType("Table Objects", "Table Objects"));
		
		return algParserOutput;
	}
	
	private void processingXmlStartElement() {
		xmlParser.getStartElement();
		String elementName = xmlParser.getStartElementName();
		Map<String, String> attribs = xmlParser.getXmlElmentAttributeValue();
		/*
		 * if(elementName.equals("class")) {
		 *System.out.println("Class Name:attribs :"+attribs ); }
		 */
		algDetailsExtractor.addElementAndDetails(elementName, attribs);
	}

	private XmlConstruct processingXmlEndElement() {
		xmlParser.getEndElement();
		return algDetailsExtractor.handleParentChildInDetailExtraction();
	}

	private void processCharacter() {
		algDetailsExtractor.processingXmlCharacters(xmlParser.getCharacters());
	}

	

}
