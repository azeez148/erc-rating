package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLiquorLiabCovBringYourOwnAlcoholEstablishments  {

	
	
	
	private com.nest.res.bop.domain.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments BOPLiquorLiabCovBringYourOwnAlcoholEstablishments;
	
	
	
	public  BOPLiquorLiabCovBringYourOwnAlcoholEstablishments (com.nest.res.bop.domain.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments BOPLiquorLiabCovBringYourOwnAlcoholEstablishments)  {
	  this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments = BOPLiquorLiabCovBringYourOwnAlcoholEstablishments;

	  
	}
	public void Premium ()  {
	  this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments.setPremium(MathHelper.roundUpDoller(this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments.getPremium() != (double)0.0){
			this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}