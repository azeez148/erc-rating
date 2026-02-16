package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationAccountsReceivableCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverage;
	
	
	
	public void Premium ()  {
	  
		if(this.BOPClassificationAccountsReceivableCoverage.getDsLimit() <= this.BOPClassificationAccountsReceivableCoverage.getOnPremisesInclddLimit()){
			this.BOPClassificationAccountsReceivableCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationAccountsReceivableCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPClassificationAccountsReceivableCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPClassificationAccountsReceivableCoverage.getOnPremisesInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationAccountsReceivableCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationAccountsReceivableCoverage.getFactor())))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationAccountsReceivableCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationAccountsReceivableCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPClassificationAccountsReceivableCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AccountsReceivableFactor",String.valueOf( "Y"))));

	  
	}
	public void bOPFunctlBusnPrsnlPropValtnCoveragePremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationAccountsReceivableCoverage,"../BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassificationAccountsReceivableCoverage.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPClassificationAccountsReceivableCoverage,"../BOPFunctlBusnPrsnlPropValtn/BOPFunctlBusnPrsnlPropValtnDetail/BOPFunctlBusnPrsnlPropValtnCoverage") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))) != 0.0){
			this.BOPClassificationAccountsReceivableCoverage.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassificationAccountsReceivableCoverage.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))))));
		}		}

		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void classFuncBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationAccountsReceivableCoverage,"../BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassificationAccountsReceivableCoverage.setClassFuncBPPPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassificationAccountsReceivableCoverage.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1())));
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setClassFuncBPPPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void OffPremisesInclddLimit () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassificationAccountsReceivableCoverage.getClassBPPPremium_1() != MathHelper.getDoubleValue(0.0) || this.BOPClassificationAccountsReceivableCoverage.getClassFuncBPPPremium_1() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationAccountsReceivableCoverage.setOffPremisesInclddLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("AccountsReceivableOffPremisesInclddLimit",String.valueOf( "Y")))));
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setOffPremisesInclddLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void OnPremisesInclddLimit () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassificationAccountsReceivableCoverage.getClassBPPPremium_1() != MathHelper.getDoubleValue(0.0) || this.BOPClassificationAccountsReceivableCoverage.getClassFuncBPPPremium_1() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationAccountsReceivableCoverage.setOnPremisesInclddLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("AccountsReceivableOnPremisesInclddLimit",String.valueOf( "Y")))));
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setOnPremisesInclddLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public  BOPClassificationAccountsReceivableCoverage (com.nest.res.bop.al09012019.domain.BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverage)  {
	  this.BOPClassificationAccountsReceivableCoverage = BOPClassificationAccountsReceivableCoverage;

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	classBPPPremium_1();
	
	bOPFunctlBusnPrsnlPropValtnCoveragePremium_1();
	
	classFuncBPPPremium_1();
	
	OffPremisesInclddLimit();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPClassificationAccountsReceivableCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0) || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationAccountsReceivableCoverage,"../BusnPrsnlPropLimit"))) == MathHelper.getIntegerValue(0.0)){
			this.BOPClassificationAccountsReceivableCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void classBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationAccountsReceivableCoverage,"../BOPClassificationBusnPrsnlPropCoverage").size() == 0.0){
			this.BOPClassificationAccountsReceivableCoverage.setClassBPPPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setClassBPPPremium_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationAccountsReceivableCoverage,"../BOPClassificationBusnPrsnlPropCoverage/Premium")))));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPClassificationAccountsReceivableCoverage.getDsLimit() <= this.BOPClassificationAccountsReceivableCoverage.getOnPremisesInclddLimit()){
			this.BOPClassificationAccountsReceivableCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationAccountsReceivableCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPClassificationAccountsReceivableCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPClassificationAccountsReceivableCoverage.getOnPremisesInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationAccountsReceivableCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationAccountsReceivableCoverage.getFactor())))));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	classBPPPremium_1();
	
	bOPFunctlBusnPrsnlPropValtnCoveragePremium_1();
	
	classFuncBPPPremium_1();
	
	OnPremisesInclddLimit();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}