package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPAddlInsdManagersLessorsPremisesDetail;

public class BOPAddlInsdManagersLessorsPremises  {

	
	
	
	private List<BOPAddlInsdManagersLessorsPremisesDetail> BOPAddlInsdManagersLessorsPremisesDetailList;
	private com.nest.res.bop.al09012019.domain.BOPAddlInsdManagersLessorsPremises BOPAddlInsdManagersLessorsPremises;
	private com.nest.res.bop.al09012019.rules.BOPAddlInsdManagersLessorsPremisesDetail BOPAddlInsdManagersLessorsPremisesDetailRule;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPAddlInsdManagersLessorsPremisesDetailList){
		for(BOPAddlInsdManagersLessorsPremisesDetail BOPAddlInsdManagersLessorsPremisesDetail:BOPAddlInsdManagersLessorsPremisesDetailList){
			BOPAddlInsdManagersLessorsPremisesDetailRule = new com.nest.res.bop.al09012019.rules.BOPAddlInsdManagersLessorsPremisesDetail(BOPAddlInsdManagersLessorsPremisesDetail);
			BOPAddlInsdManagersLessorsPremisesDetailRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public  BOPAddlInsdManagersLessorsPremises (com.nest.res.bop.al09012019.domain.BOPAddlInsdManagersLessorsPremises BOPAddlInsdManagersLessorsPremises)  {
	  this.BOPAddlInsdManagersLessorsPremises = BOPAddlInsdManagersLessorsPremises;
this.BOPAddlInsdManagersLessorsPremisesDetailList = BOPAddlInsdManagersLessorsPremises.getBOPAddlInsdManagersLessorsPremisesDetail();

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPAddlInsdManagersLessorsPremises,"BOPAddlInsdManagersLessorsPremisesDetail") ){
			this.BOPAddlInsdManagersLessorsPremises.setPremium(MathHelper.getDoubleValue(this.BOPAddlInsdManagersLessorsPremises.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	
	
	
	
	


	
}