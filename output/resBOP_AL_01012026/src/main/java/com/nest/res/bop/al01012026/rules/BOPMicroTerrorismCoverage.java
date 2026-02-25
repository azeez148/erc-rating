package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMicroTerrorismCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMicroTerrorismCoverage BOPMicroTerrorismCoverage;
	
	
	
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPMicroTerrorismCoverage.setPremium(MathHelper.roundUpDoller(this.BOPMicroTerrorismCoverage.getTerrorismBPPPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../IRPMFactor"))) + this.BOPMicroTerrorismCoverage.getTerrorismLiabilityPremium()));

	  
	}
	public void ProcessPremium2 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium2_ProcessPremiumSub1();
	
	ProcessPremium2_CommonRatingSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../MicroBOP"))).equals(MathHelper.getStringValue("Yes"))){
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../MicroTerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))) || ((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../MicroTerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../MicroTerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")))){
			this.BOPMicroTerrorismCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroTerrorismCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		else{
			this.BOPMicroTerrorismCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void effDate_1 ()  {
	  this.BOPMicroTerrorismCoverage.setEffDate_1((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"ancestor::*[name(.)='Policy' or name(.)='Quote']/EffDate"))));

	  
	}
	public void DaysUntilTRIAExpiration () throws ParseException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../MicroTRIPTerminatesBeforeExpirationDate"))).equals(MathHelper.getStringValue("Yes"))){
		if((XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../MicroTRIAExpirationDate")) != null){
		if(this.BOPMicroTerrorismCoverage.getDateDiff_1_Days() + MathHelper.getIntegerValue(1.0) >= 0.0){
			this.BOPMicroTerrorismCoverage.setDaysUntilTRIAExpiration(MathHelper.getIntegerValue(this.BOPMicroTerrorismCoverage.getDaysUntilTRIAExpirationTemp_1()));
		}
		else{
			this.BOPMicroTerrorismCoverage.setDaysUntilTRIAExpiration(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		else{
			this.BOPMicroTerrorismCoverage.setDaysUntilTRIAExpiration(MathHelper.getIntegerValue(MathHelper.getIntegerValue(365.0)));
		}
		}
		else{
			this.BOPMicroTerrorismCoverage.setDaysUntilTRIAExpiration(MathHelper.getIntegerValue(MathHelper.getIntegerValue(365.0)));
		}
	  
	}
	public  BOPMicroTerrorismCoverage (com.nest.res.bop.al01012026.domain.BOPMicroTerrorismCoverage BOPMicroTerrorismCoverage)  {
	  this.BOPMicroTerrorismCoverage = BOPMicroTerrorismCoverage;

	  
	}
	public void ProcessPremium2_CommonRatingSub1 ()  {
	  
	ExclOfCertfdActsOfTerrsmNBCR();
	
	CertifiedActsOfTerrorismLimitations();
	
	  
	}
	public void TRIAPostProRateFactor ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../BOPMicroConditionalExclusionOfTerrorismRelatingToDispositionOfFederalTRIA")) != null || (XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../BOPMicroConditionalExclusionOfTerrorismInvolvingNBCTerrorismRelatingToDispositionOfFederalTRIA")) != null || (XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../BOPMicroConditionalLimitationOfCovForTerrorismSubLimitOnAnnualAggregateBasisRelatingToDispOfFederalTRIA")) != null){
			this.BOPMicroTerrorismCoverage.setTRIAPostProRateFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
		if(this.BOPMicroTerrorismCoverage.getDaysUntilTRIAExpiration() == MathHelper.getIntegerValue(0.0)){
			this.BOPMicroTerrorismCoverage.setTRIAPostProRateFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		else{
			this.BOPMicroTerrorismCoverage.setTRIAPostProRateFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0) - this.BOPMicroTerrorismCoverage.getTRIAPreProRateFactor())));
		}
		}
	  
	}
	public void terrorismBPPPremiumTemp_1 ()  {
	  this.BOPMicroTerrorismCoverage.setTerrorismBPPPremiumTemp_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPMicroTerrorismCoverage,"../BOPMicroLocation/BOPMicroClassification") ){
			this.BOPMicroTerrorismCoverage.setTerrorismBPPPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPMicroTerrorismCoverage.getTerrorismBPPPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"TerrorismBPPPremium")))));
		}

	  
	}
	public void ProcessPremium2_ProcessPremiumSub1 ()  {
	  
	terrorismBPPPremiumTemp_1();
	
	TerrorismBPPPremium();
	
	terrorismLiabilityPremiumTemp_1();
	
	TerrorismLiabilityPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMicroTerrorismCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPMicroTerrorismCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroTerrorismCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPMicroTerrorismCoverage.setPremium(MathHelper.roundUpDoller(this.BOPMicroTerrorismCoverage.getTerrorismBPPPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../IRPMFactor"))) + this.BOPMicroTerrorismCoverage.getTerrorismLiabilityPremium()));

	  
	}
	public void endOfTRIA_1 () throws ParseException {
	  
		if((XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../MicroTRIAExpirationDate")) != null){
			this.BOPMicroTerrorismCoverage.setEndOfTRIA_1(MathHelper.getDateValue((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../MicroTRIAExpirationDate")))));
		}
	  
	}
	public void CertifiedActsOfTerrorismLimitations ()  {
	  this.BOPMicroTerrorismCoverage.setCertifiedActsOfTerrorismLimitations(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"));

	  
	}
	public void TRIAPreProRateFactor ()  {
	  
		if(this.BOPMicroTerrorismCoverage.getDaysUntilTRIAExpiration() == MathHelper.getIntegerValue(0.0) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../MicroTRIAExtended"))).equals(MathHelper.getStringValue("No"))){
			this.BOPMicroTerrorismCoverage.setTRIAPreProRateFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
		if((this.BOPMicroTerrorismCoverage.getDaysUntilTRIAExpiration() == MathHelper.getIntegerValue(365.0)) || (this.BOPMicroTerrorismCoverage.getDaysUntilTRIAExpiration() < MathHelper.getIntegerValue(365.0) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../MicroTRIAExtended"))).equals(MathHelper.getStringValue("Yes")))){
			this.BOPMicroTerrorismCoverage.setTRIAPreProRateFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		else{
			this.BOPMicroTerrorismCoverage.setTRIAPreProRateFactor(MathHelper.getDoubleValue(MathHelper.roundToHundred(MathHelper.getDoubleValue(this.BOPMicroTerrorismCoverage.getDaysUntilTRIAExpiration()) / MathHelper.getDoubleValue(365.0))));
		}
		}
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws ParseException {
	  
	effDate_1();
	
	endOfTRIA_1();
	
	dateDiff_1();
	
	daysUntilTRIAExpirationTemp_1();
	
	DaysUntilTRIAExpiration();
	
	TRIAPreProRateFactor();
	
	TRIAPostProRateFactor();
	
	  
	}
	public void daysUntilTRIAExpirationTemp_1 () throws ParseException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../MicroTRIPTerminatesBeforeExpirationDate"))).equals(MathHelper.getStringValue("Yes"))){
		if((XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../MicroTRIAExpirationDate")) != null){
			this.BOPMicroTerrorismCoverage.setDaysUntilTRIAExpirationTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPMicroTerrorismCoverage.getDateDiff_1_Days() + MathHelper.getIntegerValue(1.0))));
		}
		}
	  
	}
	public void ExclOfCertfdActsOfTerrsmNBCR ()  {
	  this.BOPMicroTerrorismCoverage.setExclOfCertfdActsOfTerrsmNBCR(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"));

	  
	}
	public void dateDiff_1 () throws ParseException {
	  
		if((XpathNode.selectNodeValue(this.BOPMicroTerrorismCoverage,"../MicroTRIAExpirationDate")) != null){
			this.BOPMicroTerrorismCoverage.setDateDiff_1(MathHelper.getLongValue(Math.abs((this.BOPMicroTerrorismCoverage.getEndOfTRIA_1().getTime() - this.BOPMicroTerrorismCoverage.getEffDate_1().getTime())/86400000)));
		}
	  
	}
	public void ProcessPremium1 () throws ParseException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void terrorismLiabilityPremiumTemp_1 ()  {
	  this.BOPMicroTerrorismCoverage.setTerrorismLiabilityPremiumTemp_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPMicroTerrorismCoverage,"../BOPMicroLocation/BOPMicroClassification") ){
			this.BOPMicroTerrorismCoverage.setTerrorismLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPMicroTerrorismCoverage.getTerrorismLiabilityPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"TerrorismLiabilityPremium")))));
		}

	  
	}
	public void TerrorismLiabilityPremium ()  {
	  this.BOPMicroTerrorismCoverage.setTerrorismLiabilityPremium(this.BOPMicroTerrorismCoverage.getTerrorismLiabilityPremiumTemp_1());

	  
	}
	public void TerrorismBPPPremium ()  {
	  this.BOPMicroTerrorismCoverage.setTerrorismBPPPremium(this.BOPMicroTerrorismCoverage.getTerrorismBPPPremiumTemp_1());

	  
	}
	
	
	
	
	


	
}