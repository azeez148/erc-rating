package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPFoodContamination  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPFoodContamination BOPFoodContamination;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void BaseCharge () throws LookupException,NumberFormatException {
	  this.BOPFoodContamination.setBaseCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FoodContaminationBaseCharge",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  this.BOPFoodContamination.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.roundUpDoller(this.BOPFoodContamination.getBaseCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFoodContamination,"../CommercialPropertyLCM")))) + this.BOPFoodContamination.getExtraExpense() + this.BOPFoodContamination.getAdvertisingExpense()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFoodContamination,"../../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFoodContamination,"../../../../IRPMFactor")))));

	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPFoodContamination.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("FoodContaminationInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void ExtraExpense ()  {
	  
		if(this.BOPFoodContamination.getDsLimit() > this.BOPFoodContamination.getInclddLimit()){
			this.BOPFoodContamination.setExtraExpense(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPFoodContamination.getBusnIncomeExtraExpenseAddlCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFoodContamination,"../CommercialPropertyLCM")))) * ((MathHelper.getDoubleValue(this.BOPFoodContamination.getDsLimit()) - MathHelper.getDoubleValue(this.BOPFoodContamination.getInclddLimit())) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
			this.BOPFoodContamination.setExtraExpense(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void AddlAdvertisingExpenseAddlCharge () throws LookupException,NumberFormatException {
	  
		if(this.BOPFoodContamination.getAddlAdvertisingExpenseLimit() > this.BOPFoodContamination.getAddlAdvertisingExpenseInclddLimit()){
			this.BOPFoodContamination.setAddlAdvertisingExpenseAddlCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AddlAdvertisingExpenseAddlCharge",String.valueOf( "Y")))));
		}
	  
	}
	public void AddlAdvertisingExpenseInclddLimit () throws LookupException,NumberFormatException {
	  this.BOPFoodContamination.setAddlAdvertisingExpenseInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("AddlAdvertisingInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	AddlAdvertisingExpenseInclddLimit();
	
	BaseCharge();
	
	BusnIncomeExtraExpenseAddlCharge();
	
	ExtraExpense();
	
	AddlAdvertisingExpenseAddlCharge();
	
	AdvertisingExpense();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void BusnIncomeExtraExpenseAddlCharge () throws LookupException,NumberFormatException {
	  
		if(this.BOPFoodContamination.getDsLimit() > this.BOPFoodContamination.getInclddLimit()){
			this.BOPFoodContamination.setBusnIncomeExtraExpenseAddlCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeExtraExpenseAddlCharge",String.valueOf( "Y")))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPFoodContamination.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPFoodContamination.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPFoodContamination.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPFoodContamination.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.roundUpDoller(this.BOPFoodContamination.getBaseCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFoodContamination,"../CommercialPropertyLCM")))) + this.BOPFoodContamination.getExtraExpense() + this.BOPFoodContamination.getAdvertisingExpense()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFoodContamination,"../../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFoodContamination,"../../../../IRPMFactor")))));

	  
	}
	public  BOPFoodContamination (com.nest.res.bop.al01012026.domain.BOPFoodContamination BOPFoodContamination)  {
	  this.BOPFoodContamination = BOPFoodContamination;

	  
	}
	public void AdvertisingExpense ()  {
	  
		if(this.BOPFoodContamination.getAddlAdvertisingExpenseLimit() > this.BOPFoodContamination.getAddlAdvertisingExpenseInclddLimit()){
			this.BOPFoodContamination.setAdvertisingExpense(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPFoodContamination.getAddlAdvertisingExpenseAddlCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFoodContamination,"../CommercialPropertyLCM")))) * ((MathHelper.getDoubleValue(this.BOPFoodContamination.getAddlAdvertisingExpenseLimit()) - MathHelper.getDoubleValue(this.BOPFoodContamination.getAddlAdvertisingExpenseInclddLimit())) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
			this.BOPFoodContamination.setAdvertisingExpense(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}