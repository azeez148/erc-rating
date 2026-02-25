package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPAddlInsdOwnersLesseesContrctrsDetail;

public class BOPAddlInsdOwnersLesseesContrctrs  {

	
	
	
	private List<BOPAddlInsdOwnersLesseesContrctrsDetail> BOPAddlInsdOwnersLesseesContrctrsDetailList;
	private com.nest.res.bop.al01012026.rules.BOPAddlInsdOwnersLesseesContrctrsDetail BOPAddlInsdOwnersLesseesContrctrsDetailRule;
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdOwnersLesseesContrctrs BOPAddlInsdOwnersLesseesContrctrs;
	
	
	
	public  BOPAddlInsdOwnersLesseesContrctrs (com.nest.res.bop.al01012026.domain.BOPAddlInsdOwnersLesseesContrctrs BOPAddlInsdOwnersLesseesContrctrs)  {
	  this.BOPAddlInsdOwnersLesseesContrctrs = BOPAddlInsdOwnersLesseesContrctrs;
this.BOPAddlInsdOwnersLesseesContrctrsDetailList = BOPAddlInsdOwnersLesseesContrctrs.getBOPAddlInsdOwnersLesseesContrctrsDetail();

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPAddlInsdOwnersLesseesContrctrs,"BOPAddlInsdOwnersLesseesContrctrsDetail") ){
			this.BOPAddlInsdOwnersLesseesContrctrs.setPremium(MathHelper.getDoubleValue(this.BOPAddlInsdOwnersLesseesContrctrs.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPAddlInsdOwnersLesseesContrctrsDetailList){
		for(BOPAddlInsdOwnersLesseesContrctrsDetail BOPAddlInsdOwnersLesseesContrctrsDetail:BOPAddlInsdOwnersLesseesContrctrsDetailList){
			BOPAddlInsdOwnersLesseesContrctrsDetailRule = new com.nest.res.bop.al01012026.rules.BOPAddlInsdOwnersLesseesContrctrsDetail(BOPAddlInsdOwnersLesseesContrctrsDetail);
			BOPAddlInsdOwnersLesseesContrctrsDetailRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}