package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPTenantsLiability  {

	
	
	
	private com.nest.res.bop.domain.BOPTenantsLiability BOPTenantsLiability;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPTenantsLiability (com.nest.res.bop.domain.BOPTenantsLiability BOPTenantsLiability)  {
	  this.BOPTenantsLiability = BOPTenantsLiability;

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPTenantsLiability.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TenantsLiabFactor",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(this.BOPTenantsLiability.getLimitInteger() >= (int)50000.0){
			this.BOPTenantsLiability.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(((double)this.BOPTenantsLiability.getLimitInteger() / (double)100.0) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTenantsLiability,"../FinalBuildingRate"))) * this.BOPTenantsLiability.getFactor())) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTenantsLiability,"../../../IRPMFactor")))));
		}
		else{
			this.BOPTenantsLiability.setPremium((double)0.0);
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPTenantsLiability.getPremium() != (double)0.0){
			this.BOPTenantsLiability.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPTenantsLiability.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}