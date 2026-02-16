package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPRestaurantsSpoilageCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPRestaurantsSpoilageCoverage BOPRestaurantsSpoilageCoverage;
	
	
	
	public void AddlSpoilageInclddLimit () throws LookupException,NumberFormatException {
	  this.BOPRestaurantsSpoilageCoverage.setAddlSpoilageInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("SpoilageInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(this.BOPRestaurantsSpoilageCoverage.getDsLimit() > this.BOPRestaurantsSpoilageCoverage.getAddlSpoilageInclddLimit()){
			this.BOPRestaurantsSpoilageCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPRestaurantsSpoilageCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../../LCM")))) * (((double)this.BOPRestaurantsSpoilageCoverage.getDsLimit() - (double)this.BOPRestaurantsSpoilageCoverage.getAddlSpoilageInclddLimit()) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../../../IRPMFactor")))));
		}
		else{
			this.BOPRestaurantsSpoilageCoverage.setPremium((double)0.0);
		}
	  
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
	public void coverageType_1 ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../CoverageType"))) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../CoverageType"))).equals((String)"")){
			this.BOPRestaurantsSpoilageCoverage.setCoverageType_1((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../CoverageType"))));
		}
		else{
			this.BOPRestaurantsSpoilageCoverage.setCoverageType_1((String)"");
		}
	  
	}
	public void maintenanceAgreement_1 ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../MaintenanceAgreement"))) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../MaintenanceAgreement"))).equals((String)"")){
			this.BOPRestaurantsSpoilageCoverage.setMaintenanceAgreement_1((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../MaintenanceAgreement"))));
		}
		else{
			this.BOPRestaurantsSpoilageCoverage.setMaintenanceAgreement_1((String)"");
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPRestaurantsSpoilageCoverage.getPremium() != (double)0.0){
			this.BOPRestaurantsSpoilageCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPRestaurantsSpoilageCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void classIndicator_1 ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../Classs"))) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../Classs"))).equals((String)"")){
			this.BOPRestaurantsSpoilageCoverage.setClassIndicator_1((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage,"../Classs"))));
		}
		else{
			this.BOPRestaurantsSpoilageCoverage.setClassIndicator_1((String)"");
		}
	  
	}
	public  BOPRestaurantsSpoilageCoverage (com.nest.res.bop.domain.BOPRestaurantsSpoilageCoverage BOPRestaurantsSpoilageCoverage)  {
	  this.BOPRestaurantsSpoilageCoverage = BOPRestaurantsSpoilageCoverage;

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(!this.BOPRestaurantsSpoilageCoverage.getClassIndicator_1().equals((String)"") && !this.BOPRestaurantsSpoilageCoverage.getCoverageType_1().equals((String)"") && !this.BOPRestaurantsSpoilageCoverage.getMaintenanceAgreement_1().equals((String)"")){
			this.BOPRestaurantsSpoilageCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SpoilageRate",((String)XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage," ../Class ")),((String)XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage," ../CoverageType ")),((String)XpathNode.selectNodeValue(this.BOPRestaurantsSpoilageCoverage," ../MaintenanceAgreement")))));
		}
		else{
			this.BOPRestaurantsSpoilageCoverage.setRate((double)0.0);
		}
	  
	}
	
	
	
	
	


	
}