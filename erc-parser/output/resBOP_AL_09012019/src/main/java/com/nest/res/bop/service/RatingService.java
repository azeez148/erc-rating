package com.nest.res.bop.service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;

import javax.xml.stream.XMLStreamException;

import com.nest.res.common.exception.ParserException;

public interface RatingService {
	public String ratePolicy(String policyXML, String lobType, String projectState, String projectVersion, String lookupFolder) throws  NumberFormatException, ParserException, XMLStreamException, IOException, ParseException, IllegalAccessException, NoSuchFieldException, SecurityException, InvocationTargetException, NoSuchMethodException;

}
