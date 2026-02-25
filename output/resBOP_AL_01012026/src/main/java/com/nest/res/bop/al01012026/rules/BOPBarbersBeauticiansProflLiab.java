package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBarbersBeauticiansProflLiab  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPBarbersBeauticiansProflLiab BOPBarbersBeauticiansProflLiab;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPBarbersBeauticiansProflLiab.setPremium(MathHelper.roundUpDoller(this.BOPBarbersBeauticiansProflLiab.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBarbersBeauticiansProflLiab,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBarbersBeauticiansProflLiab.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPBarbersBeauticiansProflLiab.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBarbersBeauticiansProflLiab.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPBarbersBeauticiansProflLiab (com.nest.res.bop.al01012026.domain.BOPBarbersBeauticiansProflLiab BOPBarbersBeauticiansProflLiab)  {
	  this.BOPBarbersBeauticiansProflLiab = BOPBarbersBeauticiansProflLiab;

	  
	}
	public void Premium ()  {
	  this.BOPBarbersBeauticiansProflLiab.setPremium(MathHelper.roundUpDoller(this.BOPBarbersBeauticiansProflLiab.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBarbersBeauticiansProflLiab,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}