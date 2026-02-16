package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPSpoilgCov  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPSpoilgCov BOPSpoilgCov;
	
	
	
	public  BOPSpoilgCov (com.nest.res.bop.al09012019.domain.BOPSpoilgCov BOPSpoilgCov)  {
	  this.BOPSpoilgCov = BOPSpoilgCov;

	  
	}
	public void ClassIndicator () throws LookupException,NumberFormatException {
	  
		if(!this.BOPSpoilgCov.getClasss().equals(MathHelper.getStringValue("Other")) && !this.BOPSpoilgCov.getClasss().equals(MathHelper.getStringValue(""))){
			this.BOPSpoilgCov.setClassIndicator(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("SpoilageClassIndicator",String.valueOf(this.BOPSpoilgCov.getClasss())))));
		}
		else{
			this.BOPSpoilgCov.setClassIndicator(MathHelper.getStringValue(MathHelper.getStringValue("0")));
		}
	  
	}
	public void Premium ()  {
	  this.BOPSpoilgCov.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpoilgCov,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPSpoilgCov.getDsLimit()) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand(this.BOPSpoilgCov.getFactor_1() * MathHelper.roundToThousand(this.BOPSpoilgCov.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpoilgCov,"../CommercialPropertyLCM"))))))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSpoilgCov.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPSpoilgCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPSpoilgCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void factor_1 ()  {
	  
		if(this.BOPSpoilgCov.getCoverageType().equals(MathHelper.getStringValue("Power Outage"))){
			this.BOPSpoilgCov.setFactor_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPSpoilgCov.getPowerOutageFactor())));
		}
		else{
		if(this.BOPSpoilgCov.getCoverageType().equals(MathHelper.getStringValue("Breakdown or Contamination and Power Outage"))){
			this.BOPSpoilgCov.setFactor_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPSpoilgCov.getPowerOutageBreakdownFactor())));
		}
		else{
			this.BOPSpoilgCov.setFactor_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	ClassIndicator();
	
	Rate();
	
	PowerOutageFactor();
	
	PowerOutageBreakdownFactor();
	
	factor_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PowerOutageBreakdownFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPSpoilgCov.getCoverageType().equals(MathHelper.getStringValue("Breakdown or Contamination and Power Outage"))){
			this.BOPSpoilgCov.setPowerOutageBreakdownFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PowerOutageAndBreakdownFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPSpoilgCov,"../../../RatingTerritory"))))));
		}
		else{
			this.BOPSpoilgCov.setPowerOutageBreakdownFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void PowerOutageFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPSpoilgCov.getCoverageType().equals(MathHelper.getStringValue("Power Outage"))){
			this.BOPSpoilgCov.setPowerOutageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PowerOutageFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPSpoilgCov,"../../../RatingTerritory"))))));
		}
		else{
			this.BOPSpoilgCov.setPowerOutageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(!this.BOPSpoilgCov.getClasss().equals(MathHelper.getStringValue("Other")) && !this.BOPSpoilgCov.getClasss().equals(MathHelper.getStringValue(""))){
		if(!this.BOPSpoilgCov.getClassIndicator().equals(MathHelper.getStringValue("")) && !this.BOPSpoilgCov.getCoverageType().equals(MathHelper.getStringValue("")) && !this.BOPSpoilgCov.getMaintenanceAgreement().equals(MathHelper.getStringValue(""))){
			this.BOPSpoilgCov.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SpoilageRate",String.valueOf(this.BOPSpoilgCov.getClassIndicator()),String.valueOf(this.BOPSpoilgCov.getCoverageType()),String.valueOf(this.BOPSpoilgCov.getMaintenanceAgreement())))));
		}
		else{
			this.BOPSpoilgCov.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPSpoilgCov.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPSpoilgCov.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpoilgCov,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPSpoilgCov.getDsLimit()) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand(this.BOPSpoilgCov.getFactor_1() * MathHelper.roundToThousand(this.BOPSpoilgCov.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpoilgCov,"../CommercialPropertyLCM"))))))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}