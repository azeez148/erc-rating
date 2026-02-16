package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf (com.nest.res.bop.al09012019.domain.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf)  {
	  this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf = BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf.setPremium(MathHelper.roundUpDoller(this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf.setPremium(MathHelper.roundUpDoller(this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}