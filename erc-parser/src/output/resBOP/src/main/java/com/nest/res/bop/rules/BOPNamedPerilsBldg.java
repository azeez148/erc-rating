package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPNamedPerilsBldg  {

	
	
	
	private com.nest.res.bop.domain.BOPNamedPerilsBldg BOPNamedPerilsBldg;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPNamedPerilsBldg (com.nest.res.bop.domain.BOPNamedPerilsBldg BOPNamedPerilsBldg)  {
	  this.BOPNamedPerilsBldg = BOPNamedPerilsBldg;

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPNamedPerilsBldg,"../BuildingLimit"))) != (int)0.0){
			this.BOPNamedPerilsBldg.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NamedPerilsBldgFactor",((String)XpathNode.selectNodeValue(this.BOPNamedPerilsBldg," ../../../BOPNamedPerils/BurglaryRobberyCoverage")))));
		}
		else{
			this.BOPNamedPerilsBldg.setFactor((double)0.0);
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPNamedPerilsBldg.getPremium() != (double)0.0){
			this.BOPNamedPerilsBldg.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPNamedPerilsBldg.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  
		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPNamedPerilsBldg,"../BOPStructureBuildingCoverage/Premium"))) == (double)0.0){
			this.BOPNamedPerilsBldg.setPremium((double)0.0);
		}
		else{
			this.BOPNamedPerilsBldg.setPremium(-1 * MathHelper.roundUpDoller(this.BOPNamedPerilsBldg.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPNamedPerilsBldg,"../BOPStructureBuildingCoverage/Premium")))));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}