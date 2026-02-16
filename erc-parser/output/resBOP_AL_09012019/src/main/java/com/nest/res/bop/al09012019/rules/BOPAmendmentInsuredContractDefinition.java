package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAmendmentInsuredContractDefinition  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPAmendmentInsuredContractDefinition BOPAmendmentInsuredContractDefinition;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAmendmentInsuredContractDefinition.setPremium(MathHelper.roundUpDoller(this.BOPAmendmentInsuredContractDefinition.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAmendmentInsuredContractDefinition,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAmendmentInsuredContractDefinition.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAmendmentInsuredContractDefinition.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAmendmentInsuredContractDefinition.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPAmendmentInsuredContractDefinition (com.nest.res.bop.al09012019.domain.BOPAmendmentInsuredContractDefinition BOPAmendmentInsuredContractDefinition)  {
	  this.BOPAmendmentInsuredContractDefinition = BOPAmendmentInsuredContractDefinition;

	  
	}
	public void Premium ()  {
	  this.BOPAmendmentInsuredContractDefinition.setPremium(MathHelper.roundUpDoller(this.BOPAmendmentInsuredContractDefinition.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAmendmentInsuredContractDefinition,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}