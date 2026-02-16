package com.nest.erc.parser;

import com.nest.erc.domain.alg.rc.Form;
import com.nest.erc.domain.alg.rc.RCWrapper;

public interface RCXmlRelationSetterService {

	public  RCWrapper readRcXml(String rcXMLFileName);
	
	public void attachDomainTableToForm(Form form,RCWrapper rcWrapper);
}
