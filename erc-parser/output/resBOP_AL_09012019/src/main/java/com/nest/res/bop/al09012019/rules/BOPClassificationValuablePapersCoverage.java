package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationValuablePapersCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverage;
	
	
	
	public void classFuncBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationValuablePapersCoverage,"../BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassificationValuablePapersCoverage.setClassFuncBPPPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassificationValuablePapersCoverage.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1())));
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setClassFuncBPPPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	classBPPPremium_1();
	
	bOPFunctlBusnPrsnlPropValtnCoveragePremium_1();
	
	classFuncBPPPremium_1();
	
	OnPremisesInclddLimit();
	
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPClassificationValuablePapersCoverage (com.nest.res.bop.al09012019.domain.BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverage)  {
	  this.BOPClassificationValuablePapersCoverage = BOPClassificationValuablePapersCoverage;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPClassificationValuablePapersCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ValuablePapersFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	classBPPPremium_1();
	
	bOPFunctlBusnPrsnlPropValtnCoveragePremium_1();
	
	classFuncBPPPremium_1();
	
	OffPremisesInclddLimit();
	
	  
	}
	public void classBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationValuablePapersCoverage,"../BOPClassificationBusnPrsnlPropCoverage").size() == 0.0){
			this.BOPClassificationValuablePapersCoverage.setClassBPPPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setClassBPPPremium_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationValuablePapersCoverage,"../BOPClassificationBusnPrsnlPropCoverage/Premium")))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationValuablePapersCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationValuablePapersCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void OffPremisesInclddLimit () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassificationValuablePapersCoverage.getClassBPPPremium_1() != MathHelper.getDoubleValue(0.0) || this.BOPClassificationValuablePapersCoverage.getClassFuncBPPPremium_1() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationValuablePapersCoverage.setOffPremisesInclddLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("ValuablePapersOffPremisesInclddLimit",String.valueOf( "Y")))));
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setOffPremisesInclddLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPClassificationValuablePapersCoverage.getDsLimit() <= this.BOPClassificationValuablePapersCoverage.getOnPremisesInclddLimit()){
			this.BOPClassificationValuablePapersCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationValuablePapersCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPClassificationValuablePapersCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPClassificationValuablePapersCoverage.getOnPremisesInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationValuablePapersCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationValuablePapersCoverage.getFactor())))));
		}
	  
	}
	public void bOPFunctlBusnPrsnlPropValtnCoveragePremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationValuablePapersCoverage,"../BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassificationValuablePapersCoverage.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPClassificationValuablePapersCoverage,"../BOPFunctlBusnPrsnlPropValtn/BOPFunctlBusnPrsnlPropValtnDetail/BOPFunctlBusnPrsnlPropValtnCoverage") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))) != 0.0){
			this.BOPClassificationValuablePapersCoverage.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassificationValuablePapersCoverage.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))))));
		}		}

		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Premium ()  {
	  
		if(this.BOPClassificationValuablePapersCoverage.getDsLimit() <= this.BOPClassificationValuablePapersCoverage.getOnPremisesInclddLimit()){
			this.BOPClassificationValuablePapersCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationValuablePapersCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPClassificationValuablePapersCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPClassificationValuablePapersCoverage.getOnPremisesInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationValuablePapersCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationValuablePapersCoverage.getFactor())))));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPClassificationValuablePapersCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0) || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationValuablePapersCoverage,"../BusnPrsnlPropLimit"))) == MathHelper.getIntegerValue(0.0)){
			this.BOPClassificationValuablePapersCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void OnPremisesInclddLimit () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassificationValuablePapersCoverage.getClassBPPPremium_1() != MathHelper.getDoubleValue(0.0) || this.BOPClassificationValuablePapersCoverage.getClassFuncBPPPremium_1() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationValuablePapersCoverage.setOnPremisesInclddLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("ValuablePapersOnPremisesInclddLimit",String.valueOf( "Y")))));
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setOnPremisesInclddLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}