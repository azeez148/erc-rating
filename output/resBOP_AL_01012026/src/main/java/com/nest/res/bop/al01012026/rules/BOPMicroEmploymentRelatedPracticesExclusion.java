package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMicroEmploymentRelatedPracticesExclusion  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMicroEmploymentRelatedPracticesExclusion BOPMicroEmploymentRelatedPracticesExclusion;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPMicroEmploymentRelatedPracticesExclusion.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPMicroEmploymentRelatedPracticesExclusion.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroEmploymentRelatedPracticesExclusion.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPMicroEmploymentRelatedPracticesExclusion (com.nest.res.bop.al01012026.domain.BOPMicroEmploymentRelatedPracticesExclusion BOPMicroEmploymentRelatedPracticesExclusion)  {
	  this.BOPMicroEmploymentRelatedPracticesExclusion = BOPMicroEmploymentRelatedPracticesExclusion;

	  
	}
	public void Premium ()  {
	  this.BOPMicroEmploymentRelatedPracticesExclusion.setPremium(MathHelper.roundUpDoller(this.BOPMicroEmploymentRelatedPracticesExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroEmploymentRelatedPracticesExclusion,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPMicroEmploymentRelatedPracticesExclusion.setPremium(MathHelper.roundUpDoller(this.BOPMicroEmploymentRelatedPracticesExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroEmploymentRelatedPracticesExclusion,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}