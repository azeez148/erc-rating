package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclProductsCompletedOpsHzd  {

	
	
	
	private com.nest.res.bop.domain.BOPExclProductsCompletedOpsHzd BOPExclProductsCompletedOpsHzd;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPExclProductsCompletedOpsHzd (com.nest.res.bop.domain.BOPExclProductsCompletedOpsHzd BOPExclProductsCompletedOpsHzd)  {
	  this.BOPExclProductsCompletedOpsHzd = BOPExclProductsCompletedOpsHzd;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPExclProductsCompletedOpsHzd.setPremium(MathHelper.roundUpDoller(this.BOPExclProductsCompletedOpsHzd.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclProductsCompletedOpsHzd,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclProductsCompletedOpsHzd.getPremium() != (double)0.0){
			this.BOPExclProductsCompletedOpsHzd.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPExclProductsCompletedOpsHzd.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}