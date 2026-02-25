package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProductsDetail;

public class BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts  {

	
	
	
	private List<BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProductsDetail> BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProductsDetailList;
	private com.nest.res.bop.al01012026.domain.BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts.setPremium(MathHelper.roundUpDoller(this.BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts.setPremium(MathHelper.roundUpDoller(this.BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts,"../IRPMFactor")))));

	  
	}
	public  BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts (com.nest.res.bop.al01012026.domain.BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts)  {
	  this.BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts = BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts;
this.BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProductsDetailList = BOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProducts.getBOPGeneticallyModifiedOrganismExclusionForDesignatedOperationsOrProductsDetail();

	  
	}
	
	
	
	
	


	
}