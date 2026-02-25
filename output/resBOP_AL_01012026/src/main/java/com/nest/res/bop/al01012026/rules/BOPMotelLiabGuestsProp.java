package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMotelLiabGuestsProp  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMotelLiabGuestsProp BOPMotelLiabGuestsProp;
	
	
	
	public void Premium ()  {
	  this.BOPMotelLiabGuestsProp.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotelLiabGuestsProp,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotelLiabGuestsProp,"../../../../PropDamageLiabDedFactor"))) * MathHelper.roundUpDoller(this.BOPMotelLiabGuestsProp.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotelLiabGuestsProp,"../CrimeLCM")))))));

	  
	}
	public  BOPMotelLiabGuestsProp (com.nest.res.bop.al01012026.domain.BOPMotelLiabGuestsProp BOPMotelLiabGuestsProp)  {
	  this.BOPMotelLiabGuestsProp = BOPMotelLiabGuestsProp;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPMotelLiabGuestsProp.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotelLiabGuestsProp,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotelLiabGuestsProp,"../../../../PropDamageLiabDedFactor"))) * MathHelper.roundUpDoller(this.BOPMotelLiabGuestsProp.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotelLiabGuestsProp,"../CrimeLCM")))))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(this.BOPMotelLiabGuestsProp.getDsLimit() != MathHelper.getIntegerValue(0.0)){
			this.BOPMotelLiabGuestsProp.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MotelGuestsPropSafeDepositLimitRate",String.valueOf(this.BOPMotelLiabGuestsProp.getDsLimit())))));
		}
		else{
			this.BOPMotelLiabGuestsProp.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMotelLiabGuestsProp.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPMotelLiabGuestsProp.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMotelLiabGuestsProp.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}