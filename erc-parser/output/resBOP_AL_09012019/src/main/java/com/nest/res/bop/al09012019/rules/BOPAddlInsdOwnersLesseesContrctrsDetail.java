package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdOwnersLesseesContrctrsDetail  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPAddlInsdOwnersLesseesContrctrsDetail BOPAddlInsdOwnersLesseesContrctrsDetail;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdOwnersLesseesContrctrsDetail.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdOwnersLesseesContrctrsDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdOwnersLesseesContrctrsDetail,"../../../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdOwnersLesseesContrctrsDetail.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdOwnersLesseesContrctrsDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdOwnersLesseesContrctrsDetail,"../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdOwnersLesseesContrctrsDetail.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdOwnersLesseesContrctrsDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdOwnersLesseesContrctrsDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPAddlInsdOwnersLesseesContrctrsDetail (com.nest.res.bop.al09012019.domain.BOPAddlInsdOwnersLesseesContrctrsDetail BOPAddlInsdOwnersLesseesContrctrsDetail)  {
	  this.BOPAddlInsdOwnersLesseesContrctrsDetail = BOPAddlInsdOwnersLesseesContrctrsDetail;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}