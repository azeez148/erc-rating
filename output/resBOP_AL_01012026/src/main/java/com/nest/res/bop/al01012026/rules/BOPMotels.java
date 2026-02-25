package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMotels  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMotels BOPMotels;
	
	
	
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(this.BOPMotels.getGuestsPropLimit() > this.BOPMotels.getGuestsPropInclddLimit()){
			this.BOPMotels.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MotelsGuestsPropLimitRate",String.valueOf(this.BOPMotels.getPerGuestLimit()),String.valueOf(this.BOPMotels.getGuestsPropLimit())))));
		}
		else{
			this.BOPMotels.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void GuestsPropInclddLimit () throws LookupException,NumberFormatException {
	  this.BOPMotels.setGuestsPropInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("MotelsGuestsPropInclddLimit",String.valueOf( "Y"))));

	  
	}
	public  BOPMotels (com.nest.res.bop.al01012026.domain.BOPMotels BOPMotels)  {
	  this.BOPMotels = BOPMotels;

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	LockReplacementLimit();
	
	PerGuestInclddLimit();
	
	  
	}
	public void Premium ()  {
	  
		if(this.BOPMotels.getGuestsPropLimit() > this.BOPMotels.getGuestsPropInclddLimit()){
			this.BOPMotels.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotels,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotels,"../../../../PropDamageLiabDedFactor"))) * MathHelper.roundUpDoller(this.BOPMotels.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotels,"../CrimeLCM"))))))));
		}
		else{
			this.BOPMotels.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void LockReplacementLimit () throws LookupException,NumberFormatException {
	  this.BOPMotels.setLockReplacementLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("MotelsLockReplacementLimit",String.valueOf( "Y"))));

	  
	}
	public void PerGuestInclddLimit () throws LookupException,NumberFormatException {
	  this.BOPMotels.setPerGuestInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("MotelsPerGuestInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMotels.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPMotels.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMotels.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPMotels.getGuestsPropLimit() > this.BOPMotels.getGuestsPropInclddLimit()){
			this.BOPMotels.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotels,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotels,"../../../../PropDamageLiabDedFactor"))) * MathHelper.roundUpDoller(this.BOPMotels.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotels,"../CrimeLCM"))))))));
		}
		else{
			this.BOPMotels.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	GuestsPropInclddLimit();
	
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}