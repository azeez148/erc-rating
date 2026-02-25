package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLimitationsOnCoverageForRoofSurfacing  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPLimitationsOnCoverageForRoofSurfacing BOPLimitationsOnCoverageForRoofSurfacing;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPLimitationsOnCoverageForRoofSurfacing.getApplicability().equals(MathHelper.getStringValue(""))){
			this.BOPLimitationsOnCoverageForRoofSurfacing.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPLimitationsOnCoverageForRoofSurfacing.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(0.0) - (MathHelper.getDoubleValue(1.0) - this.BOPLimitationsOnCoverageForRoofSurfacing.getFactor())) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitationsOnCoverageForRoofSurfacing,"../BOPStructureBuildingCoverage/Premium"))))));
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPLimitationsOnCoverageForRoofSurfacing.getApplicability().equals(MathHelper.getStringValue(""))){
			this.BOPLimitationsOnCoverageForRoofSurfacing.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPLimitationsOnCoverageForRoofSurfacing.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(0.0) - (MathHelper.getDoubleValue(1.0) - this.BOPLimitationsOnCoverageForRoofSurfacing.getFactor())) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitationsOnCoverageForRoofSurfacing,"../BOPStructureBuildingCoverage/Premium"))))));
		}
	  
	}
	public  BOPLimitationsOnCoverageForRoofSurfacing (com.nest.res.bop.al01012026.domain.BOPLimitationsOnCoverageForRoofSurfacing BOPLimitationsOnCoverageForRoofSurfacing)  {
	  this.BOPLimitationsOnCoverageForRoofSurfacing = BOPLimitationsOnCoverageForRoofSurfacing;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitationsOnCoverageForRoofSurfacing.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLimitationsOnCoverageForRoofSurfacing.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLimitationsOnCoverageForRoofSurfacing.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPLimitationsOnCoverageForRoofSurfacing.getApplicability().equals(MathHelper.getStringValue(""))){
			this.BOPLimitationsOnCoverageForRoofSurfacing.setFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LimitationsOnCoverageForRoofSurfacingFactor",String.valueOf(this.BOPLimitationsOnCoverageForRoofSurfacing.getApplicability())))));
		}
		else{
			this.BOPLimitationsOnCoverageForRoofSurfacing.setFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}