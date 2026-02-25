package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAutoServiceEmployeeDishonestyCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAutoServiceEmployeeDishonestyCoverage BOPAutoServiceEmployeeDishonestyCoverage;
	
	
	
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPAutoServiceEmployeeDishonestyCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeDishonestyOptionalCoverageFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPAutoServiceEmployeeDishonestyCoverage,"../../BOPEmployeeDishtyCoverage/dsLimit"))) > MathHelper.getIntegerValue(0.0)){
			this.BOPAutoServiceEmployeeDishonestyCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceEmployeeDishonestyCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPAutoServiceEmployeeDishonestyCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceEmployeeDishonestyCoverage,"../../BOPEmployeeDishtyCoverage/FinalAddlEmployeePremium"))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceEmployeeDishonestyCoverage,"../../BOPEmployeeDishtyCoverage/FinalAddlLocationPremium")))) + ((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceEmployeeDishonestyCoverage,"../../BOPEmployeeDishtyCoverage/BaseRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceEmployeeDishonestyCoverage,"../../CrimeLCM"))))) * this.BOPAutoServiceEmployeeDishonestyCoverage.getFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceEmployeeDishonestyCoverage,"../../IRPMFactor")))));

	  
	}
	public  BOPAutoServiceEmployeeDishonestyCoverage (com.nest.res.bop.al01012026.domain.BOPAutoServiceEmployeeDishonestyCoverage BOPAutoServiceEmployeeDishonestyCoverage)  {
	  this.BOPAutoServiceEmployeeDishonestyCoverage = BOPAutoServiceEmployeeDishonestyCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAutoServiceEmployeeDishonestyCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAutoServiceEmployeeDishonestyCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceEmployeeDishonestyCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAutoServiceEmployeeDishonestyCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceEmployeeDishonestyCoverage,"../../BOPEmployeeDishtyCoverage/FinalAddlEmployeePremium"))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceEmployeeDishonestyCoverage,"../../BOPEmployeeDishtyCoverage/FinalAddlLocationPremium")))) + ((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceEmployeeDishonestyCoverage,"../../BOPEmployeeDishtyCoverage/BaseRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceEmployeeDishonestyCoverage,"../../CrimeLCM"))))) * this.BOPAutoServiceEmployeeDishonestyCoverage.getFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceEmployeeDishonestyCoverage,"../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}