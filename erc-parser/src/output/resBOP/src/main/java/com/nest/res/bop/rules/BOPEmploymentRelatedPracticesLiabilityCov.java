package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEmploymentRelatedPracticesLiabilityCov  {

	
	
	
	private com.nest.res.bop.domain.BOPEmploymentRelatedPracticesLiabilityCov BOPEmploymentRelatedPracticesLiabilityCov;
	
	
	
	public void Premium ()  {
	  this.BOPEmploymentRelatedPracticesLiabilityCov.setPremium(MathHelper.roundUpDoller((this.BOPEmploymentRelatedPracticesLiabilityCov.getCalcPremium_1() + this.BOPEmploymentRelatedPracticesLiabilityCov.getExtendedReportingPeriodPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmploymentRelatedPracticesLiabilityCov,"../IRPMFactor")))));

	  
	}
	public void DedFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPEmploymentRelatedPracticesLiabilityCov.getDed().equals((String)"")){
			this.BOPEmploymentRelatedPracticesLiabilityCov.setDedFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmploymentRelatedDedFactor",String.valueOf(BOPEmploymentRelatedPracticesLiabilityCov.getDed()))));
		}
		else{
			this.BOPEmploymentRelatedPracticesLiabilityCov.setDedFactor((double)0.0);
		}
	  
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
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public  BOPEmploymentRelatedPracticesLiabilityCov (com.nest.res.bop.domain.BOPEmploymentRelatedPracticesLiabilityCov BOPEmploymentRelatedPracticesLiabilityCov)  {
	  this.BOPEmploymentRelatedPracticesLiabilityCov = BOPEmploymentRelatedPracticesLiabilityCov;

	  
	}
	public void NumAddlEmployees ()  {
	  
		if(this.BOPEmploymentRelatedPracticesLiabilityCov.getDsNumEmployees() <= (int)25.0){
			this.BOPEmploymentRelatedPracticesLiabilityCov.setNumAddlEmployees((int)0.0);
		}
		else{
			this.BOPEmploymentRelatedPracticesLiabilityCov.setNumAddlEmployees(this.BOPEmploymentRelatedPracticesLiabilityCov.getDsNumEmployees() - (int)25.0);
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPEmploymentRelatedPracticesLiabilityCov.getPremium() != (double)0.0){
			this.BOPEmploymentRelatedPracticesLiabilityCov.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPEmploymentRelatedPracticesLiabilityCov.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(!this.BOPEmploymentRelatedPracticesLiabilityCov.getCoverageType().equals((String)"")){
			this.BOPEmploymentRelatedPracticesLiabilityCov.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmploymentRelatedRate",String.valueOf(BOPEmploymentRelatedPracticesLiabilityCov.getCoverageType()))));
		}
		else{
			this.BOPEmploymentRelatedPracticesLiabilityCov.setRate((double)0.0);
		}
	  
	}
	public void calcPremium_1 ()  {
	  
		if(this.BOPEmploymentRelatedPracticesLiabilityCov.getDsNumEmployees() <= (int)25.0){
			this.BOPEmploymentRelatedPracticesLiabilityCov.setCalcPremium_1(MathHelper.roundUpDoller(Double.valueOf(this.BOPEmploymentRelatedPracticesLiabilityCov.getRate()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmploymentRelatedPracticesLiabilityCov,"../LCM")))) * Double.valueOf(this.BOPEmploymentRelatedPracticesLiabilityCov.getDsNumEmployees()));
		}
		else{
			this.BOPEmploymentRelatedPracticesLiabilityCov.setCalcPremium_1(MathHelper.roundUpDoller(Double.valueOf(this.BOPEmploymentRelatedPracticesLiabilityCov.getRate()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmploymentRelatedPracticesLiabilityCov,"../LCM")))) * (double)25.0);
		}this.BOPEmploymentRelatedPracticesLiabilityCov.setCalcPremium_1(MathHelper.roundUpDoller((Double.valueOf(this.BOPEmploymentRelatedPracticesLiabilityCov.getCalcPremium_1()) + (MathHelper.roundUpDoller(Double.valueOf(this.BOPEmploymentRelatedPracticesLiabilityCov.getAddlEmployeeRate()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmploymentRelatedPracticesLiabilityCov,"../LCM")))) * Double.valueOf(this.BOPEmploymentRelatedPracticesLiabilityCov.getNumAddlEmployees()))) * (Double.valueOf(this.BOPEmploymentRelatedPracticesLiabilityCov.getIncrLimitFactor()) - Double.valueOf(this.BOPEmploymentRelatedPracticesLiabilityCov.getDedFactor()))));

		if(this.BOPEmploymentRelatedPracticesLiabilityCov.getMaliciousProsecution().equals((String)"Yes")){
			this.BOPEmploymentRelatedPracticesLiabilityCov.setCalcPremium_1(Double.valueOf(this.BOPEmploymentRelatedPracticesLiabilityCov.getCalcPremium_1()) + Double.valueOf(this.BOPEmploymentRelatedPracticesLiabilityCov.getManualPremium()));
		}
	  
	}
	public void ValidationCheckPremium ()  {
	  this.BOPEmploymentRelatedPracticesLiabilityCov.setValidationCheckPremium(this.BOPEmploymentRelatedPracticesLiabilityCov.getCalcPremium_1());

	  
	}
	public void IncrLimitFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPEmploymentRelatedPracticesLiabilityCov.getAggLimit() != (int)10000.0){
		if(this.BOPEmploymentRelatedPracticesLiabilityCov.getAggLimit() != (int)0.0){
			this.BOPEmploymentRelatedPracticesLiabilityCov.setIncrLimitFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmploymentRelatedIncrLimitFactor",String.valueOf(BOPEmploymentRelatedPracticesLiabilityCov.getAggLimit()))));
		}
		else{
			this.BOPEmploymentRelatedPracticesLiabilityCov.setIncrLimitFactor((double)0.0);
		}
		}
		else{
			this.BOPEmploymentRelatedPracticesLiabilityCov.setIncrLimitFactor((double)1.0);
		}
	  
	}
	public void AddlEmployeeRate () throws LookupException,NumberFormatException {
	  
		if(!this.BOPEmploymentRelatedPracticesLiabilityCov.getCoverageType().equals((String)"")){
			this.BOPEmploymentRelatedPracticesLiabilityCov.setAddlEmployeeRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmploymentRelatedAddlEmployeeRate",String.valueOf(BOPEmploymentRelatedPracticesLiabilityCov.getCoverageType()))));
		}
		else{
			this.BOPEmploymentRelatedPracticesLiabilityCov.setAddlEmployeeRate((double)0.0);
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
	
	
	
	
	


	
}