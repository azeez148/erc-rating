package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage;
	
	
	
	public  BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage (com.nest.res.bop.al01012026.domain.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage)  {
	  this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage = BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage.setPremium(MathHelper.roundUpDoller(this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage.setPremium(MathHelper.roundUpDoller(this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCoverage,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}