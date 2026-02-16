package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPFloodCov  {

	
	
	
	private com.nest.res.bop.domain.BOPFloodCov BOPFloodCov;
	
	
	
	public  BOPFloodCov (com.nest.res.bop.domain.BOPFloodCov BOPFloodCov)  {
	  this.BOPFloodCov = BOPFloodCov;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPFloodCov.setPremium(MathHelper.roundUpDoller(this.BOPFloodCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFloodCov,"../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPFloodCov.getPremium() != (double)0.0){
			this.BOPFloodCov.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPFloodCov.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}