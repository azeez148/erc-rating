package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPInformationSecurityProtectionEndorsementDetail;

public class BOPInformationSecurityProtectionEndorsement  {

	
	
	
	private com.nest.res.bop.al09012019.rules.BOPInformationSecurityProtectionEndorsementDetail BOPInformationSecurityProtectionEndorsementDetailRule;
	private com.nest.res.bop.al09012019.domain.BOPInformationSecurityProtectionEndorsement BOPInformationSecurityProtectionEndorsement;
	private List<BOPInformationSecurityProtectionEndorsementDetail> BOPInformationSecurityProtectionEndorsementDetailList;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPInformationSecurityProtectionEndorsement,"BOPInformationSecurityProtectionEndorsementDetail") ){
			this.BOPInformationSecurityProtectionEndorsement.setPremium(MathHelper.getDoubleValue(this.BOPInformationSecurityProtectionEndorsement.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public  BOPInformationSecurityProtectionEndorsement (com.nest.res.bop.al09012019.domain.BOPInformationSecurityProtectionEndorsement BOPInformationSecurityProtectionEndorsement)  {
	  this.BOPInformationSecurityProtectionEndorsement = BOPInformationSecurityProtectionEndorsement;
this.BOPInformationSecurityProtectionEndorsementDetailList = BOPInformationSecurityProtectionEndorsement.getBOPInformationSecurityProtectionEndorsementDetail();

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPInformationSecurityProtectionEndorsementDetailList){
		for(BOPInformationSecurityProtectionEndorsementDetail BOPInformationSecurityProtectionEndorsementDetail:BOPInformationSecurityProtectionEndorsementDetailList){
			BOPInformationSecurityProtectionEndorsementDetailRule = new com.nest.res.bop.al09012019.rules.BOPInformationSecurityProtectionEndorsementDetail(BOPInformationSecurityProtectionEndorsementDetail);
			BOPInformationSecurityProtectionEndorsementDetailRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}