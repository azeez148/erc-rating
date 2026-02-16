package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium"))) != 0.0){
			this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium"))) * this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.getFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees,"../IRPMFactor"))))));
		}
		else{
			this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DishonestMaliciousOrFraudulentActsCommittedByEmployeesFactor",String.valueOf( "Y"))));

	  
	}
	public  BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees (com.nest.res.bop.al09012019.domain.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees)  {
	  this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees = BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees;

	  
	}
	public void Premium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium"))) != 0.0){
			this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium"))) * this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.getFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees,"../IRPMFactor"))))));
		}
		else{
			this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}