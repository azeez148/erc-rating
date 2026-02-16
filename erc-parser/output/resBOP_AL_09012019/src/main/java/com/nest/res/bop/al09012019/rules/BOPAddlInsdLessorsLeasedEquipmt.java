package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPAddlInsdLessorsLeasedEquipmtDetail;

public class BOPAddlInsdLessorsLeasedEquipmt  {

	
	
	
	private List<BOPAddlInsdLessorsLeasedEquipmtDetail> BOPAddlInsdLessorsLeasedEquipmtDetailList;
	private com.nest.res.bop.al09012019.rules.BOPAddlInsdLessorsLeasedEquipmtDetail BOPAddlInsdLessorsLeasedEquipmtDetailRule;
	private com.nest.res.bop.al09012019.domain.BOPAddlInsdLessorsLeasedEquipmt BOPAddlInsdLessorsLeasedEquipmt;
	
	
	
	public  BOPAddlInsdLessorsLeasedEquipmt (com.nest.res.bop.al09012019.domain.BOPAddlInsdLessorsLeasedEquipmt BOPAddlInsdLessorsLeasedEquipmt)  {
	  this.BOPAddlInsdLessorsLeasedEquipmt = BOPAddlInsdLessorsLeasedEquipmt;
this.BOPAddlInsdLessorsLeasedEquipmtDetailList = BOPAddlInsdLessorsLeasedEquipmt.getBOPAddlInsdLessorsLeasedEquipmtDetail();

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPAddlInsdLessorsLeasedEquipmtDetailList){
		for(BOPAddlInsdLessorsLeasedEquipmtDetail BOPAddlInsdLessorsLeasedEquipmtDetail:BOPAddlInsdLessorsLeasedEquipmtDetailList){
			BOPAddlInsdLessorsLeasedEquipmtDetailRule = new com.nest.res.bop.al09012019.rules.BOPAddlInsdLessorsLeasedEquipmtDetail(BOPAddlInsdLessorsLeasedEquipmtDetail);
			BOPAddlInsdLessorsLeasedEquipmtDetailRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPAddlInsdLessorsLeasedEquipmt,"BOPAddlInsdLessorsLeasedEquipmtDetail") ){
			this.BOPAddlInsdLessorsLeasedEquipmt.setPremium(MathHelper.getDoubleValue(this.BOPAddlInsdLessorsLeasedEquipmt.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	
	
	
	
	


	
}