package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclusionElectronicDataDeletionOfBodilyInjuryException  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclusionElectronicDataDeletionOfBodilyInjuryException BOPExclusionElectronicDataDeletionOfBodilyInjuryException;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPExclusionElectronicDataDeletionOfBodilyInjuryException.setPremium(MathHelper.roundUpDoller(this.BOPExclusionElectronicDataDeletionOfBodilyInjuryException.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionElectronicDataDeletionOfBodilyInjuryException,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclusionElectronicDataDeletionOfBodilyInjuryException.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclusionElectronicDataDeletionOfBodilyInjuryException.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclusionElectronicDataDeletionOfBodilyInjuryException.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclusionElectronicDataDeletionOfBodilyInjuryException.setPremium(MathHelper.roundUpDoller(this.BOPExclusionElectronicDataDeletionOfBodilyInjuryException.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionElectronicDataDeletionOfBodilyInjuryException,"../IRPMFactor")))));

	  
	}
	public  BOPExclusionElectronicDataDeletionOfBodilyInjuryException (com.nest.res.bop.al01012026.domain.BOPExclusionElectronicDataDeletionOfBodilyInjuryException BOPExclusionElectronicDataDeletionOfBodilyInjuryException)  {
	  this.BOPExclusionElectronicDataDeletionOfBodilyInjuryException = BOPExclusionElectronicDataDeletionOfBodilyInjuryException;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}