package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPFunctlBusnPrsnlPropValtnDetail;

public class BOPFunctlBusnPrsnlPropValtn  {

	
	
	
	private List<BOPFunctlBusnPrsnlPropValtnDetail> BOPFunctlBusnPrsnlPropValtnDetailList;
	private com.nest.res.bop.al01012026.domain.BOPFunctlBusnPrsnlPropValtn BOPFunctlBusnPrsnlPropValtn;
	private com.nest.res.bop.al01012026.rules.BOPFunctlBusnPrsnlPropValtnDetail BOPFunctlBusnPrsnlPropValtnDetailRule;
	
	
	
	public void TotalNamedPerilsFunctlBusnPrsnlPropCovPremium ()  {
	  this.BOPFunctlBusnPrsnlPropValtn.setTotalNamedPerilsFunctlBusnPrsnlPropCovPremium(this.BOPFunctlBusnPrsnlPropValtn.getTotalNamedPerilsFunctlBusnPrsnlPropCovPremiumTemp_1());

	  
	}
	public void TotalFunctlBusnPrsnlPropValtnCovPremium ()  {
	  this.BOPFunctlBusnPrsnlPropValtn.setTotalFunctlBusnPrsnlPropValtnCovPremium(this.BOPFunctlBusnPrsnlPropValtn.getTotalFunctlBusnPrsnlPropValtnCovPremiumTemp_1());

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPFunctlBusnPrsnlPropValtn.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FunctlBusnPrsnlPropFactor",String.valueOf( "Y"))));

	  
	}
	public void totalLimitTemp_1 ()  {
	  this.BOPFunctlBusnPrsnlPropValtn.setTotalLimitTemp_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPFunctlBusnPrsnlPropValtn,"BOPFunctlBusnPrsnlPropValtnDetail") ){
			this.BOPFunctlBusnPrsnlPropValtn.setTotalLimitTemp_1(MathHelper.getIntegerValue(this.BOPFunctlBusnPrsnlPropValtn.getTotalLimitTemp_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsLimit")))));
		}

	  
	}
	public void FinalBusnPrsnlPropRate ()  {
	  this.BOPFunctlBusnPrsnlPropValtn.setFinalBusnPrsnlPropRate(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtn,"../FinalBusnPrsnlPropRate"))) * this.BOPFunctlBusnPrsnlPropValtn.getFactor()));

	  
	}
	public void totalFunctlBusnPrsnlPropValtnCovPremiumTemp_1 ()  {
	  this.BOPFunctlBusnPrsnlPropValtn.setTotalFunctlBusnPrsnlPropValtnCovPremiumTemp_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPFunctlBusnPrsnlPropValtn,"BOPFunctlBusnPrsnlPropValtnDetail/BOPFunctlBusnPrsnlPropValtnCoverage") ){
			this.BOPFunctlBusnPrsnlPropValtn.setTotalFunctlBusnPrsnlPropValtnCovPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPFunctlBusnPrsnlPropValtn.getTotalFunctlBusnPrsnlPropValtnCovPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public void ProcessPremium2_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	totalLimitTemp_1();
	
	TotalLimit();
	
	Factor();
	
	FinalBusnPrsnlPropRate();
	
	totalFunctlBusnPrsnlPropValtnCovPremiumTemp_1();
	
	TotalFunctlBusnPrsnlPropValtnCovPremium();
	
	totalNamedPerilsFunctlBusnPrsnlPropCovPremiumTemp_1();
	
	TotalNamedPerilsFunctlBusnPrsnlPropCovPremium();
	
	  
	}
	public void ProcessPremium1_CommonRatingSub1 ()  {
	  
	totalLimitTemp_1();
	
	TotalLimit();
	
	  
	}
	public void ProcessPremium2 () throws LookupException,NumberFormatException {
	  
	ProcessPremium2_CommonRatingSub1();
	
	if(null != BOPFunctlBusnPrsnlPropValtnDetailList){
		for(BOPFunctlBusnPrsnlPropValtnDetail BOPFunctlBusnPrsnlPropValtnDetail:BOPFunctlBusnPrsnlPropValtnDetailList){
			BOPFunctlBusnPrsnlPropValtnDetailRule = new com.nest.res.bop.al01012026.rules.BOPFunctlBusnPrsnlPropValtnDetail(BOPFunctlBusnPrsnlPropValtnDetail);
			BOPFunctlBusnPrsnlPropValtnDetailRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public  BOPFunctlBusnPrsnlPropValtn (com.nest.res.bop.al01012026.domain.BOPFunctlBusnPrsnlPropValtn BOPFunctlBusnPrsnlPropValtn)  {
	  this.BOPFunctlBusnPrsnlPropValtn = BOPFunctlBusnPrsnlPropValtn;
this.BOPFunctlBusnPrsnlPropValtnDetailList = BOPFunctlBusnPrsnlPropValtn.getBOPFunctlBusnPrsnlPropValtnDetail();

	  
	}
	public void TotalLimit ()  {
	  this.BOPFunctlBusnPrsnlPropValtn.setTotalLimit(this.BOPFunctlBusnPrsnlPropValtn.getTotalLimitTemp_1());

	  
	}
	public void totalNamedPerilsFunctlBusnPrsnlPropCovPremiumTemp_1 ()  {
	  this.BOPFunctlBusnPrsnlPropValtn.setTotalNamedPerilsFunctlBusnPrsnlPropCovPremiumTemp_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPFunctlBusnPrsnlPropValtn,"BOPFunctlBusnPrsnlPropValtnDetail/BOPNamedPerilsFunctlBusnPrsnlPropCoverage") ){
			this.BOPFunctlBusnPrsnlPropValtn.setTotalNamedPerilsFunctlBusnPrsnlPropCovPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPFunctlBusnPrsnlPropValtn.getTotalNamedPerilsFunctlBusnPrsnlPropCovPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPFunctlBusnPrsnlPropValtn,"BOPFunctlBusnPrsnlPropValtnDetail") ){
			this.BOPFunctlBusnPrsnlPropValtn.setPremium(MathHelper.getDoubleValue(this.BOPFunctlBusnPrsnlPropValtn.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	
	
	
	
	


	
}