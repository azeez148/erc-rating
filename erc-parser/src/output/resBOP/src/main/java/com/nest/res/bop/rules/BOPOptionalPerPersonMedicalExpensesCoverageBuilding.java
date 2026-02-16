package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOptionalPerPersonMedicalExpensesCoverageBuilding  {

	
	
	
	private com.nest.res.bop.domain.BOPOptionalPerPersonMedicalExpensesCoverageBuilding BOPOptionalPerPersonMedicalExpensesCoverageBuilding;
	
	
	
	public void FinalRateBldg ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../BOPStructureLiabMedExpensesBldgCoverage/FinalRate"))) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../BOPStructureLiabMedExpensesBldgCoverage/FinalRate"))) != 0.0){
			this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setFinalRateBldg((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../BOPStructureLiabMedExpensesBldgCoverage/FinalRate"))));
		}
		else{
			this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setFinalRateBldg((double)0.0);
		}
	  
	}
	public void Premium ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../../../OptionalMedicalCovLimitPerPerson"))) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../../../OptionalMedicalCovLimitPerPerson"))) > this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.getInclddLimit() && ((XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../BOPStructureLiabMedExpensesBldgCoverage"))) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../BOPStructureLiabMedExpensesBldgCoverage/Premium"))) > (double)0.0){
			this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.getFinalRateBldg() * this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.getFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../BuildingLimit"))) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding,"../../../IRPMFactor")))));
		}
		else{
			this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setPremium((double)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.getPremium() != (double)0.0){
			this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LimitPerPersonMedExpensesFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	InclddLimit();
	
	FinalRateBldg();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPOptionalPerPersonMedicalExpensesCoverageBuilding (com.nest.res.bop.domain.BOPOptionalPerPersonMedicalExpensesCoverageBuilding BOPOptionalPerPersonMedicalExpensesCoverageBuilding)  {
	  this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding = BOPOptionalPerPersonMedicalExpensesCoverageBuilding;

	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPOptionalPerPersonMedicalExpensesCoverageBuilding.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("OptionalPerPersonMedExpnsInclddLimit",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}