package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail,"../../IRPMFactor")))));

	  
	}
	public  BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail (com.nest.res.bop.al01012026.domain.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail)  {
	  this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail = BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdDetail,"../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}