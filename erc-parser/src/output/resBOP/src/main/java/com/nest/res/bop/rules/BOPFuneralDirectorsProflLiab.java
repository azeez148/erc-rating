package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPFuneralDirectorsProflLiab  {

	
	
	
	private com.nest.res.bop.domain.BOPFuneralDirectorsProflLiab BOPFuneralDirectorsProflLiab;
	
	
	
	public  BOPFuneralDirectorsProflLiab (com.nest.res.bop.domain.BOPFuneralDirectorsProflLiab BOPFuneralDirectorsProflLiab)  {
	  this.BOPFuneralDirectorsProflLiab = BOPFuneralDirectorsProflLiab;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPFuneralDirectorsProflLiab.setPremium(MathHelper.roundUpDoller(this.BOPFuneralDirectorsProflLiab.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFuneralDirectorsProflLiab,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPFuneralDirectorsProflLiab.getPremium() != (double)0.0){
			this.BOPFuneralDirectorsProflLiab.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPFuneralDirectorsProflLiab.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}