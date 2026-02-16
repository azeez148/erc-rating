package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPFloodCov  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPFloodCov BOPFloodCov;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPFloodCov.setPremium(MathHelper.roundUpDoller(this.BOPFloodCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFloodCov,"../../IRPMFactor")))));

	  
	}
	public  BOPFloodCov (com.nest.res.bop.al09012019.domain.BOPFloodCov BOPFloodCov)  {
	  this.BOPFloodCov = BOPFloodCov;

	  
	}
	public void Premium ()  {
	  this.BOPFloodCov.setPremium(MathHelper.roundUpDoller(this.BOPFloodCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFloodCov,"../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPFloodCov.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPFloodCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPFloodCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}