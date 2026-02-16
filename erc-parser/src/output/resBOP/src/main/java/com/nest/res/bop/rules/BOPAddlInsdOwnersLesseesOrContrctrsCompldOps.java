package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdOwnersLesseesOrContrctrsCompldOps  {

	
	
	
	private com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps BOPAddlInsdOwnersLesseesOrContrctrsCompldOps;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps.getPremium() != (double)0.0){
			this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps,"../IRPMFactor")))));

	  
	}
	public  BOPAddlInsdOwnersLesseesOrContrctrsCompldOps (com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps BOPAddlInsdOwnersLesseesOrContrctrsCompldOps)  {
	  this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps = BOPAddlInsdOwnersLesseesOrContrctrsCompldOps;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}