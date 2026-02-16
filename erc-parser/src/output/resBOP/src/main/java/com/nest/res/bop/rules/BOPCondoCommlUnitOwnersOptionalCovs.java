package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage;
import com.nest.res.bop.domain.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage;

public class BOPCondoCommlUnitOwnersOptionalCovs  {

	
	
	
	private com.nest.res.bop.rules.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageRule;
	private com.nest.res.bop.rules.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageRule;
	private List<BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage> BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageList;
	private com.nest.res.bop.domain.BOPCondoCommlUnitOwnersOptionalCovs BOPCondoCommlUnitOwnersOptionalCovs;
	private List<BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage> BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageList;
	
	
	
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageList != null && this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage : BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageList) {
				finalPremium = finalPremium + BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getPremium();
			}
		}
		if(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageList != null && this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage : BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageList) {
				finalPremium = finalPremium + BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.getPremium();
			}
		}
this.BOPCondoCommlUnitOwnersOptionalCovs.setPremium(finalPremium) ;
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageList){
		for(BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage:BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageList){
			BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageRule = new com.nest.res.bop.rules.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage(BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage);
			BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageList){
		for(BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage:BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageList){
			BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageRule = new com.nest.res.bop.rules.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage(BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage);
			BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	public  BOPCondoCommlUnitOwnersOptionalCovs (com.nest.res.bop.domain.BOPCondoCommlUnitOwnersOptionalCovs BOPCondoCommlUnitOwnersOptionalCovs)  {
	  this.BOPCondoCommlUnitOwnersOptionalCovs = BOPCondoCommlUnitOwnersOptionalCovs;
this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverageList = BOPCondoCommlUnitOwnersOptionalCovs.getBOPCondoCommlUnitOwnersOptionalLossAssmtCoverage();
this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverageList = BOPCondoCommlUnitOwnersOptionalCovs.getBOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage();

	  
	}
	
	
	
	
	


	
}