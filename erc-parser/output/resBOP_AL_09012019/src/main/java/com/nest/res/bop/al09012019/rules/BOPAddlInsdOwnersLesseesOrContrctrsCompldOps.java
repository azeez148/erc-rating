package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPAddlInsdOwnersLesseesOrContrctrsCompldOpsDetail;

public class BOPAddlInsdOwnersLesseesOrContrctrsCompldOps  {

	
	
	
	private List<BOPAddlInsdOwnersLesseesOrContrctrsCompldOpsDetail> BOPAddlInsdOwnersLesseesOrContrctrsCompldOpsDetailList;
	private com.nest.res.bop.al09012019.domain.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps BOPAddlInsdOwnersLesseesOrContrctrsCompldOps;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public  BOPAddlInsdOwnersLesseesOrContrctrsCompldOps (com.nest.res.bop.al09012019.domain.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps BOPAddlInsdOwnersLesseesOrContrctrsCompldOps)  {
	  this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps = BOPAddlInsdOwnersLesseesOrContrctrsCompldOps;
this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOpsDetailList = BOPAddlInsdOwnersLesseesOrContrctrsCompldOps.getBOPAddlInsdOwnersLesseesOrContrctrsCompldOpsDetail();

	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}