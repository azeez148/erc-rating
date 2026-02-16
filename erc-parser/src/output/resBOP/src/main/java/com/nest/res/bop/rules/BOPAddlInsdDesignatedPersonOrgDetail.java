package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdDesignatedPersonOrgDetail  {

	
	
	
	private com.nest.res.bop.domain.BOPAddlInsdDesignatedPersonOrgDetail BOPAddlInsdDesignatedPersonOrgDetail;
	
	
	
	public void Premium ()  {
	  this.BOPAddlInsdDesignatedPersonOrgDetail.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdDesignatedPersonOrgDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdDesignatedPersonOrgDetail,"../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPAddlInsdDesignatedPersonOrgDetail (com.nest.res.bop.domain.BOPAddlInsdDesignatedPersonOrgDetail BOPAddlInsdDesignatedPersonOrgDetail)  {
	  this.BOPAddlInsdDesignatedPersonOrgDetail = BOPAddlInsdDesignatedPersonOrgDetail;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdDesignatedPersonOrgDetail.getPremium() != (double)0.0){
			this.BOPAddlInsdDesignatedPersonOrgDetail.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPAddlInsdDesignatedPersonOrgDetail.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}