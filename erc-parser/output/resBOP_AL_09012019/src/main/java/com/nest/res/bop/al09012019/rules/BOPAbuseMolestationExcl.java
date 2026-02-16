package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAbuseMolestationExcl  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPAbuseMolestationExcl BOPAbuseMolestationExcl;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAbuseMolestationExcl.setPremium(MathHelper.roundUpDoller(this.BOPAbuseMolestationExcl.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAbuseMolestationExcl,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPAbuseMolestationExcl.setPremium(MathHelper.roundUpDoller(this.BOPAbuseMolestationExcl.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAbuseMolestationExcl,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAbuseMolestationExcl.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAbuseMolestationExcl.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAbuseMolestationExcl.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPAbuseMolestationExcl (com.nest.res.bop.al09012019.domain.BOPAbuseMolestationExcl BOPAbuseMolestationExcl)  {
	  this.BOPAbuseMolestationExcl = BOPAbuseMolestationExcl;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}