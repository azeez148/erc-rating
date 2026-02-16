package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLiquorLiabCov  {

	
	
	
	private com.nest.res.bop.domain.BOPLiquorLiabCov BOPLiquorLiabCov;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPLiquorLiabCov.getPremium() != (double)0.0){
			this.BOPLiquorLiabCov.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPLiquorLiabCov.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPLiquorLiabCov (com.nest.res.bop.domain.BOPLiquorLiabCov BOPLiquorLiabCov)  {
	  this.BOPLiquorLiabCov = BOPLiquorLiabCov;

	  
	}
	public void Premium ()  {
	  this.BOPLiquorLiabCov.setPremium(MathHelper.roundUpDoller(this.BOPLiquorLiabCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLiquorLiabCov,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}