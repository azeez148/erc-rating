package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPAddlInsdGrantorOfLicensesDetail;

public class BOPAddlInsdGrantorOfLicenses  {

	
	
	
	private List<BOPAddlInsdGrantorOfLicensesDetail> BOPAddlInsdGrantorOfLicensesDetailList;
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdGrantorOfLicenses BOPAddlInsdGrantorOfLicenses;
	
	
	
	public void Premium ()  {
	  this.BOPAddlInsdGrantorOfLicenses.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdGrantorOfLicenses.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdGrantorOfLicenses,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdGrantorOfLicenses.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdGrantorOfLicenses.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdGrantorOfLicenses.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdGrantorOfLicenses.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdGrantorOfLicenses.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdGrantorOfLicenses,"../IRPMFactor")))));

	  
	}
	public  BOPAddlInsdGrantorOfLicenses (com.nest.res.bop.al01012026.domain.BOPAddlInsdGrantorOfLicenses BOPAddlInsdGrantorOfLicenses)  {
	  this.BOPAddlInsdGrantorOfLicenses = BOPAddlInsdGrantorOfLicenses;
this.BOPAddlInsdGrantorOfLicensesDetailList = BOPAddlInsdGrantorOfLicenses.getBOPAddlInsdGrantorOfLicensesDetail();

	  
	}
	
	
	
	
	


	
}