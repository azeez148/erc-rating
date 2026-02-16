package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPStructureBuildingCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPStructureBuildingCoverage BOPStructureBuildingCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPStructureBuildingCoverage (com.nest.res.bop.domain.BOPStructureBuildingCoverage BOPStructureBuildingCoverage)  {
	  this.BOPStructureBuildingCoverage = BOPStructureBuildingCoverage;

	  
	}
	public void Premium ()  {
	  this.BOPStructureBuildingCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../BuildingLimit"))) / (double)100.0) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../FinalBuildingRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../FunctlBldgFactor")))))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPStructureBuildingCoverage.getPremium() != (double)0.0){
			this.BOPStructureBuildingCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPStructureBuildingCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}