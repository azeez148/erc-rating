package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail;

public class BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd  {

	
	
	
	private com.nest.res.bop.rules.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailRule;
	private List<BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail> BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailList;
	private com.nest.res.bop.domain.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd;
	
	
	
	public  BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd (com.nest.res.bop.domain.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd)  {
	  this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd = BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd;
this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailList = BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd.getBOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail();

	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailList != null && this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail : BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailList) {
				finalPremium = finalPremium + BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail.getPremium();
			}
		}
this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd.setPremium(finalPremium) ;
	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailList){
		for(BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail:BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailList){
			BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailRule = new com.nest.res.bop.rules.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail(BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail);
			BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	
	
	
	
	


	
}