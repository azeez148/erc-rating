package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPExclusionDesignatedCannabisProductsDetail;

public class BOPExclusionDesignatedCannabisProducts  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclusionDesignatedCannabisProducts BOPExclusionDesignatedCannabisProducts;
	private List<BOPExclusionDesignatedCannabisProductsDetail> BOPExclusionDesignatedCannabisProductsDetailList;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclusionDesignatedCannabisProducts.setPremium(MathHelper.roundUpDoller(this.BOPExclusionDesignatedCannabisProducts.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionDesignatedCannabisProducts,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPExclusionDesignatedCannabisProducts.setPremium(MathHelper.roundUpDoller(this.BOPExclusionDesignatedCannabisProducts.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionDesignatedCannabisProducts,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public  BOPExclusionDesignatedCannabisProducts (com.nest.res.bop.al01012026.domain.BOPExclusionDesignatedCannabisProducts BOPExclusionDesignatedCannabisProducts)  {
	  this.BOPExclusionDesignatedCannabisProducts = BOPExclusionDesignatedCannabisProducts;
this.BOPExclusionDesignatedCannabisProductsDetailList = BOPExclusionDesignatedCannabisProducts.getBOPExclusionDesignatedCannabisProductsDetail();

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclusionDesignatedCannabisProducts.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclusionDesignatedCannabisProducts.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclusionDesignatedCannabisProducts.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}