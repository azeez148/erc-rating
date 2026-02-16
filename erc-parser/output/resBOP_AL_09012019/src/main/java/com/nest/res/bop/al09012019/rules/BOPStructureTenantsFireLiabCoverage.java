package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPStructureTenantsFireLiabCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPStructureTenantsFireLiabCoverage BOPStructureTenantsFireLiabCoverage;
	
	
	
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPStructureTenantsFireLiabCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TenantsFireLiabFactor",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPStructureTenantsFireLiabCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPStructureTenantsFireLiabCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPStructureTenantsFireLiabCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPStructureTenantsFireLiabCoverage (com.nest.res.bop.al09012019.domain.BOPStructureTenantsFireLiabCoverage BOPStructureTenantsFireLiabCoverage)  {
	  this.BOPStructureTenantsFireLiabCoverage = BOPStructureTenantsFireLiabCoverage;

	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPStructureTenantsFireLiabCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("TenantsFireLiabInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(this.BOPStructureTenantsFireLiabCoverage.getDsLimit() <= this.BOPStructureTenantsFireLiabCoverage.getInclddLimit()){
			this.BOPStructureTenantsFireLiabCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPStructureTenantsFireLiabCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureTenantsFireLiabCoverage,"../../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPStructureTenantsFireLiabCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPStructureTenantsFireLiabCoverage.getInclddLimit())) / MathHelper.getDoubleValue(100.0) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureTenantsFireLiabCoverage,"../FinalBuildingRate"))) * this.BOPStructureTenantsFireLiabCoverage.getFactor())))));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  this.BOPStructureTenantsFireLiabCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(1.0));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPStructureTenantsFireLiabCoverage.getDsLimit() <= this.BOPStructureTenantsFireLiabCoverage.getInclddLimit()){
			this.BOPStructureTenantsFireLiabCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPStructureTenantsFireLiabCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureTenantsFireLiabCoverage,"../../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPStructureTenantsFireLiabCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPStructureTenantsFireLiabCoverage.getInclddLimit())) / MathHelper.getDoubleValue(100.0) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureTenantsFireLiabCoverage,"../FinalBuildingRate"))) * this.BOPStructureTenantsFireLiabCoverage.getFactor())))));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}