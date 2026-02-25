package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPVacancyPermitBusnPrsnlPropCoverage  {

	
	
	
	private double bOPStructureBuildingCoveragePremiumCount_1;
	private com.nest.res.bop.al01012026.domain.BOPVacancyPermitBusnPrsnlPropCoverage BOPVacancyPermitBusnPrsnlPropCoverage;
	private double bOPClassificationBusnPrsnlPropLimitCount_1;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPVacancyPermitBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller(this.BOPVacancyPermitBusnPrsnlPropCoverage.getCalcPremium_1() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"../VacancyPermitProRateFactor")))));

	  
	}
	public void EffectiveDt () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"../StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"../EndDate"))) != null){
			this.BOPVacancyPermitBusnPrsnlPropCoverage.setEffectiveDt(MathHelper.getDateValue((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"../StartDate")))));
		}
	  
	}
	public void ProcessPremium1 () throws ParseException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.bOPClassificationBusnPrsnlPropLimitCount_1 > MathHelper.getIntegerValue(0.0) || this.bOPStructureBuildingCoveragePremiumCount_1 > MathHelper.getIntegerValue(0.0)){
			this.BOPVacancyPermitBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPVacancyPermitBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ExpirationDt () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"../StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"../EndDate"))) != null){
			this.BOPVacancyPermitBusnPrsnlPropCoverage.setExpirationDt(MathHelper.getDateValue((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"../EndDate")))));
		}
	  
	}
	public void bOPClassificationBusnPrsnlPropLimitCount_1 ()  {
	  this.bOPClassificationBusnPrsnlPropLimitCount_1 = MathHelper.getIntegerValue(0.0);

		for( Policy policy : XpathNode.selectNodes(BOPVacancyPermitBusnPrsnlPropCoverage,"../../BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) > MathHelper.getIntegerValue(0.0)){
			this.bOPClassificationBusnPrsnlPropLimitCount_1 = MathHelper.getIntegerValue(this.bOPClassificationBusnPrsnlPropLimitCount_1 + MathHelper.getIntegerValue(1.0));
		}		}

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	functBPPTotalLimit_1();
	
	calcPremium_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void functBPPTotalLimit_1 ()  {
	  this.BOPVacancyPermitBusnPrsnlPropCoverage.setFunctBPPTotalLimit_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPVacancyPermitBusnPrsnlPropCoverage,"../../BOPClassification/BOPFunctlBusnPrsnlPropValtn/BOPFunctlBusnPrsnlPropValtnDetail") ){
			this.BOPVacancyPermitBusnPrsnlPropCoverage.setFunctBPPTotalLimit_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPVacancyPermitBusnPrsnlPropCoverage.getFunctBPPTotalLimit_1()) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsLimit")))));
		}

	  
	}
	public  BOPVacancyPermitBusnPrsnlPropCoverage (com.nest.res.bop.al01012026.domain.BOPVacancyPermitBusnPrsnlPropCoverage BOPVacancyPermitBusnPrsnlPropCoverage)  {
	  this.BOPVacancyPermitBusnPrsnlPropCoverage = BOPVacancyPermitBusnPrsnlPropCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	bOPClassificationBusnPrsnlPropLimitCount_1();
	
	bOPStructureBuildingCoveragePremiumCount_1();
	
	CoverageOnPolicyIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPVacancyPermitBusnPrsnlPropCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPVacancyPermitBusnPrsnlPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPVacancyPermitBusnPrsnlPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void bOPStructureBuildingCoveragePremiumCount_1 ()  {
	  this.bOPStructureBuildingCoveragePremiumCount_1 = MathHelper.getIntegerValue(0.0);

		for( Policy policy : XpathNode.selectNodes(BOPVacancyPermitBusnPrsnlPropCoverage,"../../BOPStructureBuildingCoverage") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))) > MathHelper.getDoubleValue(0.0)){
			this.bOPStructureBuildingCoveragePremiumCount_1 = MathHelper.getIntegerValue(this.bOPStructureBuildingCoveragePremiumCount_1 + MathHelper.getIntegerValue(1.0));
		}		}

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws ParseException {
	  
	ProRateIndicator();
	
	EffectiveDt();
	
	ExpirationDt();
	
	  
	}
	public void calcPremium_1 ()  {
	  this.BOPVacancyPermitBusnPrsnlPropCoverage.setCalcPremium_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPVacancyPermitBusnPrsnlPropCoverage,"../../BOPClassification") ){
			this.BOPVacancyPermitBusnPrsnlPropCoverage.setCalcPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPVacancyPermitBusnPrsnlPropCoverage.getCalcPremium_1()) + MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FinalBusnPrsnlPropRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"Factor")))) * (((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) + MathHelper.getDoubleValue(this.BOPVacancyPermitBusnPrsnlPropCoverage.getFunctBPPTotalLimit_1())) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"IRPMFactor"))))));
		}

	  
	}
	public void ProRateIndicator ()  {
	  this.BOPVacancyPermitBusnPrsnlPropCoverage.setProRateIndicator(MathHelper.getIntegerValue(0.0));

	  
	}
	public void Premium ()  {
	  this.BOPVacancyPermitBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller(this.BOPVacancyPermitBusnPrsnlPropCoverage.getCalcPremium_1() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBusnPrsnlPropCoverage,"../VacancyPermitProRateFactor")))));

	  
	}
	
	
	
	
	


	
}