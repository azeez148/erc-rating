package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBeautySalonsProflLiab  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPBeautySalonsProflLiab BOPBeautySalonsProflLiab;
	
	
	
	public  BOPBeautySalonsProflLiab (com.nest.res.bop.al09012019.domain.BOPBeautySalonsProflLiab BOPBeautySalonsProflLiab)  {
	  this.BOPBeautySalonsProflLiab = BOPBeautySalonsProflLiab;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBeautySalonsProflLiab.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPBeautySalonsProflLiab.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBeautySalonsProflLiab.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPBeautySalonsProflLiab.setPremium(MathHelper.roundUpDoller(this.BOPBeautySalonsProflLiab.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBeautySalonsProflLiab,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPBeautySalonsProflLiab.setPremium(MathHelper.roundUpDoller(this.BOPBeautySalonsProflLiab.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBeautySalonsProflLiab,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}