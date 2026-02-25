package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationBusnIncomeDependentPropCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverage;
	
	
	
	public  BOPClassificationBusnIncomeDependentPropCoverage (com.nest.res.bop.al01012026.domain.BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverage)  {
	  this.BOPClassificationBusnIncomeDependentPropCoverage = BOPClassificationBusnIncomeDependentPropCoverage;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../BusnPrsnlPropLimit"))) > MathHelper.getIntegerValue(0.0)) || ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../BusnPrsnlPropLimit"))) <= MathHelper.getIntegerValue(0.0) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../FunctlBusnPrsnlPropValtnApply"))).equals(MathHelper.getStringValue("Yes")))){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationBusnIncomeDependentPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	BusnIncomeDependentPropAndSecondaryDependentPropFactor();
	
	InclddLimit();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPClassificationBusnIncomeDependentPropCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeDependentPropFactor",String.valueOf( "Y"))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void BusnIncomeDependentPropAndSecondaryDependentPropFactor () throws LookupException,NumberFormatException {
	  this.BOPClassificationBusnIncomeDependentPropCoverage.setBusnIncomeDependentPropAndSecondaryDependentPropFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeDependentPropAndSecondaryDependentPropFactor",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(this.BOPClassificationBusnIncomeDependentPropCoverage.getDsLimit() <= this.BOPClassificationBusnIncomeDependentPropCoverage.getInclddLimit()){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../BusinessIncomeFromSecondaryDependentProperties"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationBusnIncomeDependentPropCoverage.getBusnIncomeDependentPropAndSecondaryDependentPropFactor())))));
		}
		else{
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationBusnIncomeDependentPropCoverage.getFactor())))));
		}
		}
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPClassificationBusnIncomeDependentPropCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeDependentPropInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationBusnIncomeDependentPropCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPClassificationBusnIncomeDependentPropCoverage.getDsLimit() <= this.BOPClassificationBusnIncomeDependentPropCoverage.getInclddLimit()){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../BusinessIncomeFromSecondaryDependentProperties"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationBusnIncomeDependentPropCoverage.getBusnIncomeDependentPropAndSecondaryDependentPropFactor())))));
		}
		else{
			this.BOPClassificationBusnIncomeDependentPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPClassificationBusnIncomeDependentPropCoverage.getInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnIncomeDependentPropCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationBusnIncomeDependentPropCoverage.getFactor())))));
		}
		}
	  
	}
	
	
	
	
	


	
}