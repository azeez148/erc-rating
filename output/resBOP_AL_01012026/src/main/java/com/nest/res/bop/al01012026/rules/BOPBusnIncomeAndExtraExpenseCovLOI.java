package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusnIncomeAndExtraExpenseCovLOI  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPBusnIncomeAndExtraExpenseCovLOI BOPBusnIncomeAndExtraExpenseCovLOI;
	
	
	
	public void modifiedBPPLimitFactor_1 ()  {
	  
		if(this.BOPBusnIncomeAndExtraExpenseCovLOI.getDsLimit() > MathHelper.getIntegerValue(0.0)){
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setModifiedBPPLimitFactor_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0) - (MathHelper.getDoubleValue(1.0) - MathHelper.getDoubleValue(this.BOPBusnIncomeAndExtraExpenseCovLOI.getBPPLimitFactor())))));
		}
		else{
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setModifiedBPPLimitFactor_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPBusnIncomeAndExtraExpenseCovLOI (com.nest.res.bop.al01012026.domain.BOPBusnIncomeAndExtraExpenseCovLOI BOPBusnIncomeAndExtraExpenseCovLOI)  {
	  this.BOPBusnIncomeAndExtraExpenseCovLOI = BOPBusnIncomeAndExtraExpenseCovLOI;

	  
	}
	public void Premium ()  {
	  this.BOPBusnIncomeAndExtraExpenseCovLOI.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPBusnIncomeAndExtraExpenseCovLOI.getModifiedBldgLimitFactor_1() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../BOPStructureBuildingCoverage/Premium")))) + MathHelper.roundUpDoller(this.BOPBusnIncomeAndExtraExpenseCovLOI.getModifiedBPPLimitFactor_1() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../TotalBusnPrsnlPropCovPremium"))))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPBusnIncomeAndExtraExpenseCovLOI.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPBusnIncomeAndExtraExpenseCovLOI.getModifiedBldgLimitFactor_1() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../BOPStructureBuildingCoverage/Premium")))) + MathHelper.roundUpDoller(this.BOPBusnIncomeAndExtraExpenseCovLOI.getModifiedBPPLimitFactor_1() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../TotalBusnPrsnlPropCovPremium"))))));

	  
	}
	public void BPPLimitFactor () throws LookupException,NumberFormatException {
	  this.BOPBusnIncomeAndExtraExpenseCovLOI.setBPPLimitFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeExtraExpenseCovLOIBPPFactor",String.valueOf(this.BOPBusnIncomeAndExtraExpenseCovLOI.getDsLimit()),String.valueOf(this.BOPBusnIncomeAndExtraExpenseCovLOI.getType()))));

	  
	}
	public void BldgLimitFactor () throws LookupException,NumberFormatException {
	  this.BOPBusnIncomeAndExtraExpenseCovLOI.setBldgLimitFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeExtraExpenseCovLOIBldgFactor",String.valueOf(this.BOPBusnIncomeAndExtraExpenseCovLOI.getDsLimit()),String.valueOf(this.BOPBusnIncomeAndExtraExpenseCovLOI.getType()))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusnIncomeAndExtraExpenseCovLOI.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Type();
	
	BldgLimitFactor();
	
	BPPLimitFactor();
	
	modifiedBldgLimitFactor_1();
	
	modifiedBPPLimitFactor_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void modifiedBldgLimitFactor_1 ()  {
	  
		if(this.BOPBusnIncomeAndExtraExpenseCovLOI.getDsLimit() > MathHelper.getIntegerValue(0.0)){
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setModifiedBldgLimitFactor_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0) - (MathHelper.getDoubleValue(1.0) - MathHelper.getDoubleValue(this.BOPBusnIncomeAndExtraExpenseCovLOI.getBldgLimitFactor())))));
		}
		else{
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setModifiedBldgLimitFactor_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void Type ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../PropertyType"))).equals(MathHelper.getStringValue("Office")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../PropertyType"))).equals(MathHelper.getStringValue("Office Condominium"))){
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setType(MathHelper.getStringValue(MathHelper.getStringValue("Offices")));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../PropertyType"))).equals(MathHelper.getStringValue("Contractor"))){
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setType(MathHelper.getStringValue(MathHelper.getStringValue("Contractors")));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../PropertyType"))).equals(MathHelper.getStringValue("Hotels, Motels and Inns")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../PropertyType"))).equals(MathHelper.getStringValue("Apartment")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../PropertyType"))).equals(MathHelper.getStringValue("Apartment Condominium Association"))){
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setType(MathHelper.getStringValue(MathHelper.getStringValue("Hotels, Motels And Inns And Residential")));
		}
		else{
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setType(MathHelper.getStringValue(MathHelper.getStringValue("All Other")));
		}
		}
		}
	  
	}
	
	
	
	
	


	
}