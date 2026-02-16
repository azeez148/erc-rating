package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps  {

	
	
	
	private com.nest.res.bop.domain.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps;
	
	
	
	public  BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps (com.nest.res.bop.domain.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps)  {
	  this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps = BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps.getPremium() != (double)0.0){
			this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps.setPremium(MathHelper.roundUpDoller(this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}