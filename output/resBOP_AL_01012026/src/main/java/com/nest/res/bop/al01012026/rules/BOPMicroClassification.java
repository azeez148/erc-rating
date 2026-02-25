package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPMicroClassificationLiabMedExpensesCoverage;
import com.nest.res.bop.al01012026.domain.BOPMicroClassificationBusnPrsnlPropCoverage;

public class BOPMicroClassification  {

	
	
	
	private List<BOPMicroClassificationLiabMedExpensesCoverage> BOPMicroClassificationLiabMedExpensesCoverageList;
	private List<BOPMicroClassificationBusnPrsnlPropCoverage> BOPMicroClassificationBusnPrsnlPropCoverageList;
	private com.nest.res.bop.al01012026.domain.BOPMicroClassification BOPMicroClassification;
	private com.nest.res.bop.al01012026.rules.BOPMicroClassificationBusnPrsnlPropCoverage BOPMicroClassificationBusnPrsnlPropCoverageRule;
	private com.nest.res.bop.al01012026.rules.BOPMicroClassificationLiabMedExpensesCoverage BOPMicroClassificationLiabMedExpensesCoverageRule;
	
	
	
	public void TerrorismLiabilityFactor () throws LookupException,NumberFormatException {
	  this.BOPMicroClassification.setTerrorismLiabilityFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroLiabilityAndMedicalExpensesCertifiedActsOfTerrorismCoverageFactor",String.valueOf( "Y"))));

	  
	}
	public  BOPMicroClassification (com.nest.res.bop.al01012026.domain.BOPMicroClassification BOPMicroClassification)  {
	  this.BOPMicroClassification = BOPMicroClassification;
this.BOPMicroClassificationLiabMedExpensesCoverageList = BOPMicroClassification.getBOPMicroClassificationLiabMedExpensesCoverage();
this.BOPMicroClassificationBusnPrsnlPropCoverageList = BOPMicroClassification.getBOPMicroClassificationBusnPrsnlPropCoverage();

	  
	}
	public void TerrorismLiabilityPremium ()  {
	  this.BOPMicroClassification.setTerrorismLiabilityPremium(MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismPreLiabilityPremiumTemp_1() + this.BOPMicroClassification.getTerrorismPostLiabilityPremiumTemp_1()));

	  
	}
	public void terrorismPostBPPPremiumTemp_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTRIPTerminatesBeforeExpirationDate"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTRIAExtended"))).equals(MathHelper.getStringValue("No")) && (XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroConditionalExclusionOfTerrorismRelatingToDispositionOfFederalTRIA")) == null && (XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroConditionalExclusionOfTerrorismInvolvingNBCTerrorismRelatingToDispositionOfFederalTRIA")) == null && (XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroConditionalLimitationOfCovForTerrorismSubLimitOnAnnualAggregateBasisRelatingToDispOfFederalTRIA")) == null){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPMicroClassification.setTerrorismPostBPPPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismBPPFullRate()) * MathHelper.getDoubleValue(this.BOPMicroClassification.getMicroLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/TRIAPostProRateFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../OptionalDeductibleFactor")))) * (MathHelper.getDoubleValue(this.BOPMicroClassification.getBusnPrsnlPropLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTypeOfExclusion"))).equals(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"))){
			this.BOPMicroClassification.setTerrorismPostBPPPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismBPPFullRate()) * MathHelper.getDoubleValue(this.BOPMicroClassification.getMicroLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/TRIAPostProRateFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../OptionalDeductibleFactor"))) * MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismBPPNBCRFactor())) * (MathHelper.getDoubleValue(this.BOPMicroClassification.getBusnPrsnlPropLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTypeOfExclusion"))).equals(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"))){
			this.BOPMicroClassification.setTerrorismPostBPPPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismBPPFullRate()) * MathHelper.getDoubleValue(this.BOPMicroClassification.getMicroLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/TRIAPostProRateFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../OptionalDeductibleFactor")))) * (MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrsmSubLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
			this.BOPMicroClassification.setTerrorismPostBPPPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
		else{
			this.BOPMicroClassification.setTerrorismPostBPPPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_CommonRatingSub2 ()  {
	  
	terrorismPreBPPPremiumTemp_1();
	
	terrorismPostBPPPremiumTemp_1();
	
	TerrorismBPPPremium();
	
	terrorismPreLiabilityPremiumTemp_1();
	
	terrorismPostLiabilityPremiumTemp_1();
	
	TerrorismLiabilityPremium();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPMicroClassification.setPremium(MathHelper.getDoubleValue(this.BOPMicroClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"BOPMicroClassificationBusnPrsnlPropCoverage/Premium")))));
