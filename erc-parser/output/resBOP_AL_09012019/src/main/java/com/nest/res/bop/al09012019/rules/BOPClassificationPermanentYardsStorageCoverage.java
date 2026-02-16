package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationPermanentYardsStorageCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPClassificationPermanentYardsStorageCoverage BOPClassificationPermanentYardsStorageCoverage;
	
	
	
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Premium ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../ClassPropertyType"))).equals(MathHelper.getStringValue("Contractor")) || this.BOPClassificationPermanentYardsStorageCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPClassificationPermanentYardsStorageCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPClassificationPermanentYardsStorageCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPClassificationPermanentYardsStorageCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand(this.BOPClassificationPermanentYardsStorageCoverage.getDedFactor() * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../LCM"))) * this.BOPClassificationPermanentYardsStorageCoverage.getRate()))))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationPermanentYardsStorageCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationPermanentYardsStorageCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationPermanentYardsStorageCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../RatingTerritory"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../FireProtectionClassPPC"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassificationPermanentYardsStorageCoverage.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PermanentYardsRateMaintenanceStorage",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../RatingTerritory")),String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../FireProtectionClassPPC"))))));
		}
		else{
			this.BOPClassificationPermanentYardsStorageCoverage.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../ClassPropertyType"))).equals(MathHelper.getStringValue("Contractor")) || this.BOPClassificationPermanentYardsStorageCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPClassificationPermanentYardsStorageCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPClassificationPermanentYardsStorageCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPClassificationPermanentYardsStorageCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand(this.BOPClassificationPermanentYardsStorageCoverage.getDedFactor() * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../LCM"))) * this.BOPClassificationPermanentYardsStorageCoverage.getRate()))))));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPClassificationPermanentYardsStorageCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPClassificationPermanentYardsStorageCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPClassificationPermanentYardsStorageCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public  BOPClassificationPermanentYardsStorageCoverage (com.nest.res.bop.al09012019.domain.BOPClassificationPermanentYardsStorageCoverage BOPClassificationPermanentYardsStorageCoverage)  {
	  this.BOPClassificationPermanentYardsStorageCoverage = BOPClassificationPermanentYardsStorageCoverage;

	  
	}
	public void DedFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../WindHailDeductible"))).equals(MathHelper.getStringValue("Not Applicable"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../OptionalDeductible"))).equals(MathHelper.getStringValue("")) && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../TotAmountInsurance"))) + this.BOPClassificationPermanentYardsStorageCoverage.getDsLimit() != 0.0 && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../WindHailDeductible"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassificationPermanentYardsStorageCoverage.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindHailDedFactorWithLOI",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../OptionalDeductible")),String.valueOf(this.BOPClassificationPermanentYardsStorageCoverage.getTotAmountInsurancePlusPermanentYardsLimit_1()),String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../WindHailDeductible"))))));
		}
		else{
			this.BOPClassificationPermanentYardsStorageCoverage.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../OptionalDeductible"))).equals(MathHelper.getStringValue("250"))){
			this.BOPClassificationPermanentYardsStorageCoverage.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("Optnl250FixedDedFactor",String.valueOf( "Y")))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../OptionalDeductible"))).equals(MathHelper.getStringValue("")) || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../TotAmountInsurance"))) + this.BOPClassificationPermanentYardsStorageCoverage.getDsLimit() == 0.0){
			this.BOPClassificationPermanentYardsStorageCoverage.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OptnlFixedDedFactorWithLOI",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../OptionalDeductible")),String.valueOf(this.BOPClassificationPermanentYardsStorageCoverage.getTotAmountInsurancePlusPermanentYardsLimit_1())))));
		}
		else{
			this.BOPClassificationPermanentYardsStorageCoverage.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public void totAmountInsurancePlusPermanentYardsLimit_1 ()  {
	  this.BOPClassificationPermanentYardsStorageCoverage.setTotAmountInsurancePlusPermanentYardsLimit_1(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationPermanentYardsStorageCoverage,"../../../TotAmountInsurance"))) + this.BOPClassificationPermanentYardsStorageCoverage.getDsLimit()));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	totAmountInsurancePlusPermanentYardsLimit_1();
	
	DedFactor();
	
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}