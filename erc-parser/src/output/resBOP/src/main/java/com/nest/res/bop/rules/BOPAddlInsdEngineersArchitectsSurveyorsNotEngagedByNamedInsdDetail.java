package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail  {

	
	
	
	private com.nest.res.bop.domain.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail;
	
	
	
	public void Premium ()  {
	  this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail,"../../IRPMFactor")))));

	  
	}
	public  BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail (com.nest.res.bop.domain.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail)  {
	  this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail = BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail.getPremium() != (double)0.0){
			this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}