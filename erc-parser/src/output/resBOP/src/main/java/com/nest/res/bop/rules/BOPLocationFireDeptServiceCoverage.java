package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLocationFireDeptServiceCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPLocationFireDeptServiceCoverage BOPLocationFireDeptServiceCoverage;
	
	
	
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPLocationFireDeptServiceCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("FireDeptServiceInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  this.BOPLocationFireDeptServiceCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPLocationFireDeptServiceCoverage.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationFireDeptServiceCoverage,"../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationFireDeptServiceCoverage,"../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLocationFireDeptServiceCoverage.getPremium() != (double)0.0){
			this.BOPLocationFireDeptServiceCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPLocationFireDeptServiceCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPLocationFireDeptServiceCoverage (com.nest.res.bop.domain.BOPLocationFireDeptServiceCoverage BOPLocationFireDeptServiceCoverage)  {
	  this.BOPLocationFireDeptServiceCoverage = BOPLocationFireDeptServiceCoverage;

	  
	}
	public void Charge () throws LookupException,NumberFormatException {
	  
		if(this.BOPLocationFireDeptServiceCoverage.getDsLimit() > this.BOPLocationFireDeptServiceCoverage.getInclddLimit()){
			this.BOPLocationFireDeptServiceCoverage.setCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FireDeptServiceCharge",String.valueOf(BOPLocationFireDeptServiceCoverage.getDsLimit()))));
		}
		else{
			this.BOPLocationFireDeptServiceCoverage.setCharge((double)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	Charge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}