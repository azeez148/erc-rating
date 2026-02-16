package com.nest.erc.adapter.service;

import com.nest.erc.domain.ERCProcessorOutput;
import com.nest.erc.domain.ERCProjectType;
import com.nest.erc.domain.LOBName;

public interface AdapterService {
	
	boolean buildProject(ERCProcessorOutput ercProcessorOutput,String lobName, String ercProjectType) throws Exception;

}
