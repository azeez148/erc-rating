package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPAddlInsdVendorsDetail;

public class BOPAddlInsdVendors  {

	
	
	
	private com.nest.res.bop.rules.BOPAddlInsdVendorsDetail BOPAddlInsdVendorsDetailRule;
	private List<BOPAddlInsdVendorsDetail> BOPAddlInsdVendorsDetailList;
	private com.nest.res.bop.domain.BOPAddlInsdVendors BOPAddlInsdVendors;
	
	
	
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPAddlInsdVendorsDetailList != null && this.BOPAddlInsdVendorsDetailList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlInsdVendorsDetail BOPAddlInsdVendorsDetail : BOPAddlInsdVendorsDetailList) {
				finalPremium = finalPremium + BOPAddlInsdVendorsDetail.getPremium();
			}
		}
this.BOPAddlInsdVendors.setPremium(finalPremium) ;
	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPAddlInsdVendorsDetailList){
		for(BOPAddlInsdVendorsDetail BOPAddlInsdVendorsDetail:BOPAddlInsdVendorsDetailList){
			BOPAddlInsdVendorsDetailRule = new com.nest.res.bop.rules.BOPAddlInsdVendorsDetail(BOPAddlInsdVendorsDetail);
			BOPAddlInsdVendorsDetailRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	public  BOPAddlInsdVendors (com.nest.res.bop.domain.BOPAddlInsdVendors BOPAddlInsdVendors)  {
	  this.BOPAddlInsdVendors = BOPAddlInsdVendors;
this.BOPAddlInsdVendorsDetailList = BOPAddlInsdVendors.getBOPAddlInsdVendorsDetail();

	  
	}
	
	
	
	
	


	
}