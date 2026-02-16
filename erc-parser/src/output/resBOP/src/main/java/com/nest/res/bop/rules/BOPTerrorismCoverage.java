package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPTerrorismCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPTerrorismCoverage BOPTerrorismCoverage;
	
	
	
	public void endOfTRIA_1 () throws ParseException {
	  
		if(((XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TRIAExpirationDate"))) != null){
			this.BOPTerrorismCoverage.setEndOfTRIA_1((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TRIAExpirationDate"))));
		}
	  
	}
	public void ProcessPremium2 ()  {
	  
	ProcessPremium2_ProcessPremiumSub1();
	
	ProcessPremium2_CommonRatingSub1();
	
	  
	}
	public void TRIAPostProRateFactor ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../BOPConditionalExclusionOfTerrorismDispositionOfAct2002"))) != null || ((XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../BOPConditionalExclusionOfTerrorismNuclearBiologicalChemicalDispositionOfAct2002"))) != null || ((XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../BOPConditionalLimitationOfCoverageTerrorismSublimitAnnualAggregateTerrorismAct2002"))) != null){
			this.BOPTerrorismCoverage.setTRIAPostProRateFactor((double)0.0);
		}
		else{
		if(this.BOPTerrorismCoverage.getDaysUntilTRIAExpiration() == (int)0.0){
			this.BOPTerrorismCoverage.setTRIAPostProRateFactor((double)1.0);
		}
		else{
			this.BOPTerrorismCoverage.setTRIAPostProRateFactor((double)1.0 - this.BOPTerrorismCoverage.getTRIAPreProRateFactor());
		}
		}
	  
	}
	public void TerrorismBldgPremium ()  {
	  this.BOPTerrorismCoverage.setTerrorismBldgPremium((double)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPTerrorismCoverage,"../BOPLocation/BOPStructure") ){
			this.BOPTerrorismCoverage.setTerrorismBldgPremium(this.BOPTerrorismCoverage.getTerrorismBldgPremium()+this.BOPTerrorismCoverage.getTerrorismBldgPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"TerrsmBldgPremium"))));
		}

	  
	}
	public void Premium ()  {
	  this.BOPTerrorismCoverage.setPremium(MathHelper.roundUpDoller((this.BOPTerrorismCoverage.getTerrorismBldgPremium() +
			  this.BOPTerrorismCoverage.getTerrorismBPPPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../IRPMFactor")))) + this.BOPTerrorismCoverage.getTerrorismLiabPremium());

	  
	}
	public void TerrorismLiabPremium ()  {
	  this.BOPTerrorismCoverage.setTerrorismLiabPremium((double)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPTerrorismCoverage,"../BOPLocation/BOPStructure") ){
			this.BOPTerrorismCoverage.setTerrorismLiabPremium(this.BOPTerrorismCoverage.getTerrorismLiabPremium()+this.BOPTerrorismCoverage.getTerrorismLiabPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"TerrsmLiabilityPremium"))));
		}

	  
	}
	public void TRIAPreProRateFactor ()  {
	  
		if(this.BOPTerrorismCoverage.getDaysUntilTRIAExpiration() == (int)0.0 && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TRIAExtended"))).equals((String)"No")){
			this.BOPTerrorismCoverage.setTRIAPreProRateFactor((double)0.0);
		}
		else{
		if((this.BOPTerrorismCoverage.getDaysUntilTRIAExpiration() == (int)365.0) || (this.BOPTerrorismCoverage.getDaysUntilTRIAExpiration() < (int)365.0 && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TRIAExtended"))).equals((String)"Yes"))){
			this.BOPTerrorismCoverage.setTRIAPreProRateFactor((double)1.0);
		}
		else{
			this.BOPTerrorismCoverage.setTRIAPreProRateFactor(MathHelper.roundToHundred((double)this.BOPTerrorismCoverage.getDaysUntilTRIAExpiration() / (double)365.0));
		}
		}
	  
	}
	public void dateDiff_1 () throws ParseException {
	  
		if(((XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TRIAExpirationDate"))) != null){
			this.BOPTerrorismCoverage.setDateDiff_1(null);
		}
	  
	}
	public void CertifiedActsOfTerrorismLimitations ()  {
	  this.BOPTerrorismCoverage.setCertifiedActsOfTerrorismLimitations((String)"Limitations Of Coverage For Certified Acts Of Terrorism");

	  
	}
	public void DaysUntilTRIAExpiration () throws ParseException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TRIPTerminatesBeforeExpirationDate"))).equals((String)"Yes")){
		if(((XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"../TRIAExpirationDate"))) != null){
			this.BOPTerrorismCoverage.setDaysUntilTRIAExpiration(this.BOPTerrorismCoverage.getDateDiff_1_Days() + (int)1.0);
		if(this.BOPTerrorismCoverage.getDaysUntilTRIAExpiration() < (int)0.0){
			this.BOPTerrorismCoverage.setDaysUntilTRIAExpiration((int)0.0);
		}
		}
		}
		else{
			this.BOPTerrorismCoverage.setDaysUntilTRIAExpiration((int)365.0);
		}
	  
	}
	public void ProcessPremium2_ProcessPremiumSub1 ()  {
	  
	TerrorismBldgPremium();
	
	TerrorismBPPPremium();
	
	TerrorismLiabPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPTerrorismCoverage (com.nest.res.bop.domain.BOPTerrorismCoverage BOPTerrorismCoverage)  {
	  this.BOPTerrorismCoverage = BOPTerrorismCoverage;

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws ParseException {
	  
	effDate_1();
	
	endOfTRIA_1();
	
	dateDiff_1();
	
	DaysUntilTRIAExpiration();
	
	TRIAPreProRateFactor();
	
	TRIAPostProRateFactor();
	
	  
	}
	public void ProcessPremium1 () throws ParseException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void TerrorismBPPPremium ()  {
	  this.BOPTerrorismCoverage.setTerrorismBPPPremium((double)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPTerrorismCoverage,"../BOPLocation/BOPStructure/BOPClassification") ){
			this.BOPTerrorismCoverage.setTerrorismBPPPremium(this.BOPTerrorismCoverage.getTerrorismBPPPremium()+this.BOPTerrorismCoverage.getTerrorismBPPPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"TerrsmBusnPrsnlPropPremium"))));
		}

	  
	}
	public void effDate_1 ()  {
	  this.BOPTerrorismCoverage.setEffDate_1((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPTerrorismCoverage,"ancestor::*[name(.)='Policy' or name(.)='Quote']/EffDate"))));

	  
	}
	public void ExclOfCertfdActsOfTerrsmNBCR ()  {
	  this.BOPTerrorismCoverage.setExclOfCertfdActsOfTerrsmNBCR((String)"Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses");

	  
	}
	public void ProcessPremium2_CommonRatingSub1 ()  {
	  
	ExclOfCertfdActsOfTerrsmNBCR();
	
	CertifiedActsOfTerrorismLimitations();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPTerrorismCoverage.getPremium() != (double)0.0){
			this.BOPTerrorismCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPTerrorismCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}