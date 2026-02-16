package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMotels  {

	
	
	
	private com.nest.res.bop.domain.BOPMotels BOPMotels;
	
	
	
	public void GuestsPropInclddLimit () throws LookupException,NumberFormatException {
	  this.BOPMotels.setGuestsPropInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("MotelsGuestsPropInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	GuestsPropInclddLimit();
	
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void LockReplacementLimit () throws LookupException,NumberFormatException {
	  this.BOPMotels.setLockReplacementLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("MotelsLockReplacementLimit",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	LockReplacementLimit();
	
	PerGuestInclddLimit();
	
	  
	}
	public  BOPMotels (com.nest.res.bop.domain.BOPMotels BOPMotels)  {
	  this.BOPMotels = BOPMotels;

	  
	}
	public void PerGuestInclddLimit () throws LookupException,NumberFormatException {
	  this.BOPMotels.setPerGuestInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("MotelsPerGuestInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMotels.getPremium() != (double)0.0){
			this.BOPMotels.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPMotels.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(this.BOPMotels.getGuestsPropLimit() > this.BOPMotels.getGuestsPropInclddLimit()){
			this.BOPMotels.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MotelsGuestsPropLimitRate",String.valueOf(BOPMotels.getPerGuestLimit()),String.valueOf(BOPMotels.getGuestsPropLimit()))));
		}
		else{
			this.BOPMotels.setRate((double)0.0);
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPMotels.getGuestsPropLimit() > this.BOPMotels.getGuestsPropInclddLimit()){
			this.BOPMotels.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotels,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotels,"../../../../PropDamageLiabDedFactor"))) * MathHelper.roundUpDoller(this.BOPMotels.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotels,"../CrimeLCM")))))));
		}
		else{
			this.BOPMotels.setPremium((double)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	
	
	
	
	


	
}