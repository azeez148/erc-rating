package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAutoServiceFireDepartmentServiceChargeCoverage  {

	
	
	
	private double bOPFireDeptServiceChargeLimitCount_1;
	private com.nest.res.bop.al01012026.domain.BOPAutoServiceFireDepartmentServiceChargeCoverage BOPAutoServiceFireDepartmentServiceChargeCoverage;
	
	
	
	public void premiumTemp_1 ()  {
	  this.BOPAutoServiceFireDepartmentServiceChargeCoverage.setPremiumTemp_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPAutoServiceFireDepartmentServiceChargeCoverage,"../../BOPLocation/BOPStructure/BOPClassification") ){
			this.BOPAutoServiceFireDepartmentServiceChargeCoverage.setPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPAutoServiceFireDepartmentServiceChargeCoverage.getPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"AutoServiceFireDeptServiceChargePremium")))));
		}

	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	bOPFireDeptServiceChargeLimitCount_1();
	
	CoverageOnPolicyIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAutoServiceFireDepartmentServiceChargeCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAutoServiceFireDepartmentServiceChargeCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceFireDepartmentServiceChargeCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAutoServiceFireDepartmentServiceChargeCoverage.setPremium(this.BOPAutoServiceFireDepartmentServiceChargeCoverage.getPremiumTemp_1());

	  
	}
	public void bOPFireDeptServiceChargeLimitCount_1 ()  {
	  this.bOPFireDeptServiceChargeLimitCount_1 = MathHelper.getIntegerValue(0.0);

		for( Policy policy : XpathNode.selectNodes(BOPAutoServiceFireDepartmentServiceChargeCoverage,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"AutoServiceFireDeptServiceChargeLimit"))).equals(MathHelper.getStringValue("7500")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"AutoServiceFireDeptServiceChargeLimit"))).equals(MathHelper.getStringValue("10000"))){
			this.bOPFireDeptServiceChargeLimitCount_1 = MathHelper.getIntegerValue(this.bOPFireDeptServiceChargeLimitCount_1 + MathHelper.getIntegerValue(1.0));
		}		}

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	premiumTemp_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPAutoServiceFireDepartmentServiceChargeCoverage.setPremium(this.BOPAutoServiceFireDepartmentServiceChargeCoverage.getPremiumTemp_1());

	  
	}
	public  BOPAutoServiceFireDepartmentServiceChargeCoverage (com.nest.res.bop.al01012026.domain.BOPAutoServiceFireDepartmentServiceChargeCoverage BOPAutoServiceFireDepartmentServiceChargeCoverage)  {
	  this.BOPAutoServiceFireDepartmentServiceChargeCoverage = BOPAutoServiceFireDepartmentServiceChargeCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.bOPFireDeptServiceChargeLimitCount_1 > MathHelper.getIntegerValue(0.0)){
			this.BOPAutoServiceFireDepartmentServiceChargeCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceFireDepartmentServiceChargeCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}