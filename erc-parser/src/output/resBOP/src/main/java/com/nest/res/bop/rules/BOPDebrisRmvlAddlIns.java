package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPDebrisRmvlAddlIns  {

	
	
	
	private com.nest.res.bop.domain.BOPDebrisRmvlAddlIns BOPDebrisRmvlAddlIns;
	
	
	
	public void DebrisRmvlAddlInsFactor () throws LookupException,NumberFormatException {
	  this.BOPDebrisRmvlAddlIns.setDebrisRmvlAddlInsFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DebrisRmvlAddlInsFactor",String.valueOf( "Y"))));

	  
	}
	public void finalBldgRate_1 ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPDebrisRmvlAddlIns,"../FinalBuildingRate"))) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDebrisRmvlAddlIns,"../FinalBuildingRate"))) != 0.0){
			this.BOPDebrisRmvlAddlIns.setFinalBldgRate_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDebrisRmvlAddlIns,"../FinalBuildingRate"))));
		}
		else{
			this.BOPDebrisRmvlAddlIns.setFinalBldgRate_1((double)0.0);
		}
	  
	}
	public  BOPDebrisRmvlAddlIns (com.nest.res.bop.domain.BOPDebrisRmvlAddlIns BOPDebrisRmvlAddlIns)  {
	  this.BOPDebrisRmvlAddlIns = BOPDebrisRmvlAddlIns;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  
		if(this.BOPDebrisRmvlAddlIns.getDsLimit() == (double)0.0){
			this.BOPDebrisRmvlAddlIns.setPremium((double)0.0);
		}
		else{
			this.BOPDebrisRmvlAddlIns.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPDebrisRmvlAddlIns.getFinalBldgRate_1() * this.BOPDebrisRmvlAddlIns.getDebrisRmvlAddlInsFactor()) * ((this.BOPDebrisRmvlAddlIns.getDsLimit() - (double)25000.0) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDebrisRmvlAddlIns,"../../../IRPMFactor")))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPDebrisRmvlAddlIns.getPremium() != (double)0.0){
			this.BOPDebrisRmvlAddlIns.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPDebrisRmvlAddlIns.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	DebrisRmvlAddlInsFactor();
	
	finalBldgRate_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}