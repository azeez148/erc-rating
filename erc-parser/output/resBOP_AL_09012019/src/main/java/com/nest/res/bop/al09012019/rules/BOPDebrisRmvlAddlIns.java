package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPDebrisRmvlAddlIns  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPDebrisRmvlAddlIns BOPDebrisRmvlAddlIns;
	
	
	
	public void Premium ()  {
	  
		if(this.BOPDebrisRmvlAddlIns.getDsLimit() == MathHelper.getDoubleValue(0.0)){
			this.BOPDebrisRmvlAddlIns.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPDebrisRmvlAddlIns.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPDebrisRmvlAddlIns.getFinalBldgRate_1() * this.BOPDebrisRmvlAddlIns.getDebrisRmvlAddlInsFactor()) * ((this.BOPDebrisRmvlAddlIns.getDsLimit() - MathHelper.getDoubleValue(25000.0)) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDebrisRmvlAddlIns,"../../../IRPMFactor"))))));
		}
	  
	}
	public void finalBldgRate_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPDebrisRmvlAddlIns,"../FinalBuildingRate")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDebrisRmvlAddlIns,"../FinalBuildingRate"))) != 0.0){
			this.BOPDebrisRmvlAddlIns.setFinalBldgRate_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDebrisRmvlAddlIns,"../FinalBuildingRate")))));
		}
		else{
			this.BOPDebrisRmvlAddlIns.setFinalBldgRate_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPDebrisRmvlAddlIns.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPDebrisRmvlAddlIns.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPDebrisRmvlAddlIns.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void DebrisRmvlAddlInsFactor () throws LookupException,NumberFormatException {
	  this.BOPDebrisRmvlAddlIns.setDebrisRmvlAddlInsFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DebrisRmvlAddlInsFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	DebrisRmvlAddlInsFactor();
	
	finalBldgRate_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPDebrisRmvlAddlIns (com.nest.res.bop.al09012019.domain.BOPDebrisRmvlAddlIns BOPDebrisRmvlAddlIns)  {
	  this.BOPDebrisRmvlAddlIns = BOPDebrisRmvlAddlIns;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPDebrisRmvlAddlIns.getDsLimit() == MathHelper.getDoubleValue(0.0)){
			this.BOPDebrisRmvlAddlIns.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPDebrisRmvlAddlIns.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPDebrisRmvlAddlIns.getFinalBldgRate_1() * this.BOPDebrisRmvlAddlIns.getDebrisRmvlAddlInsFactor()) * ((this.BOPDebrisRmvlAddlIns.getDsLimit() - MathHelper.getDoubleValue(25000.0)) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDebrisRmvlAddlIns,"../../../IRPMFactor"))))));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}