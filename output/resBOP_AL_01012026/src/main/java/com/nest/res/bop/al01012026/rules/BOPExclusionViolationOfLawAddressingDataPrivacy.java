package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclusionViolationOfLawAddressingDataPrivacy  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclusionViolationOfLawAddressingDataPrivacy BOPExclusionViolationOfLawAddressingDataPrivacy;
	
	
	
	public  BOPExclusionViolationOfLawAddressingDataPrivacy (com.nest.res.bop.al01012026.domain.BOPExclusionViolationOfLawAddressingDataPrivacy BOPExclusionViolationOfLawAddressingDataPrivacy)  {
	  this.BOPExclusionViolationOfLawAddressingDataPrivacy = BOPExclusionViolationOfLawAddressingDataPrivacy;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclusionViolationOfLawAddressingDataPrivacy.setPremium(MathHelper.roundUpDoller(this.BOPExclusionViolationOfLawAddressingDataPrivacy.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionViolationOfLawAddressingDataPrivacy,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclusionViolationOfLawAddressingDataPrivacy.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclusionViolationOfLawAddressingDataPrivacy.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclusionViolationOfLawAddressingDataPrivacy.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPExclusionViolationOfLawAddressingDataPrivacy.setPremium(MathHelper.roundUpDoller(this.BOPExclusionViolationOfLawAddressingDataPrivacy.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionViolationOfLawAddressingDataPrivacy,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}