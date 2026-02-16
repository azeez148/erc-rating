package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPApartmentBuildings  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPApartmentBuildings BOPApartmentBuildings;
	
	
	
	public  BOPApartmentBuildings (com.nest.res.bop.al09012019.domain.BOPApartmentBuildings BOPApartmentBuildings)  {
	  this.BOPApartmentBuildings = BOPApartmentBuildings;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Charge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Charge () throws LookupException,NumberFormatException {
	  this.BOPApartmentBuildings.setCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ApartmentBuildingCharge",String.valueOf( "Y"))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPApartmentBuildings.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPApartmentBuildings.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPApartmentBuildings,"../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPApartmentBuildings,"../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPApartmentBuildings.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPApartmentBuildings.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPApartmentBuildings.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPApartmentBuildings.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPApartmentBuildings.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPApartmentBuildings,"../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPApartmentBuildings,"../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}