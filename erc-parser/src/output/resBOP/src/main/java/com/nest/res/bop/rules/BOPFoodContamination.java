package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPFoodContamination  {

	
	
	
	private com.nest.res.bop.domain.BOPFoodContamination BOPFoodContamination;
	
	
	
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
	public void PremiumIndicator ()  {
	  
		if(this.BOPFoodContamination.getPremium() != (double)0.0){
			this.BOPFoodContamination.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPFoodContamination.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPFoodContamination (com.nest.res.bop.domain.BOPFoodContamination BOPFoodContamination)  {
	  this.BOPFoodContamination = BOPFoodContamination;

	  
	}
	public void AddlAdvertisingExpenseInclddLimit () throws LookupException,NumberFormatException {
	  this.BOPFoodContamination.setAddlAdvertisingExpenseInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("AddlAdvertisingInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void BusnIncomeExtraExpenseAddlCharge () throws LookupException,NumberFormatException {
	  
		if(this.BOPFoodContamination.getDsLimit() > this.BOPFoodContamination.getInclddLimit()){
			this.BOPFoodContamination.setBusnIncomeExtraExpenseAddlCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeExtraExpenseAddlCharge",String.valueOf( "Y"))));
		}
	  
	}
	public void ExtraExpense ()  {
	  
		if(this.BOPFoodContamination.getDsLimit() > this.BOPFoodContamination.getInclddLimit()){
			this.BOPFoodContamination.setExtraExpense(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPFoodContamination.getBusnIncomeExtraExpenseAddlCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFoodContamination,"../CommercialPropertyLCM")))) * (((double)this.BOPFoodContamination.getDsLimit() - (double)this.BOPFoodContamination.getInclddLimit()) / (double)100.0)));
		}
		else{
			this.BOPFoodContamination.setExtraExpense((double)0.0);
		}
	  
	}
	public void AddlAdvertisingExpenseAddlCharge () throws LookupException,NumberFormatException {
	  
		if(this.BOPFoodContamination.getAddlAdvertisingExpenseLimit() > this.BOPFoodContamination.getAddlAdvertisingExpenseInclddLimit()){
			this.BOPFoodContamination.setAddlAdvertisingExpenseAddlCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AddlAdvertisingExpenseAddlCharge",String.valueOf( "Y"))));
		}
	  
	}
	public void AdvertisingExpense ()  {
	  
		if(this.BOPFoodContamination.getAddlAdvertisingExpenseLimit() > this.BOPFoodContamination.getAddlAdvertisingExpenseInclddLimit()){
			this.BOPFoodContamination.setAdvertisingExpense(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPFoodContamination.getAddlAdvertisingExpenseAddlCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFoodContamination,"../CommercialPropertyLCM")))) * (((double)this.BOPFoodContamination.getAddlAdvertisingExpenseLimit() - (double)this.BOPFoodContamination.getAddlAdvertisingExpenseInclddLimit()) / (double)100.0)));
		}
		else{
			this.BOPFoodContamination.setAdvertisingExpense((double)0.0);
		}
	  
	}
	public void BaseCharge () throws LookupException,NumberFormatException {
	  this.BOPFoodContamination.setBaseCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FoodContaminationBaseCharge",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  this.BOPFoodContamination.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.roundUpDoller(this.BOPFoodContamination.getBaseCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFoodContamination,"../CommercialPropertyLCM")))) + this.BOPFoodContamination.getExtraExpense() + this.BOPFoodContamination.getAdvertisingExpense()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFoodContamination,"../../../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFoodContamination,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPFoodContamination.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("FoodContaminationInclddLimit",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}