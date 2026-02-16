package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAmendmentLiquorLiabExclExcptnDetail  {

	
	
	
	private com.nest.res.bop.domain.BOPAmendmentLiquorLiabExclExcptnDetail BOPAmendmentLiquorLiabExclExcptnDetail;
	
	
	
	public void Premium ()  {
	  this.BOPAmendmentLiquorLiabExclExcptnDetail.setPremium(MathHelper.roundUpDoller(this.BOPAmendmentLiquorLiabExclExcptnDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAmendmentLiquorLiabExclExcptnDetail,"../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAmendmentLiquorLiabExclExcptnDetail.getPremium() != (double)0.0){
			this.BOPAmendmentLiquorLiabExclExcptnDetail.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPAmendmentLiquorLiabExclExcptnDetail.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPAmendmentLiquorLiabExclExcptnDetail (com.nest.res.bop.domain.BOPAmendmentLiquorLiabExclExcptnDetail BOPAmendmentLiquorLiabExclExcptnDetail)  {
	  this.BOPAmendmentLiquorLiabExclExcptnDetail = BOPAmendmentLiquorLiabExclExcptnDetail;

	  
	}
	
	
	
	
	


	
}