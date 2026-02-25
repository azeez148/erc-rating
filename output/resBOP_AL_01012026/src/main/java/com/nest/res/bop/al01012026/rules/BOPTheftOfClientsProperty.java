package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPTheftOfClientsPropertyDetail;

public class BOPTheftOfClientsProperty  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPTheftOfClientsProperty BOPTheftOfClientsProperty;
	private List<BOPTheftOfClientsPropertyDetail> BOPTheftOfClientsPropertyDetailList;
	
	
	
	public void BasePremium ()  {
	  this.BOPTheftOfClientsProperty.setBasePremium(MathHelper.roundUpDoller(this.BOPTheftOfClientsProperty.getTheftOfClientsPropFactor() * ((this.BOPTheftOfClientsProperty.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"../CrimeLCM")))) + this.BOPTheftOfClientsProperty.getFinalAddlEmployeePremium())));

	  
	}
	public void FinalAddlEmployeePremium ()  {
	  this.BOPTheftOfClientsProperty.setFinalAddlEmployeePremium(MathHelper.getDoubleValue(this.BOPTheftOfClientsProperty.getAddlEmployeePremium() * MathHelper.getDoubleValue(this.BOPTheftOfClientsProperty.getAdditionalEmployeesCount())));

	  
	}
	public void employeeDishtyApply_1 ()  {
	  this.BOPTheftOfClientsProperty.setEmployeeDishtyApply_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPTheftOfClientsProperty,"../BOPLocation") ){
			this.BOPTheftOfClientsProperty.setEmployeeDishtyApply_1(MathHelper.getIntegerValue(this.BOPTheftOfClientsProperty.getEmployeeDishtyApply_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"TheftOfClientsPropertyEmployeeDishtyApplyCount")))));
		}

	  
	}
	public void Premium ()  {
	  this.BOPTheftOfClientsProperty.setPremium(MathHelper.roundUpDoller((this.BOPTheftOfClientsProperty.getBasePremium() + this.BOPTheftOfClientsProperty.getAdditionalCharge()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"../IRPMFactor")))));

	  
	}
	public void AdditionalEmployeesCount ()  {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"../BOPEmployeeDishtyCoverage/dsNumEmployees"))) <= MathHelper.getIntegerValue(5.0)){
			this.BOPTheftOfClientsProperty.setAdditionalEmployeesCount(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPTheftOfClientsProperty.setAdditionalEmployeesCount(MathHelper.getIntegerValue(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"../BOPEmployeeDishtyCoverage/dsNumEmployees"))) - MathHelper.getIntegerValue(5.0))));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	DetailCoverageLimit();
	
	AdditionalEmployeesCount();
	
	TheftOfClientsPropFactor();
	
	BaseRate();
	
	AddlEmployeeRate();
	
	AddlEmployeePremium();
	
	FinalAddlEmployeePremium();
	
	BasePremium();
	
	AddlLocationRate();
	
	employeeDishtyApply_1();
	
	AdditionalCharge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void TheftOfClientsPropFactor () throws LookupException,NumberFormatException {
	  this.BOPTheftOfClientsProperty.setTheftOfClientsPropFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TheftOfClientsPropFactor",String.valueOf( "Y"))));

	  
	}
	public  BOPTheftOfClientsProperty (com.nest.res.bop.al01012026.domain.BOPTheftOfClientsProperty BOPTheftOfClientsProperty)  {
	  this.BOPTheftOfClientsProperty = BOPTheftOfClientsProperty;
this.BOPTheftOfClientsPropertyDetailList = BOPTheftOfClientsProperty.getBOPTheftOfClientsPropertyDetail();

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPTheftOfClientsProperty.setPremium(MathHelper.roundUpDoller((this.BOPTheftOfClientsProperty.getBasePremium() + this.BOPTheftOfClientsProperty.getAdditionalCharge()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"../IRPMFactor")))));

	  
	}
	public void DetailCoverageLimit ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"BOPTheftOfClientsPropertyDetail/CoverageLimit")) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"BOPTheftOfClientsPropertyDetail/CoverageLimit"))) != 0){
			this.BOPTheftOfClientsProperty.setDetailCoverageLimit(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"BOPTheftOfClientsPropertyDetail/CoverageLimit")))));
		}
		else{
			this.BOPTheftOfClientsProperty.setDetailCoverageLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPTheftOfClientsProperty.getDetailCoverageLimit() != MathHelper.getIntegerValue(0.0)){
			this.BOPTheftOfClientsProperty.setBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeDishtyBaseRate",String.valueOf(this.BOPTheftOfClientsProperty.getDetailCoverageLimit())))));
		}
		else{
			this.BOPTheftOfClientsProperty.setBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void AdditionalCharge ()  {
	  
		if(this.BOPTheftOfClientsProperty.getEmployeeDishtyApply_1() < MathHelper.getIntegerValue(2.0)){
			this.BOPTheftOfClientsProperty.setAdditionalCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPTheftOfClientsProperty.setAdditionalCharge(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPTheftOfClientsProperty.getAddlLocationRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"../CrimeLCM")))) * this.BOPTheftOfClientsProperty.getTheftOfClientsPropFactor() * (this.BOPTheftOfClientsProperty.getEmployeeDishtyApply_1() - MathHelper.getDoubleValue(1.0)))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPTheftOfClientsProperty.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPTheftOfClientsProperty.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPTheftOfClientsProperty.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void AddlLocationRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPTheftOfClientsProperty.getDetailCoverageLimit() != MathHelper.getIntegerValue(0.0)){
			this.BOPTheftOfClientsProperty.setAddlLocationRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeDishtyAddlLocationRate",String.valueOf(this.BOPTheftOfClientsProperty.getDetailCoverageLimit())))));
		}
		else{
			this.BOPTheftOfClientsProperty.setAddlLocationRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void AddlEmployeePremium ()  {
	  this.BOPTheftOfClientsProperty.setAddlEmployeePremium(MathHelper.roundUpDoller(this.BOPTheftOfClientsProperty.getAddlEmployeeRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"../CrimeLCM")))));

	  
	}
	public void AddlEmployeeRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPTheftOfClientsProperty.getDetailCoverageLimit() != MathHelper.getIntegerValue(0.0)){
			this.BOPTheftOfClientsProperty.setAddlEmployeeRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeDishtyAddlEmployeeRate",String.valueOf(this.BOPTheftOfClientsProperty.getDetailCoverageLimit())))));
		}
		else{
			this.BOPTheftOfClientsProperty.setAddlEmployeeRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}