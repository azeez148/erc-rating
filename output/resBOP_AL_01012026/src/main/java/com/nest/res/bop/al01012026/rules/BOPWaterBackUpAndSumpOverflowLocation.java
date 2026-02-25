package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPWaterBackUpAndSumpOverflowLocation  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPWaterBackUpAndSumpOverflowLocation BOPWaterBackUpAndSumpOverflowLocation;
	
	
	
	public void coveredPropertyAnnualAggregateLimit_1 ()  {
	  this.BOPWaterBackUpAndSumpOverflowLocation.setCoveredPropertyAnnualAggregateLimit_1(this.BOPWaterBackUpAndSumpOverflowLocation.getCoveredPropertyAnnualAggregateLimit());

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPWaterBackUpAndSumpOverflowLocation.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPWaterBackUpAndSumpOverflowLocation.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPWaterBackUpAndSumpOverflowLocation.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPWaterBackUpAndSumpOverflowLocation.getCoveredPropertyAnnualAggregateLimit().equals(MathHelper.getStringValue("5000")) && this.BOPWaterBackUpAndSumpOverflowLocation.getBusinessIncomeExtraExpenseAnnualAggregateLimit().equals(MathHelper.getStringValue("5000"))){
			this.BOPWaterBackUpAndSumpOverflowLocation.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPWaterBackUpAndSumpOverflowLocation,"../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPWaterBackUpAndSumpOverflowLocation,"../DedFactor"))) * MathHelper.roundUpDoller(this.BOPWaterBackUpAndSumpOverflowLocation.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPWaterBackUpAndSumpOverflowLocation,"../LCM"))))))));
		}
		else{
			this.BOPWaterBackUpAndSumpOverflowLocation.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPWaterBackUpAndSumpOverflowLocation.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPWaterBackUpAndSumpOverflowLocation,"../../IRPMFactor"))))));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPWaterBackUpAndSumpOverflowLocation.getCoveredPropertyAnnualAggregateLimit().equals(MathHelper.getStringValue("5000")) && this.BOPWaterBackUpAndSumpOverflowLocation.getBusinessIncomeExtraExpenseAnnualAggregateLimit().equals(MathHelper.getStringValue("5000"))){
			this.BOPWaterBackUpAndSumpOverflowLocation.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPWaterBackUpAndSumpOverflowLocation,"../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPWaterBackUpAndSumpOverflowLocation,"../DedFactor"))) * MathHelper.roundUpDoller(this.BOPWaterBackUpAndSumpOverflowLocation.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPWaterBackUpAndSumpOverflowLocation,"../LCM"))))))));
		}
		else{
			this.BOPWaterBackUpAndSumpOverflowLocation.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPWaterBackUpAndSumpOverflowLocation.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPWaterBackUpAndSumpOverflowLocation,"../../IRPMFactor"))))));
		}
	  
	}
	public void Charge () throws LookupException,NumberFormatException {
	  
		if(this.BOPWaterBackUpAndSumpOverflowLocation.getCoveredPropertyAnnualAggregateLimit().equals(MathHelper.getStringValue("5000")) && this.BOPWaterBackUpAndSumpOverflowLocation.getBusinessIncomeExtraExpenseAnnualAggregateLimit().equals(MathHelper.getStringValue("5000"))){
			this.BOPWaterBackUpAndSumpOverflowLocation.setCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WaterBackUpAndSumpOverflowPerLimitCharge",String.valueOf(this.BOPWaterBackUpAndSumpOverflowLocation.getBusnPrsnlPropReplmtCostCoverage()),String.valueOf(this.BOPWaterBackUpAndSumpOverflowLocation.getCoveredPropertyAnnualAggregateLimit_1())))));
		}
		else{
			this.BOPWaterBackUpAndSumpOverflowLocation.setCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPWaterBackUpAndSumpOverflowLocation (com.nest.res.bop.al01012026.domain.BOPWaterBackUpAndSumpOverflowLocation BOPWaterBackUpAndSumpOverflowLocation)  {
	  this.BOPWaterBackUpAndSumpOverflowLocation = BOPWaterBackUpAndSumpOverflowLocation;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	bppLimit_1();
	
	BusnPrsnlPropReplmtCostCoverage();
	
	coveredPropertyAnnualAggregateLimit_1();
	
	Charge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void bppLimit_1 ()  {
	  this.BOPWaterBackUpAndSumpOverflowLocation.setBppLimit_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPWaterBackUpAndSumpOverflowLocation,"../BOPStructure/BOPClassification") ){
			this.BOPWaterBackUpAndSumpOverflowLocation.setBppLimit_1(MathHelper.getIntegerValue(this.BOPWaterBackUpAndSumpOverflowLocation.getBppLimit_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit")))));
		}

	  
	}
	public void BusnPrsnlPropReplmtCostCoverage ()  {
	  
		if(this.BOPWaterBackUpAndSumpOverflowLocation.getBppLimit_1() > MathHelper.getIntegerValue(0.0)){
			this.BOPWaterBackUpAndSumpOverflowLocation.setBusnPrsnlPropReplmtCostCoverage(MathHelper.getStringValue(MathHelper.getStringValue("BusinessPersonalProperty")));
		}
		else{
			this.BOPWaterBackUpAndSumpOverflowLocation.setBusnPrsnlPropReplmtCostCoverage(MathHelper.getStringValue(MathHelper.getStringValue("Building")));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}