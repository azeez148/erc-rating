package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLiquorLiab  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPLiquorLiab BOPLiquorLiab;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLiquorLiab.setPremium(MathHelper.roundUpDoller(this.BOPLiquorLiab.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLiquorLiab,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPLiquorLiab.setPremium(MathHelper.roundUpDoller(this.BOPLiquorLiab.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLiquorLiab,"../IRPMFactor")))));

	  
	}
	public  BOPLiquorLiab (com.nest.res.bop.al09012019.domain.BOPLiquorLiab BOPLiquorLiab)  {
	  this.BOPLiquorLiab = BOPLiquorLiab;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLiquorLiab.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLiquorLiab.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLiquorLiab.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}