package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPPhotographyMakeupAndHairstyling  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPPhotographyMakeupAndHairstyling BOPPhotographyMakeupAndHairstyling;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPPhotographyMakeupAndHairstyling.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPPhotographyMakeupAndHairstyling.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPPhotographyMakeupAndHairstyling.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPPhotographyMakeupAndHairstyling.setPremium(MathHelper.roundUpDoller(this.BOPPhotographyMakeupAndHairstyling.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotographyMakeupAndHairstyling,"../IRPMFactor")))));

	  
	}
	public  BOPPhotographyMakeupAndHairstyling (com.nest.res.bop.al01012026.domain.BOPPhotographyMakeupAndHairstyling BOPPhotographyMakeupAndHairstyling)  {
	  this.BOPPhotographyMakeupAndHairstyling = BOPPhotographyMakeupAndHairstyling;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPPhotographyMakeupAndHairstyling.setPremium(MathHelper.roundUpDoller(this.BOPPhotographyMakeupAndHairstyling.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotographyMakeupAndHairstyling,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}