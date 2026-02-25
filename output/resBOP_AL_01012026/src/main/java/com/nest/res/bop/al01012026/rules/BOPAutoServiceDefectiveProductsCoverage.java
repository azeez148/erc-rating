package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAutoServiceDefectiveProductsCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAutoServiceDefectiveProductsCoverage BOPAutoServiceDefectiveProductsCoverage;
	
	
	
	public  BOPAutoServiceDefectiveProductsCoverage (com.nest.res.bop.al01012026.domain.BOPAutoServiceDefectiveProductsCoverage BOPAutoServiceDefectiveProductsCoverage)  {
	  this.BOPAutoServiceDefectiveProductsCoverage = BOPAutoServiceDefectiveProductsCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  this.BOPAutoServiceDefectiveProductsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(1.0));

	  
	}
	public void premiumTemp_1 ()  {
	  this.BOPAutoServiceDefectiveProductsCoverage.setPremiumTemp_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPAutoServiceDefectiveProductsCoverage,"../../BOPLocation/BOPStructure/BOPClassification") ){
			this.BOPAutoServiceDefectiveProductsCoverage.setPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPAutoServiceDefectiveProductsCoverage.getPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"AutoServiceDefectiveProductsPremium")))));
		}

	  
	}
	public void Premium ()  {
	  this.BOPAutoServiceDefectiveProductsCoverage.setPremium(this.BOPAutoServiceDefectiveProductsCoverage.getPremiumTemp_1());

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAutoServiceDefectiveProductsCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAutoServiceDefectiveProductsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceDefectiveProductsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	premiumTemp_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAutoServiceDefectiveProductsCoverage.setPremium(this.BOPAutoServiceDefectiveProductsCoverage.getPremiumTemp_1());

	  
	}
	
	
	
	
	


	
}