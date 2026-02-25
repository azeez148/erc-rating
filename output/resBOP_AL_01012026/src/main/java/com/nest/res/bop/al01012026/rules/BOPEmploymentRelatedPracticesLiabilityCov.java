package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEmploymentRelatedPracticesLiabilityCov  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPEmploymentRelatedPracticesLiabilityCov BOPEmploymentRelatedPracticesLiabilityCov;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPEmploymentRelatedPracticesLiabilityCov.setPremium(MathHelper.roundUpDoller((this.BOPEmploymentRelatedPracticesLiabilityCov.getCalcPremium_1() + this.BOPEmploymentRelatedPracticesLiabilityCov.getExtendedReportingPeriodPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmploymentRelatedPracticesLiabilityCov,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	IncrLimitFactor();
	
	AddlEmployeeRate();
	
	Rate();
	
	DedFactor();
	
	NumAddlEmployees();
	
	calcPremium_1();
	
	ValidationCheckPremium();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPEmploymentRelatedPracticesLiabilityCov.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPEmploymentRelatedPracticesLiabilityCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPEmploymentRelatedPracticesLiabilityCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void IncrLimitFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPEmploymentRelatedPracticesLiabilityCov.getAggLimit() != MathHelper.getIntegerValue(10000.0)){
		if(this.BOPEmploymentRelatedPracticesLiabilityCov.getAggLimit() != MathHelper.getIntegerValue(0.0)){
			this.BOPEmploymentRelatedPracticesLiabilityCov.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmploymentRelatedIncrLimitFactor",String.valueOf(this.BOPEmploymentRelatedPracticesLiabilityCov.getAggLimit())))));
		}
		else{
			this.BOPEmploymentRelatedPracticesLiabilityCov.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPEmploymentRelatedPracticesLiabilityCov.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPEmploymentRelatedPracticesLiabilityCov.setPremium(MathHelper.roundUpDoller((this.BOPEmploymentRelatedPracticesLiabilityCov.getCalcPremium_1() + this.BOPEmploymentRelatedPracticesLiabilityCov.getExtendedReportingPeriodPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmploymentRelatedPracticesLiabilityCov,"../IRPMFactor")))));

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(!this.BOPEmploymentRelatedPracticesLiabilityCov.getCoverageType().equals(MathHelper.getStringValue(""))){
			this.BOPEmploymentRelatedPracticesLiabilityCov.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmploymentRelatedRate",String.valueOf(this.BOPEmploymentRelatedPracticesLiabilityCov.getCoverageType())))));
		}
		else{
			this.BOPEmploymentRelatedPracticesLiabilityCov.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void DedFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPEmploymentRelatedPracticesLiabilityCov.getDed().equals(MathHelper.getStringValue(""))){
			this.BOPEmploymentRelatedPracticesLiabilityCov.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmploymentRelatedDedFactor",String.valueOf(this.BOPEmploymentRelatedPracticesLiabilityCov.getDed())))));
		}
		else{
			this.BOPEmploymentRelatedPracticesLiabilityCov.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void NumAddlEmployees ()  {
	  
		if(this.BOPEmploymentRelatedPracticesLiabilityCov.getDsNumEmployees() <= MathHelper.getIntegerValue(25.0)){
			this.BOPEmploymentRelatedPracticesLiabilityCov.setNumAddlEmployees(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPEmploymentRelatedPracticesLiabilityCov.setNumAddlEmployees(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPEmploymentRelatedPracticesLiabilityCov.getDsNumEmployees() - MathHelper.getIntegerValue(25.0))));
		}
	  
	}
	public  BOPEmploymentRelatedPracticesLiabilityCov (com.nest.res.bop.al01012026.domain.BOPEmploymentRelatedPracticesLiabilityCov BOPEmploymentRelatedPracticesLiabilityCov)  {
	  this.BOPEmploymentRelatedPracticesLiabilityCov = BOPEmploymentRelatedPracticesLiabilityCov;

	  
	}
	public void ValidationCheckPremium ()  {
	  this.BOPEmploymentRelatedPracticesLiabilityCov.setValidationCheckPremium(this.BOPEmploymentRelatedPracticesLiabilityCov.getCalcPremium_1());

	  
	}
	public void AddlEmployeeRate () throws LookupException,NumberFormatException {
	  
		if(!this.BOPEmploymentRelatedPracticesLiabilityCov.getCoverageType().equals(MathHelper.getStringValue(""))){
			this.BOPEmploymentRelatedPracticesLiabilityCov.setAddlEmployeeRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmploymentRelatedAddlEmployeeRate",String.valueOf(this.BOPEmploymentRelatedPracticesLiabilityCov.getCoverageType())))));
		}
		else{
			this.BOPEmploymentRelatedPracticesLiabilityCov.setAddlEmployeeRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	IncrLimitFactor();
	
	AddlEmployeeRate();
	
	Rate();
	
	DedFactor();
	
	NumAddlEmployees();
	
	calcPremium_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void calcPremium_1 ()  {
	  
		if(this.BOPEmploymentRelatedPracticesLiabilityCov.getDsNumEmployees() <= MathHelper.getIntegerValue(25.0)){
			this.BOPEmploymentRelatedPracticesLiabilityCov.setCalcPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.getDoubleValue(this.BOPEmploymentRelatedPracticesLiabilityCov.getRate()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmploymentRelatedPracticesLiabilityCov,"../LCM")))) * MathHelper.getDoubleValue(this.BOPEmploymentRelatedPracticesLiabilityCov.getDsNumEmployees()))));
		}
		else{
			this.BOPEmploymentRelatedPracticesLiabilityCov.setCalcPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.getDoubleValue(this.BOPEmploymentRelatedPracticesLiabilityCov.getRate()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmploymentRelatedPracticesLiabilityCov,"../LCM")))) * MathHelper.getDoubleValue(25.0))));
		}this.BOPEmploymentRelatedPracticesLiabilityCov.setCalcPremium_1(MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPEmploymentRelatedPracticesLiabilityCov.getCalcPremium_1()) + (MathHelper.roundUpDoller(MathHelper.getDoubleValue(this.BOPEmploymentRelatedPracticesLiabilityCov.getAddlEmployeeRate()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmploymentRelatedPracticesLiabilityCov,"../LCM")))) * MathHelper.getDoubleValue(this.BOPEmploymentRelatedPracticesLiabilityCov.getNumAddlEmployees()))) * (MathHelper.getDoubleValue(this.BOPEmploymentRelatedPracticesLiabilityCov.getIncrLimitFactor()) - MathHelper.getDoubleValue(this.BOPEmploymentRelatedPracticesLiabilityCov.getDedFactor()))));

		if(this.BOPEmploymentRelatedPracticesLiabilityCov.getMaliciousProsecution().equals(MathHelper.getStringValue("Yes"))){
			this.BOPEmploymentRelatedPracticesLiabilityCov.setCalcPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPEmploymentRelatedPracticesLiabilityCov.getCalcPremium_1()) + MathHelper.getDoubleValue(this.BOPEmploymentRelatedPracticesLiabilityCov.getManualPremium()))));
		}
	  
	}
	
	
	
	
	


	
}