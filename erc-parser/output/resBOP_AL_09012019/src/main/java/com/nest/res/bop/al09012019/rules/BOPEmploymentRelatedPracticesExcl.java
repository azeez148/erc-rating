package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEmploymentRelatedPracticesExcl  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPEmploymentRelatedPracticesExcl BOPEmploymentRelatedPracticesExcl;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPEmploymentRelatedPracticesExcl (com.nest.res.bop.al09012019.domain.BOPEmploymentRelatedPracticesExcl BOPEmploymentRelatedPracticesExcl)  {
	  this.BOPEmploymentRelatedPracticesExcl = BOPEmploymentRelatedPracticesExcl;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPEmploymentRelatedPracticesExcl.setPremium(MathHelper.roundUpDoller(this.BOPEmploymentRelatedPracticesExcl.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmploymentRelatedPracticesExcl,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPEmploymentRelatedPracticesExcl.setPremium(MathHelper.roundUpDoller(this.BOPEmploymentRelatedPracticesExcl.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmploymentRelatedPracticesExcl,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPEmploymentRelatedPracticesExcl.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPEmploymentRelatedPracticesExcl.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPEmploymentRelatedPracticesExcl.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}