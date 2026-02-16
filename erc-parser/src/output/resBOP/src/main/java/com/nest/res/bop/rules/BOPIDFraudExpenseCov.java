package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPIDFraudExpenseCov  {

	
	
	
	private com.nest.res.bop.domain.BOPIDFraudExpenseCov BOPIDFraudExpenseCov;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPIDFraudExpenseCov.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IDFraudExpnRate",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(this.BOPIDFraudExpenseCov.getAggregateLimit() > (int)25000.0){
			this.BOPIDFraudExpenseCov.setPremium(MathHelper.roundUpDoller(this.BOPIDFraudExpenseCov.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIDFraudExpenseCov,"../LCM")))) + MathHelper.roundUpDoller(((double)this.BOPIDFraudExpenseCov.getAggregateLimit() - (double)25000.0) / (double)100.0 * this.BOPIDFraudExpenseCov.getOptnlHigherLmtsRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIDFraudExpenseCov,"../IRPMFactor")))));
		}
		else{
			this.BOPIDFraudExpenseCov.setPremium(MathHelper.roundUpDoller(this.BOPIDFraudExpenseCov.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIDFraudExpenseCov,"../LCM")))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPIDFraudExpenseCov.getPremium() != (double)0.0){
			this.BOPIDFraudExpenseCov.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPIDFraudExpenseCov.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	OptnlHigherLmtsRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPIDFraudExpenseCov (com.nest.res.bop.domain.BOPIDFraudExpenseCov BOPIDFraudExpenseCov)  {
	  this.BOPIDFraudExpenseCov = BOPIDFraudExpenseCov;

	  
	}
	public void OptnlHigherLmtsRate () throws LookupException,NumberFormatException {
	  this.BOPIDFraudExpenseCov.setOptnlHigherLmtsRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IDFraudExpnOptnlHigherLmtsRate",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}