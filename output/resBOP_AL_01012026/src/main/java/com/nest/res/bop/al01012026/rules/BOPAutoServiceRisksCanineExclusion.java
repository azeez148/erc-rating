package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAutoServiceRisksCanineExclusion  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAutoServiceRisksCanineExclusion BOPAutoServiceRisksCanineExclusion;
	
	
	
	public void Premium ()  {
	  this.BOPAutoServiceRisksCanineExclusion.setPremium(MathHelper.roundUpDoller(this.BOPAutoServiceRisksCanineExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceRisksCanineExclusion,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAutoServiceRisksCanineExclusion.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAutoServiceRisksCanineExclusion.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceRisksCanineExclusion.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPAutoServiceRisksCanineExclusion (com.nest.res.bop.al01012026.domain.BOPAutoServiceRisksCanineExclusion BOPAutoServiceRisksCanineExclusion)  {
	  this.BOPAutoServiceRisksCanineExclusion = BOPAutoServiceRisksCanineExclusion;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAutoServiceRisksCanineExclusion.setPremium(MathHelper.roundUpDoller(this.BOPAutoServiceRisksCanineExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceRisksCanineExclusion,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}