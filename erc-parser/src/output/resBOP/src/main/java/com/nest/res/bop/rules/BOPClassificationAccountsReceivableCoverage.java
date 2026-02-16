package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationAccountsReceivableCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverage;
	
	
	
	public void OffPremisesInclddLimit () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassificationAccountsReceivableCoverage.getClassBPPPremium_1() != (double)0.0 || this.BOPClassificationAccountsReceivableCoverage.getClassFuncBPPPremium_1() != (double)0.0){
			this.BOPClassificationAccountsReceivableCoverage.setOffPremisesInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("AccountsReceivableOffPremisesInclddLimit",String.valueOf( "Y"))));
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setOffPremisesInclddLimit((int)0.0);
		}
	  
	}
	public  BOPClassificationAccountsReceivableCoverage (com.nest.res.bop.domain.BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverage)  {
	  this.BOPClassificationAccountsReceivableCoverage = BOPClassificationAccountsReceivableCoverage;

	  
	}
	public void classBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationAccountsReceivableCoverage,"../BOPClassificationBusnPrsnlPropCoverage").size() == 0.0){
			this.BOPClassificationAccountsReceivableCoverage.setClassBPPPremium_1((double)0.0);
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setClassBPPPremium_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationAccountsReceivableCoverage,"../BOPClassificationBusnPrsnlPropCoverage/Premium"))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationAccountsReceivableCoverage.getPremium() != (double)0.0){
			this.BOPClassificationAccountsReceivableCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPClassificationAccountsReceivableCoverage.getDsLimit() <= this.BOPClassificationAccountsReceivableCoverage.getOnPremisesInclddLimit()){
			this.BOPClassificationAccountsReceivableCoverage.setPremium((double)0.0);
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationAccountsReceivableCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller((((double)this.BOPClassificationAccountsReceivableCoverage.getDsLimit() - (double)this.BOPClassificationAccountsReceivableCoverage.getOnPremisesInclddLimit()) / (double)100.0) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationAccountsReceivableCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationAccountsReceivableCoverage.getFactor()))));
		}
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	classBPPPremium_1();
	
	bOPFunctlBusnPrsnlPropValtnCoveragePremium_1();
	
	classFuncBPPPremium_1();
	
	OffPremisesInclddLimit();
	
	  
	}
	public void bOPFunctlBusnPrsnlPropValtnCoveragePremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationAccountsReceivableCoverage,"../BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassificationAccountsReceivableCoverage.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1((double)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPClassificationAccountsReceivableCoverage,"../BOPFunctlBusnPrsnlPropValtn/BOPFunctlBusnPrsnlPropValtnDetail/BOPFunctlBusnPrsnlPropValtnCoverage") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))) != 0.0){
			this.BOPClassificationAccountsReceivableCoverage.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1(Double.valueOf(this.BOPClassificationAccountsReceivableCoverage.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))));
		}		}

		}
	  
	}
	public void OnPremisesInclddLimit () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassificationAccountsReceivableCoverage.getClassBPPPremium_1() != (double)0.0 || this.BOPClassificationAccountsReceivableCoverage.getClassFuncBPPPremium_1() != (double)0.0){
			this.BOPClassificationAccountsReceivableCoverage.setOnPremisesInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("AccountsReceivableOnPremisesInclddLimit",String.valueOf( "Y"))));
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setOnPremisesInclddLimit((int)0.0);
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPClassificationAccountsReceivableCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AccountsReceivableFactor",String.valueOf( "Y"))));

	  
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
	public void classFuncBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationAccountsReceivableCoverage,"../BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassificationAccountsReceivableCoverage.setClassFuncBPPPremium_1(Double.valueOf(this.BOPClassificationAccountsReceivableCoverage.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1()));
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setClassFuncBPPPremium_1((double)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	
	
	
	
	


	
}