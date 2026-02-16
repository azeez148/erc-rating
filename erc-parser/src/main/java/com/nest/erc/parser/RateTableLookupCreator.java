package com.nest.erc.parser;

import com.nest.erc.domain.alg.rc.RCWrapper;

public interface RateTableLookupCreator {

	void createRateTableLookupJson(RCWrapper rcWrapper, String lobName, String type, String version);
}
