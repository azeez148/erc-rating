package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBarbersBeauticiansProflLiab  {

	
	
	
	private com.nest.res.bop.domain.BOPBarbersBeauticiansProflLiab BOPBarbersBeauticiansProflLiab;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBarbersBeauticiansProflLiab.getPremium() != (double)0.0){
			this.BOPBarbersBeauticiansProflLiab.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPBarbersBeauticiansProflLiab.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPBarbersBeauticiansProflLiab.setPremium(MathHelper.roundUpDoller(this.BOPBarbersBeauticiansProflLiab.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBarbersBeauticiansProflLiab,"../IRPMFactor")))));

	  
	}
	public  BOPBarbersBeauticiansProflLiab (com.nest.res.bop.domain.BOPBarbersBeauticiansProflLiab BOPBarbersBeauticiansProflLiab)  {
	  this.BOPBarbersBeauticiansProflLiab = BOPBarbersBeauticiansProflLiab;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}