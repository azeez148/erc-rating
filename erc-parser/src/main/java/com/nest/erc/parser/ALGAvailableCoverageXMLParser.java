package com.nest.erc.parser;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.nest.erc.domain.AvailableLOBCoverage;

public interface ALGAvailableCoverageXMLParser {
	
	AvailableLOBCoverage parseXML(String fileName);
	
	AvailableLOBCoverage parseExcel(String fileName) throws FileNotFoundException, IOException;

}