this.BOPMicroClassification.setPremium(MathHelper.getDoubleValue(this.BOPMicroClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"BOPMicroClassificationLiabMedExpensesCoverage/Premium")))));

	  
	}
	public void TerrorismCovUnderlyingPolicyStatCode () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/Premium")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/Premium"))) != 0.0){
		if(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/Premium"))) > MathHelper.getDoubleValue(0.0)) && ((XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroCapOnLossesFromCertifiedActsOfTerrorism")) != null && (XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroExclusionOfOtherActsOfTerrorismCommittedOutsideTheUSCapOnLossesFromCertifiedActsOfTerrorism")) != null)){
			this.BOPMicroClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("TerrorismCovUnderlyingPolicyStatCode",String.valueOf( "No" ),String.valueOf( "No")))));
		}
		else{
		if(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/Premium"))) == MathHelper.getDoubleValue(0.0)) && ((XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroCapOnLossesFromCertifiedActsOfTerrorism")) != null && (XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroExclusionOfOtherActsOfTerrorismCommittedOutsideTheUSCapOnLossesFromCertifiedActsOfTerrorism")) != null)){
			this.BOPMicroClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("TerrorismCovUnderlyingPolicyStatCode",String.valueOf( "Yes" ),String.valueOf( "No")))));
		}
		else{
		if(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/Premium"))) > MathHelper.getDoubleValue(0.0)) && (XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroCapOnLossesFromCertifiedActsOfTerrorism")) != null){
			this.BOPMicroClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("TerrorismCovUnderlyingPolicyStatCode",String.valueOf( "No" ),String.valueOf( "Yes")))));
		}
		else{
		if(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/Premium"))) == MathHelper.getDoubleValue(0.0)) && (XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroCapOnLossesFromCertifiedActsOfTerrorism")) != null){
			this.BOPMicroClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("TerrorismCovUnderlyingPolicyStatCode",String.valueOf( "Yes" ),String.valueOf( "Yes")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroExclusionOfCertifiedActsOfTerrorism")) != null && (XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroExclusionOfCertifiedActsOfTerrorismAndExclusionOfOtherActsOfTerrorismCommittedOutsideTheUS")) != null){
			this.BOPMicroClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("TerrorismCovUnderlyingPolicyStatCode",String.valueOf( "No" ),String.valueOf( "No")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroExclusionOfCertifiedActsOfTerrorism")) != null){
			this.BOPMicroClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("TerrorismCovUnderlyingPolicyStatCode",String.valueOf( "No" ),String.valueOf( "Yes")))));
		}
		else{
		if(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/Premium"))) > MathHelper.getDoubleValue(0.0)) && ((XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroExclusionOfCertifiedActsOfTerrorismInvolvingNBCRTerrorismCapOnCoveredCertifiedActsLosses")) != null || (XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism")) != null)){
			this.BOPMicroClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("TerrorismCovUnderlyingPolicyStatCode",String.valueOf( "No" ),String.valueOf( "Yes")))));
		}
		else{
		if(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/Premium"))) == MathHelper.getDoubleValue(0.0)) && ((XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroExclusionOfCertifiedActsOfTerrorismInvolvingNBCRTerrorismCapOnCoveredCertifiedActsLosses")) != null || (XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism")) != null)){
			this.BOPMicroClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("TerrorismCovUnderlyingPolicyStatCode",String.valueOf( "Yes" ),String.valueOf( "Yes")))));
		}
		else{
			this.BOPMicroClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
		}
		}
		}
		}
		}
		}
		}
		}
		else{
			this.BOPMicroClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
	  
	}
	public void ProcessPremium2_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	TerrorismCovUnderlyingPolicyStatCode();
	
	  
	}
	public void BusinessPersonalPropertyRate () throws LookupException,NumberFormatException {
	  this.BOPMicroClassification.setBusinessPersonalPropertyRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroBusinessPersonalPropertyLossCost",String.valueOf( "Y"))));

	  
	}
	public void TerrorismBPPPremium ()  {
	  this.BOPMicroClassification.setTerrorismBPPPremium(MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismPreBPPPremiumTemp_1() + this.BOPMicroClassification.getTerrorismPostBPPPremiumTemp_1()));

	  
	}
	public void TerrorismLiabilitySubLimitFactor () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroAggregateLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroAggregateLimit"))).equals(MathHelper.getStringValue("")) && (XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrsmSubLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrsmSubLimit"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrsmSubLimit"))).equals(MathHelper.getStringValue("Not Applicable"))){
			this.BOPMicroClassification.setTerrorismLiabilitySubLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroLiabilityAndMedicalExpensesTerrorismSubLimitFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroAggregateLimit")),String.valueOf(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrsmSubLimit"))))));
		}
		else{
			this.BOPMicroClassification.setTerrorismLiabilitySubLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void terrorismPostLiabilityPremiumTemp_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTRIPTerminatesBeforeExpirationDate"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTRIAExtended"))).equals(MathHelper.getStringValue("No")) && (XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroConditionalExclusionOfTerrorismRelatingToDispositionOfFederalTRIA")) == null && (XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroConditionalExclusionOfTerrorismInvolvingNBCTerrorismRelatingToDispositionOfFederalTRIA")) == null && (XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroConditionalLimitationOfCovForTerrorismSubLimitOnAnnualAggregateBasisRelatingToDispOfFederalTRIA")) == null){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPMicroClassification.setTerrorismPostLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismLiabilityFullFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/TRIAPostProRateFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"BOPMicroClassificationLiabMedExpensesCoverage/Premium"))))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTypeOfExclusion"))).equals(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"))){
			this.BOPMicroClassification.setTerrorismPostLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismLiabilityFullFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/TRIAPostProRateFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"BOPMicroClassificationLiabMedExpensesCoverage/Premium")))) * MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismLiabilityNBCRFactor()))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTypeOfExclusion"))).equals(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"))){
		if(this.BOPMicroClassification.getTerrorismLiabilitySubLimitFactor() > MathHelper.getDoubleValue(0.0)){
			this.BOPMicroClassification.setTerrorismPostLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismLiabilityFullFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/TRIAPostProRateFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"BOPMicroClassificationLiabMedExpensesCoverage/Premium")))) * MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismLiabilitySubLimitFactor()))));
		}
		else{
			this.BOPMicroClassification.setTerrorismPostLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPMicroClassification.setTerrorismPostLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
		else{
			this.BOPMicroClassification.setTerrorismPostLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void TerrorismBPPNBCRFactor () throws LookupException,NumberFormatException {
	  this.BOPMicroClassification.setTerrorismBPPNBCRFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroPropertyAdjustmentFactorsForCertifiedActsCovWithExclOfNBCREventsFactor",String.valueOf( "Y"))));

	  
	}
	public void terrorismPreLiabilityPremiumTemp_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPMicroClassification.setTerrorismPreLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismLiabilityFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/TRIAPreProRateFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"BOPMicroClassificationLiabMedExpensesCoverage/Premium"))))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTypeOfExclusion"))).equals(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"))){
			this.BOPMicroClassification.setTerrorismPreLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismLiabilityFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/TRIAPreProRateFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"BOPMicroClassificationLiabMedExpensesCoverage/Premium")))) * MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismLiabilityNBCRFactor()))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTypeOfExclusion"))).equals(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"))){
		if(this.BOPMicroClassification.getTerrorismLiabilitySubLimitFactor() > MathHelper.getDoubleValue(0.0)){
			this.BOPMicroClassification.setTerrorismPreLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismLiabilityFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/TRIAPreProRateFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"BOPMicroClassificationLiabMedExpensesCoverage/Premium")))) * MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismLiabilitySubLimitFactor()))));
		}
		else{
			this.BOPMicroClassification.setTerrorismPreLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPMicroClassification.setTerrorismPreLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	MicroLCM();
	
	BusinessPersonalPropertyRate();
	
	FinalBusinessPersonalPropertyRate();
	
	TerrorismBPPRate();
	
	TerrorismBPPFullRate();
	
	TerrorismLiabilityFactor();
	
	TerrorismLiabilityFullFactor();
	
	TerrorismBPPNBCRFactor();
	
	TerrorismLiabilityNBCRFactor();
	
	TerrorismLiabilitySubLimitFactor();
	
	  
	}
	public void TerrorismLiabilityNBCRFactor () throws LookupException,NumberFormatException {
	  this.BOPMicroClassification.setTerrorismLiabilityNBCRFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroLiabilityAdjustmentFactorsForCertifiedActsCovWithExclOfNBCREventsFactor",String.valueOf( "Y"))));

	  
	}
	public void TerrorismBPPFullRate () throws LookupException,NumberFormatException {
	  this.BOPMicroClassification.setTerrorismBPPFullRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroBusinessPersonalPropertyCertifiedActsOfTerrorismCoverageFullRateLossCosts",String.valueOf( "Y"))));

	  
	}
	public void TerrorismLiabilityFullFactor () throws LookupException,NumberFormatException {
	  this.BOPMicroClassification.setTerrorismLiabilityFullFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroLiabilityAndMedicalExpensesCertifiedActsOfTerrorismCoverageFullRateFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium2 () throws LookupException,NumberFormatException {
	  
	ProcessPremium2_CommonRatingSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void MicroLCM ()  {
	  this.BOPMicroClassification.setMicroLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../MicroLCM"))));

	  
	}
	public void FinalBusinessPersonalPropertyRate ()  {
	  this.BOPMicroClassification.setFinalBusinessPersonalPropertyRate(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPMicroClassification.getBusinessPersonalPropertyRate() * this.BOPMicroClassification.getMicroLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../OptionalDeductibleFactor")))));

	  
	}
	public void terrorismPreBPPPremiumTemp_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPMicroClassification.setTerrorismPreBPPPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismBPPRate()) * MathHelper.getDoubleValue(this.BOPMicroClassification.getMicroLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/TRIAPreProRateFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../OptionalDeductibleFactor")))) * (MathHelper.getDoubleValue(this.BOPMicroClassification.getBusnPrsnlPropLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTypeOfExclusion"))).equals(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"))){
			this.BOPMicroClassification.setTerrorismPreBPPPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismBPPRate()) * MathHelper.getDoubleValue(this.BOPMicroClassification.getMicroLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/TRIAPreProRateFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../OptionalDeductibleFactor"))) * MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismBPPNBCRFactor())) * (MathHelper.getDoubleValue(this.BOPMicroClassification.getBusnPrsnlPropLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../MicroTypeOfExclusion"))).equals(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"))){
			this.BOPMicroClassification.setTerrorismPreBPPPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrorismBPPRate()) * MathHelper.getDoubleValue(this.BOPMicroClassification.getMicroLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../../BOPMicroTerrorismCoverage/TRIAPreProRateFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassification,"../OptionalDeductibleFactor")))) * (MathHelper.getDoubleValue(this.BOPMicroClassification.getTerrsmSubLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
			this.BOPMicroClassification.setTerrorismPreBPPPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public void TerrorismBPPRate () throws LookupException,NumberFormatException {
	  this.BOPMicroClassification.setTerrorismBPPRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroBusinessPersonalPropertyCertifiedActsOfTerrorismCoverageLossCosts",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPMicroClassificationBusnPrsnlPropCoverageList){
		for(BOPMicroClassificationBusnPrsnlPropCoverage BOPMicroClassificationBusnPrsnlPropCoverage:BOPMicroClassificationBusnPrsnlPropCoverageList){
			BOPMicroClassificationBusnPrsnlPropCoverageRule = new com.nest.res.bop.al01012026.rules.BOPMicroClassificationBusnPrsnlPropCoverage(BOPMicroClassificationBusnPrsnlPropCoverage);
			BOPMicroClassificationBusnPrsnlPropCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPMicroClassificationLiabMedExpensesCoverageList){
		for(BOPMicroClassificationLiabMedExpensesCoverage BOPMicroClassificationLiabMedExpensesCoverage:BOPMicroClassificationLiabMedExpensesCoverageList){
			BOPMicroClassificationLiabMedExpensesCoverageRule = new com.nest.res.bop.al01012026.rules.BOPMicroClassificationLiabMedExpensesCoverage(BOPMicroClassificationLiabMedExpensesCoverage);
			BOPMicroClassificationLiabMedExpensesCoverageRule.ProcessPremium1();

		}
	}
	ProcessPremium1_CommonRatingSub2();
	
	  
	}
	
	
	
	
	


	
}