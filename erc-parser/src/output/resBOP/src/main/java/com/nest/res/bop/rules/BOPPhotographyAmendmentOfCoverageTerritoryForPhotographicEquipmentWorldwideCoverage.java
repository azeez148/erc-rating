package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PhotographyScheduledPhotographicEquipmentCharge () throws LookupException,NumberFormatException {
	  this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage.setPhotographyScheduledPhotographicEquipmentCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PhotographyScheduledPhotographicEquipmentCharge",String.valueOf( "Y"))));

	  
	}
	public void PhotographyWorldwideCoverageFactor () throws LookupException,NumberFormatException {
	  this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage.setPhotographyWorldwideCoverageFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PhotographyWorldwideCoverageFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	PhotographyWorldwideCoverageCharge();
	
	PhotographyWorldwideCoverageFactor();
	
	PhotographyScheduledPhotographicEquipmentCharge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage (com.nest.res.bop.domain.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage)  {
	  this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage = BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage.getPremium() != (double)0.0){
			this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void PhotographyWorldwideCoverageCharge () throws LookupException,NumberFormatException {
	  this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage.setPhotographyWorldwideCoverageCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PhotographyWorldwideCoverageCharge",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage,"../BOPPhotography"))) != null && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage,"../BOPPhotography/ScheduledItems"))).equals((String)"Yes")){
			this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage.getPhotographyWorldwideCoverageCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage,"../LCM")))) + ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage,"../BOPPhotography/TotalLimitOfInsurance"))) / (double)100.0 * MathHelper.roundToThousand(this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage.getPhotographyScheduledPhotographicEquipmentCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage,"../LCM")))))) * this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage.getPhotographyWorldwideCoverageFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage,"../IRPMFactor")))));
		}
		else{
			this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage.getPhotographyWorldwideCoverageCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage,"../LCM")))) * this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage.getPhotographyWorldwideCoverageFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage,"../IRPMFactor")))));
		}
	  
	}
	
	
	
	
	


	
}