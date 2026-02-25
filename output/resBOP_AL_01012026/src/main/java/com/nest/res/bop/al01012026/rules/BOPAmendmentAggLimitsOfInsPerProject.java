package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAmendmentAggLimitsOfInsPerProject  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAmendmentAggLimitsOfInsPerProject BOPAmendmentAggLimitsOfInsPerProject;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPAmendmentAggLimitsOfInsPerProject (com.nest.res.bop.al01012026.domain.BOPAmendmentAggLimitsOfInsPerProject BOPAmendmentAggLimitsOfInsPerProject)  {
	  this.BOPAmendmentAggLimitsOfInsPerProject = BOPAmendmentAggLimitsOfInsPerProject;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAmendmentAggLimitsOfInsPerProject.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAmendmentAggLimitsOfInsPerProject.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAmendmentAggLimitsOfInsPerProject.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAmendmentAggLimitsOfInsPerProject.setPremium(MathHelper.roundUpDoller(this.BOPAmendmentAggLimitsOfInsPerProject.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAmendmentAggLimitsOfInsPerProject,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPAmendmentAggLimitsOfInsPerProject.setPremium(MathHelper.roundUpDoller(this.BOPAmendmentAggLimitsOfInsPerProject.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAmendmentAggLimitsOfInsPerProject,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}