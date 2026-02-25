package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAutoServiceOutdoorPropertyCoverage  {

	
	
	
	private double bOPOutdoorPropertyLimitCount_1;
	private com.nest.res.bop.al01012026.domain.BOPAutoServiceOutdoorPropertyCoverage BOPAutoServiceOutdoorPropertyCoverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPAutoServiceOutdoorPropertyCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAutoServiceOutdoorPropertyCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceOutdoorPropertyCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAutoServiceOutdoorPropertyCoverage.setPremium(this.BOPAutoServiceOutdoorPropertyCoverage.getPremiumTemp_1());

	  
	}
	public void premiumTemp_1 ()  {
	  this.BOPAutoServiceOutdoorPropertyCoverage.setPremiumTemp_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPAutoServiceOutdoorPropertyCoverage,"../../BOPLocation/BOPStructure/BOPClassification") ){
			this.BOPAutoServiceOutdoorPropertyCoverage.setPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPAutoServiceOutdoorPropertyCoverage.getPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"AutoServiceOutdoorPropertyPremium")))));
		}

	  
	}
	public  BOPAutoServiceOutdoorPropertyCoverage (com.nest.res.bop.al01012026.domain.BOPAutoServiceOutdoorPropertyCoverage BOPAutoServiceOutdoorPropertyCoverage)  {
	  this.BOPAutoServiceOutdoorPropertyCoverage = BOPAutoServiceOutdoorPropertyCoverage;

	  
	}
	public void bOPOutdoorPropertyLimitCount_1 ()  {
	  this.bOPOutdoorPropertyLimitCount_1 = MathHelper.getIntegerValue(0.0);

		for( Policy policy : XpathNode.selectNodes(BOPAutoServiceOutdoorPropertyCoverage,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"AutoServiceOutdoorPropertyLimit"))) > MathHelper.getIntegerValue(5000.0)){
			this.bOPOutdoorPropertyLimitCount_1 = MathHelper.getIntegerValue(this.bOPOutdoorPropertyLimitCount_1 + MathHelper.getIntegerValue(1.0));
		}		}

	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	bOPOutdoorPropertyLimitCount_1();
	
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPAutoServiceOutdoorPropertyCoverage.setPremium(this.BOPAutoServiceOutdoorPropertyCoverage.getPremiumTemp_1());

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	premiumTemp_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.bOPOutdoorPropertyLimitCount_1 > MathHelper.getIntegerValue(0.0)){
			this.BOPAutoServiceOutdoorPropertyCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceOutdoorPropertyCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}