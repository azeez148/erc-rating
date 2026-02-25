package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPAddlInsdVendorsDetail;

public class BOPAddlInsdVendors  {

	
	
	
	private com.nest.res.bop.al01012026.rules.BOPAddlInsdVendorsDetail BOPAddlInsdVendorsDetailRule;
	private List<BOPAddlInsdVendorsDetail> BOPAddlInsdVendorsDetailList;
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdVendors BOPAddlInsdVendors;
	
	
	
	public  BOPAddlInsdVendors (com.nest.res.bop.al01012026.domain.BOPAddlInsdVendors BOPAddlInsdVendors)  {
	  this.BOPAddlInsdVendors = BOPAddlInsdVendors;
this.BOPAddlInsdVendorsDetailList = BOPAddlInsdVendors.getBOPAddlInsdVendorsDetail();

	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPAddlInsdVendorsDetailList){
		for(BOPAddlInsdVendorsDetail BOPAddlInsdVendorsDetail:BOPAddlInsdVendorsDetailList){
			BOPAddlInsdVendorsDetailRule = new com.nest.res.bop.al01012026.rules.BOPAddlInsdVendorsDetail(BOPAddlInsdVendorsDetail);
			BOPAddlInsdVendorsDetailRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPAddlInsdVendors,"BOPAddlInsdVendorsDetail") ){
			this.BOPAddlInsdVendors.setPremium(MathHelper.getDoubleValue(this.BOPAddlInsdVendors.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	
	
	
	
	


	
}