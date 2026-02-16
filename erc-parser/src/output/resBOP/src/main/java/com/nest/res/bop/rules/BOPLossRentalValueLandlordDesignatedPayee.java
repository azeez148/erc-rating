package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPLossRentalValueLandlordDesignatedPayeeDetail;

public class BOPLossRentalValueLandlordDesignatedPayee  {

	
	
	
	private com.nest.res.bop.domain.BOPLossRentalValueLandlordDesignatedPayee BOPLossRentalValueLandlordDesignatedPayee;
	private List<BOPLossRentalValueLandlordDesignatedPayeeDetail> BOPLossRentalValueLandlordDesignatedPayeeDetailList;
	private com.nest.res.bop.rules.BOPLossRentalValueLandlordDesignatedPayeeDetail BOPLossRentalValueLandlordDesignatedPayeeDetailRule;
	
	
	
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPLossRentalValueLandlordDesignatedPayeeDetailList != null && this.BOPLossRentalValueLandlordDesignatedPayeeDetailList.size() > 0){
			for(com.nest.res.bop.domain.BOPLossRentalValueLandlordDesignatedPayeeDetail BOPLossRentalValueLandlordDesignatedPayeeDetail : BOPLossRentalValueLandlordDesignatedPayeeDetailList) {
				finalPremium = finalPremium + BOPLossRentalValueLandlordDesignatedPayeeDetail.getPremium();
			}
		}
this.BOPLossRentalValueLandlordDesignatedPayee.setPremium(finalPremium) ;
	  
	}
	public  BOPLossRentalValueLandlordDesignatedPayee (com.nest.res.bop.domain.BOPLossRentalValueLandlordDesignatedPayee BOPLossRentalValueLandlordDesignatedPayee)  {
	  this.BOPLossRentalValueLandlordDesignatedPayee = BOPLossRentalValueLandlordDesignatedPayee;
this.BOPLossRentalValueLandlordDesignatedPayeeDetailList = BOPLossRentalValueLandlordDesignatedPayee.getBOPLossRentalValueLandlordDesignatedPayeeDetail();

	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPLossRentalValueLandlordDesignatedPayeeDetailList){
		for(BOPLossRentalValueLandlordDesignatedPayeeDetail BOPLossRentalValueLandlordDesignatedPayeeDetail:BOPLossRentalValueLandlordDesignatedPayeeDetailList){
			BOPLossRentalValueLandlordDesignatedPayeeDetailRule = new com.nest.res.bop.rules.BOPLossRentalValueLandlordDesignatedPayeeDetail(BOPLossRentalValueLandlordDesignatedPayeeDetail);
			BOPLossRentalValueLandlordDesignatedPayeeDetailRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	
	
	
	
	


	
}