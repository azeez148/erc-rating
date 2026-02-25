package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationAccountsReceivableCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverage;
	
	
	
	public void OffPremisesInclddLimit () throws LookupException,NumberFormatException {
	  this.BOPClassificationAccountsReceivableCoverage.setOffPremisesInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("AccountsReceivableOffPremisesInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPClassificationAccountsReceivableCoverage.getDsLimit() <= this.BOPClassificationAccountsReceivableCoverage.getOnPremisesInclddLimit()){
			this.BOPClassificationAccountsReceivableCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationAccountsReceivableCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPClassificationAccountsReceivableCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPClassificationAccountsReceivableCoverage.getOnPremisesInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationAccountsReceivableCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationAccountsReceivableCoverage.getFactor())))));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPClassificationAccountsReceivableCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AccountsReceivableFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	OnPremisesInclddLimit();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void OnPremisesInclddLimit () throws LookupException,NumberFormatException {
	  this.BOPClassificationAccountsReceivableCoverage.setOnPremisesInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("AccountsReceivableOnPremisesInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationAccountsReceivableCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationAccountsReceivableCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	OffPremisesInclddLimit();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public  BOPClassificationAccountsReceivableCoverage (com.nest.res.bop.al01012026.domain.BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverage)  {
	  this.BOPClassificationAccountsReceivableCoverage = BOPClassificationAccountsReceivableCoverage;

	  
	}
	public void Premium ()  {
	  
		if(this.BOPClassificationAccountsReceivableCoverage.getDsLimit() <= this.BOPClassificationAccountsReceivableCoverage.getOnPremisesInclddLimit()){
			this.BOPClassificationAccountsReceivableCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationAccountsReceivableCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPClassificationAccountsReceivableCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPClassificationAccountsReceivableCoverage.getOnPremisesInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationAccountsReceivableCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationAccountsReceivableCoverage.getFactor())))));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationAccountsReceivableCoverage,"../BusnPrsnlPropLimit"))) > MathHelper.getIntegerValue(0.0)) || ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationAccountsReceivableCoverage,"../BusnPrsnlPropLimit"))) <= MathHelper.getIntegerValue(0.0) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationAccountsReceivableCoverage,"../FunctlBusnPrsnlPropValtnApply"))).equals(MathHelper.getStringValue("Yes")))){
			this.BOPClassificationAccountsReceivableCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationAccountsReceivableCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}