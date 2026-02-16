package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov  {

	
	
	
	private com.nest.res.bop.domain.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov;
	
	
	
	public  BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov (com.nest.res.bop.domain.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov)  {
	  this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov = BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov.getPremium() != (double)0.0){
			this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov.setPremium(MathHelper.roundUpDoller(this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}