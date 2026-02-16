package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPStructureACVCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPStructureACVCoverage BOPStructureACVCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPStructureACVCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ACVFactor",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPStructureACVCoverage.getPremium() != (double)0.0){
			this.BOPStructureACVCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPStructureACVCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPStructureACVCoverage (com.nest.res.bop.domain.BOPStructureACVCoverage BOPStructureACVCoverage)  {
	  this.BOPStructureACVCoverage = BOPStructureACVCoverage;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureACVCoverage,"../PctOwnerOccupied"))).equals((String)"10% or less")){
			this.BOPStructureACVCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureACVCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/Premium"))) * this.BOPStructureACVCoverage.getFactor()));
		}
		else{
			this.BOPStructureACVCoverage.setPremium((double)0.0);
		}
	  
	}
	
	
	
	
	


	
}