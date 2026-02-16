package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPFunctlBusnPrsnlPropValtnDetail;

public class BOPFunctlBusnPrsnlPropValtn  {

	
	
	
	private List<BOPFunctlBusnPrsnlPropValtnDetail> BOPFunctlBusnPrsnlPropValtnDetailList;
	private com.nest.res.bop.al09012019.domain.BOPFunctlBusnPrsnlPropValtn BOPFunctlBusnPrsnlPropValtn;
	private com.nest.res.bop.al09012019.rules.BOPFunctlBusnPrsnlPropValtnDetail BOPFunctlBusnPrsnlPropValtnDetailRule;
	
	
	
	public void ProcessPremium2_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	TotalLimit();
	
	Factor();
	
	FinalBusnPrsnlPropRate();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public  BOPFunctlBusnPrsnlPropValtn (com.nest.res.bop.al09012019.domain.BOPFunctlBusnPrsnlPropValtn BOPFunctlBusnPrsnlPropValtn)  {
	  this.BOPFunctlBusnPrsnlPropValtn = BOPFunctlBusnPrsnlPropValtn;
this.BOPFunctlBusnPrsnlPropValtnDetailList = BOPFunctlBusnPrsnlPropValtn.getBOPFunctlBusnPrsnlPropValtnDetail();

	  
	}
	public void FinalBusnPrsnlPropRate ()  {
	  this.BOPFunctlBusnPrsnlPropValtn.setFinalBusnPrsnlPropRate(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtn,"../FinalBusnPrsnlPropRate"))) * this.BOPFunctlBusnPrsnlPropValtn.getFactor()));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPFunctlBusnPrsnlPropValtn,"BOPFunctlBusnPrsnlPropValtnDetail") ){
			this.BOPFunctlBusnPrsnlPropValtn.setPremium(MathHelper.getDoubleValue(this.BOPFunctlBusnPrsnlPropValtn.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public void ProcessPremium1_CommonRatingSub1 ()  {
	  
	TotalLimit();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPFunctlBusnPrsnlPropValtn.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FunctlBusnPrsnlPropFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium2 () throws LookupException,NumberFormatException {
	  
	ProcessPremium2_CommonRatingSub1();
	
	if(null != BOPFunctlBusnPrsnlPropValtnDetailList){
		for(BOPFunctlBusnPrsnlPropValtnDetail BOPFunctlBusnPrsnlPropValtnDetail:BOPFunctlBusnPrsnlPropValtnDetailList){
			BOPFunctlBusnPrsnlPropValtnDetailRule = new com.nest.res.bop.al09012019.rules.BOPFunctlBusnPrsnlPropValtnDetail(BOPFunctlBusnPrsnlPropValtnDetail);
			BOPFunctlBusnPrsnlPropValtnDetailRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void TotalLimit ()  {
	  this.BOPFunctlBusnPrsnlPropValtn.setTotalLimit(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPFunctlBusnPrsnlPropValtn,"BOPFunctlBusnPrsnlPropValtnDetail") ){
			this.BOPFunctlBusnPrsnlPropValtn.setTotalLimit(MathHelper.getIntegerValue(this.BOPFunctlBusnPrsnlPropValtn.getTotalLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsLimit")))));
		}

	  
	}
	
	
	
	
	


	
}