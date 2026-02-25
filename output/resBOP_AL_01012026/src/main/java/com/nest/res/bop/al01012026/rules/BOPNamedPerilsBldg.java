package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPNamedPerilsBldg  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPNamedPerilsBldg BOPNamedPerilsBldg;
	
	
	
	public void Premium ()  {
	  
		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPNamedPerilsBldg,"../BOPStructureBuildingCoverage/Premium"))) == MathHelper.getDoubleValue(0.0)){
			this.BOPNamedPerilsBldg.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPNamedPerilsBldg.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(-1 * MathHelper.roundUpDoller(this.BOPNamedPerilsBldg.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPNamedPerilsBldg,"../BOPStructureBuildingCoverage/Premium")))))));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPNamedPerilsBldg,"../BuildingLimit"))) != MathHelper.getIntegerValue(0.0) && ((XpathNode.selectNodeValue(this.BOPNamedPerilsBldg,"../../../BOPNamedPerils/BurglaryRobberyCoverage")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPNamedPerilsBldg,"../../../BOPNamedPerils/BurglaryRobberyCoverage"))).equals(MathHelper.getStringValue("")))){
			this.BOPNamedPerilsBldg.setFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NamedPerilsBldgFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPNamedPerilsBldg,"../../../BOPNamedPerils/BurglaryRobberyCoverage"))))));
		}
		else{
			this.BOPNamedPerilsBldg.setFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPNamedPerilsBldg (com.nest.res.bop.al01012026.domain.BOPNamedPerilsBldg BOPNamedPerilsBldg)  {
	  this.BOPNamedPerilsBldg = BOPNamedPerilsBldg;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPNamedPerilsBldg,"../BOPStructureBuildingCoverage/Premium"))) == MathHelper.getDoubleValue(0.0)){
			this.BOPNamedPerilsBldg.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPNamedPerilsBldg.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(-1 * MathHelper.roundUpDoller(this.BOPNamedPerilsBldg.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPNamedPerilsBldg,"../BOPStructureBuildingCoverage/Premium")))))));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPNamedPerilsBldg.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPNamedPerilsBldg.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPNamedPerilsBldg.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}