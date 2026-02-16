package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPStructureTenantsFireLiabCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPStructureTenantsFireLiabCoverage BOPStructureTenantsFireLiabCoverage;
	
	
	
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPStructureTenantsFireLiabCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TenantsFireLiabFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPStructureTenantsFireLiabCoverage (com.nest.res.bop.domain.BOPStructureTenantsFireLiabCoverage BOPStructureTenantsFireLiabCoverage)  {
	  this.BOPStructureTenantsFireLiabCoverage = BOPStructureTenantsFireLiabCoverage;

	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPStructureTenantsFireLiabCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("TenantsFireLiabInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  
		if(this.BOPStructureTenantsFireLiabCoverage.getDsLimit() <= this.BOPStructureTenantsFireLiabCoverage.getInclddLimit()){
			this.BOPStructureTenantsFireLiabCoverage.setPremium((double)0.0);
		}
		else{
			this.BOPStructureTenantsFireLiabCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureTenantsFireLiabCoverage,"../../../IRPMFactor"))) * MathHelper.roundUpDoller(((double)this.BOPStructureTenantsFireLiabCoverage.getDsLimit() - (double)this.BOPStructureTenantsFireLiabCoverage.getInclddLimit()) / (double)100.0 * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureTenantsFireLiabCoverage,"../FinalBuildingRate"))) * this.BOPStructureTenantsFireLiabCoverage.getFactor()))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPStructureTenantsFireLiabCoverage.getPremium() != (double)0.0){
			this.BOPStructureTenantsFireLiabCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPStructureTenantsFireLiabCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}