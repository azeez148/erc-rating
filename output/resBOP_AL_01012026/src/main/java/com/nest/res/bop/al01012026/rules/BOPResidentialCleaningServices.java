package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPResidentialCleaningServices  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPResidentialCleaningServices BOPResidentialCleaningServices;
	
	
	
	public  BOPResidentialCleaningServices (com.nest.res.bop.al01012026.domain.BOPResidentialCleaningServices BOPResidentialCleaningServices)  {
	  this.BOPResidentialCleaningServices = BOPResidentialCleaningServices;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPResidentialCleaningServices.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPResidentialCleaningServices.getPremiumRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPResidentialCleaningServices,"../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPResidentialCleaningServices,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	PremiumRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumRate () throws LookupException,NumberFormatException {
	  this.BOPResidentialCleaningServices.setPremiumRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ResidentialCleaningServicesPremiumRate",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  this.BOPResidentialCleaningServices.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPResidentialCleaningServices.getPremiumRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPResidentialCleaningServices,"../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPResidentialCleaningServices,"../../../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPResidentialCleaningServices.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPResidentialCleaningServices.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPResidentialCleaningServices.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}