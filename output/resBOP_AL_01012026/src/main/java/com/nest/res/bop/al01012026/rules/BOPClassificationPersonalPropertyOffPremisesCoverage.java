package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationPersonalPropertyOffPremisesCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPClassificationPersonalPropertyOffPremisesCoverage BOPClassificationPersonalPropertyOffPremisesCoverage;
	
	
	
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPClassificationPersonalPropertyOffPremisesCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PersonalPropertyOffPremisesFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPClassificationPersonalPropertyOffPremisesCoverage.getDsLimit() > MathHelper.getIntegerValue(10000.0)){
			this.BOPClassificationPersonalPropertyOffPremisesCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationPersonalPropertyOffPremisesCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationPersonalPropertyOffPremisesCoverage.getFactor()) * ((MathHelper.getDoubleValue(this.BOPClassificationPersonalPropertyOffPremisesCoverage.getDsLimit()) - MathHelper.getDoubleValue(10000.0)) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationPersonalPropertyOffPremisesCoverage,"../../../../IRPMFactor"))))));
		}
		else{
			this.BOPClassificationPersonalPropertyOffPremisesCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Premium ()  {
	  
		if(this.BOPClassificationPersonalPropertyOffPremisesCoverage.getDsLimit() > MathHelper.getIntegerValue(10000.0)){
			this.BOPClassificationPersonalPropertyOffPremisesCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationPersonalPropertyOffPremisesCoverage,"../FinalBusnPrsnlPropRate"))) * this.BOPClassificationPersonalPropertyOffPremisesCoverage.getFactor()) * ((MathHelper.getDoubleValue(this.BOPClassificationPersonalPropertyOffPremisesCoverage.getDsLimit()) - MathHelper.getDoubleValue(10000.0)) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationPersonalPropertyOffPremisesCoverage,"../../../../IRPMFactor"))))));
		}
		else{
			this.BOPClassificationPersonalPropertyOffPremisesCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPClassificationPersonalPropertyOffPremisesCoverage.getDsLimit() > MathHelper.getIntegerValue(10000.0)){
			this.BOPClassificationPersonalPropertyOffPremisesCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationPersonalPropertyOffPremisesCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationPersonalPropertyOffPremisesCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationPersonalPropertyOffPremisesCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationPersonalPropertyOffPremisesCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPClassificationPersonalPropertyOffPremisesCoverage (com.nest.res.bop.al01012026.domain.BOPClassificationPersonalPropertyOffPremisesCoverage BOPClassificationPersonalPropertyOffPremisesCoverage)  {
	  this.BOPClassificationPersonalPropertyOffPremisesCoverage = BOPClassificationPersonalPropertyOffPremisesCoverage;

	  
	}
	
	
	
	
	


	
}