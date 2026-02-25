package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAmendmentLiquorLiabExclExcptnDetail  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAmendmentLiquorLiabExclExcptnDetail BOPAmendmentLiquorLiabExclExcptnDetail;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPAmendmentLiquorLiabExclExcptnDetail (com.nest.res.bop.al01012026.domain.BOPAmendmentLiquorLiabExclExcptnDetail BOPAmendmentLiquorLiabExclExcptnDetail)  {
	  this.BOPAmendmentLiquorLiabExclExcptnDetail = BOPAmendmentLiquorLiabExclExcptnDetail;

	  
	}
	public void Premium ()  {
	  this.BOPAmendmentLiquorLiabExclExcptnDetail.setPremium(MathHelper.roundUpDoller(this.BOPAmendmentLiquorLiabExclExcptnDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAmendmentLiquorLiabExclExcptnDetail,"../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAmendmentLiquorLiabExclExcptnDetail.setPremium(MathHelper.roundUpDoller(this.BOPAmendmentLiquorLiabExclExcptnDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAmendmentLiquorLiabExclExcptnDetail,"../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAmendmentLiquorLiabExclExcptnDetail.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAmendmentLiquorLiabExclExcptnDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAmendmentLiquorLiabExclExcptnDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}