package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclDesignatedWork  {

	
	
	
	private com.nest.res.bop.domain.BOPExclDesignatedWork BOPExclDesignatedWork;
	
	
	
	public  BOPExclDesignatedWork (com.nest.res.bop.domain.BOPExclDesignatedWork BOPExclDesignatedWork)  {
	  this.BOPExclDesignatedWork = BOPExclDesignatedWork;

	  
	}
	public void Premium ()  {
	  this.BOPExclDesignatedWork.setPremium(MathHelper.roundUpDoller(this.BOPExclDesignatedWork.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclDesignatedWork,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclDesignatedWork.getPremium() != (double)0.0){
			this.BOPExclDesignatedWork.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPExclDesignatedWork.setPremiumIndicator((int)0.0);
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