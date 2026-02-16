package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLimitationsOfCovForCertfdActsTerrsm  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPLimitationsOfCovForCertfdActsTerrsm BOPLimitationsOfCovForCertfdActsTerrsm;
	
	
	
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	AggregateLimitAsInteger();
	
	  
	}
	public  BOPLimitationsOfCovForCertfdActsTerrsm (com.nest.res.bop.al09012019.domain.BOPLimitationsOfCovForCertfdActsTerrsm BOPLimitationsOfCovForCertfdActsTerrsm)  {
	  this.BOPLimitationsOfCovForCertfdActsTerrsm = BOPLimitationsOfCovForCertfdActsTerrsm;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLimitationsOfCovForCertfdActsTerrsm.setPremium(MathHelper.roundUpDoller(this.BOPLimitationsOfCovForCertfdActsTerrsm.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitationsOfCovForCertfdActsTerrsm,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitationsOfCovForCertfdActsTerrsm.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLimitationsOfCovForCertfdActsTerrsm.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLimitationsOfCovForCertfdActsTerrsm.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void AggregateLimitAsInteger () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitationsOfCovForCertfdActsTerrsm,"../AggregateLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPLimitationsOfCovForCertfdActsTerrsm.setAggregateLimitAsInteger(MathHelper.getIntegerValue(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("AggregateLimitAsInteger",String.valueOf(XpathNode.selectNodeValue(this.BOPLimitationsOfCovForCertfdActsTerrsm,"../AggregateLimit"))))));
		}
		else{
			this.BOPLimitationsOfCovForCertfdActsTerrsm.setAggregateLimitAsInteger(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPLimitationsOfCovForCertfdActsTerrsm.setPremium(MathHelper.roundUpDoller(this.BOPLimitationsOfCovForCertfdActsTerrsm.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitationsOfCovForCertfdActsTerrsm,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}