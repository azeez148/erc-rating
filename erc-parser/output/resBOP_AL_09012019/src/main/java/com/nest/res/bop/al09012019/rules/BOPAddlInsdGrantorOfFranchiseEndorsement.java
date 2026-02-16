package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdGrantorOfFranchiseEndorsement  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPAddlInsdGrantorOfFranchiseEndorsement BOPAddlInsdGrantorOfFranchiseEndorsement;
	
	
	
	public  BOPAddlInsdGrantorOfFranchiseEndorsement (com.nest.res.bop.al09012019.domain.BOPAddlInsdGrantorOfFranchiseEndorsement BOPAddlInsdGrantorOfFranchiseEndorsement)  {
	  this.BOPAddlInsdGrantorOfFranchiseEndorsement = BOPAddlInsdGrantorOfFranchiseEndorsement;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdGrantorOfFranchiseEndorsement.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdGrantorOfFranchiseEndorsement.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdGrantorOfFranchiseEndorsement,"../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdGrantorOfFranchiseEndorsement.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdGrantorOfFranchiseEndorsement.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdGrantorOfFranchiseEndorsement,"../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdGrantorOfFranchiseEndorsement.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdGrantorOfFranchiseEndorsement.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdGrantorOfFranchiseEndorsement.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}