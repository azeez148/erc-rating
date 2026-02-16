package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationBusnIncomeDependentPropCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverage;
	
	
	
	public void Premium ()  {
	  
		if(this.BOPClassificationBusnIncomeDependentPropCoverage.getDsLimit() <= this.BOPClassificationBusnIncomeDependentPropCoverage.getInclddLimit()){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremium((double)0.0);
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../BusinessIncomeFromSecondaryDependentProperties"))).equals((String)"Yes")){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller((((double)this.BOPClassificationBusnIncomeDependentPropCoverage.getDsLimit() - (double)this.BOPClassificationBusnIncomeDependentPropCoverage.getInclddLimit()) / (double)100.0) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationBusnIncomeDependentPropCoverage.getBusnIncomeDependentPropAndSecondaryDependentPropFactor()))));
		}
		else{
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller((((double)this.BOPClassificationBusnIncomeDependentPropCoverage.getDsLimit() - (double)this.BOPClassificationBusnIncomeDependentPropCoverage.getInclddLimit()) / (double)100.0) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationBusnIncomeDependentPropCoverage.getFactor()))));
		}
		}
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassificationBusnIncomeDependentPropCoverage.getClassBPPPremium_1() != (double)0.0 || this.BOPClassificationBusnIncomeDependentPropCoverage.getClassFuncBPPPremium_1() != (double)0.0){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeDependentPropInclddLimit",String.valueOf( "Y"))));
		}
		else{
			this.BOPClassificationBusnIncomeDependentPropCoverage.setInclddLimit((int)0.0);
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPClassificationBusnIncomeDependentPropCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeDependentPropFactor",String.valueOf( "Y"))));

	  
	}
	public void classFuncBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationBusnIncomeDependentPropCoverage,"../BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setClassFuncBPPPremium_1(Double.valueOf(this.BOPClassificationBusnIncomeDependentPropCoverage.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1()));
		}
		else{
			this.BOPClassificationBusnIncomeDependentPropCoverage.setClassFuncBPPPremium_1((double)0.0);
		}
	  
	}
	public void classBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationBusnIncomeDependentPropCoverage,"../BOPClassificationBusnPrsnlPropCoverage").size() == 0.0){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setClassBPPPremium_1((double)0.0);
		}
		else{
			this.BOPClassificationBusnIncomeDependentPropCoverage.setClassBPPPremium_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../BOPClassificationBusnPrsnlPropCoverage/Premium"))));
		}
	  
	}
	public void bOPFunctlBusnPrsnlPropValtnCoveragePremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationBusnIncomeDependentPropCoverage,"../BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1((double)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPClassificationBusnIncomeDependentPropCoverage,"../BOPFunctlBusnPrsnlPropValtn/BOPFunctlBusnPrsnlPropValtnDetail/BOPFunctlBusnPrsnlPropValtnCoverage") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))) != 0.0){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1(Double.valueOf(this.BOPClassificationBusnIncomeDependentPropCoverage.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))));
		}		}

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
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationBusnIncomeDependentPropCoverage.getPremium() != (double)0.0){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPClassificationBusnIncomeDependentPropCoverage (com.nest.res.bop.domain.BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverage)  {
	  this.BOPClassificationBusnIncomeDependentPropCoverage = BOPClassificationBusnIncomeDependentPropCoverage;

	  
	}
	public void BusnIncomeDependentPropAndSecondaryDependentPropFactor () throws LookupException,NumberFormatException {
	  this.BOPClassificationBusnIncomeDependentPropCoverage.setBusnIncomeDependentPropAndSecondaryDependentPropFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeDependentPropAndSecondaryDependentPropFactor",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}