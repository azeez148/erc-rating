package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPAddlInsdDesignatedPersonOrgDetail;

public class BOPAddlInsdDesignatedPersonOrg  {

	
	
	
	private com.nest.res.bop.domain.BOPAddlInsdDesignatedPersonOrg BOPAddlInsdDesignatedPersonOrg;
	private com.nest.res.bop.rules.BOPAddlInsdDesignatedPersonOrgDetail BOPAddlInsdDesignatedPersonOrgDetailRule;
	private List<BOPAddlInsdDesignatedPersonOrgDetail> BOPAddlInsdDesignatedPersonOrgDetailList;
	
	
	
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPAddlInsdDesignatedPersonOrgDetailList != null && this.BOPAddlInsdDesignatedPersonOrgDetailList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlInsdDesignatedPersonOrgDetail BOPAddlInsdDesignatedPersonOrgDetail : BOPAddlInsdDesignatedPersonOrgDetailList) {
				finalPremium = finalPremium + BOPAddlInsdDesignatedPersonOrgDetail.getPremium();
			}
		}
this.BOPAddlInsdDesignatedPersonOrg.setPremium(finalPremium) ;
	  
	}
	public  BOPAddlInsdDesignatedPersonOrg (com.nest.res.bop.domain.BOPAddlInsdDesignatedPersonOrg BOPAddlInsdDesignatedPersonOrg)  {
	  this.BOPAddlInsdDesignatedPersonOrg = BOPAddlInsdDesignatedPersonOrg;
this.BOPAddlInsdDesignatedPersonOrgDetailList = BOPAddlInsdDesignatedPersonOrg.getBOPAddlInsdDesignatedPersonOrgDetail();

	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPAddlInsdDesignatedPersonOrgDetailList){
		for(BOPAddlInsdDesignatedPersonOrgDetail BOPAddlInsdDesignatedPersonOrgDetail:BOPAddlInsdDesignatedPersonOrgDetailList){
			BOPAddlInsdDesignatedPersonOrgDetailRule = new com.nest.res.bop.rules.BOPAddlInsdDesignatedPersonOrgDetail(BOPAddlInsdDesignatedPersonOrgDetail);
			BOPAddlInsdDesignatedPersonOrgDetailRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	
	
	
	
	


	
}