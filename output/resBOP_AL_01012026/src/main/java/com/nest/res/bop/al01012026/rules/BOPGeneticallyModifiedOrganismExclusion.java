package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPGeneticallyModifiedOrganismExclusion  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPGeneticallyModifiedOrganismExclusion BOPGeneticallyModifiedOrganismExclusion;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPGeneticallyModifiedOrganismExclusion.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPGeneticallyModifiedOrganismExclusion.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPGeneticallyModifiedOrganismExclusion.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPGeneticallyModifiedOrganismExclusion.setPremium(MathHelper.roundUpDoller(this.BOPGeneticallyModifiedOrganismExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPGeneticallyModifiedOrganismExclusion,"../IRPMFactor")))));

	  
	}
	public  BOPGeneticallyModifiedOrganismExclusion (com.nest.res.bop.al01012026.domain.BOPGeneticallyModifiedOrganismExclusion BOPGeneticallyModifiedOrganismExclusion)  {
	  this.BOPGeneticallyModifiedOrganismExclusion = BOPGeneticallyModifiedOrganismExclusion;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPGeneticallyModifiedOrganismExclusion.setPremium(MathHelper.roundUpDoller(this.BOPGeneticallyModifiedOrganismExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPGeneticallyModifiedOrganismExclusion,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}