package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPSpoilgCov  {

	
	
	
	private com.nest.res.bop.domain.BOPSpoilgCov BOPSpoilgCov;
	
	
	
	public void ClassIndicator () throws LookupException,NumberFormatException {
	  
		if(!this.BOPSpoilgCov.getClasss().equals((String)"Other") && !this.BOPSpoilgCov.getClasss().equals((String)"")){
			this.BOPSpoilgCov.setClassIndicator(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("SpoilageClassIndicator",String.valueOf(BOPSpoilgCov.getClasss()))));
		}
		else{
			this.BOPSpoilgCov.setClassIndicator((String)"0");
		}
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(!this.BOPSpoilgCov.getClasss().equals((String)"Other") && !this.BOPSpoilgCov.getClasss().equals((String)"")){
		if(!this.BOPSpoilgCov.getClassIndicator().equals((String)"") && !this.BOPSpoilgCov.getCoverageType().equals((String)"") && !this.BOPSpoilgCov.getMaintenanceAgreement().equals((String)"")){
			this.BOPSpoilgCov.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SpoilageRate",String.valueOf(BOPSpoilgCov.getClassIndicator()),String.valueOf(BOPSpoilgCov.getCoverageType()),String.valueOf(BOPSpoilgCov.getMaintenanceAgreement()))));
		}
		else{
			this.BOPSpoilgCov.setRate((double)0.0);
		}
		}
		else{
			this.BOPSpoilgCov.setRate((double)0.0);
		}
	  
	}
	public void PowerOutageFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPSpoilgCov.getCoverageType().equals((String)"Power Outage")){
			this.BOPSpoilgCov.setPowerOutageFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PowerOutageFactor",((String)XpathNode.selectNodeValue(this.BOPSpoilgCov," ../../../RatingTerritory")))));
		}
		else{
			this.BOPSpoilgCov.setPowerOutageFactor((double)1.0);
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSpoilgCov.getPremium() != (double)0.0){
			this.BOPSpoilgCov.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPSpoilgCov.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPSpoilgCov.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpoilgCov,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((double)this.BOPSpoilgCov.getDsLimit() / (double)100.0) * MathHelper.roundToThousand(this.BOPSpoilgCov.getFactor_1() * MathHelper.roundToThousand(this.BOPSpoilgCov.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpoilgCov,"../CommercialPropertyLCM"))))))));

	  
	}
	public  BOPSpoilgCov (com.nest.res.bop.domain.BOPSpoilgCov BOPSpoilgCov)  {
	  this.BOPSpoilgCov = BOPSpoilgCov;

	  
	}
	public void factor_1 ()  {
	  
		if(this.BOPSpoilgCov.getCoverageType().equals((String)"Power Outage")){
			this.BOPSpoilgCov.setFactor_1(Double.valueOf(this.BOPSpoilgCov.getPowerOutageFactor()));
		}
		else{
		if(this.BOPSpoilgCov.getCoverageType().equals((String)"Breakdown or Contamination and Power Outage")){
			this.BOPSpoilgCov.setFactor_1(Double.valueOf(this.BOPSpoilgCov.getPowerOutageBreakdownFactor()));
		}
		else{
			this.BOPSpoilgCov.setFactor_1((double)1.0);
		}
		}
	  
	}
	public void PowerOutageBreakdownFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPSpoilgCov.getCoverageType().equals((String)"Breakdown or Contamination and Power Outage")){
			this.BOPSpoilgCov.setPowerOutageBreakdownFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PowerOutageAndBreakdownFactor",((String)XpathNode.selectNodeValue(this.BOPSpoilgCov," ../../../RatingTerritory")))));
		}
		else{
			this.BOPSpoilgCov.setPowerOutageBreakdownFactor((double)1.0);
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
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}