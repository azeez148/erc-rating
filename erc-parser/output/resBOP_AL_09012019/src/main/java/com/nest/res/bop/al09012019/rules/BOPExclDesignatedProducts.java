package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclDesignatedProducts  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPExclDesignatedProducts BOPExclDesignatedProducts;
	
	
	
	public void Premium ()  {
	  this.BOPExclDesignatedProducts.setPremium(MathHelper.roundUpDoller(this.BOPExclDesignatedProducts.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclDesignatedProducts,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclDesignatedProducts.setPremium(MathHelper.roundUpDoller(this.BOPExclDesignatedProducts.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclDesignatedProducts,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclDesignatedProducts.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclDesignatedProducts.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclDesignatedProducts.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPExclDesignatedProducts (com.nest.res.bop.al09012019.domain.BOPExclDesignatedProducts BOPExclDesignatedProducts)  {
	  this.BOPExclDesignatedProducts = BOPExclDesignatedProducts;

	  
	}
	
	
	
	
	


	
}