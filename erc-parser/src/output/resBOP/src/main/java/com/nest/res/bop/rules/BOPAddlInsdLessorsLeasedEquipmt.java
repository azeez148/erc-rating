package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPAddlInsdLessorsLeasedEquipmtDetail;

public class BOPAddlInsdLessorsLeasedEquipmt  {

	
	
	
	private List<BOPAddlInsdLessorsLeasedEquipmtDetail> BOPAddlInsdLessorsLeasedEquipmtDetailList;
	private com.nest.res.bop.rules.BOPAddlInsdLessorsLeasedEquipmtDetail BOPAddlInsdLessorsLeasedEquipmtDetailRule;
	private com.nest.res.bop.domain.BOPAddlInsdLessorsLeasedEquipmt BOPAddlInsdLessorsLeasedEquipmt;
	
	
	
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPAddlInsdLessorsLeasedEquipmtDetailList != null && this.BOPAddlInsdLessorsLeasedEquipmtDetailList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlInsdLessorsLeasedEquipmtDetail BOPAddlInsdLessorsLeasedEquipmtDetail : BOPAddlInsdLessorsLeasedEquipmtDetailList) {
				finalPremium = finalPremium + BOPAddlInsdLessorsLeasedEquipmtDetail.getPremium();
			}
		}
this.BOPAddlInsdLessorsLeasedEquipmt.setPremium(finalPremium) ;
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPAddlInsdLessorsLeasedEquipmtDetailList){
		for(BOPAddlInsdLessorsLeasedEquipmtDetail BOPAddlInsdLessorsLeasedEquipmtDetail:BOPAddlInsdLessorsLeasedEquipmtDetailList){
			BOPAddlInsdLessorsLeasedEquipmtDetailRule = new com.nest.res.bop.rules.BOPAddlInsdLessorsLeasedEquipmtDetail(BOPAddlInsdLessorsLeasedEquipmtDetail);
			BOPAddlInsdLessorsLeasedEquipmtDetailRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	public  BOPAddlInsdLessorsLeasedEquipmt (com.nest.res.bop.domain.BOPAddlInsdLessorsLeasedEquipmt BOPAddlInsdLessorsLeasedEquipmt)  {
	  this.BOPAddlInsdLessorsLeasedEquipmt = BOPAddlInsdLessorsLeasedEquipmt;
this.BOPAddlInsdLessorsLeasedEquipmtDetailList = BOPAddlInsdLessorsLeasedEquipmt.getBOPAddlInsdLessorsLeasedEquipmtDetail();

	  
	}
	
	
	
	
	


	
}