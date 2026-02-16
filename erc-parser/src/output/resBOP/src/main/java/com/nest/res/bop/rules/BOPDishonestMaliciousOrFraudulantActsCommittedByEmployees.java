package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees  {

	
	
	
	private com.nest.res.bop.domain.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees (com.nest.res.bop.domain.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees)  {
	  this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees = BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.getPremium() != (double)0.0){
			this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium"))) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium"))) != 0.0){
			this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium"))) * this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.getFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees,"../IRPMFactor")))));
		}
		else{
			this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.setPremium((double)0.0);
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DishonestMaliciousOrFraudulentActsCommittedByEmployeesFactor",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}