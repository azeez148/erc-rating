package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage;
import com.nest.res.bop.al01012026.domain.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage;

public class BOPCondoCommlUnitOwnersOptionalCovs  {

	
	
	
	private com.nest.res.bop.al01012026.rules.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageRule;
	private com.nest.res.bop.al01012026.rules.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageRule;
	private List<BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage> BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageList;
	private com.nest.res.bop.al01012026.domain.BOPCondoCommlUnitOwnersOptionalCovs BOPCondoCommlUnitOwnersOptionalCovs;
	private List<BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage> BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageList;
	
	
	
	public  BOPCondoCommlUnitOwnersOptionalCovs (com.nest.res.bop.al01012026.domain.BOPCondoCommlUnitOwnersOptionalCovs BOPCondoCommlUnitOwnersOptionalCovs)  {
	  this.BOPCondoCommlUnitOwnersOptionalCovs = BOPCondoCommlUnitOwnersOptionalCovs;
this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageList = BOPCondoCommlUnitOwnersOptionalCovs.getBOPCondoCommlUnitOwnersOptionalLossAssmtCoverage();
this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageList = BOPCondoCommlUnitOwnersOptionalCovs.getBOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage();

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageList){
		for(BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage:BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageList){
			BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageRule = new com.nest.res.bop.al01012026.rules.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage(BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage);
			BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageList){
		for(BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage:BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageList){
			BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageRule = new com.nest.res.bop.al01012026.rules.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage(BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage);
			BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCondoCommlUnitOwnersOptionalCovs.setPremium(MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalCovs.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalCovs,"BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage/Premium")))));
this.BOPCondoCommlUnitOwnersOptionalCovs.setPremium(MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalCovs.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalCovs,"BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage/Premium")))));

	  
	}
	
	
	
	
	


	
}