package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEmploymentRelatedPracticesExcl  {

	
	
	
	private com.nest.res.bop.domain.BOPEmploymentRelatedPracticesExcl BOPEmploymentRelatedPracticesExcl;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPEmploymentRelatedPracticesExcl.setPremium(MathHelper.roundUpDoller(this.BOPEmploymentRelatedPracticesExcl.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmploymentRelatedPracticesExcl,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPEmploymentRelatedPracticesExcl.getPremium() != (double)0.0){
			this.BOPEmploymentRelatedPracticesExcl.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPEmploymentRelatedPracticesExcl.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPEmploymentRelatedPracticesExcl (com.nest.res.bop.domain.BOPEmploymentRelatedPracticesExcl BOPEmploymentRelatedPracticesExcl)  {
	  this.BOPEmploymentRelatedPracticesExcl = BOPEmploymentRelatedPracticesExcl;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}