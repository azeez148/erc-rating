package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPStructureLiabMedExpensesBldgCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPStructureLiabMedExpensesBldgCoverage BOPStructureLiabMedExpensesBldgCoverage;
	
	
	
	public void totalArea_1 ()  {
	  
		if(this.BOPStructureLiabMedExpensesBldgCoverage.getStructBuildingLimit() > (int)0.0 && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../PropertyType"))).equals((String)"Office Condominium")){
			this.BOPStructureLiabMedExpensesBldgCoverage.setTotalArea_1((int)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPStructureLiabMedExpensesBldgCoverage,"../BOPClassification") ){
			this.BOPStructureLiabMedExpensesBldgCoverage.setTotalArea_1(this.BOPStructureLiabMedExpensesBldgCoverage.getTotalArea_1()+Integer.valueOf(this.BOPStructureLiabMedExpensesBldgCoverage.getTotalArea_1()) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))));
		}

		}
	  
	}
	public void FinalRate ()  {
	  this.BOPStructureLiabMedExpensesBldgCoverage.setFinalRate(MathHelper.roundToThousand(this.BOPStructureLiabMedExpensesBldgCoverage.getCombinedBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../LCM"))) * this.BOPStructureLiabMedExpensesBldgCoverage.getIncrLimitFactor() * this.BOPStructureLiabMedExpensesBldgCoverage.getPropDamageLiabDedFactor()));

	  
	}
	public void structBuildingLimit ()  {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../BuildingLimit"))) != 0){
			this.BOPStructureLiabMedExpensesBldgCoverage.setStructBuildingLimit((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../BuildingLimit"))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setStructBuildingLimit((int)0.0);
		}
	  
	}
	public void ClassGroupFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals((String)"51") || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals((String)"52") || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals((String)"53") || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals((String)"54") || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals((String)"55") || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals((String)"56") || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals((String)"57") || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals((String)"58") || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals((String)"59")){
			this.BOPStructureLiabMedExpensesBldgCoverage.setClassGroupFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLessorsContrctrsClassFactor",String.valueOf(BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup()),String.valueOf(BOPStructureLiabMedExpensesBldgCoverage.getStructClassCode()))));
		}
		else{
		if(!this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals((String)"")){
			this.BOPStructureLiabMedExpensesBldgCoverage.setClassGroupFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLessorsClassFactor",String.valueOf(BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup()))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setClassGroupFactor((double)0.0);
		}
		}
	  
	}
	public void baseRateToUse_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPWanted"))).equals((String)"Yes") && ((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPTypeLiabilityLessors"))).equals((String)"Smoothed") || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPTypeLiabilityLessors"))).equals((String)"Unsmoothed"))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRateToUse_1(Double.valueOf(this.BOPStructureLiabMedExpensesBldgCoverage.getBaseRateRABOP()));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRateToUse_1(Double.valueOf(this.BOPStructureLiabMedExpensesBldgCoverage.getBaseRate()));
		}
	  
	}
	public void BaseRateRABOP () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPWanted"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPTypeLiabilityLessors"))).equals((String)"Smoothed")){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCode"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCode"))).equals((String)"Other")){
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRateRABOP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLessorsRateRABOPS",((String)XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage," ../../ZipCode")))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCodeOverride"))).equals((String)"") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCode"))).equals((String)"Other")){
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRateRABOP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLessorsRateRABOPS",((String)XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage," ../../ZipCodeOverride")))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRateRABOP((double)0.0);
		}
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPWanted"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPTypeLiabilityLessors"))).equals((String)"Unsmoothed")){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCode"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCode"))).equals((String)"Other")){
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRateRABOP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLessorsRateRABOPU",((String)XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage," ../../ZipCode")))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCodeOverride"))).equals((String)"") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCode"))).equals((String)"Other")){
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRateRABOP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLessorsRateRABOPU",((String)XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage," ../../ZipCodeOverride")))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRateRABOP((double)0.0);
		}
		}
		}
		}
	  
	}
	public void structClassCode ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../ClassCode"))).equals((String)"")){
			this.BOPStructureLiabMedExpensesBldgCoverage.setStructClassCode((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../ClassCode"))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setStructClassCode((String)"");
		}
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPWanted"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPTypeLiabilityLessors"))).equals((String)"Smoothed"))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPWanted"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPTypeLiabilityLessors"))).equals((String)"Unsmoothed"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../RatingTerritory"))).equals((String)"")){
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLessorsRate",((String)XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage," ../../RatingTerritory")))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRate((double)0.0);
		}
		}
		}
	  
	}
	public void IncrLimitFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../EachOccLimit"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../ProdCompldOpsAggregateLimit"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../AggregateLimit"))).equals((String)"")){
			this.BOPStructureLiabMedExpensesBldgCoverage.setIncrLimitFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabIncrLimitFactor",((String)XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage," ../../../EachOccLimit ")),((String)XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage," ../../../ProdCompldOpsAggregateLimit ")),((String)XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage," ../../../AggregateLimit")))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setIncrLimitFactor((double)0.0);
		}
	  
	}
	public void TotalArea ()  {
	  
		if(this.BOPStructureLiabMedExpensesBldgCoverage.getStructBuildingLimit() > (int)0.0 && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../PropertyType"))).equals((String)"Office Condominium")){
			this.BOPStructureLiabMedExpensesBldgCoverage.setTotalArea(this.BOPStructureLiabMedExpensesBldgCoverage.getTotalArea_1());
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setTotalArea((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../PropertyType"))).equals((String)"Office Condominium") && this.BOPStructureLiabMedExpensesBldgCoverage.getTotalCondominiumBuildingSquareFootage() != (int)0.0){
			this.BOPStructureLiabMedExpensesBldgCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPStructureLiabMedExpensesBldgCoverage.getFinalRate() * (((double)this.BOPStructureLiabMedExpensesBldgCoverage.getTotalArea() / (double)this.BOPStructureLiabMedExpensesBldgCoverage.getTotalCondominiumBuildingSquareFootage()) * ((double)this.BOPStructureLiabMedExpensesBldgCoverage.getCondominiumBuildingLimitOfInsurance() / (double)100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../IRPMFactor")))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../PropertyType"))).equals((String)"Office Condominium")){
			this.BOPStructureLiabMedExpensesBldgCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPStructureLiabMedExpensesBldgCoverage.getFinalRate() * (this.BOPStructureLiabMedExpensesBldgCoverage.getStructBuildingLimit() / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../IRPMFactor")))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setPremium((double)0.0);
		}
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	structClassCode();
	
	structClassGroup();
	
	structBuildingLimit();
	
	BaseRateRABOP();
	
	BaseRate();
	
	ClassGroupFactor();
	
	IncrLimitFactor();
	
	propDamageLiabDedFactor();
	
	baseRateToUse_1();
	
	CombinedBaseRate();
	
	FinalRate();
	
	totalArea_1();
	
	TotalArea();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void structClassGroup ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../ClassGroup"))).equals((String)"")){
			this.BOPStructureLiabMedExpensesBldgCoverage.setStructClassGroup((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../ClassGroup"))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setStructClassGroup((String)"");
		}
	  
	}
	public void CombinedBaseRate ()  {
	  this.BOPStructureLiabMedExpensesBldgCoverage.setCombinedBaseRate(this.BOPStructureLiabMedExpensesBldgCoverage.getBaseRateToUse_1() * this.BOPStructureLiabMedExpensesBldgCoverage.getClassGroupFactor());

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPStructureLiabMedExpensesBldgCoverage.getPremium() != (double)0.0){
			this.BOPStructureLiabMedExpensesBldgCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void propDamageLiabDedFactor ()  {
	  
		if(this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassCode().equals((String)"75601") || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassCode().equals((String)"75611") || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassCode().equals((String)"75631") || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassCode().equals((String)"75641")){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../PropDamageLiabDed"))).equals((String)"250")){
			this.BOPStructureLiabMedExpensesBldgCoverage.setPropDamageLiabDedFactor((double)1.0);
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setPropDamageLiabDedFactor((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../PropDamageLiabDedFactor"))));
		}
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setPropDamageLiabDedFactor((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../PropDamageLiabDedFactor"))));
		}
	  
	}
	public  BOPStructureLiabMedExpensesBldgCoverage (com.nest.res.bop.domain.BOPStructureLiabMedExpensesBldgCoverage BOPStructureLiabMedExpensesBldgCoverage)  {
	  this.BOPStructureLiabMedExpensesBldgCoverage = BOPStructureLiabMedExpensesBldgCoverage;

	  
	}
	
	
	
	
	


	
}