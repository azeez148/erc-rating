package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPFuneralDirectorsProflLiab  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPFuneralDirectorsProflLiab BOPFuneralDirectorsProflLiab;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPFuneralDirectorsProflLiab.setPremium(MathHelper.roundUpDoller(this.BOPFuneralDirectorsProflLiab.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFuneralDirectorsProflLiab,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPFuneralDirectorsProflLiab (com.nest.res.bop.al01012026.domain.BOPFuneralDirectorsProflLiab BOPFuneralDirectorsProflLiab)  {
	  this.BOPFuneralDirectorsProflLiab = BOPFuneralDirectorsProflLiab;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPFuneralDirectorsProflLiab.setPremium(MathHelper.roundUpDoller(this.BOPFuneralDirectorsProflLiab.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFuneralDirectorsProflLiab,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPFuneralDirectorsProflLiab.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPFuneralDirectorsProflLiab.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPFuneralDirectorsProflLiab.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}