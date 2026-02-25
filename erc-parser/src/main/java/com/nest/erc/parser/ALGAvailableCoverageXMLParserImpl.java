package com.nest.erc.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nest.erc.domain.AvailableCoverage;
import com.nest.erc.domain.AvailableLOBCoverage;
import com.nest.erc.domain.constants.ERCConstants;

@Component
public class ALGAvailableCoverageXMLParserImpl implements ALGAvailableCoverageXMLParser {

	static Stack<AvailableLOBCoverage> elements = new Stack<AvailableLOBCoverage>();
	static final String ISREQUIREDATT = "required";
	static final String CHECKCOVERAGEAVAILABILTY = "checkCoverageAvailability";
	@Autowired
	private ERCParserProjectProperties projectProperties;
	
	@Override
	public AvailableLOBCoverage parseXML(String fileName) {
		
		
		String folderPath = projectProperties.getInputFilelocation();
		
		AvailableLOBCoverage availableLOBCoverages = new AvailableLOBCoverage();		
		List<String> availableCoverages = new ArrayList<String>();
		try {
			// First, create a new XMLInputFactory
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			// Setup a new eventReader
			InputStream in = new FileInputStream(folderPath+fileName);
			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
			// read the XML document
			AvailableCoverage availableCoverage = null;

			while (eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();

				if (event.isStartElement()) {
					StartElement startElement = event.asStartElement();

					if (startElement.getName().getLocalPart().equals(ERCConstants.AvailableCoverageRootNode)) {

						Iterator<Attribute> attributes = startElement.getAttributes();

						while (attributes.hasNext()) {
							Attribute attribute = attributes.next();
							if (attribute.getName().toString().equals(CHECKCOVERAGEAVAILABILTY)) {
								if(attribute.getValue().equals("true")) {
									availableLOBCoverages.setChekcCoverageAvailability(true);								
								}
								else {
									availableLOBCoverages.setChekcCoverageAvailability(false);
								}
							}

						}

					}
					// If we have an item element, we create a new item
					else if (startElement.getName().getLocalPart().equals(ERCConstants.AvailableCoverageNode)) {
						availableCoverage = new AvailableCoverage();
						// We read the attributes from this tag and add the date
						// attribute to our object
						Iterator<Attribute> attributes = startElement.getAttributes();

						while (attributes.hasNext()) {
							Attribute attribute = attributes.next();
							if (attribute.getName().toString().equals(ISREQUIREDATT)) {
								if(attribute.getValue().equals("true")) {
									availableCoverage.setAvailable(true);									
								}
								else {
									availableCoverage.setAvailable(false);
								}
							}

						}

						if(availableCoverage.isAvailable()) {
							event = eventReader.nextEvent();
							availableCoverage.setCoverageName(event.asCharacters().getData());
						}
					}				
				}
				// If we reach the end of an item element, we add it to the list
				if (event.isEndElement()) {
					EndElement endElement = event.asEndElement();
					if (endElement.getName().getLocalPart().equals(ERCConstants.AvailableCoverageNode)) {
						if(availableCoverage.isAvailable()) {
							availableCoverages.add(availableCoverage.getCoverageName());
						}
					}

					if (endElement.getName().getLocalPart().equals(ERCConstants.AvailableCoverageRootNode)) {
						availableLOBCoverages.setAvailableCoverage(availableCoverages);
					}
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
		return availableLOBCoverages;
	}

	@Override
	public AvailableLOBCoverage parseExcel(String fileName) throws IOException {
		// TODO Auto-generated method stub
		AvailableLOBCoverage availableLOBCoverages = new AvailableLOBCoverage();
		List<String> availableCoverages = new ArrayList<String>();
		String folderPath = projectProperties.getInputFilelocation();
		FileInputStream file = new FileInputStream(new File(folderPath+"/"+fileName));
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		//Get first/desired sheet from the workbook
		XSSFSheet sheet = workbook.getSheetAt(0);

		//Iterate through each rows one by one
		Iterator<Row> rowIterator = sheet.iterator();
		int i=0;
		while (rowIterator.hasNext()) 
		{

			Row row = rowIterator.next();
			if(i==0) {
				i++;
				continue;
			}
			//For each row, iterate through all the columns
			Iterator<Cell> cellIterator = row.cellIterator();         
			boolean addCoverage = false;
			String coverageName ="";
			while (cellIterator.hasNext()) 
			{
				Cell cell = cellIterator.next();
				//Check the cell type and format accordingly
				switch (cell.getCellType()) 
				{
				case STRING:
					coverageName =cell.getStringCellValue();
					break;    
				case BOOLEAN:
					addCoverage =cell.getBooleanCellValue();
					break;    
				}


			}
			if(addCoverage) {
				availableCoverages.add(coverageName);            	
			} 
		}

		workbook.close();
		file.close();
		availableLOBCoverages.setAvailableCoverage(availableCoverages);
		if(availableCoverages.size() ==0) {
			availableLOBCoverages.setChekcCoverageAvailability(false);
		}
		else {
			availableLOBCoverages.setChekcCoverageAvailability(true);
		}
		return availableLOBCoverages;
	}
}




