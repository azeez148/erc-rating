package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAutoServiceLossOrDamageToLessorsPropertyCoverage  {

	
	
	
	private double bOPLossOrDamageToLessorsPropertyLimitCount_1;
	private com.nest.res.bop.al01012026.domain.BOPAutoServiceLossOrDamageToLessorsPropertyCoverage BOPAutoServiceLossOrDamageToLessorsPropertyCoverage;
	
	
	
	public void PolicyIndicator_Calculation ()  {
	  
	bOPLossOrDamageToLessorsPropertyLimitCount_1();
	
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	premiumTemp_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void bOPLossOrDamageToLessorsPropertyLimitCount_1 ()  {
	  this.bOPLossOrDamageToLessorsPropertyLimitCount_1 = MathHelper.getIntegerValue(0.0);

		for( Policy policy : XpathNode.selectNodes(BOPAutoServiceLossOrDamageToLessorsPropertyCoverage,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"AutoServiceLossOrDamageToLessorsPropertyLimit"))) > MathHelper.getIntegerValue(0.0)){
			this.bOPLossOrDamageToLessorsPropertyLimitCount_1 = MathHelper.getIntegerValue(this.bOPLossOrDamageToLessorsPropertyLimitCount_1 + MathHelper.getIntegerValue(1.0));
		}		}

	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.bOPLossOrDamageToLessorsPropertyLimitCount_1 > MathHelper.getIntegerValue(0.0)){
			this.BOPAutoServiceLossOrDamageToLessorsPropertyCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceLossOrDamageToLessorsPropertyCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void premiumTemp_1 ()  {
	  this.BOPAutoServiceLossOrDamageToLessorsPropertyCoverage.setPremiumTemp_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPAutoServiceLossOrDamageToLessorsPropertyCoverage,"../../BOPLocation/BOPStructure/BOPClassification") ){
			this.BOPAutoServiceLossOrDamageToLessorsPropertyCoverage.setPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPAutoServiceLossOrDamageToLessorsPropertyCoverage.getPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"AutoServiceLossOrDamageToLessorsPropertyPremium")))));
		}

	  
	}
	public  BOPAutoServiceLossOrDamageToLessorsPropertyCoverage (com.nest.res.bop.al01012026.domain.BOPAutoServiceLossOrDamageToLessorsPropertyCoverage BOPAutoServiceLossOrDamageToLessorsPropertyCoverage)  {
	  this.BOPAutoServiceLossOrDamageToLessorsPropertyCoverage = BOPAutoServiceLossOrDamageToLessorsPropertyCoverage;

	  
	}
	public void Premium ()  {
	  this.BOPAutoServiceLossOrDamageToLessorsPropertyCoverage.setPremium(this.BOPAutoServiceLossOrDamageToLessorsPropertyCoverage.getPremiumTemp_1());

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAutoServiceLossOrDamageToLessorsPropertyCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAutoServiceLossOrDamageToLessorsPropertyCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceLossOrDamageToLessorsPropertyCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAutoServiceLossOrDamageToLessorsPropertyCoverage.setPremium(this.BOPAutoServiceLossOrDamageToLessorsPropertyCoverage.getPremiumTemp_1());

	  
	}
	
	
	
	
	


	
}