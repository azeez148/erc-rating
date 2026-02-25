package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPAddlInsdDesignatedPersonOrgDetail;

public class BOPAddlInsdDesignatedPersonOrg  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdDesignatedPersonOrg BOPAddlInsdDesignatedPersonOrg;
	private com.nest.res.bop.al01012026.rules.BOPAddlInsdDesignatedPersonOrgDetail BOPAddlInsdDesignatedPersonOrgDetailRule;
	private List<BOPAddlInsdDesignatedPersonOrgDetail> BOPAddlInsdDesignatedPersonOrgDetailList;
	
	
	
	public  BOPAddlInsdDesignatedPersonOrg (com.nest.res.bop.al01012026.domain.BOPAddlInsdDesignatedPersonOrg BOPAddlInsdDesignatedPersonOrg)  {
	  this.BOPAddlInsdDesignatedPersonOrg = BOPAddlInsdDesignatedPersonOrg;
this.BOPAddlInsdDesignatedPersonOrgDetailList = BOPAddlInsdDesignatedPersonOrg.getBOPAddlInsdDesignatedPersonOrgDetail();

	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPAddlInsdDesignatedPersonOrgDetailList){
		for(BOPAddlInsdDesignatedPersonOrgDetail BOPAddlInsdDesignatedPersonOrgDetail:BOPAddlInsdDesignatedPersonOrgDetailList){
			BOPAddlInsdDesignatedPersonOrgDetailRule = new com.nest.res.bop.al01012026.rules.BOPAddlInsdDesignatedPersonOrgDetail(BOPAddlInsdDesignatedPersonOrgDetail);
			BOPAddlInsdDesignatedPersonOrgDetailRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPAddlInsdDesignatedPersonOrg,"BOPAddlInsdDesignatedPersonOrgDetail") ){
			this.BOPAddlInsdDesignatedPersonOrg.setPremium(MathHelper.getDoubleValue(this.BOPAddlInsdDesignatedPersonOrg.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	
	
	
	
	


	
}