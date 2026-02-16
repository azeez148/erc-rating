package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage;
import com.nest.res.bop.al09012019.domain.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage;

public class BOPCondoCommlUnitOwnersOptionalCovs  {

	
	
	
	private com.nest.res.bop.al09012019.rules.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageRule;
	private com.nest.res.bop.al09012019.rules.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageRule;
	private List<BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage> BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageList;
	private com.nest.res.bop.al09012019.domain.BOPCondoCommlUnitOwnersOptionalCovs BOPCondoCommlUnitOwnersOptionalCovs;
	private List<BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage> BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageList;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageList){
		for(BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage:BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageList){
			BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageRule = new com.nest.res.bop.al09012019.rules.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage(BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage);
			BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageList){
		for(BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage:BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageList){
			BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageRule = new com.nest.res.bop.al09012019.rules.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage(BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage);
			BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public  BOPCondoCommlUnitOwnersOptionalCovs (com.nest.res.bop.al09012019.domain.BOPCondoCommlUnitOwnersOptionalCovs BOPCondoCommlUnitOwnersOptionalCovs)  {
	  this.BOPCondoCommlUnitOwnersOptionalCovs = BOPCondoCommlUnitOwnersOptionalCovs;
this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageList = BOPCondoCommlUnitOwnersOptionalCovs.getBOPCondoCommlUnitOwnersOptionalLossAssmtCoverage();
this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageList = BOPCondoCommlUnitOwnersOptionalCovs.getBOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage();

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCondoCommlUnitOwnersOptionalCovs.setPremium(MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalCovs.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalCovs,"BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage/Premium")))));
this.BOPCondoCommlUnitOwnersOptionalCovs.setPremium(MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalCovs.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalCovs,"BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage/Premium")))));

	  
	}
	
	
	
	
	


	
}