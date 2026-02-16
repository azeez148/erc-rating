package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPFunctlBusnPrsnlPropValtnDetail;

public class BOPFunctlBusnPrsnlPropValtn  {

	
	
	
	private List<BOPFunctlBusnPrsnlPropValtnDetail> BOPFunctlBusnPrsnlPropValtnDetailList;
	private com.nest.res.bop.domain.BOPFunctlBusnPrsnlPropValtn BOPFunctlBusnPrsnlPropValtn;
	private com.nest.res.bop.rules.BOPFunctlBusnPrsnlPropValtnDetail BOPFunctlBusnPrsnlPropValtnDetailRule;
	
	
	
	public void ProcessPremium2 () throws LookupException,NumberFormatException {
	  
	ProcessPremium2_CommonRatingSub1();
	
	if(null != BOPFunctlBusnPrsnlPropValtnDetailList){
		for(BOPFunctlBusnPrsnlPropValtnDetail BOPFunctlBusnPrsnlPropValtnDetail:BOPFunctlBusnPrsnlPropValtnDetailList){
			BOPFunctlBusnPrsnlPropValtnDetailRule = new com.nest.res.bop.rules.BOPFunctlBusnPrsnlPropValtnDetail(BOPFunctlBusnPrsnlPropValtnDetail);
			BOPFunctlBusnPrsnlPropValtnDetailRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	public void FinalBusnPrsnlPropRate ()  {
	  this.BOPFunctlBusnPrsnlPropValtn.setFinalBusnPrsnlPropRate(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtn,"../FinalBusnPrsnlPropRate"))) * this.BOPFunctlBusnPrsnlPropValtn.getFactor()));

	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPFunctlBusnPrsnlPropValtnDetailList != null && this.BOPFunctlBusnPrsnlPropValtnDetailList.size() > 0){
			for(com.nest.res.bop.domain.BOPFunctlBusnPrsnlPropValtnDetail BOPFunctlBusnPrsnlPropValtnDetail : BOPFunctlBusnPrsnlPropValtnDetailList) {
				finalPremium = finalPremium + BOPFunctlBusnPrsnlPropValtnDetail.getPremium();
			}
		}
this.BOPFunctlBusnPrsnlPropValtn.setPremium(finalPremium) ;
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPFunctlBusnPrsnlPropValtn.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FunctlBusnPrsnlPropFactor",String.valueOf( "Y"))));

	  
	}
	public  BOPFunctlBusnPrsnlPropValtn (com.nest.res.bop.domain.BOPFunctlBusnPrsnlPropValtn BOPFunctlBusnPrsnlPropValtn)  {
	  this.BOPFunctlBusnPrsnlPropValtn = BOPFunctlBusnPrsnlPropValtn;
this.BOPFunctlBusnPrsnlPropValtnDetailList = BOPFunctlBusnPrsnlPropValtn.getBOPFunctlBusnPrsnlPropValtnDetail();

	  
	}
	public void ProcessPremium2_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	TotalLimit();
	
	Factor();
	
	FinalBusnPrsnlPropRate();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void ProcessPremium1_CommonRatingSub1 ()  {
	  
	TotalLimit();
	
	  
	}
	public void TotalLimit ()  {
	  this.BOPFunctlBusnPrsnlPropValtn.setTotalLimit((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPFunctlBusnPrsnlPropValtn,"BOPFunctlBusnPrsnlPropValtnDetail") ){
			this.BOPFunctlBusnPrsnlPropValtn.setTotalLimit(this.BOPFunctlBusnPrsnlPropValtn.getTotalLimit()+this.BOPFunctlBusnPrsnlPropValtn.getTotalLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsLimit"))));
		}

	  
	}
	
	
	
	
	


	
}