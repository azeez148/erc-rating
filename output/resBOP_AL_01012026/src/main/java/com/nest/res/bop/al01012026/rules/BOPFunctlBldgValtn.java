package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPFunctlBldgValtnDetail;

public class BOPFunctlBldgValtn  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPFunctlBldgValtn BOPFunctlBldgValtn;
	private List<BOPFunctlBldgValtnDetail> BOPFunctlBldgValtnDetailList;
	private com.nest.res.bop.al01012026.rules.BOPFunctlBldgValtnDetail BOPFunctlBldgValtnDetailRule;
	
	
	
	public void FinalBuildingRate ()  {
	  this.BOPFunctlBldgValtn.setFinalBuildingRate(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBldgValtn,"../FinalBuildingRate"))) * this.BOPFunctlBldgValtn.getFactor()));

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	totalLimitTemp_1();
	
	TotalLimit();
	
	Factor();
	
	FinalBuildingRate();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPFunctlBldgValtn,"BOPFunctlBldgValtnDetail") ){
			this.BOPFunctlBldgValtn.setPremium(MathHelper.getDoubleValue(this.BOPFunctlBldgValtn.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPFunctlBldgValtnDetailList){
		for(BOPFunctlBldgValtnDetail BOPFunctlBldgValtnDetail:BOPFunctlBldgValtnDetailList){
			BOPFunctlBldgValtnDetailRule = new com.nest.res.bop.al01012026.rules.BOPFunctlBldgValtnDetail(BOPFunctlBldgValtnDetail);
			BOPFunctlBldgValtnDetailRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPFunctlBldgValtn.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FunctlBldgFactor",String.valueOf( "Y"))));

	  
	}
	public void TotalLimit ()  {
	  this.BOPFunctlBldgValtn.setTotalLimit(this.BOPFunctlBldgValtn.getTotalLimitTemp_1());

	  
	}
	public void totalLimitTemp_1 ()  {
	  this.BOPFunctlBldgValtn.setTotalLimitTemp_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPFunctlBldgValtn,"BOPFunctlBldgValtnDetail") ){
			this.BOPFunctlBldgValtn.setTotalLimitTemp_1(MathHelper.getIntegerValue(this.BOPFunctlBldgValtn.getTotalLimitTemp_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"LimitOfInsurance")))));
		}

	  
	}
	public  BOPFunctlBldgValtn (com.nest.res.bop.al01012026.domain.BOPFunctlBldgValtn BOPFunctlBldgValtn)  {
	  this.BOPFunctlBldgValtn = BOPFunctlBldgValtn;
this.BOPFunctlBldgValtnDetailList = BOPFunctlBldgValtn.getBOPFunctlBldgValtnDetail();

	  
	}
	
	
	
	
	


	
}