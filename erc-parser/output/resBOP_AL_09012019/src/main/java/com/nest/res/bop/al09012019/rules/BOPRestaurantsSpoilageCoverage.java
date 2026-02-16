package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPRestaurantsSpoilageCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPRestaurantsSpoilageCoverage BOPRestaurantsSpoilageCoverage;
	
	
	
	public void AddlSpoilageInclddLimit () throws LookupException,NumberFormatException {
	  this.BOPRestaurantsSpoilageCoverage.setAddlSpoilageInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("SpoilageInclddLimit",String.valueOf( "Y"))));

	  
	}
	public  BOPRestaurantsSpoilageCoverage (com.nest.res.bop.al09012019.domain.BOPRestaurantsSpoilageCoverage BOPRestaurantsSpoilageCoverage)  {
	  this.BOPRestaurantsSpoilageCoverage = BOPRestaurantsSpoilageCoverage;

	  
	}
	public void coverageType_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../CoverageType")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../CoverageType"))).equals(MathHelper.getStringValue(""))){
			this.BOPRestaurantsSpoilageCoverage.setCoverageType_1(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../CoverageType")))));
		}
		else{
			this.BOPRestaurantsSpoilageCoverage.setCoverageType_1(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void classIndicator_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../Classs")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../Classs"))).equals(MathHelper.getStringValue(""))){
			this.BOPRestaurantsSpoilageCoverage.setClassIndicator_1(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../Classs")))));
		}
		else{
			this.BOPRestaurantsSpoilageCoverage.setClassIndicator_1(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPRestaurantsSpoilageCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPRestaurantsSpoilageCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPRestaurantsSpoilageCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPRestaurantsSpoilageCoverage.getDsLimit() > this.BOPRestaurantsSpoilageCoverage.getAddlSpoilageInclddLimit()){
			this.BOPRestaurantsSpoilageCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPRestaurantsSpoilageCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../../LCM")))) * ((MathHelper.getDoubleValue(this.BOPRestaurantsSpoilageCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPRestaurantsSpoilageCoverage.getAddlSpoilageInclddLimit())) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../../../IRPMFactor"))))));
		}
		else{
			this.BOPRestaurantsSpoilageCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(!this.BOPRestaurantsSpoilageCoverage.getClassIndicator_1().equals(MathHelper.getStringValue("")) && !this.BOPRestaurantsSpoilageCoverage.getCoverageType_1().equals(MathHelper.getStringValue("")) && !this.BOPRestaurantsSpoilageCoverage.getMaintenanceAgreement_1().equals(MathHelper.getStringValue(""))){
			this.BOPRestaurantsSpoilageCoverage.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SpoilageRate",String.valueOf(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../Classs")),String.valueOf(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../CoverageType")),String.valueOf(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../MaintenanceAgreement"))))));
		}
		else{
			this.BOPRestaurantsSpoilageCoverage.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void maintenanceAgreement_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../MaintenanceAgreement")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../MaintenanceAgreement"))).equals(MathHelper.getStringValue(""))){
			this.BOPRestaurantsSpoilageCoverage.setMaintenanceAgreement_1(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../MaintenanceAgreement")))));
		}
		else{
			this.BOPRestaurantsSpoilageCoverage.setMaintenanceAgreement_1(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPRestaurantsSpoilageCoverage.getDsLimit() > this.BOPRestaurantsSpoilageCoverage.getAddlSpoilageInclddLimit()){
			this.BOPRestaurantsSpoilageCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPRestaurantsSpoilageCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../../LCM")))) * ((MathHelper.getDoubleValue(this.BOPRestaurantsSpoilageCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPRestaurantsSpoilageCoverage.getAddlSpoilageInclddLimit())) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../../../IRPMFactor"))))));
		}
		else{
			this.BOPRestaurantsSpoilageCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  this.BOPRestaurantsSpoilageCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(1.0));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	AddlSpoilageInclddLimit();
	
	classIndicator_1();
	
	coverageType_1();
	
	maintenanceAgreement_1();
	
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}