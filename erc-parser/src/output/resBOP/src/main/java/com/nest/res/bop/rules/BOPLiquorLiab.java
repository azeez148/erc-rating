package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLiquorLiab  {

	
	
	
	private com.nest.res.bop.domain.BOPLiquorLiab BOPLiquorLiab;
	
	
	
	public  BOPLiquorLiab (com.nest.res.bop.domain.BOPLiquorLiab BOPLiquorLiab)  {
	  this.BOPLiquorLiab = BOPLiquorLiab;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLiquorLiab.getPremium() != (double)0.0){
			this.BOPLiquorLiab.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPLiquorLiab.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPLiquorLiab.setPremium(MathHelper.roundUpDoller(this.BOPLiquorLiab.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLiquorLiab,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}