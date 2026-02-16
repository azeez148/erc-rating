package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPLossRentalValueLandlordDesignatedPayeeDetail;

public class BOPLossRentalValueLandlordDesignatedPayee  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPLossRentalValueLandlordDesignatedPayee BOPLossRentalValueLandlordDesignatedPayee;
	private List<BOPLossRentalValueLandlordDesignatedPayeeDetail> BOPLossRentalValueLandlordDesignatedPayeeDetailList;
	private com.nest.res.bop.al09012019.rules.BOPLossRentalValueLandlordDesignatedPayeeDetail BOPLossRentalValueLandlordDesignatedPayeeDetailRule;
	
	
	
	public void ProcessPremium1 ()  {
	  
	if(null != BOPLossRentalValueLandlordDesignatedPayeeDetailList){
		for(BOPLossRentalValueLandlordDesignatedPayeeDetail BOPLossRentalValueLandlordDesignatedPayeeDetail:BOPLossRentalValueLandlordDesignatedPayeeDetailList){
			BOPLossRentalValueLandlordDesignatedPayeeDetailRule = new com.nest.res.bop.al09012019.rules.BOPLossRentalValueLandlordDesignatedPayeeDetail(BOPLossRentalValueLandlordDesignatedPayeeDetail);
			BOPLossRentalValueLandlordDesignatedPayeeDetailRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPLossRentalValueLandlordDesignatedPayee,"BOPLossRentalValueLandlordDesignatedPayeeDetail") ){
			this.BOPLossRentalValueLandlordDesignatedPayee.setPremium(MathHelper.getDoubleValue(this.BOPLossRentalValueLandlordDesignatedPayee.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public  BOPLossRentalValueLandlordDesignatedPayee (com.nest.res.bop.al09012019.domain.BOPLossRentalValueLandlordDesignatedPayee BOPLossRentalValueLandlordDesignatedPayee)  {
	  this.BOPLossRentalValueLandlordDesignatedPayee = BOPLossRentalValueLandlordDesignatedPayee;
this.BOPLossRentalValueLandlordDesignatedPayeeDetailList = BOPLossRentalValueLandlordDesignatedPayee.getBOPLossRentalValueLandlordDesignatedPayeeDetail();

	  
	}
	
	
	
	
	


	
}