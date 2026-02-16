package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOptionalPerPersonMedicalExpensesCoverageBuilding  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPOptionalPerPersonMedicalExpensesCoverageBuilding BOPOptionalPerPersonMedicalExpensesCoverageBuilding;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../../../OptionalMedicalCovLimitPerPerson")) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../../../OptionalMedicalCovLimitPerPerson"))) > this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.getInclddLimit() && (XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../BOPStructureLiabMedExpensesBldgCoverage")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../BOPStructureLiabMedExpensesBldgCoverage/Premium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.getFinalRateBldg() * this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.getFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../../../IRPMFactor"))))));
		}
		else{
			this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../../../OptionalMedicalCovLimitPerPerson")) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../../../OptionalMedicalCovLimitPerPerson"))) > this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.getInclddLimit() && (XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../BOPStructureLiabMedExpensesBldgCoverage")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../BOPStructureLiabMedExpensesBldgCoverage/Premium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.getFinalRateBldg() * this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.getFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../../../IRPMFactor"))))));
		}
		else{
			this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("OptionalPerPersonMedExpnsInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public  BOPOptionalPerPersonMedicalExpensesCoverageBuilding (com.nest.res.bop.al09012019.domain.BOPOptionalPerPersonMedicalExpensesCoverageBuilding BOPOptionalPerPersonMedicalExpensesCoverageBuilding)  {
	  this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding = BOPOptionalPerPersonMedicalExpensesCoverageBuilding;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void FinalRateBldg ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../BOPStructureLiabMedExpensesBldgCoverage/FinalRate")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../BOPStructureLiabMedExpensesBldgCoverage/FinalRate"))) != 0.0){
			this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setFinalRateBldg(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../BOPStructureLiabMedExpensesBldgCoverage/FinalRate")))));
		}
		else{
			this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setFinalRateBldg(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	InclddLimit();
	
	FinalRateBldg();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LimitPerPersonMedExpensesFactor",String.valueOf( "Y"))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(1.0));

	  
	}
	
	
	
	
	


	
}