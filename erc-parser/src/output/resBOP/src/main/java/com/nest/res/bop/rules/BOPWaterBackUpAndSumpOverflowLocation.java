package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPWaterBackUpAndSumpOverflowLocation  {

	
	
	
	private com.nest.res.bop.domain.BOPWaterBackUpAndSumpOverflowLocation BOPWaterBackUpAndSumpOverflowLocation;
	
	
	
	public  BOPWaterBackUpAndSumpOverflowLocation (com.nest.res.bop.domain.BOPWaterBackUpAndSumpOverflowLocation BOPWaterBackUpAndSumpOverflowLocation)  {
	  this.BOPWaterBackUpAndSumpOverflowLocation = BOPWaterBackUpAndSumpOverflowLocation;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	bppLimit_1();
	
	busnPrsnlPropReplmtCostCoverage();
	
	limit();
	
	Charge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Charge () throws LookupException,NumberFormatException {
	  
		if(this.BOPWaterBackUpAndSumpOverflowLocation.getCoveredPropertyAnnualAggregateLimit().equals((String)"5000") && this.BOPWaterBackUpAndSumpOverflowLocation.getBusinessIncomeExtraExpenseAnnualAggregateLimit().equals((String)"5000")){
			this.BOPWaterBackUpAndSumpOverflowLocation.setCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WaterBackUpAndSumpOverflowPerLimitCharge",String.valueOf(BOPWaterBackUpAndSumpOverflowLocation.getBusnPrsnlPropReplmtCostCoverage()),String.valueOf(BOPWaterBackUpAndSumpOverflowLocation.getLimit()))));
		}
		else{
			this.BOPWaterBackUpAndSumpOverflowLocation.setCharge((double)0.0);
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPWaterBackUpAndSumpOverflowLocation.getCoveredPropertyAnnualAggregateLimit().equals((String)"5000") && this.BOPWaterBackUpAndSumpOverflowLocation.getBusinessIncomeExtraExpenseAnnualAggregateLimit().equals((String)"5000")){
			this.BOPWaterBackUpAndSumpOverflowLocation.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPWaterBackUpAndSumpOverflowLocation,"../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPWaterBackUpAndSumpOverflowLocation,"../DedFactor"))) * MathHelper.roundUpDoller(this.BOPWaterBackUpAndSumpOverflowLocation.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPWaterBackUpAndSumpOverflowLocation,"../LCM")))))));
		}
		else{
			this.BOPWaterBackUpAndSumpOverflowLocation.setPremium(MathHelper.roundUpDoller(this.BOPWaterBackUpAndSumpOverflowLocation.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPWaterBackUpAndSumpOverflowLocation,"../../IRPMFactor")))));
		}
	  
	}
	public void limit ()  {
	  
		if(this.BOPWaterBackUpAndSumpOverflowLocation.getCoveredPropertyAnnualAggregateLimit().equals((String)"5000") && this.BOPWaterBackUpAndSumpOverflowLocation.getBusinessIncomeExtraExpenseAnnualAggregateLimit().equals((String)"5000")){
			this.BOPWaterBackUpAndSumpOverflowLocation.setLimit(Integer.valueOf(this.BOPWaterBackUpAndSumpOverflowLocation.getCoveredPropertyAnnualAggregateLimit()));
		}
	  
	}
	public void bppLimit_1 ()  {
	  this.BOPWaterBackUpAndSumpOverflowLocation.setBppLimit_1((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPWaterBackUpAndSumpOverflowLocation,"../BOPStructure/BOPClassification") ){
			this.BOPWaterBackUpAndSumpOverflowLocation.setBppLimit_1(this.BOPWaterBackUpAndSumpOverflowLocation.getBppLimit_1()+Integer.valueOf(this.BOPWaterBackUpAndSumpOverflowLocation.getBppLimit_1()) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))));
		}

	  
	}
	public void busnPrsnlPropReplmtCostCoverage ()  {
	  
		if(this.BOPWaterBackUpAndSumpOverflowLocation.getBppLimit_1() > (int)0.0){
			this.BOPWaterBackUpAndSumpOverflowLocation.setBusnPrsnlPropReplmtCostCoverage((String)"BusinessPersonalProperty");
		}
		else{
			this.BOPWaterBackUpAndSumpOverflowLocation.setBusnPrsnlPropReplmtCostCoverage((String)"Building");
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPWaterBackUpAndSumpOverflowLocation.getPremium() != (double)0.0){
			this.BOPWaterBackUpAndSumpOverflowLocation.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPWaterBackUpAndSumpOverflowLocation.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}