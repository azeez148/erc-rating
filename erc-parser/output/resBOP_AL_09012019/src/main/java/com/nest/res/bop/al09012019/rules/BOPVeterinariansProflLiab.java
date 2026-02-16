package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPVeterinariansProflLiab  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPVeterinariansProflLiab BOPVeterinariansProflLiab;
	
	
	
	public  BOPVeterinariansProflLiab (com.nest.res.bop.al09012019.domain.BOPVeterinariansProflLiab BOPVeterinariansProflLiab)  {
	  this.BOPVeterinariansProflLiab = BOPVeterinariansProflLiab;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Charge();
	
	IncrLimitFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPVeterinariansProflLiab.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVeterinariansProflLiab,"../IRPMFactor"))) * MathHelper.roundUpDoller(this.BOPVeterinariansProflLiab.getIncrLimitFactor() * MathHelper.roundUpDoller(MathHelper.getDoubleValue(this.BOPVeterinariansProflLiab.getNumVeterinarians()) * MathHelper.roundToThousand(this.BOPVeterinariansProflLiab.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVeterinariansProflLiab,"../ProfessionalLiabilityLCM"))))))));

	  
	}
	public void IncrLimitFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPVeterinariansProflLiab,"../EachOccLimit"))).equals(MathHelper.getStringValue("300,000"))){
			this.BOPVeterinariansProflLiab.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("VeterinariansIncrLimitFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPVeterinariansProflLiab,"../EachOccLimit"))))));
		}
		else{
			this.BOPVeterinariansProflLiab.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void Charge () throws LookupException,NumberFormatException {
	  this.BOPVeterinariansProflLiab.setCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("VeterinariansCharge",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPVeterinariansProflLiab.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPVeterinariansProflLiab.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPVeterinariansProflLiab.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPVeterinariansProflLiab.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVeterinariansProflLiab,"../IRPMFactor"))) * MathHelper.roundUpDoller(this.BOPVeterinariansProflLiab.getIncrLimitFactor() * MathHelper.roundUpDoller(MathHelper.getDoubleValue(this.BOPVeterinariansProflLiab.getNumVeterinarians()) * MathHelper.roundToThousand(this.BOPVeterinariansProflLiab.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVeterinariansProflLiab,"../ProfessionalLiabilityLCM"))))))));

	  
	}
	
	
	
	
	


	
}