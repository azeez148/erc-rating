package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPWindstormOrHailLossesRoofACV  {

	
	
	
	private com.nest.res.bop.domain.BOPWindstormOrHailLossesRoofACV BOPWindstormOrHailLossesRoofACV;
	
	
	
	public void WindstormOrHailLossesRoofACVFactor () throws LookupException,NumberFormatException {
	  this.BOPWindstormOrHailLossesRoofACV.setWindstormOrHailLossesRoofACVFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindstormOrHailLossesRoofACVFactor",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  this.BOPWindstormOrHailLossesRoofACV.setPremium(MathHelper.roundUpDoller(this.BOPWindstormOrHailLossesRoofACV.getFinalBldgPremium_1() * ((double)0.0 - ((double)1.0 - this.BOPWindstormOrHailLossesRoofACV.getWindstormOrHailLossesRoofACVFactor()))));

	  
	}
	public void finalBldgPremium_1 ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPWindstormOrHailLossesRoofACV,"../BOPStructureBuildingCoverage/Premium"))) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPWindstormOrHailLossesRoofACV,"../BOPStructureBuildingCoverage/Premium"))) != 0.0){
			this.BOPWindstormOrHailLossesRoofACV.setFinalBldgPremium_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPWindstormOrHailLossesRoofACV,"../BOPStructureBuildingCoverage/Premium"))));
		}
		else{
			this.BOPWindstormOrHailLossesRoofACV.setFinalBldgPremium_1((double)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	WindstormOrHailLossesRoofACVFactor();
	
	finalBldgPremium_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPWindstormOrHailLossesRoofACV (com.nest.res.bop.domain.BOPWindstormOrHailLossesRoofACV BOPWindstormOrHailLossesRoofACV)  {
	  this.BOPWindstormOrHailLossesRoofACV = BOPWindstormOrHailLossesRoofACV;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPWindstormOrHailLossesRoofACV.getPremium() != (double)0.0){
			this.BOPWindstormOrHailLossesRoofACV.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPWindstormOrHailLossesRoofACV.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}