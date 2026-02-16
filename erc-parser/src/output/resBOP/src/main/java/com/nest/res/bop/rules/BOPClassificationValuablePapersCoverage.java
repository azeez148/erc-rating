package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationValuablePapersCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverage;
	
	
	
	public void classFuncBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationValuablePapersCoverage,"../BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassificationValuablePapersCoverage.setClassFuncBPPPremium_1(Double.valueOf(this.BOPClassificationValuablePapersCoverage.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1()));
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setClassFuncBPPPremium_1((double)0.0);
		}
	  
	}
	public void bOPFunctlBusnPrsnlPropValtnCoveragePremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationValuablePapersCoverage,"../BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassificationValuablePapersCoverage.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1((double)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPClassificationValuablePapersCoverage,"../BOPFunctlBusnPrsnlPropValtn/BOPFunctlBusnPrsnlPropValtnDetail/BOPFunctlBusnPrsnlPropValtnCoverage") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))) != 0.0){
			this.BOPClassificationValuablePapersCoverage.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1(Double.valueOf(this.BOPClassificationValuablePapersCoverage.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))));
		}		}

		}
	  
	}
	public void OnPremisesInclddLimit () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassificationValuablePapersCoverage.getClassBPPPremium_1() != (double)0.0 || this.BOPClassificationValuablePapersCoverage.getClassFuncBPPPremium_1() != (double)0.0){
			this.BOPClassificationValuablePapersCoverage.setOnPremisesInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("ValuablePapersOnPremisesInclddLimit",String.valueOf( "Y"))));
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setOnPremisesInclddLimit((int)0.0);
		}
	  
	}
	public void OffPremisesInclddLimit () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassificationValuablePapersCoverage.getClassBPPPremium_1() != (double)0.0 || this.BOPClassificationValuablePapersCoverage.getClassFuncBPPPremium_1() != (double)0.0){
			this.BOPClassificationValuablePapersCoverage.setOffPremisesInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("ValuablePapersOffPremisesInclddLimit",String.valueOf( "Y"))));
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setOffPremisesInclddLimit((int)0.0);
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPClassificationValuablePapersCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ValuablePapersFactor",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationValuablePapersCoverage.getPremium() != (double)0.0){
			this.BOPClassificationValuablePapersCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setPremiumIndicator((int)0.0);
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
	public void Premium ()  {
	  
		if(this.BOPClassificationValuablePapersCoverage.getDsLimit() <= this.BOPClassificationValuablePapersCoverage.getOnPremisesInclddLimit()){
			this.BOPClassificationValuablePapersCoverage.setPremium((double)0.0);
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationValuablePapersCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller((((double)this.BOPClassificationValuablePapersCoverage.getDsLimit() - (double)this.BOPClassificationValuablePapersCoverage.getOnPremisesInclddLimit()) / (double)100.0) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationValuablePapersCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationValuablePapersCoverage.getFactor()))));
		}
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	classBPPPremium_1();
	
	bOPFunctlBusnPrsnlPropValtnCoveragePremium_1();
	
	classFuncBPPPremium_1();
	
	OffPremisesInclddLimit();
	
	  
	}
	public void classBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationValuablePapersCoverage,"../BOPClassificationBusnPrsnlPropCoverage").size() == 0.0){
			this.BOPClassificationValuablePapersCoverage.setClassBPPPremium_1((double)0.0);
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setClassBPPPremium_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationValuablePapersCoverage,"../BOPClassificationBusnPrsnlPropCoverage/Premium"))));
		}
	  
	}
	public  BOPClassificationValuablePapersCoverage (com.nest.res.bop.domain.BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverage)  {
	  this.BOPClassificationValuablePapersCoverage = BOPClassificationValuablePapersCoverage;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	
	
	
	
	


	
}