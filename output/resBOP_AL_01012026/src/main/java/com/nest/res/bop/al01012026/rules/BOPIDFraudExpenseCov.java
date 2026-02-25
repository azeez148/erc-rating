package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPIDFraudExpenseCov  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPIDFraudExpenseCov BOPIDFraudExpenseCov;
	
	
	
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPIDFraudExpenseCov.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IDFraudExpnRate",String.valueOf( "Y"))));

	  
	}
	public void OptnlHigherLmtsRate () throws LookupException,NumberFormatException {
	  this.BOPIDFraudExpenseCov.setOptnlHigherLmtsRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IDFraudExpnOptnlHigherLmtsRate",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPIDFraudExpenseCov (com.nest.res.bop.al01012026.domain.BOPIDFraudExpenseCov BOPIDFraudExpenseCov)  {
	  this.BOPIDFraudExpenseCov = BOPIDFraudExpenseCov;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPIDFraudExpenseCov.getAggregateLimit() > MathHelper.getIntegerValue(25000.0)){
			this.BOPIDFraudExpenseCov.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.roundToThousand(this.BOPIDFraudExpenseCov.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIDFraudExpenseCov,"../LCM")))) + MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPIDFraudExpenseCov.getAggregateLimit()) - MathHelper.getDoubleValue(25000.0)) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand(this.BOPIDFraudExpenseCov.getOptnlHigherLmtsRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIDFraudExpenseCov,"../LCM")))))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIDFraudExpenseCov,"../IRPMFactor"))))));
		}
		else{
			this.BOPIDFraudExpenseCov.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((this.BOPIDFraudExpenseCov.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIDFraudExpenseCov,"../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIDFraudExpenseCov,"../IRPMFactor"))))));
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPIDFraudExpenseCov.getAggregateLimit() > MathHelper.getIntegerValue(25000.0)){
			this.BOPIDFraudExpenseCov.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.roundToThousand(this.BOPIDFraudExpenseCov.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIDFraudExpenseCov,"../LCM")))) + MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPIDFraudExpenseCov.getAggregateLimit()) - MathHelper.getDoubleValue(25000.0)) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand(this.BOPIDFraudExpenseCov.getOptnlHigherLmtsRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIDFraudExpenseCov,"../LCM")))))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIDFraudExpenseCov,"../IRPMFactor"))))));
		}
		else{
			this.BOPIDFraudExpenseCov.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((this.BOPIDFraudExpenseCov.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIDFraudExpenseCov,"../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIDFraudExpenseCov,"../IRPMFactor"))))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPIDFraudExpenseCov.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPIDFraudExpenseCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPIDFraudExpenseCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	OptnlHigherLmtsRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}