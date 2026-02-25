package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationValuablePapersCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverage;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPClassificationValuablePapersCoverage.getDsLimit() <= this.BOPClassificationValuablePapersCoverage.getOnPremisesInclddLimit()){
			this.BOPClassificationValuablePapersCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationValuablePapersCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPClassificationValuablePapersCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPClassificationValuablePapersCoverage.getOnPremisesInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationValuablePapersCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationValuablePapersCoverage.getFactor())))));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPClassificationValuablePapersCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ValuablePapersFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void OnPremisesInclddLimit () throws LookupException,NumberFormatException {
	  this.BOPClassificationValuablePapersCoverage.setOnPremisesInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("ValuablePapersOnPremisesInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationValuablePapersCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationValuablePapersCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPClassificationValuablePapersCoverage.getDsLimit() <= this.BOPClassificationValuablePapersCoverage.getOnPremisesInclddLimit()){
			this.BOPClassificationValuablePapersCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationValuablePapersCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPClassificationValuablePapersCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPClassificationValuablePapersCoverage.getOnPremisesInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationValuablePapersCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationValuablePapersCoverage.getFactor())))));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	OnPremisesInclddLimit();
	
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void OffPremisesInclddLimit () throws LookupException,NumberFormatException {
	  this.BOPClassificationValuablePapersCoverage.setOffPremisesInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("ValuablePapersOffPremisesInclddLimit",String.valueOf( "Y"))));

	  
	}
	public  BOPClassificationValuablePapersCoverage (com.nest.res.bop.al01012026.domain.BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverage)  {
	  this.BOPClassificationValuablePapersCoverage = BOPClassificationValuablePapersCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationValuablePapersCoverage,"../BusnPrsnlPropLimit"))) > MathHelper.getIntegerValue(0.0)) || ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationValuablePapersCoverage,"../BusnPrsnlPropLimit"))) <= MathHelper.getIntegerValue(0.0) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationValuablePapersCoverage,"../FunctlBusnPrsnlPropValtnApply"))).equals(MathHelper.getStringValue("Yes")))){
			this.BOPClassificationValuablePapersCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationValuablePapersCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	OffPremisesInclddLimit();
	
	  
	}
	
	
	
	
	


	
}