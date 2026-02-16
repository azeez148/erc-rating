package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPVacancyPermitBusnPrsnlPropCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPVacancyPermitBusnPrsnlPropCoverage BOPVacancyPermitBusnPrsnlPropCoverage;
	
	
	
	public void ProRateIndicator ()  {
	  this.BOPVacancyPermitBusnPrsnlPropCoverage.setProRateIndicator((int)0.0);

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws ParseException {
	  
	ProRateIndicator();
	
	EffectiveDt();
	
	ExpirationDt();
	
	  
	}
	public void Premium ()  {
	  this.BOPVacancyPermitBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller(this.BOPVacancyPermitBusnPrsnlPropCoverage.getCalcPremium_1() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"../VacancyPermitProRateFactor")))));

	  
	}
	public void calcPremium_1 ()  {
	  this.BOPVacancyPermitBusnPrsnlPropCoverage.setCalcPremium_1((double)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPVacancyPermitBusnPrsnlPropCoverage,"../../BOPClassification") ){
			this.BOPVacancyPermitBusnPrsnlPropCoverage.setCalcPremium_1(this.BOPVacancyPermitBusnPrsnlPropCoverage.getCalcPremium_1()+Double.valueOf(this.BOPVacancyPermitBusnPrsnlPropCoverage.getCalcPremium_1()) + MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FinalBusnPrsnlPropRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"Factor")))) * (((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) + Double.valueOf(this.BOPVacancyPermitBusnPrsnlPropCoverage.getFunctBPPTotalLimit_1())) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"IRPMFactor")))));
		}

	  
	}
	public  BOPVacancyPermitBusnPrsnlPropCoverage (com.nest.res.bop.domain.BOPVacancyPermitBusnPrsnlPropCoverage BOPVacancyPermitBusnPrsnlPropCoverage)  {
	  this.BOPVacancyPermitBusnPrsnlPropCoverage = BOPVacancyPermitBusnPrsnlPropCoverage;

	  
	}
	public void functBPPTotalLimit_1 ()  {
	  this.BOPVacancyPermitBusnPrsnlPropCoverage.setFunctBPPTotalLimit_1((double)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPVacancyPermitBusnPrsnlPropCoverage,"../../BOPClassification/BOPFunctlBusnPrsnlPropValtn/BOPFunctlBusnPrsnlPropValtnDetail") ){
			this.BOPVacancyPermitBusnPrsnlPropCoverage.setFunctBPPTotalLimit_1(this.BOPVacancyPermitBusnPrsnlPropCoverage.getFunctBPPTotalLimit_1()+Double.valueOf(this.BOPVacancyPermitBusnPrsnlPropCoverage.getFunctBPPTotalLimit_1()) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsLimit"))));
		}

	  
	}
	public void ExpirationDt () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"../StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"../EndDate"))) != null){
			this.BOPVacancyPermitBusnPrsnlPropCoverage.setExpirationDt((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"../EndDate"))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPVacancyPermitBusnPrsnlPropCoverage.getPremium() != (double)0.0){
			this.BOPVacancyPermitBusnPrsnlPropCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPVacancyPermitBusnPrsnlPropCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void EffectiveDt () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"../StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"../EndDate"))) != null){
			this.BOPVacancyPermitBusnPrsnlPropCoverage.setEffectiveDt((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"../StartDate"))));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	functBPPTotalLimit_1();
	
	calcPremium_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws ParseException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	
	
	
	
	


	
}