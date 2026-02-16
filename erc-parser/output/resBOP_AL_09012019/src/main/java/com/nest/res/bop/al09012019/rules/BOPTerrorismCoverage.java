package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPTerrorismCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPTerrorismCoverage BOPTerrorismCoverage;
	
	
	
	public  BOPTerrorismCoverage (com.nest.res.bop.al09012019.domain.BOPTerrorismCoverage BOPTerrorismCoverage)  {
	  this.BOPTerrorismCoverage = BOPTerrorismCoverage;

	  
	}
	public void endOfTRIA_1 () throws ParseException {
	  
		if((XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TRIAExpirationDate")) != null){
			this.BOPTerrorismCoverage.setEndOfTRIA_1(MathHelper.getDateValue((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TRIAExpirationDate")))));
		}
	  
	}
	public void Premium ()  {
	  this.BOPTerrorismCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((this.BOPTerrorismCoverage.getTerrorismBldgPremium() + this.BOPTerrorismCoverage.getTerrorismBPPPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../IRPMFactor")))) + this.BOPTerrorismCoverage.getTerrorismLiabPremium()));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPTerrorismCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((this.BOPTerrorismCoverage.getTerrorismBldgPremium() + this.BOPTerrorismCoverage.getTerrorismBPPPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../IRPMFactor")))) + this.BOPTerrorismCoverage.getTerrorismLiabPremium()));

	  
	}
	public void TerrorismBPPPremium ()  {
	  this.BOPTerrorismCoverage.setTerrorismBPPPremium(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPTerrorismCoverage,"../BOPLocation/BOPStructure/BOPClassification") ){
			this.BOPTerrorismCoverage.setTerrorismBPPPremium(MathHelper.getDoubleValue(this.BOPTerrorismCoverage.getTerrorismBPPPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"TerrsmBusnPrsnlPropPremium")))));
		}

	  
	}
	public void DaysUntilTRIAExpiration () throws ParseException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TRIPTerminatesBeforeExpirationDate"))).equals(MathHelper.getStringValue("Yes"))){
		if((XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TRIAExpirationDate")) != null){
			this.BOPTerrorismCoverage.setDaysUntilTRIAExpiration(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPTerrorismCoverage.getDateDiff_1_Days() + MathHelper.getIntegerValue(1.0))));
		if(this.BOPTerrorismCoverage.getDaysUntilTRIAExpiration() < MathHelper.getIntegerValue(0.0)){
			this.BOPTerrorismCoverage.setDaysUntilTRIAExpiration(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		}
		else{
			this.BOPTerrorismCoverage.setDaysUntilTRIAExpiration(MathHelper.getIntegerValue(MathHelper.getIntegerValue(365.0)));
		}
	  
	}
	public void TRIAPostProRateFactor ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../BOPConditionalExclusionOfTerrorismDispositionOfAct2002")) != null || (XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../BOPConditionalExclusionOfTerrorismNuclearBiologicalChemicalDispositionOfAct2002")) != null || (XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../BOPConditionalLimitationOfCoverageTerrorismSublimitAnnualAggregateTerrorismAct2002")) != null){
			this.BOPTerrorismCoverage.setTRIAPostProRateFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
		if(this.BOPTerrorismCoverage.getDaysUntilTRIAExpiration() == MathHelper.getIntegerValue(0.0)){
			this.BOPTerrorismCoverage.setTRIAPostProRateFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		else{
			this.BOPTerrorismCoverage.setTRIAPostProRateFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0) - this.BOPTerrorismCoverage.getTRIAPreProRateFactor())));
		}
		}
	  
	}
	public void ProcessPremium1 () throws ParseException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws ParseException {
	  
	effDate_1();
	
	endOfTRIA_1();
	
	dateDiff_1();
	
	DaysUntilTRIAExpiration();
	
	TRIAPreProRateFactor();
	
	TRIAPostProRateFactor();
	
	  
	}
	public void TerrorismLiabPremium ()  {
	  this.BOPTerrorismCoverage.setTerrorismLiabPremium(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPTerrorismCoverage,"../BOPLocation/BOPStructure") ){
			this.BOPTerrorismCoverage.setTerrorismLiabPremium(MathHelper.getDoubleValue(this.BOPTerrorismCoverage.getTerrorismLiabPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"TerrsmLiabilityPremium")))));
		}

	  
	}
	public void ProcessPremium2 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium2_ProcessPremiumSub1();
	
	ProcessPremium2_CommonRatingSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))) || ((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")))){
			this.BOPTerrorismCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPTerrorismCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void TRIAPreProRateFactor ()  {
	  
		if(this.BOPTerrorismCoverage.getDaysUntilTRIAExpiration() == MathHelper.getIntegerValue(0.0) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TRIAExtended"))).equals(MathHelper.getStringValue("No"))){
			this.BOPTerrorismCoverage.setTRIAPreProRateFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
		if((this.BOPTerrorismCoverage.getDaysUntilTRIAExpiration() == MathHelper.getIntegerValue(365.0)) || (this.BOPTerrorismCoverage.getDaysUntilTRIAExpiration() < MathHelper.getIntegerValue(365.0) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TRIAExtended"))).equals(MathHelper.getStringValue("Yes")))){
			this.BOPTerrorismCoverage.setTRIAPreProRateFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		else{
			this.BOPTerrorismCoverage.setTRIAPreProRateFactor(MathHelper.getDoubleValue(MathHelper.roundToHundred(MathHelper.getDoubleValue(this.BOPTerrorismCoverage.getDaysUntilTRIAExpiration()) / MathHelper.getDoubleValue(365.0))));
		}
		}
	  
	}
	public void TerrorismBldgPremium ()  {
	  this.BOPTerrorismCoverage.setTerrorismBldgPremium(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPTerrorismCoverage,"../BOPLocation/BOPStructure") ){
			this.BOPTerrorismCoverage.setTerrorismBldgPremium(MathHelper.getDoubleValue(this.BOPTerrorismCoverage.getTerrorismBldgPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"TerrsmBldgPremium")))));
		}

	  
	}
	public void CertifiedActsOfTerrorismLimitations ()  {
	  this.BOPTerrorismCoverage.setCertifiedActsOfTerrorismLimitations(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"));

	  
	}
	public void dateDiff_1 () throws ParseException {
	  
		if((XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TRIAExpirationDate")) != null){
			this.BOPTerrorismCoverage.setDateDiff_1(MathHelper.getLongValue(Math.abs((this.BOPTerrorismCoverage.getEndOfTRIA_1().getTime() - this.BOPTerrorismCoverage.getEffDate_1().getTime())/86400000)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPTerrorismCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPTerrorismCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPTerrorismCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium2_ProcessPremiumSub1 ()  {
	  
	TerrorismBldgPremium();
	
	TerrorismBPPPremium();
	
	TerrorismLiabPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium2_CommonRatingSub1 ()  {
	  
	ExclOfCertfdActsOfTerrsmNBCR();
	
	CertifiedActsOfTerrorismLimitations();
	
	  
	}
	public void ExclOfCertfdActsOfTerrsmNBCR ()  {
	  this.BOPTerrorismCoverage.setExclOfCertfdActsOfTerrsmNBCR(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"));

	  
	}
	public void effDate_1 ()  {
	  this.BOPTerrorismCoverage.setEffDate_1((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"ancestor::*[name(.)='Policy' or name(.)='Quote']/EffDate"))));

	  
	}
	
	
	
	
	


	
}