package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPVeterinariansProflLiab  {

	
	
	
	private com.nest.res.bop.domain.BOPVeterinariansProflLiab BOPVeterinariansProflLiab;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPVeterinariansProflLiab.getPremium() != (double)0.0){
			this.BOPVeterinariansProflLiab.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPVeterinariansProflLiab.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Charge () throws LookupException,NumberFormatException {
	  this.BOPVeterinariansProflLiab.setCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("VeterinariansCharge",String.valueOf( "Y"))));

	  
	}
	public  BOPVeterinariansProflLiab (com.nest.res.bop.domain.BOPVeterinariansProflLiab BOPVeterinariansProflLiab)  {
	  this.BOPVeterinariansProflLiab = BOPVeterinariansProflLiab;

	  
	}
	public void IncrLimitFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPVeterinariansProflLiab,"../EachOccLimit"))).equals((String)"300,000")){
			this.BOPVeterinariansProflLiab.setIncrLimitFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("VeterinariansIncrLimitFactor",((String)XpathNode.selectNodeValue(this.BOPVeterinariansProflLiab," ../EachOccLimit")))));
		}
		else{
			this.BOPVeterinariansProflLiab.setIncrLimitFactor((double)1.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Charge();
	
	IncrLimitFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPVeterinariansProflLiab.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVeterinariansProflLiab,"../IRPMFactor"))) * MathHelper.roundUpDoller(this.BOPVeterinariansProflLiab.getIncrLimitFactor() * MathHelper.roundUpDoller((double)this.BOPVeterinariansProflLiab.getNumVeterinarians() * MathHelper.roundToThousand(this.BOPVeterinariansProflLiab.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVeterinariansProflLiab,"../ProfessionalLiabilityLCM"))))))));

	  
	}
	
	
	
	
	


	
}