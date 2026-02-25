package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAutoServiceEmployeesToolsCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAutoServiceEmployeesToolsCoverage BOPAutoServiceEmployeesToolsCoverage;
	private double bOPEmployeesToolsLimitCount_1;
	
	
	
	public void bOPEmployeesToolsLimitCount_1 ()  {
	  this.bOPEmployeesToolsLimitCount_1 = MathHelper.getIntegerValue(0.0);

		for( Policy policy : XpathNode.selectNodes(BOPAutoServiceEmployeesToolsCoverage,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"AutoServiceEmployeesToolsLimit"))).equals(MathHelper.getStringValue("25000")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"AutoServiceEmployeesToolsLimit"))).equals(MathHelper.getStringValue("50000"))){
			this.bOPEmployeesToolsLimitCount_1 = MathHelper.getIntegerValue(this.bOPEmployeesToolsLimitCount_1 + MathHelper.getIntegerValue(1.0));
		}		}

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.bOPEmployeesToolsLimitCount_1 > MathHelper.getIntegerValue(0.0)){
			this.BOPAutoServiceEmployeesToolsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceEmployeesToolsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void premiumTemp_1 ()  {
	  this.BOPAutoServiceEmployeesToolsCoverage.setPremiumTemp_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPAutoServiceEmployeesToolsCoverage,"../../BOPLocation/BOPStructure/BOPClassification") ){
			this.BOPAutoServiceEmployeesToolsCoverage.setPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPAutoServiceEmployeesToolsCoverage.getPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"AutoServiceEmployeesToolsPremium")))));
		}

	  
	}
	public void Premium ()  {
	  this.BOPAutoServiceEmployeesToolsCoverage.setPremium(this.BOPAutoServiceEmployeesToolsCoverage.getPremiumTemp_1());

	  
	}
	public  BOPAutoServiceEmployeesToolsCoverage (com.nest.res.bop.al01012026.domain.BOPAutoServiceEmployeesToolsCoverage BOPAutoServiceEmployeesToolsCoverage)  {
	  this.BOPAutoServiceEmployeesToolsCoverage = BOPAutoServiceEmployeesToolsCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAutoServiceEmployeesToolsCoverage.setPremium(this.BOPAutoServiceEmployeesToolsCoverage.getPremiumTemp_1());

	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAutoServiceEmployeesToolsCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAutoServiceEmployeesToolsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceEmployeesToolsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	premiumTemp_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	bOPEmployeesToolsLimitCount_1();
	
	CoverageOnPolicyIndicator();
	
	  
	}
	
	
	
	
	


	
}