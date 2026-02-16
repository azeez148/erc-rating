package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLocationFireDeptServiceCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPLocationFireDeptServiceCoverage BOPLocationFireDeptServiceCoverage;
	
	
	
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPLocationFireDeptServiceCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("FireDeptServiceInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	Charge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPLocationFireDeptServiceCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPLocationFireDeptServiceCoverage.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationFireDeptServiceCoverage,"../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationFireDeptServiceCoverage,"../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLocationFireDeptServiceCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLocationFireDeptServiceCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLocationFireDeptServiceCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPLocationFireDeptServiceCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPLocationFireDeptServiceCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPLocationFireDeptServiceCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void Charge () throws LookupException,NumberFormatException {
	  
		if(this.BOPLocationFireDeptServiceCoverage.getDsLimit() > this.BOPLocationFireDeptServiceCoverage.getInclddLimit()){
			this.BOPLocationFireDeptServiceCoverage.setCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FireDeptServiceCharge",String.valueOf(this.BOPLocationFireDeptServiceCoverage.getDsLimit())))));
		}
		else{
			this.BOPLocationFireDeptServiceCoverage.setCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPLocationFireDeptServiceCoverage (com.nest.res.bop.al09012019.domain.BOPLocationFireDeptServiceCoverage BOPLocationFireDeptServiceCoverage)  {
	  this.BOPLocationFireDeptServiceCoverage = BOPLocationFireDeptServiceCoverage;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLocationFireDeptServiceCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPLocationFireDeptServiceCoverage.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationFireDeptServiceCoverage,"../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationFireDeptServiceCoverage,"../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}