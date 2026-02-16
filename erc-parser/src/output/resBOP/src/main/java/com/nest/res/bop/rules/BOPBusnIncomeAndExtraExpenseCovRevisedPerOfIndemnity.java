package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity  {

	
	
	
	private com.nest.res.bop.domain.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity;
	
	
	
	public  BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity (com.nest.res.bop.domain.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity)  {
	  this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity = BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity;

	  
	}
	public void modifiedLimitFactor_1 ()  {
	  
		if(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getLimitFactor() > (double)0.0){
			this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setModifiedLimitFactor_1((double)0.0 - ((double)1.0 - Double.valueOf(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getLimitFactor())));
		}
		else{
			this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setModifiedLimitFactor_1((double)0.0);
		}
	  
	}
	public void totBPPPremium_1 ()  {
	  this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setTotBPPPremium_1((double)0.0);

		if(XpathNode.selectNodes(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity,"../BOPClassification/BOPClassificationBusnPrsnlPropCoverage").size() > 0.0){
		for( Policy policy : XpathNode.selectNodes(BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity,"../BOPClassification/BOPClassificationBusnPrsnlPropCoverage") ){
			this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setTotBPPPremium_1(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getTotBPPPremium_1()+Double.valueOf(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getTotBPPPremium_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))));
		}

		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	LimitFactor();
	
	totBldgPremium_1();
	
	totBPPPremium_1();
	
	modifiedLimitFactor_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void LimitFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getNumOfMonths() != (int)0.0){
			this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setLimitFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeExtraExpenseCovRevisedPerOfIndemnityFactor",String.valueOf(BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getNumOfMonths()))));
		}
		else{
			this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setLimitFactor((double)0.0);
		}
	  
	}
	public void totBldgPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity,"../BOPStructureBuildingCoverage").size() > 0.0){
			this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setTotBldgPremium_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity,"../BOPStructureBuildingCoverage/Premium"))));
		}
		else{
			this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setTotBldgPremium_1((double)0.0);
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getPremium() != (double)0.0){
			this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setPremium(MathHelper.roundUpDoller(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getModifiedLimitFactor_1() * this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getTotBldgPremium_1()) + MathHelper.roundUpDoller(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getModifiedLimitFactor_1() * this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getTotBPPPremium_1()));

	  
	}
	
	
	
	
	


	
}