package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLiquorLiabCovBringYourOwnAlcoholEstablishments  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments BOPLiquorLiabCovBringYourOwnAlcoholEstablishments;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments.setPremium(MathHelper.roundUpDoller(this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPLiquorLiabCovBringYourOwnAlcoholEstablishments (com.nest.res.bop.al01012026.domain.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments BOPLiquorLiabCovBringYourOwnAlcoholEstablishments)  {
	  this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments = BOPLiquorLiabCovBringYourOwnAlcoholEstablishments;

	  
	}
	public void Premium ()  {
	  this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments.setPremium(MathHelper.roundUpDoller(this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}