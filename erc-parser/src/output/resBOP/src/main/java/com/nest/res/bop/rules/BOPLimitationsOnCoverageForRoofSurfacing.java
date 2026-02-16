package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLimitationsOnCoverageForRoofSurfacing  {

	
	
	
	private com.nest.res.bop.domain.BOPLimitationsOnCoverageForRoofSurfacing BOPLimitationsOnCoverageForRoofSurfacing;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPLimitationsOnCoverageForRoofSurfacing.getApplicability().equals((String)"")){
			this.BOPLimitationsOnCoverageForRoofSurfacing.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LimitationsOnCoverageForRoofSurfacingFactor",String.valueOf(BOPLimitationsOnCoverageForRoofSurfacing.getApplicability()))));
		}
		else{
			this.BOPLimitationsOnCoverageForRoofSurfacing.setFactor((double)0.0);
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitationsOnCoverageForRoofSurfacing.getPremium() != (double)0.0){
			this.BOPLimitationsOnCoverageForRoofSurfacing.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPLimitationsOnCoverageForRoofSurfacing.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPLimitationsOnCoverageForRoofSurfacing (com.nest.res.bop.domain.BOPLimitationsOnCoverageForRoofSurfacing BOPLimitationsOnCoverageForRoofSurfacing)  {
	  this.BOPLimitationsOnCoverageForRoofSurfacing = BOPLimitationsOnCoverageForRoofSurfacing;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  
		if(this.BOPLimitationsOnCoverageForRoofSurfacing.getApplicability().equals((String)"")){
			this.BOPLimitationsOnCoverageForRoofSurfacing.setPremium((double)0.0);
		}
		else{
			this.BOPLimitationsOnCoverageForRoofSurfacing.setPremium(MathHelper.roundUpDoller(((double)0.0 - ((double)1.0 - this.BOPLimitationsOnCoverageForRoofSurfacing.getFactor())) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitationsOnCoverageForRoofSurfacing,"../BOPStructureBuildingCoverage/Premium")))));
		}
	  
	}
	
	
	
	
	


	
}