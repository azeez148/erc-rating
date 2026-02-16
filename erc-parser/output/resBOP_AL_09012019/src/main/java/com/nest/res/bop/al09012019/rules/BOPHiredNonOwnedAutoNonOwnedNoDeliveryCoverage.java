package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage,"../../CommercialAutoLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage,"../IncrLimitFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage,"../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage (com.nest.res.bop.al09012019.domain.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage)  {
	  this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage = BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NonownedAutoWithoutDeliveryRate",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage,"../BOPHiredNonOwnedAutoNonOwnedCoverage/LiabilityDeliveryCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage,"../../CommercialAutoLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage,"../IncrLimitFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage,"../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}