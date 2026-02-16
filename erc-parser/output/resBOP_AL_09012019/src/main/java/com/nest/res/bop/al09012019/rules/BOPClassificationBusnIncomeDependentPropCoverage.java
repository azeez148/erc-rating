package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationBusnIncomeDependentPropCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverage;
	
	
	
	public void classBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationBusnIncomeDependentPropCoverage,"../BOPClassificationBusnPrsnlPropCoverage").size() == 0.0){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setClassBPPPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPClassificationBusnIncomeDependentPropCoverage.setClassBPPPremium_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../BOPClassificationBusnPrsnlPropCoverage/Premium")))));
		}
	  
	}
	public void classFuncBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationBusnIncomeDependentPropCoverage,"../BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setClassFuncBPPPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1())));
		}
		else{
			this.BOPClassificationBusnIncomeDependentPropCoverage.setClassFuncBPPPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	BusnIncomeDependentPropAndSecondaryDependentPropFactor();
	
	classBPPPremium_1();
	
	bOPFunctlBusnPrsnlPropValtnCoveragePremium_1();
	
	classFuncBPPPremium_1();
	
	InclddLimit();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPClassificationBusnIncomeDependentPropCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0) || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../BusnPrsnlPropLimit"))) == MathHelper.getIntegerValue(0.0)){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPClassificationBusnIncomeDependentPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void BusnIncomeDependentPropAndSecondaryDependentPropFactor () throws LookupException,NumberFormatException {
	  this.BOPClassificationBusnIncomeDependentPropCoverage.setBusnIncomeDependentPropAndSecondaryDependentPropFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeDependentPropAndSecondaryDependentPropFactor",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationBusnIncomeDependentPropCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPClassificationBusnIncomeDependentPropCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeDependentPropFactor",String.valueOf( "Y"))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void bOPFunctlBusnPrsnlPropValtnCoveragePremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationBusnIncomeDependentPropCoverage,"../BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPClassificationBusnIncomeDependentPropCoverage,"../BOPFunctlBusnPrsnlPropValtn/BOPFunctlBusnPrsnlPropValtnDetail/BOPFunctlBusnPrsnlPropValtnCoverage") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))) != 0.0){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))))));
		}		}

		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPClassificationBusnIncomeDependentPropCoverage.getDsLimit() <= this.BOPClassificationBusnIncomeDependentPropCoverage.getInclddLimit()){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../BusinessIncomeFromSecondaryDependentProperties"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationBusnIncomeDependentPropCoverage.getBusnIncomeDependentPropAndSecondaryDependentPropFactor())))));
		}
		else{
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationBusnIncomeDependentPropCoverage.getFactor())))));
		}
		}
	  
	}
	public  BOPClassificationBusnIncomeDependentPropCoverage (com.nest.res.bop.al09012019.domain.BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverage)  {
	  this.BOPClassificationBusnIncomeDependentPropCoverage = BOPClassificationBusnIncomeDependentPropCoverage;

	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassificationBusnIncomeDependentPropCoverage.getClassBPPPremium_1() != MathHelper.getDoubleValue(0.0) || this.BOPClassificationBusnIncomeDependentPropCoverage.getClassFuncBPPPremium_1() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setInclddLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeDependentPropInclddLimit",String.valueOf( "Y")))));
		}
		else{
			this.BOPClassificationBusnIncomeDependentPropCoverage.setInclddLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPClassificationBusnIncomeDependentPropCoverage.getDsLimit() <= this.BOPClassificationBusnIncomeDependentPropCoverage.getInclddLimit()){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../BusinessIncomeFromSecondaryDependentProperties"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationBusnIncomeDependentPropCoverage.getBusnIncomeDependentPropAndSecondaryDependentPropFactor())))));
		}
		else{
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationBusnIncomeDependentPropCoverage.getFactor())))));
		}
		}
	  
	}
	
	
	
	
	


	
}