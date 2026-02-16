package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdOwnersLesseesContrctrsDetail  {

	
	
	
	private com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesContrctrsDetail BOPAddlInsdOwnersLesseesContrctrsDetail;
	
	
	
	public void Premium ()  {
	  this.BOPAddlInsdOwnersLesseesContrctrsDetail.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdOwnersLesseesContrctrsDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdOwnersLesseesContrctrsDetail,"../../../IRPMFactor")))));

	  
	}
	public  BOPAddlInsdOwnersLesseesContrctrsDetail (com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesContrctrsDetail BOPAddlInsdOwnersLesseesContrctrsDetail)  {
	  this.BOPAddlInsdOwnersLesseesContrctrsDetail = BOPAddlInsdOwnersLesseesContrctrsDetail;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdOwnersLesseesContrctrsDetail.getPremium() != (double)0.0){
			this.BOPAddlInsdOwnersLesseesContrctrsDetail.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPAddlInsdOwnersLesseesContrctrsDetail.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}