package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPVacancyPermitBldgCoverage;
import com.nest.res.bop.al09012019.domain.BOPVacancyPermitBusnPrsnlPropCoverage;

public class BOPVacancyPermit  {

	
	
	
	private List<BOPVacancyPermitBldgCoverage> BOPVacancyPermitBldgCoverageList;
	private com.nest.res.bop.al09012019.rules.BOPVacancyPermitBldgCoverage BOPVacancyPermitBldgCoverageRule;
	private com.nest.res.bop.al09012019.rules.BOPVacancyPermitBusnPrsnlPropCoverage BOPVacancyPermitBusnPrsnlPropCoverageRule;
	private com.nest.res.bop.al09012019.domain.BOPVacancyPermit BOPVacancyPermit;
	private List<BOPVacancyPermitBusnPrsnlPropCoverage> BOPVacancyPermitBusnPrsnlPropCoverageList;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException,ParseException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPVacancyPermitBldgCoverageList){
		for(BOPVacancyPermitBldgCoverage BOPVacancyPermitBldgCoverage:BOPVacancyPermitBldgCoverageList){
			BOPVacancyPermitBldgCoverageRule = new com.nest.res.bop.al09012019.rules.BOPVacancyPermitBldgCoverage(BOPVacancyPermitBldgCoverage);
			BOPVacancyPermitBldgCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPVacancyPermitBusnPrsnlPropCoverageList){
		for(BOPVacancyPermitBusnPrsnlPropCoverage BOPVacancyPermitBusnPrsnlPropCoverage:BOPVacancyPermitBusnPrsnlPropCoverageList){
			BOPVacancyPermitBusnPrsnlPropCoverageRule = new com.nest.res.bop.al09012019.rules.BOPVacancyPermitBusnPrsnlPropCoverage(BOPVacancyPermitBusnPrsnlPropCoverage);
			BOPVacancyPermitBusnPrsnlPropCoverageRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void periodFrom_1 () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) != null){
			this.BOPVacancyPermit.setPeriodFrom_1(MathHelper.getDateValue((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate")))));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPVacancyPermit.setPremium(MathHelper.getDoubleValue(this.BOPVacancyPermit.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"BOPVacancyPermitBldgCoverage/Premium")))));
this.BOPVacancyPermit.setPremium(MathHelper.getDoubleValue(this.BOPVacancyPermit.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"BOPVacancyPermitBusnPrsnlPropCoverage/Premium")))));

	  
	}
	public void vacancyPermitErrors_1 () throws ParseException {
	  this.BOPVacancyPermit.setVacancyPermitErrors_1(MathHelper.getBooleanValue(false));

		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) == null){
			this.BOPVacancyPermit.setVacancyPermitErrors_1(MathHelper.getBooleanValue(MathHelper.getBooleanValue(true)));
		}
		else{
		if(this.BOPVacancyPermit.getStartDate().compareTo((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"../../../../EffDate"))))<0 || this.BOPVacancyPermit.getStartDate().compareTo((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"../../../../ExpDate"))))>0){
			this.BOPVacancyPermit.setVacancyPermitErrors_1(MathHelper.getBooleanValue(MathHelper.getBooleanValue(true)));
		}
		}
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) == null){
			this.BOPVacancyPermit.setVacancyPermitErrors_1(MathHelper.getBooleanValue(MathHelper.getBooleanValue(true)));
		}
		else{
		if(this.BOPVacancyPermit.getEndDate().compareTo((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"../../../../EffDate"))))<0 || this.BOPVacancyPermit.getEndDate().compareTo((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"../../../../ExpDate"))))>0){
			this.BOPVacancyPermit.setVacancyPermitErrors_1(MathHelper.getBooleanValue(MathHelper.getBooleanValue(true)));
		}
		else{
		if(this.BOPVacancyPermit.getEndDate().compareTo(this.BOPVacancyPermit.getStartDate())<0){
			this.BOPVacancyPermit.setVacancyPermitErrors_1(MathHelper.getBooleanValue(MathHelper.getBooleanValue(true)));
		}
		}
		}
	  
	}
	public void policyDate_1 () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) != null){
			this.BOPVacancyPermit.setPolicyDate_1(MathHelper.getLongValue(Math.abs((this.BOPVacancyPermit.getExpirationDate_1().getTime() - this.BOPVacancyPermit.getEffectiveDate_1().getTime())/86400000)));
		}
	  
	}
	public void formDate_1 () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) != null){
			this.BOPVacancyPermit.setFormDate_1(MathHelper.getLongValue(Math.abs((this.BOPVacancyPermit.getPeriodTo_1().getTime() - this.BOPVacancyPermit.getPeriodFrom_1().getTime())/86400000)));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException,ParseException {
	  this.BOPVacancyPermit.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("VacancyPermitFactor",String.valueOf( "Y"))));

	  
	}
	public void EffectiveDt ()  {
	  
		if(this.BOPVacancyPermit.getVacancyPermitErrors_1() == MathHelper.getBooleanValue(false)){
			this.BOPVacancyPermit.setEffectiveDt(MathHelper.getDateValue(this.BOPVacancyPermit.getStartDate()));
		}
	  
	}
	public void ExpirationDt ()  {
	  
		if(this.BOPVacancyPermit.getVacancyPermitErrors_1() == MathHelper.getBooleanValue(false)){
			this.BOPVacancyPermit.setExpirationDt(MathHelper.getDateValue(this.BOPVacancyPermit.getEndDate()));
		}
	  
	}
	public void effectiveDate_1 () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) != null){
			this.BOPVacancyPermit.setEffectiveDate_1(MathHelper.getDateValue((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"../../../../EffDate")))));
		}
	  
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
	public void periodTo_1 () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) != null){
			this.BOPVacancyPermit.setPeriodTo_1(MathHelper.getDateValue((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate")))));
		}
	  
	}
	public  BOPVacancyPermit (com.nest.res.bop.al09012019.domain.BOPVacancyPermit BOPVacancyPermit)  {
	  this.BOPVacancyPermit = BOPVacancyPermit;
this.BOPVacancyPermitBldgCoverageList = BOPVacancyPermit.getBOPVacancyPermitBldgCoverage();
this.BOPVacancyPermitBusnPrsnlPropCoverageList = BOPVacancyPermit.getBOPVacancyPermitBusnPrsnlPropCoverage();

	  
	}
	public void expirationDate_1 () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) != null){
			this.BOPVacancyPermit.setExpirationDate_1(MathHelper.getDateValue((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"../../../../ExpDate")))));
		}
	  
	}
	public void ProRateFactor () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) != null){
			this.BOPVacancyPermit.setProRateFactor(MathHelper.getDoubleValue(MathHelper.roundToThousand(this.BOPVacancyPermit.getFormDate_1_Days() / this.BOPVacancyPermit.getPolicyDate_1_Days())));
		}
		else{
			this.BOPVacancyPermit.setProRateFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void VacancyPermitProRateFactor () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermit,"EndDate"))) != null){
			this.BOPVacancyPermit.setVacancyPermitProRateFactor(MathHelper.getDoubleValue(MathHelper.roundToThousand(this.BOPVacancyPermit.getFormDate_1_Days() / this.BOPVacancyPermit.getPolicyDate_1_Days())));
		}
		else{
			this.BOPVacancyPermit.setVacancyPermitProRateFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}