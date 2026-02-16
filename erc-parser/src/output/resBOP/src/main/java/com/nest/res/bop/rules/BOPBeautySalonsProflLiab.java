package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBeautySalonsProflLiab  {

	
	
	
	private com.nest.res.bop.domain.BOPBeautySalonsProflLiab BOPBeautySalonsProflLiab;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPBeautySalonsProflLiab (com.nest.res.bop.domain.BOPBeautySalonsProflLiab BOPBeautySalonsProflLiab)  {
	  this.BOPBeautySalonsProflLiab = BOPBeautySalonsProflLiab;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBeautySalonsProflLiab.getPremium() != (double)0.0){
			this.BOPBeautySalonsProflLiab.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPBeautySalonsProflLiab.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPBeautySalonsProflLiab.setPremium(MathHelper.roundUpDoller(this.BOPBeautySalonsProflLiab.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBeautySalonsProflLiab,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}