package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPWindstormOrHailLossesRoofACV  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPWindstormOrHailLossesRoofACV BOPWindstormOrHailLossesRoofACV;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	WindstormOrHailLossesRoofACVFactor();
	
	finalBldgPremium_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void WindstormOrHailLossesRoofACVFactor () throws LookupException,NumberFormatException {
	  this.BOPWindstormOrHailLossesRoofACV.setWindstormOrHailLossesRoofACVFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindstormOrHailLossesRoofACVFactor",String.valueOf( "Y"))));

	  
	}
	public  BOPWindstormOrHailLossesRoofACV (com.nest.res.bop.al09012019.domain.BOPWindstormOrHailLossesRoofACV BOPWindstormOrHailLossesRoofACV)  {
	  this.BOPWindstormOrHailLossesRoofACV = BOPWindstormOrHailLossesRoofACV;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPWindstormOrHailLossesRoofACV.setPremium(MathHelper.roundUpDoller(this.BOPWindstormOrHailLossesRoofACV.getFinalBldgPremium_1() * (MathHelper.getDoubleValue(0.0) - (MathHelper.getDoubleValue(1.0) - this.BOPWindstormOrHailLossesRoofACV.getWindstormOrHailLossesRoofACVFactor()))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPWindstormOrHailLossesRoofACV.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPWindstormOrHailLossesRoofACV.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPWindstormOrHailLossesRoofACV.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPWindstormOrHailLossesRoofACV.setPremium(MathHelper.roundUpDoller(this.BOPWindstormOrHailLossesRoofACV.getFinalBldgPremium_1() * (MathHelper.getDoubleValue(0.0) - (MathHelper.getDoubleValue(1.0) - this.BOPWindstormOrHailLossesRoofACV.getWindstormOrHailLossesRoofACVFactor()))));

	  
	}
	public void finalBldgPremium_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPWindstormOrHailLossesRoofACV,"../BOPStructureBuildingCoverage/Premium")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPWindstormOrHailLossesRoofACV,"../BOPStructureBuildingCoverage/Premium"))) != 0.0){
			this.BOPWindstormOrHailLossesRoofACV.setFinalBldgPremium_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPWindstormOrHailLossesRoofACV,"../BOPStructureBuildingCoverage/Premium")))));
		}
		else{
			this.BOPWindstormOrHailLossesRoofACV.setFinalBldgPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}