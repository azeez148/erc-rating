package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLiquorLiabCov  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPLiquorLiabCov BOPLiquorLiabCov;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPLiquorLiabCov.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLiquorLiabCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLiquorLiabCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPLiquorLiabCov (com.nest.res.bop.al09012019.domain.BOPLiquorLiabCov BOPLiquorLiabCov)  {
	  this.BOPLiquorLiabCov = BOPLiquorLiabCov;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPLiquorLiabCov.setPremium(MathHelper.roundUpDoller(this.BOPLiquorLiabCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLiquorLiabCov,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLiquorLiabCov.setPremium(MathHelper.roundUpDoller(this.BOPLiquorLiabCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLiquorLiabCov,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}