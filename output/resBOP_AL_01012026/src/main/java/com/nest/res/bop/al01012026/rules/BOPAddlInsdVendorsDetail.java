package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdVendorsDetail  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdVendorsDetail BOPAddlInsdVendorsDetail;
	
	
	
	public void Premium ()  {
	  this.BOPAddlInsdVendorsDetail.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdVendorsDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdVendorsDetail,"../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdVendorsDetail.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdVendorsDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdVendorsDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPAddlInsdVendorsDetail (com.nest.res.bop.al01012026.domain.BOPAddlInsdVendorsDetail BOPAddlInsdVendorsDetail)  {
	  this.BOPAddlInsdVendorsDetail = BOPAddlInsdVendorsDetail;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdVendorsDetail.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdVendorsDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdVendorsDetail,"../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}