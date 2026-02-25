package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPPharmacists  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPPharmacists BOPPharmacists;
	
	
	
	public  BOPPharmacists (com.nest.res.bop.al01012026.domain.BOPPharmacists BOPPharmacists)  {
	  this.BOPPharmacists = BOPPharmacists;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPPharmacists.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPPharmacists.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPPharmacists.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPPharmacists.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPPharmacists.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPharmacists,"../ProfessionalLiabilityLCM")))) * (MathHelper.getDoubleValue(this.BOPPharmacists.getGrossSales()) / MathHelper.getDoubleValue(1000.0))) * this.BOPPharmacists.getIncrLimitFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPharmacists,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	IncrLimitFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPPharmacists.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PharmacistsRate",String.valueOf( "Y"))));

	  
	}
	public void IncrLimitFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPPharmacists,"../EachOccLimit"))).equals(MathHelper.getStringValue("300,000")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPPharmacists,"../EachOccLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPPharmacists.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PharmacistsIncrLimitFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPPharmacists,"../EachOccLimit"))))));
		}
		else{
			this.BOPPharmacists.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPPharmacists.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPPharmacists.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPharmacists,"../ProfessionalLiabilityLCM")))) * (MathHelper.getDoubleValue(this.BOPPharmacists.getGrossSales()) / MathHelper.getDoubleValue(1000.0))) * this.BOPPharmacists.getIncrLimitFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPharmacists,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}