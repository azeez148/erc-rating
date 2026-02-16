package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclProductsCompletedOpsHzd  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPExclProductsCompletedOpsHzd BOPExclProductsCompletedOpsHzd;
	
	
	
	public  BOPExclProductsCompletedOpsHzd (com.nest.res.bop.al09012019.domain.BOPExclProductsCompletedOpsHzd BOPExclProductsCompletedOpsHzd)  {
	  this.BOPExclProductsCompletedOpsHzd = BOPExclProductsCompletedOpsHzd;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclProductsCompletedOpsHzd.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclProductsCompletedOpsHzd.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclProductsCompletedOpsHzd.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPExclProductsCompletedOpsHzd.setPremium(MathHelper.roundUpDoller(this.BOPExclProductsCompletedOpsHzd.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclProductsCompletedOpsHzd,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclProductsCompletedOpsHzd.setPremium(MathHelper.roundUpDoller(this.BOPExclProductsCompletedOpsHzd.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclProductsCompletedOpsHzd,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}