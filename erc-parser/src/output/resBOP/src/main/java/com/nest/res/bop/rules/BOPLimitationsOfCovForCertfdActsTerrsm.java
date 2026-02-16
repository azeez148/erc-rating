package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLimitationsOfCovForCertfdActsTerrsm  {

	
	
	
	private com.nest.res.bop.domain.BOPLimitationsOfCovForCertfdActsTerrsm BOPLimitationsOfCovForCertfdActsTerrsm;
	
	
	
	public void AggregateLimitAsInteger () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitationsOfCovForCertfdActsTerrsm,"../AggregateLimit"))).equals((String)"")){
			this.BOPLimitationsOfCovForCertfdActsTerrsm.setAggregateLimitAsInteger(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("AggregateLimitAsInteger",((String)XpathNode.selectNodeValue(this.BOPLimitationsOfCovForCertfdActsTerrsm," ../AggregateLimit")))));
		}
		else{
			this.BOPLimitationsOfCovForCertfdActsTerrsm.setAggregateLimitAsInteger((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitationsOfCovForCertfdActsTerrsm.getPremium() != (double)0.0){
			this.BOPLimitationsOfCovForCertfdActsTerrsm.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPLimitationsOfCovForCertfdActsTerrsm.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public  BOPLimitationsOfCovForCertfdActsTerrsm (com.nest.res.bop.domain.BOPLimitationsOfCovForCertfdActsTerrsm BOPLimitationsOfCovForCertfdActsTerrsm)  {
	  this.BOPLimitationsOfCovForCertfdActsTerrsm = BOPLimitationsOfCovForCertfdActsTerrsm;

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	AggregateLimitAsInteger();
	
	  
	}
	public void Premium ()  {
	  this.BOPLimitationsOfCovForCertfdActsTerrsm.setPremium(MathHelper.roundUpDoller(this.BOPLimitationsOfCovForCertfdActsTerrsm.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitationsOfCovForCertfdActsTerrsm,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}