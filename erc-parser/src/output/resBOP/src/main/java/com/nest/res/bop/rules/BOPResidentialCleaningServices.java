package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPResidentialCleaningServices  {

	
	
	
	private com.nest.res.bop.domain.BOPResidentialCleaningServices BOPResidentialCleaningServices;
	
	
	
	public void Premium ()  {
	  this.BOPResidentialCleaningServices.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPResidentialCleaningServices.getPremiumRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPResidentialCleaningServices,"../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPResidentialCleaningServices,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumRate () throws LookupException,NumberFormatException {
	  this.BOPResidentialCleaningServices.setPremiumRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ResidentialCleaningServicesPremiumRate",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	PremiumRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPResidentialCleaningServices (com.nest.res.bop.domain.BOPResidentialCleaningServices BOPResidentialCleaningServices)  {
	  this.BOPResidentialCleaningServices = BOPResidentialCleaningServices;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPResidentialCleaningServices.getPremium() != (double)0.0){
			this.BOPResidentialCleaningServices.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPResidentialCleaningServices.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}