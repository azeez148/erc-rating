package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusnIncomeAndExtraExpenseCovLOI  {

	
	
	
	private com.nest.res.bop.domain.BOPBusnIncomeAndExtraExpenseCovLOI BOPBusnIncomeAndExtraExpenseCovLOI;
	
	
	
	public void totBPPPremium_1 ()  {
	  this.BOPBusnIncomeAndExtraExpenseCovLOI.setTotBPPPremium_1((double)0.0);

		if(XpathNode.selectNodes(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../BOPClassification/BOPClassificationBusnPrsnlPropCoverage").size() > 0.0){
		for( Policy policy : XpathNode.selectNodes(BOPBusnIncomeAndExtraExpenseCovLOI,"../BOPClassification/BOPClassificationBusnPrsnlPropCoverage") ){
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setTotBPPPremium_1(this.BOPBusnIncomeAndExtraExpenseCovLOI.getTotBPPPremium_1()+Double.valueOf(this.BOPBusnIncomeAndExtraExpenseCovLOI.getTotBPPPremium_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))));
		}

		}
	  
	}
	public void BPPLimitFactor () throws LookupException,NumberFormatException {
	  this.BOPBusnIncomeAndExtraExpenseCovLOI.setBPPLimitFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeExtraExpenseCovLOIBPPFactor",String.valueOf(BOPBusnIncomeAndExtraExpenseCovLOI.getDsLimit()),String.valueOf(BOPBusnIncomeAndExtraExpenseCovLOI.getType()))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Type();
	
	BldgLimitFactor();
	
	BPPLimitFactor();
	
	totBldgPremium_1();
	
	totBPPPremium_1();
	
	modifiedBldgLimitFactor_1();
	
	modifiedBPPLimitFactor_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void BldgLimitFactor () throws LookupException,NumberFormatException {
	  this.BOPBusnIncomeAndExtraExpenseCovLOI.setBldgLimitFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeExtraExpenseCovLOIBldgFactor",String.valueOf(BOPBusnIncomeAndExtraExpenseCovLOI.getDsLimit()),String.valueOf(BOPBusnIncomeAndExtraExpenseCovLOI.getType()))));

	  
	}
	public void totBldgPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../BOPStructureBuildingCoverage").size() > 0.0){
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setTotBldgPremium_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../BOPStructureBuildingCoverage/Premium"))));
		}
		else{
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setTotBldgPremium_1((double)0.0);
		}
	  
	}
	public void modifiedBldgLimitFactor_1 ()  {
	  
		if(this.BOPBusnIncomeAndExtraExpenseCovLOI.getDsLimit() > (int)0.0){
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setModifiedBldgLimitFactor_1((double)0.0 - ((double)1.0 - Double.valueOf(this.BOPBusnIncomeAndExtraExpenseCovLOI.getBldgLimitFactor())));
		}
		else{
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setModifiedBldgLimitFactor_1((double)0.0);
		}
	  
	}
	public void modifiedBPPLimitFactor_1 ()  {
	  
		if(this.BOPBusnIncomeAndExtraExpenseCovLOI.getDsLimit() > (int)0.0){
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setModifiedBPPLimitFactor_1((double)0.0 - ((double)1.0 - Double.valueOf(this.BOPBusnIncomeAndExtraExpenseCovLOI.getBPPLimitFactor())));
		}
		else{
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setModifiedBPPLimitFactor_1((double)0.0);
		}
	  
	}
	public void Type ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../PropertyType"))).equals((String)"Office") || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../PropertyType"))).equals((String)"Office Condominium")){
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setType((String)"Offices");
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../PropertyType"))).equals((String)"Contractor")){
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setType((String)"Contractors");
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../PropertyType"))).equals((String)"Motel") || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../PropertyType"))).equals((String)"Apartment") || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovLOI,"../PropertyType"))).equals((String)"Apartment Condominium Association")){
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setType((String)"Motels And Residential");
		}
		else{
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setType((String)"All Other");
		}
		}
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPBusnIncomeAndExtraExpenseCovLOI (com.nest.res.bop.domain.BOPBusnIncomeAndExtraExpenseCovLOI BOPBusnIncomeAndExtraExpenseCovLOI)  {
	  this.BOPBusnIncomeAndExtraExpenseCovLOI = BOPBusnIncomeAndExtraExpenseCovLOI;

	  
	}
	public void Premium ()  {
	  this.BOPBusnIncomeAndExtraExpenseCovLOI.setPremium(MathHelper.roundUpDoller(this.BOPBusnIncomeAndExtraExpenseCovLOI.getModifiedBldgLimitFactor_1() * this.BOPBusnIncomeAndExtraExpenseCovLOI.getTotBldgPremium_1()) + MathHelper.roundUpDoller(this.BOPBusnIncomeAndExtraExpenseCovLOI.getModifiedBPPLimitFactor_1() * this.BOPBusnIncomeAndExtraExpenseCovLOI.getTotBPPPremium_1()));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusnIncomeAndExtraExpenseCovLOI.getPremium() != (double)0.0){
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPBusnIncomeAndExtraExpenseCovLOI.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}