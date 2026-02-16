package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPStructureBuildingCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPStructureBuildingCoverage BOPStructureBuildingCoverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPStructureBuildingCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPStructureBuildingCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPStructureBuildingCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPStructureBuildingCoverage (com.nest.res.bop.al09012019.domain.BOPStructureBuildingCoverage BOPStructureBuildingCoverage)  {
	  this.BOPStructureBuildingCoverage = BOPStructureBuildingCoverage;

	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../BuildingLimit"))) > MathHelper.getIntegerValue(0.0)){
			this.BOPStructureBuildingCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPStructureBuildingCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPStructureBuildingCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../FinalBuildingRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../FunctlBldgFactor")))))));

	  
	}
	public void Premium ()  {
	  this.BOPStructureBuildingCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../FinalBuildingRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../FunctlBldgFactor")))))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}