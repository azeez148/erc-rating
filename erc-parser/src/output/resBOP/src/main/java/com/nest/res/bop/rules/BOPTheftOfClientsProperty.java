package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPTheftOfClientsProperty  {

	
	
	
	private com.nest.res.bop.domain.BOPTheftOfClientsProperty BOPTheftOfClientsProperty;
	
	
	
	public void FinalAddlEmployeePremium ()  {
	  this.BOPTheftOfClientsProperty.setFinalAddlEmployeePremium(this.BOPTheftOfClientsProperty.getAddlEmployeePremium() * (double)this.BOPTheftOfClientsProperty.getAdditionalEmployeesCount());

	  
	}
	public void AddlLocationRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPTheftOfClientsProperty.getDetailCoverageLimit() != (int)0.0){
			this.BOPTheftOfClientsProperty.setAddlLocationRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeDishtyAddlLocationRate",String.valueOf(BOPTheftOfClientsProperty.getDetailCoverageLimit()))));
		}
		else{
			this.BOPTheftOfClientsProperty.setAddlLocationRate((double)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void employeeDishtyApply_1 ()  {
	  this.BOPTheftOfClientsProperty.setEmployeeDishtyApply_1((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPTheftOfClientsProperty,"../BOPLocation") ){
			this.BOPTheftOfClientsProperty.setEmployeeDishtyApply_1(this.BOPTheftOfClientsProperty.getEmployeeDishtyApply_1()+Integer.valueOf(this.BOPTheftOfClientsProperty.getEmployeeDishtyApply_1()) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"TheftOfClientsPropertyEmployeeDishtyApplyCount"))));
		}

	  
	}
	public void TheftOfClientsPropFactor () throws LookupException,NumberFormatException {
	  this.BOPTheftOfClientsProperty.setTheftOfClientsPropFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TheftOfClientsPropFactor",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPTheftOfClientsProperty.getPremium() != (double)0.0){
			this.BOPTheftOfClientsProperty.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPTheftOfClientsProperty.setPremiumIndicator((int)0.0);
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
	public  BOPTheftOfClientsProperty (com.nest.res.bop.domain.BOPTheftOfClientsProperty BOPTheftOfClientsProperty)  {
	  this.BOPTheftOfClientsProperty = BOPTheftOfClientsProperty;

	  
	}
	public void DetailCoverageLimit ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"BOPTheftOfClientsPropertyDetail/CoverageLimit"))) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"BOPTheftOfClientsPropertyDetail/CoverageLimit"))) != 0){
			this.BOPTheftOfClientsProperty.setDetailCoverageLimit((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"BOPTheftOfClientsPropertyDetail/CoverageLimit"))));
		}
		else{
			this.BOPTheftOfClientsProperty.setDetailCoverageLimit((int)0.0);
		}
	  
	}
	public void AddlEmployeePremium ()  {
	  this.BOPTheftOfClientsProperty.setAddlEmployeePremium(MathHelper.roundUpDoller(this.BOPTheftOfClientsProperty.getAddlEmployeeRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"../CrimeLCM")))));

	  
	}
	public void AdditionalEmployeesCount ()  {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"../BOPEmployeeDishtyCoverage/dsNumEmployees"))) <= (int)5.0){
			this.BOPTheftOfClientsProperty.setAdditionalEmployeesCount((int)0.0);
		}
		else{
			this.BOPTheftOfClientsProperty.setAdditionalEmployeesCount((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"../BOPEmployeeDishtyCoverage/dsNumEmployees"))) - (int)5.0);
		}
	  
	}
	public void AdditionalCharge ()  {
	  
		if(this.BOPTheftOfClientsProperty.getEmployeeDishtyApply_1() < (int)2.0){
			this.BOPTheftOfClientsProperty.setAdditionalCharge((double)0.0);
		}
		else{
			this.BOPTheftOfClientsProperty.setAdditionalCharge(MathHelper.roundUpDoller((this.BOPTheftOfClientsProperty.getAddlLocationRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"../CrimeLCM")))) * (this.BOPTheftOfClientsProperty.getEmployeeDishtyApply_1() - (double)1.0)));
		}
	  
	}
	public void BasePremium ()  {
	  this.BOPTheftOfClientsProperty.setBasePremium(MathHelper.roundUpDoller(this.BOPTheftOfClientsProperty.getTheftOfClientsPropFactor() * ((this.BOPTheftOfClientsProperty.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"../CrimeLCM")))) + this.BOPTheftOfClientsProperty.getFinalAddlEmployeePremium())));

	  
	}
	public void Premium ()  {
	  this.BOPTheftOfClientsProperty.setPremium(MathHelper.roundUpDoller((this.BOPTheftOfClientsProperty.getBasePremium() + this.BOPTheftOfClientsProperty.getAdditionalCharge()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftOfClientsProperty,"../IRPMFactor")))));

	  
	}
	public void AddlEmployeeRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPTheftOfClientsProperty.getDetailCoverageLimit() != (int)0.0){
			this.BOPTheftOfClientsProperty.setAddlEmployeeRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeDishtyAddlEmployeeRate",String.valueOf(BOPTheftOfClientsProperty.getDetailCoverageLimit()))));
		}
		else{
			this.BOPTheftOfClientsProperty.setAddlEmployeeRate((double)0.0);
		}
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPTheftOfClientsProperty.getDetailCoverageLimit() != (int)0.0){
			this.BOPTheftOfClientsProperty.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeDishtyBaseRate",String.valueOf(BOPTheftOfClientsProperty.getDetailCoverageLimit()))));
		}
		else{
			this.BOPTheftOfClientsProperty.setBaseRate((double)0.0);
		}
	  
	}
	
	
	
	
	


	
}