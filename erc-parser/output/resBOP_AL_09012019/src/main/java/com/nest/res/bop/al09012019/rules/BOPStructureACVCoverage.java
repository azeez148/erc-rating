package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPStructureACVCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPStructureACVCoverage BOPStructureACVCoverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPStructureACVCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPStructureACVCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPStructureACVCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureACVCoverage,"../PctOwnerOccupied"))).equals(MathHelper.getStringValue("10% or less"))){
			this.BOPStructureACVCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureACVCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/Premium"))) * this.BOPStructureACVCoverage.getFactor())));
		}
		else{
			this.BOPStructureACVCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureACVCoverage,"../RatingBasis"))).equals(MathHelper.getStringValue("Actual Cash Value"))){
			this.BOPStructureACVCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPStructureACVCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPStructureACVCoverage (com.nest.res.bop.al09012019.domain.BOPStructureACVCoverage BOPStructureACVCoverage)  {
	  this.BOPStructureACVCoverage = BOPStructureACVCoverage;

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPStructureACVCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ACVFactor",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureACVCoverage,"../PctOwnerOccupied"))).equals(MathHelper.getStringValue("10% or less"))){
			this.BOPStructureACVCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureACVCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/Premium"))) * this.BOPStructureACVCoverage.getFactor())));
		}
		else{
			this.BOPStructureACVCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}