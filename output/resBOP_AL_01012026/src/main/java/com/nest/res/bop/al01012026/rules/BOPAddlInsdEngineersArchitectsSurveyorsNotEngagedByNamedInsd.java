package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail;

public class BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd  {

	
	
	
	private com.nest.res.bop.al01012026.rules.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailRule;
	private List<BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail> BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailList;
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd;
	
	
	
	public  BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd (com.nest.res.bop.al01012026.domain.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd)  {
	  this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd = BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd;
this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailList = BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd.getBOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail();

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd,"BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail") ){
			this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd.setPremium(MathHelper.getDoubleValue(this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailList){
		for(BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail:BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailList){
			BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailRule = new com.nest.res.bop.al01012026.rules.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail(BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail);
			BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetailRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}