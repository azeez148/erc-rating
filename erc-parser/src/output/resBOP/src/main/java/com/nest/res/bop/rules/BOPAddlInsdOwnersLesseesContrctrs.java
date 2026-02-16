package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesContrctrsDetail;

public class BOPAddlInsdOwnersLesseesContrctrs  {

	
	
	
	private List<BOPAddlInsdOwnersLesseesContrctrsDetail> BOPAddlInsdOwnersLesseesContrctrsDetailList;
	private com.nest.res.bop.rules.BOPAddlInsdOwnersLesseesContrctrsDetail BOPAddlInsdOwnersLesseesContrctrsDetailRule;
	private com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesContrctrs BOPAddlInsdOwnersLesseesContrctrs;
	
	
	
	public  BOPAddlInsdOwnersLesseesContrctrs (com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesContrctrs BOPAddlInsdOwnersLesseesContrctrs)  {
	  this.BOPAddlInsdOwnersLesseesContrctrs = BOPAddlInsdOwnersLesseesContrctrs;
this.BOPAddlInsdOwnersLesseesContrctrsDetailList = BOPAddlInsdOwnersLesseesContrctrs.getBOPAddlInsdOwnersLesseesContrctrsDetail();

	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPAddlInsdOwnersLesseesContrctrsDetailList != null && this.BOPAddlInsdOwnersLesseesContrctrsDetailList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesContrctrsDetail BOPAddlInsdOwnersLesseesContrctrsDetail : BOPAddlInsdOwnersLesseesContrctrsDetailList) {
				finalPremium = finalPremium + BOPAddlInsdOwnersLesseesContrctrsDetail.getPremium();
			}
		}
this.BOPAddlInsdOwnersLesseesContrctrs.setPremium(finalPremium) ;
	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPAddlInsdOwnersLesseesContrctrsDetailList){
		for(BOPAddlInsdOwnersLesseesContrctrsDetail BOPAddlInsdOwnersLesseesContrctrsDetail:BOPAddlInsdOwnersLesseesContrctrsDetailList){
			BOPAddlInsdOwnersLesseesContrctrsDetailRule = new com.nest.res.bop.rules.BOPAddlInsdOwnersLesseesContrctrsDetail(BOPAddlInsdOwnersLesseesContrctrsDetail);
			BOPAddlInsdOwnersLesseesContrctrsDetailRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	
	
	
	
	


	
}