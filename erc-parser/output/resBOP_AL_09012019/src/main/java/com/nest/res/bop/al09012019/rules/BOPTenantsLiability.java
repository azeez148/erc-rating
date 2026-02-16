package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPTenantsLiability  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPTenantsLiability BOPTenantsLiability;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPTenantsLiability.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPTenantsLiability.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPTenantsLiability.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPTenantsLiability.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TenantsLiabFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPTenantsLiability.getLimitInteger() >= MathHelper.getIntegerValue(50000.0)){
			this.BOPTenantsLiability.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPTenantsLiability.getLimitInteger()) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTenantsLiability,"../FinalBuildingRate"))) * this.BOPTenantsLiability.getFactor())) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTenantsLiability,"../../../IRPMFactor"))))));
		}
		else{
			this.BOPTenantsLiability.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPTenantsLiability (com.nest.res.bop.al09012019.domain.BOPTenantsLiability BOPTenantsLiability)  {
	  this.BOPTenantsLiability = BOPTenantsLiability;

	  
	}
	public void Premium ()  {
	  
		if(this.BOPTenantsLiability.getLimitInteger() >= MathHelper.getIntegerValue(50000.0)){
			this.BOPTenantsLiability.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPTenantsLiability.getLimitInteger()) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTenantsLiability,"../FinalBuildingRate"))) * this.BOPTenantsLiability.getFactor())) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTenantsLiability,"../../../IRPMFactor"))))));
		}
		else{
			this.BOPTenantsLiability.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}