package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdDesignatedPersonOrgDetail  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdDesignatedPersonOrgDetail BOPAddlInsdDesignatedPersonOrgDetail;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdDesignatedPersonOrgDetail.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdDesignatedPersonOrgDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdDesignatedPersonOrgDetail,"../../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdDesignatedPersonOrgDetail.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdDesignatedPersonOrgDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdDesignatedPersonOrgDetail,"../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPAddlInsdDesignatedPersonOrgDetail (com.nest.res.bop.al01012026.domain.BOPAddlInsdDesignatedPersonOrgDetail BOPAddlInsdDesignatedPersonOrgDetail)  {
	  this.BOPAddlInsdDesignatedPersonOrgDetail = BOPAddlInsdDesignatedPersonOrgDetail;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdDesignatedPersonOrgDetail.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdDesignatedPersonOrgDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdDesignatedPersonOrgDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}