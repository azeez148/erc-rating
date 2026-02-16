package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPVacancyPermitBldgCoverage;
import com.nest.res.bop.domain.BOPVacancyPermitBusnPrsnlPropCoverage;

public class BOPVacancyPermit  {

	
	
	
	private List<BOPVacancyPermitBldgCoverage> BOPVacancyPermitBldgCoverageList;
	private com.nest.res.bop.rules.BOPVacancyPermitBldgCoverage BOPVacancyPermitBldgCoverageRule;
	private com.nest.res.bop.rules.BOPVacancyPermitBusnPrsnlPropCoverage BOPVacancyPermitBusnPrsnlPropCoverageRule;
	private com.nest.res.bop.domain.BOPVacancyPermit BOPVacancyPermit;
	private List<BOPVacancyPermitBusnPrsnlPropCoverage> BOPVacancyPermitBusnPrsnlPropCoverageList;
	
	
	
	public void policyDate_1 () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) != null){
			this.BOPVacancyPermit.setPolicyDate_1(null);
		}
	  
	}
	public void periodFrom_1 () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) != null){
			this.BOPVacancyPermit.setPeriodFrom_1((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException,ParseException {
	  this.BOPVacancyPermit.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("VacancyPermitFactor",String.valueOf( "Y"))));

	  
	}
	public void formDate_1 () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) != null){
			this.BOPVacancyPermit.setFormDate_1(null);
		}
	  
	}
	public void ProRateFactor () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) != null){
			this.BOPVacancyPermit.setProRateFactor(MathHelper.roundToThousand(this.BOPVacancyPermit.getFormDate_1_Days() / this.BOPVacancyPermit.getPolicyDate_1_Days()));
		}
		else{
			this.BOPVacancyPermit.setProRateFactor((double)0.0);
		}
	  
	}
	public void vacancyPermitErrors_1 () throws ParseException {
	  this.BOPVacancyPermit.setVacancyPermitErrors_1((boolean)false);

		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) == null){
			this.BOPVacancyPermit.setVacancyPermitErrors_1((boolean)true);
		}
		else{
		if(this.BOPVacancyPermit.getStartDate().compareTo((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"../../../../EffDate"))))<0 || this.BOPVacancyPermit.getStartDate().compareTo((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"../../../../ExpDate"))))>0){
			this.BOPVacancyPermit.setVacancyPermitErrors_1((boolean)true);
		}
		}
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) == null){
			this.BOPVacancyPermit.setVacancyPermitErrors_1((boolean)true);
		}
		else{
		if(this.BOPVacancyPermit.getEndDate().compareTo((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"../../../../EffDate"))))<0 || this.BOPVacancyPermit.getEndDate().compareTo((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"../../../../ExpDate"))))>0){
			this.BOPVacancyPermit.setVacancyPermitErrors_1((boolean)true);
		}
		else{
		if(this.BOPVacancyPermit.getEndDate().compareTo(this.BOPVacancyPermit.getStartDate())<0){
			this.BOPVacancyPermit.setVacancyPermitErrors_1((boolean)true);
		}
		}
		}
	  
	}
	public void periodTo_1 () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) != null){
			this.BOPVacancyPermit.setPeriodTo_1((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))));
		}
	  
	}
	public  BOPVacancyPermit (com.nest.res.bop.domain.BOPVacancyPermit BOPVacancyPermit)  {
	  this.BOPVacancyPermit = BOPVacancyPermit;
this.BOPVacancyPermitBldgCoverageList = BOPVacancyPermit.getBOPVacancyPermitBldgCoverage();
this.BOPVacancyPermitBusnPrsnlPropCoverageList = BOPVacancyPermit.getBOPVacancyPermitBusnPrsnlPropCoverage();

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException,ParseException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPVacancyPermitBldgCoverageList){
		for(BOPVacancyPermitBldgCoverage BOPVacancyPermitBldgCoverage:BOPVacancyPermitBldgCoverageList){
			BOPVacancyPermitBldgCoverageRule = new com.nest.res.bop.rules.BOPVacancyPermitBldgCoverage(BOPVacancyPermitBldgCoverage);
			BOPVacancyPermitBldgCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPVacancyPermitBusnPrsnlPropCoverageList){
		for(BOPVacancyPermitBusnPrsnlPropCoverage BOPVacancyPermitBusnPrsnlPropCoverage:BOPVacancyPermitBusnPrsnlPropCoverageList){
			BOPVacancyPermitBusnPrsnlPropCoverageRule = new com.nest.res.bop.rules.BOPVacancyPermitBusnPrsnlPropCoverage(BOPVacancyPermitBusnPrsnlPropCoverage);
			BOPVacancyPermitBusnPrsnlPropCoverageRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	public void ExpirationDt ()  {
	  
		if(this.BOPVacancyPermit.getVacancyPermitErrors_1() == (boolean)false){
			this.BOPVacancyPermit.setExpirationDt(this.BOPVacancyPermit.getEndDate());
		}
	  
	}
	public void effectiveDate_1 () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) != null){
			this.BOPVacancyPermit.setEffectiveDate_1((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"../../../../EffDate"))));
		}
	  
	}
	public void VacancyPermitProRateFactor () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) != null){
			this.BOPVacancyPermit.setVacancyPermitProRateFactor(MathHelper.roundToThousand(this.BOPVacancyPermit.getFormDate_1_Days() / this.BOPVacancyPermit.getPolicyDate_1_Days()));
		}
		else{
			this.BOPVacancyPermit.setVacancyPermitProRateFactor((double)0.0);
		}
	  
	}
	public void expirationDate_1 () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) != null){
			this.BOPVacancyPermit.setExpirationDate_1((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"../../../../ExpDate"))));
		}
	  
	}
	public void EffectiveDt ()  {
	  
		if(this.BOPVacancyPermit.getVacancyPermitErrors_1() == (boolean)false){
			this.BOPVacancyPermit.setEffectiveDt(this.BOPVacancyPermit.getStartDate());
		}
	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPVacancyPermitBldgCoverageList != null && this.BOPVacancyPermitBldgCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPVacancyPermitBldgCoverage BOPVacancyPermitBldgCoverage : BOPVacancyPermitBldgCoverageList) {
				finalPremium = finalPremium + BOPVacancyPermitBldgCoverage.getPremium();
			}
		}
		if(this.BOPVacancyPermitBusnPrsnlPropCoverageList != null && this.BOPVacancyPermitBusnPrsnlPropCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPVacancyPermitBusnPrsnlPropCoverage BOPVacancyPermitBusnPrsnlPropCoverage : BOPVacancyPermitBusnPrsnlPropCoverageList) {
				finalPremium = finalPremium + BOPVacancyPermitBusnPrsnlPropCoverage.getPremium();
			}
		}
this.BOPVacancyPermit.setPremium(finalPremium) ;
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException,ParseException {
	  
	vacancyPermitErrors_1();
	
	EffectiveDt();
	
	ExpirationDt();
	
	periodFrom_1();
	
	periodTo_1();
	
	effectiveDate_1();
	
	expirationDate_1();
	
	policyDate_1();
	
	formDate_1();
	
	VacancyPermitProRateFactor();
	
	ProRateFactor();
	
	Factor();
	
	  
	}
	
	
	
	
	


	
}