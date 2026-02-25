package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclDesignatedWork  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclDesignatedWork BOPExclDesignatedWork;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclDesignatedWork.setPremium(MathHelper.roundUpDoller(this.BOPExclDesignatedWork.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclDesignatedWork,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclDesignatedWork.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclDesignatedWork.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclDesignatedWork.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPExclDesignatedWork (com.nest.res.bop.al01012026.domain.BOPExclDesignatedWork BOPExclDesignatedWork)  {
	  this.BOPExclDesignatedWork = BOPExclDesignatedWork;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPExclDesignatedWork.setPremium(MathHelper.roundUpDoller(this.BOPExclDesignatedWork.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclDesignatedWork,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}