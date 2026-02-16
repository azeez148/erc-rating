package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclDesignatedProducts  {

	
	
	
	private com.nest.res.bop.domain.BOPExclDesignatedProducts BOPExclDesignatedProducts;
	
	
	
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
	public  BOPExclDesignatedProducts (com.nest.res.bop.domain.BOPExclDesignatedProducts BOPExclDesignatedProducts)  {
	  this.BOPExclDesignatedProducts = BOPExclDesignatedProducts;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclDesignatedProducts.getPremium() != (double)0.0){
			this.BOPExclDesignatedProducts.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPExclDesignatedProducts.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}