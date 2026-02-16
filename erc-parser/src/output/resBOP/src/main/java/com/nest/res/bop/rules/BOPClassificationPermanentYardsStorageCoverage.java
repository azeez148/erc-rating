package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationPermanentYardsStorageCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPClassificationPermanentYardsStorageCoverage BOPClassificationPermanentYardsStorageCoverage;
	
	
	
	public  BOPClassificationPermanentYardsStorageCoverage (com.nest.res.bop.domain.BOPClassificationPermanentYardsStorageCoverage BOPClassificationPermanentYardsStorageCoverage)  {
	  this.BOPClassificationPermanentYardsStorageCoverage = BOPClassificationPermanentYardsStorageCoverage;

	  
	}
	public void Premium ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../ClassPropertyType"))).equals((String)"Contractor") || this.BOPClassificationPermanentYardsStorageCoverage.getDsLimit() == (int)0.0){
			this.BOPClassificationPermanentYardsStorageCoverage.setPremium((double)0.0);
		}
		else{
			this.BOPClassificationPermanentYardsStorageCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((double)this.BOPClassificationPermanentYardsStorageCoverage.getDsLimit() / (double)100.0) * MathHelper.roundToThousand(this.BOPClassificationPermanentYardsStorageCoverage.getDedFactor() * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../LCM"))) * this.BOPClassificationPermanentYardsStorageCoverage.getRate())))));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	totAmountInsurancePlusPermanentYardsLimit_1();
	
	DedFactor();
	
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../RatingTerritory"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../FireProtectionClassPPC"))).equals((String)"")){
			this.BOPClassificationPermanentYardsStorageCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PermanentYardsRateMaintenanceStorage",((String)XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage," ../../../RatingTerritory ")),((String)XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage," ../../../FireProtectionClassPPC")))));
		}
		else{
			this.BOPClassificationPermanentYardsStorageCoverage.setRate((double)0.0);
		}
	  
	}
	public void DedFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../WindHailDeductible"))).equals((String)"Not Applicable")){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../OptionalDeductible"))).equals((String)"") && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../TotAmountInsurance"))) + this.BOPClassificationPermanentYardsStorageCoverage.getDsLimit() != 0.0 && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../WindHailDeductible"))).equals((String)"")){
			this.BOPClassificationPermanentYardsStorageCoverage.setDedFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindHailDedFactorWithLOI",((String)XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage," ../../../OptionalDeductible ")),String.valueOf(BOPClassificationPermanentYardsStorageCoverage.getTotAmountInsurancePlusPermanentYardsLimit_1()),((String)XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage," ../../../WindHailDeductible")))));
		}
		else{
			this.BOPClassificationPermanentYardsStorageCoverage.setDedFactor((double)0.0);
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../OptionalDeductible"))).equals((String)"250")){
			this.BOPClassificationPermanentYardsStorageCoverage.setDedFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("Optnl250FixedDedFactor",String.valueOf( "Y"))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../OptionalDeductible"))).equals((String)"") || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../TotAmountInsurance"))) + this.BOPClassificationPermanentYardsStorageCoverage.getDsLimit() == 0.0){
			this.BOPClassificationPermanentYardsStorageCoverage.setDedFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OptnlFixedDedFactorWithLOI",((String)XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage," ../../../OptionalDeductible ")),String.valueOf(BOPClassificationPermanentYardsStorageCoverage.getTotAmountInsurancePlusPermanentYardsLimit_1()))));
		}
		else{
			this.BOPClassificationPermanentYardsStorageCoverage.setDedFactor((double)0.0);
		}
		}
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void totAmountInsurancePlusPermanentYardsLimit_1 ()  {
	  this.BOPClassificationPermanentYardsStorageCoverage.setTotAmountInsurancePlusPermanentYardsLimit_1((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../TotAmountInsurance"))) + Integer.valueOf(this.BOPClassificationPermanentYardsStorageCoverage.getDsLimit()));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationPermanentYardsStorageCoverage.getPremium() != (double)0.0){
			this.BOPClassificationPermanentYardsStorageCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPClassificationPermanentYardsStorageCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}