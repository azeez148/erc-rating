package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPComputerFraudFundsTransferFraudCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPComputerFraudFundsTransferFraudCoverage BOPComputerFraudFundsTransferFraudCoverage;
	
	
	
	public void AddlEmployeePremium ()  {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setAddlEmployeePremium(MathHelper.roundUpDoller(this.BOPComputerFraudFundsTransferFraudCoverage.getAddlEmployeeRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPComputerFraudFundsTransferFraudCoverage,"../CrimeLCM")))) * (double)this.BOPComputerFraudFundsTransferFraudCoverage.getNumAddlEmployees());

	  
	}
	public void NumAddlEmployees ()  {
	  
		if(this.BOPComputerFraudFundsTransferFraudCoverage.getDsNumEmployees() <= (int)5.0){
			this.BOPComputerFraudFundsTransferFraudCoverage.setNumAddlEmployees((int)0.0);
		}
		else{
			this.BOPComputerFraudFundsTransferFraudCoverage.setNumAddlEmployees(this.BOPComputerFraudFundsTransferFraudCoverage.getDsNumEmployees() - (int)5.0);
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPComputerFraudFundsTransferFraudCoverage.getPremium() != (double)0.0){
			this.BOPComputerFraudFundsTransferFraudCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPComputerFraudFundsTransferFraudCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void AddlLocationPremium ()  {
	  
		if(this.BOPComputerFraudFundsTransferFraudCoverage.getNumberOfAdditionalLocations() >= (int)1.0){
			this.BOPComputerFraudFundsTransferFraudCoverage.setAddlLocationPremium(MathHelper.roundUpDoller(this.BOPComputerFraudFundsTransferFraudCoverage.getAddlLocationRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPComputerFraudFundsTransferFraudCoverage,"../CrimeLCM")))) * (double)this.BOPComputerFraudFundsTransferFraudCoverage.getNumAddlLocations());
		}
		else{
			this.BOPComputerFraudFundsTransferFraudCoverage.setAddlLocationPremium((double)0.0);
		}
	  
	}
	public void numberOfAdditionalLocations ()  {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setNumberOfAdditionalLocations((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPComputerFraudFundsTransferFraudCoverage,"../BOPLocation") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ComputerFraudApply"))).equals((String)"Yes")){
			this.BOPComputerFraudFundsTransferFraudCoverage.setNumberOfAdditionalLocations(Integer.valueOf(this.BOPComputerFraudFundsTransferFraudCoverage.getNumberOfAdditionalLocations()) + (int)1.0);
		}		}

	  
	}
	public void NumAddlLocations ()  {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setNumAddlLocations(this.BOPComputerFraudFundsTransferFraudCoverage.getNumberOfAdditionalLocations() - (int)1.0);

	  
	}
	public void Premium ()  {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPComputerFraudFundsTransferFraudCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPComputerFraudFundsTransferFraudCoverage,"../CrimeLCM")))) + this.BOPComputerFraudFundsTransferFraudCoverage.getAddlEmployeePremium() + this.BOPComputerFraudFundsTransferFraudCoverage.getAddlLocationPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPComputerFraudFundsTransferFraudCoverage,"../IRPMFactor")))));

	  
	}
	public void NumEmployees ()  {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setDsNumEmployees(this.BOPComputerFraudFundsTransferFraudCoverage.getNumEmployees());

	  
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
	public  BOPComputerFraudFundsTransferFraudCoverage (com.nest.res.bop.domain.BOPComputerFraudFundsTransferFraudCoverage BOPComputerFraudFundsTransferFraudCoverage)  {
	  this.BOPComputerFraudFundsTransferFraudCoverage = BOPComputerFraudFundsTransferFraudCoverage;

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ComputerFraudBaseRate",String.valueOf(BOPComputerFraudFundsTransferFraudCoverage.getDsLimit()))));

	  
	}
	public void numEmployees ()  {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setNumEmployees((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPComputerFraudFundsTransferFraudCoverage,"../BOPLocation") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ComputerFraudApply"))).equals((String)"Yes")){
			this.BOPComputerFraudFundsTransferFraudCoverage.setNumEmployees(Integer.valueOf(this.BOPComputerFraudFundsTransferFraudCoverage.getNumEmployees()) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"ComputerFraudNumEmployees"))));
		}		}

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void AddlEmployeeRate () throws LookupException,NumberFormatException {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setAddlEmployeeRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ComputerFraudAddlEmployeeRate",String.valueOf(BOPComputerFraudFundsTransferFraudCoverage.getDsLimit()))));

	  
	}
	public void AddlLocationRate () throws LookupException,NumberFormatException {
	  this.BOPComputerFraudFundsTransferFraudCoverage.setAddlLocationRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ComputerFraudAddlLocationRate",String.valueOf(BOPComputerFraudFundsTransferFraudCoverage.getDsLimit()))));

	  
	}
	
	
	
	
	


	
}