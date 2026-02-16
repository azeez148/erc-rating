package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPAddlInsdManagersLessorsPremisesDetail;

public class BOPAddlInsdManagersLessorsPremises  {

	
	
	
	private List<BOPAddlInsdManagersLessorsPremisesDetail> BOPAddlInsdManagersLessorsPremisesDetailList;
	private com.nest.res.bop.domain.BOPAddlInsdManagersLessorsPremises BOPAddlInsdManagersLessorsPremises;
	private com.nest.res.bop.rules.BOPAddlInsdManagersLessorsPremisesDetail BOPAddlInsdManagersLessorsPremisesDetailRule;
	
	
	
	public  BOPAddlInsdManagersLessorsPremises (com.nest.res.bop.domain.BOPAddlInsdManagersLessorsPremises BOPAddlInsdManagersLessorsPremises)  {
	  this.BOPAddlInsdManagersLessorsPremises = BOPAddlInsdManagersLessorsPremises;
this.BOPAddlInsdManagersLessorsPremisesDetailList = BOPAddlInsdManagersLessorsPremises.getBOPAddlInsdManagersLessorsPremisesDetail();

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPAddlInsdManagersLessorsPremisesDetailList){
		for(BOPAddlInsdManagersLessorsPremisesDetail BOPAddlInsdManagersLessorsPremisesDetail:BOPAddlInsdManagersLessorsPremisesDetailList){
			BOPAddlInsdManagersLessorsPremisesDetailRule = new com.nest.res.bop.rules.BOPAddlInsdManagersLessorsPremisesDetail(BOPAddlInsdManagersLessorsPremisesDetail);
			BOPAddlInsdManagersLessorsPremisesDetailRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPAddlInsdManagersLessorsPremisesDetailList != null && this.BOPAddlInsdManagersLessorsPremisesDetailList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlInsdManagersLessorsPremisesDetail BOPAddlInsdManagersLessorsPremisesDetail : BOPAddlInsdManagersLessorsPremisesDetailList) {
				finalPremium = finalPremium + BOPAddlInsdManagersLessorsPremisesDetail.getPremium();
			}
		}
this.BOPAddlInsdManagersLessorsPremises.setPremium(finalPremium) ;
	  
	}
	
	
	
	
	


	
}