package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAmendmentInsuredContractDefinition  {

	
	
	
	private com.nest.res.bop.domain.BOPAmendmentInsuredContractDefinition BOPAmendmentInsuredContractDefinition;
	
	
	
	public  BOPAmendmentInsuredContractDefinition (com.nest.res.bop.domain.BOPAmendmentInsuredContractDefinition BOPAmendmentInsuredContractDefinition)  {
	  this.BOPAmendmentInsuredContractDefinition = BOPAmendmentInsuredContractDefinition;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAmendmentInsuredContractDefinition.getPremium() != (double)0.0){
			this.BOPAmendmentInsuredContractDefinition.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPAmendmentInsuredContractDefinition.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPAmendmentInsuredContractDefinition.setPremium(MathHelper.roundUpDoller(this.BOPAmendmentInsuredContractDefinition.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAmendmentInsuredContractDefinition,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}