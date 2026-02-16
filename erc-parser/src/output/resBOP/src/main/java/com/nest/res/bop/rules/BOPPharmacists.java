package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPPharmacists  {

	
	
	
	private com.nest.res.bop.domain.BOPPharmacists BOPPharmacists;
	
	
	
	public void IncrLimitFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPPharmacists,"../EachOccLimit"))).equals((String)"300,000") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPPharmacists,"../EachOccLimit"))).equals((String)"")){
			this.BOPPharmacists.setIncrLimitFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PharmacistsIncrLimitFactor",((String)XpathNode.selectNodeValue(this.BOPPharmacists," ../EachOccLimit")))));
		}
		else{
			this.BOPPharmacists.setIncrLimitFactor((double)1.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPPharmacists.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPPharmacists.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPharmacists,"../ProfessionalLiabilityLCM")))) * ((double)this.BOPPharmacists.getGrossSales() / (double)1000.0)) * this.BOPPharmacists.getIncrLimitFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPharmacists,"../IRPMFactor")))));

	  
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
	public  BOPPharmacists (com.nest.res.bop.domain.BOPPharmacists BOPPharmacists)  {
	  this.BOPPharmacists = BOPPharmacists;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPPharmacists.getPremium() != (double)0.0){
			this.BOPPharmacists.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPPharmacists.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}