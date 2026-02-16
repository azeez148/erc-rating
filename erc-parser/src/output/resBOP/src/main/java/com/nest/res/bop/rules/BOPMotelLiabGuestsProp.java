package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMotelLiabGuestsProp  {

	
	
	
	private com.nest.res.bop.domain.BOPMotelLiabGuestsProp BOPMotelLiabGuestsProp;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPMotelLiabGuestsProp.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotelLiabGuestsProp,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotelLiabGuestsProp,"../../../../PropDamageLiabDedFactor"))) * MathHelper.roundUpDoller(this.BOPMotelLiabGuestsProp.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMotelLiabGuestsProp,"../CrimeLCM")))))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMotelLiabGuestsProp.getPremium() != (double)0.0){
			this.BOPMotelLiabGuestsProp.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPMotelLiabGuestsProp.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(this.BOPMotelLiabGuestsProp.getDsLimit() != (int)0.0){
			this.BOPMotelLiabGuestsProp.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MotelGuestsPropSafeDepositLimitRate",String.valueOf(BOPMotelLiabGuestsProp.getDsLimit()))));
		}
		else{
			this.BOPMotelLiabGuestsProp.setRate((double)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPMotelLiabGuestsProp (com.nest.res.bop.domain.BOPMotelLiabGuestsProp BOPMotelLiabGuestsProp)  {
	  this.BOPMotelLiabGuestsProp = BOPMotelLiabGuestsProp;

	  
	}
	
	
	
	
	


	
}