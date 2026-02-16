package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPComputerFraudFundsTransferFraudCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPComputerFraudFundsTransferFraudCoverage BOPComputerFraudFundsTransferFraudCoverage;
	
	
	
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ComputerFraudBaseRate",String.valueOf(this.BOPComputerFraudFundsTransferFraudCoverage.getDsLimit()))));

	  
	}
	public void AddlLocationRate () throws LookupException,NumberFormatException {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setAddlLocationRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ComputerFraudAddlLocationRate",String.valueOf(this.BOPComputerFraudFundsTransferFraudCoverage.getDsLimit()))));

	  
	}
	public void AddlEmployeeRate () throws LookupException,NumberFormatException {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setAddlEmployeeRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ComputerFraudAddlEmployeeRate",String.valueOf(this.BOPComputerFraudFundsTransferFraudCoverage.getDsLimit()))));

	  
	}
	public void AddlLocationPremium ()  {
	  
		if(this.BOPComputerFraudFundsTransferFraudCoverage.getNumberOfAdditionalLocations() >= MathHelper.getIntegerValue(1.0)){
			this.BOPComputerFraudFundsTransferFraudCoverage.setAddlLocationPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPComputerFraudFundsTransferFraudCoverage.getAddlLocationRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPComputerFraudFundsTransferFraudCoverage,"../CrimeLCM")))) * MathHelper.getDoubleValue(this.BOPComputerFraudFundsTransferFraudCoverage.getNumAddlLocations()))));
		}
		else{
			this.BOPComputerFraudFundsTransferFraudCoverage.setAddlLocationPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPComputerFraudFundsTransferFraudCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPComputerFraudFundsTransferFraudCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPComputerFraudFundsTransferFraudCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPComputerFraudFundsTransferFraudCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPComputerFraudFundsTransferFraudCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPComputerFraudFundsTransferFraudCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void NumEmployees ()  {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setDsNumEmployees(this.BOPComputerFraudFundsTransferFraudCoverage.getNumEmployees());

	  
	}
	public void numEmployees ()  {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setNumEmployees(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPComputerFraudFundsTransferFraudCoverage,"../BOPLocation") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ComputerFraudApply"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPComputerFraudFundsTransferFraudCoverage.setNumEmployees(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPComputerFraudFundsTransferFraudCoverage.getNumEmployees() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"ComputerFraudNumEmployees"))))));
		}		}

	  
	}
	public void numberOfAdditionalLocations ()  {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setNumberOfAdditionalLocations(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPComputerFraudFundsTransferFraudCoverage,"../BOPLocation") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ComputerFraudApply"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPComputerFraudFundsTransferFraudCoverage.setNumberOfAdditionalLocations(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPComputerFraudFundsTransferFraudCoverage.getNumberOfAdditionalLocations() + MathHelper.getIntegerValue(1.0))));
		}		}

	  
	}
	public  BOPComputerFraudFundsTransferFraudCoverage (com.nest.res.bop.al09012019.domain.BOPComputerFraudFundsTransferFraudCoverage BOPComputerFraudFundsTransferFraudCoverage)  {
	  this.BOPComputerFraudFundsTransferFraudCoverage = BOPComputerFraudFundsTransferFraudCoverage;

	  
	}
	public void Premium ()  {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPComputerFraudFundsTransferFraudCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPComputerFraudFundsTransferFraudCoverage,"../CrimeLCM")))) + this.BOPComputerFraudFundsTransferFraudCoverage.getAddlEmployeePremium() + this.BOPComputerFraudFundsTransferFraudCoverage.getAddlLocationPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPComputerFraudFundsTransferFraudCoverage,"../IRPMFactor")))));

	  
	}
	public void AddlEmployeePremium ()  {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setAddlEmployeePremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPComputerFraudFundsTransferFraudCoverage.getAddlEmployeeRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPComputerFraudFundsTransferFraudCoverage,"../CrimeLCM")))) * MathHelper.getDoubleValue(this.BOPComputerFraudFundsTransferFraudCoverage.getNumAddlEmployees())));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPComputerFraudFundsTransferFraudCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPComputerFraudFundsTransferFraudCoverage,"../CrimeLCM")))) + this.BOPComputerFraudFundsTransferFraudCoverage.getAddlEmployeePremium() + this.BOPComputerFraudFundsTransferFraudCoverage.getAddlLocationPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPComputerFraudFundsTransferFraudCoverage,"../IRPMFactor")))));

	  
	}
	public void NumAddlLocations ()  {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setNumAddlLocations(MathHelper.getIntegerValue(this.BOPComputerFraudFundsTransferFraudCoverage.getNumberOfAdditionalLocations() - MathHelper.getIntegerValue(1.0)));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	numberOfAdditionalLocations();
	
	NumAddlLocations();
	
	numEmployees();
	
	NumEmployees();
	
	AddlEmployeeRate();
	
	BaseRate();
	
	NumAddlEmployees();
	
	AddlLocationRate();
	
	AddlEmployeePremium();
	
	AddlLocationPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void NumAddlEmployees ()  {
	  
		if(this.BOPComputerFraudFundsTransferFraudCoverage.getDsNumEmployees() <= MathHelper.getIntegerValue(5.0)){
			this.BOPComputerFraudFundsTransferFraudCoverage.setNumAddlEmployees(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPComputerFraudFundsTransferFraudCoverage.setNumAddlEmployees(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPComputerFraudFundsTransferFraudCoverage.getDsNumEmployees() - MathHelper.getIntegerValue(5.0))));
		}
	  
	}
	
	
	
	
	


	
}