package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPInformationSecurityProtectionEndorsementDetail;

public class BOPInformationSecurityProtectionEndorsement  {

	
	
	
	private com.nest.res.bop.rules.BOPInformationSecurityProtectionEndorsementDetail BOPInformationSecurityProtectionEndorsementDetailRule;
	private com.nest.res.bop.domain.BOPInformationSecurityProtectionEndorsement BOPInformationSecurityProtectionEndorsement;
	private List<BOPInformationSecurityProtectionEndorsementDetail> BOPInformationSecurityProtectionEndorsementDetailList;
	
	
	
	public  BOPInformationSecurityProtectionEndorsement (com.nest.res.bop.domain.BOPInformationSecurityProtectionEndorsement BOPInformationSecurityProtectionEndorsement)  {
	  this.BOPInformationSecurityProtectionEndorsement = BOPInformationSecurityProtectionEndorsement;
this.BOPInformationSecurityProtectionEndorsementDetailList = BOPInformationSecurityProtectionEndorsement.getBOPInformationSecurityProtectionEndorsementDetail();

	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPInformationSecurityProtectionEndorsementDetailList != null && this.BOPInformationSecurityProtectionEndorsementDetailList.size() > 0){
			for(com.nest.res.bop.domain.BOPInformationSecurityProtectionEndorsementDetail BOPInformationSecurityProtectionEndorsementDetail : BOPInformationSecurityProtectionEndorsementDetailList) {
				finalPremium = finalPremium + BOPInformationSecurityProtectionEndorsementDetail.getPremium();
			}
		}
this.BOPInformationSecurityProtectionEndorsement.setPremium(finalPremium) ;
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPInformationSecurityProtectionEndorsementDetailList){
		for(BOPInformationSecurityProtectionEndorsementDetail BOPInformationSecurityProtectionEndorsementDetail:BOPInformationSecurityProtectionEndorsementDetailList){
			BOPInformationSecurityProtectionEndorsementDetailRule = new com.nest.res.bop.rules.BOPInformationSecurityProtectionEndorsementDetail(BOPInformationSecurityProtectionEndorsementDetail);
			BOPInformationSecurityProtectionEndorsementDetailRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	
	
	
	
	


	
}