package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises;
	
	
	
	public  BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises (com.nest.res.bop.al09012019.domain.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises)  {
	  this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises = BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void SpecifiedBPPTemporarilyAwayFromPremisesAllRiskFactor () throws LookupException,NumberFormatException {
	  this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setSpecifiedBPPTemporarilyAwayFromPremisesAllRiskFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SpecifiedBPPTemporarilyAwayFromPremisesAllRiskFactor",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../BOPNamedPerils")) != null || (XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../BOPNamedPerilsBldg")) != null || (XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../BOPNamedPerilsBusnPrsnlProp")) != null) && (XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../BOPFunctlBusnPrsnlPropValtn")) != null){
			this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../FinalBusnPrsnlPropRate"))) - this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getNamedPerilsCredit_1()) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getSpecifiedBPPTemporarilyAwayFromPremisesNamedPerilsFactor()) * (MathHelper.getDoubleValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getDsLimit()) / MathHelper.getDoubleValue(100.0)) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getFunctlBusnPrsnlPropFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../IRPMFactor"))))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../BOPNamedPerils")) != null || (XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../BOPNamedPerilsBldg")) != null || (XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../BOPNamedPerilsBusnPrsnlProp")) != null){
			this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../FinalBusnPrsnlPropRate"))) - this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getNamedPerilsCredit_1()) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getSpecifiedBPPTemporarilyAwayFromPremisesNamedPerilsFactor()) * (MathHelper.getDoubleValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getDsLimit()) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../IRPMFactor"))))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../BOPFunctlBusnPrsnlPropValtn")) != null){
			this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../FinalBusnPrsnlPropRate"))) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getSpecifiedBPPTemporarilyAwayFromPremisesAllRiskFactor()) * (MathHelper.getDoubleValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getDsLimit()) / MathHelper.getDoubleValue(100.0)) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getFunctlBusnPrsnlPropFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../IRPMFactor"))))));
		}
		else{
			this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../FinalBusnPrsnlPropRate"))) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getSpecifiedBPPTemporarilyAwayFromPremisesAllRiskFactor()) * (MathHelper.getDoubleValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getDsLimit()) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../IRPMFactor"))))));
		}
		}
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../BOPNamedPerils")) != null || (XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../BOPNamedPerilsBldg")) != null || (XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../BOPNamedPerilsBusnPrsnlProp")) != null) && (XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../BOPFunctlBusnPrsnlPropValtn")) != null){
			this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../FinalBusnPrsnlPropRate"))) - this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getNamedPerilsCredit_1()) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getSpecifiedBPPTemporarilyAwayFromPremisesNamedPerilsFactor()) * (MathHelper.getDoubleValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getDsLimit()) / MathHelper.getDoubleValue(100.0)) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getFunctlBusnPrsnlPropFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../IRPMFactor"))))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../BOPNamedPerils")) != null || (XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../BOPNamedPerilsBldg")) != null || (XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../BOPNamedPerilsBusnPrsnlProp")) != null){
			this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../FinalBusnPrsnlPropRate"))) - this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getNamedPerilsCredit_1()) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getSpecifiedBPPTemporarilyAwayFromPremisesNamedPerilsFactor()) * (MathHelper.getDoubleValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getDsLimit()) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../IRPMFactor"))))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../BOPFunctlBusnPrsnlPropValtn")) != null){
			this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../FinalBusnPrsnlPropRate"))) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getSpecifiedBPPTemporarilyAwayFromPremisesAllRiskFactor()) * (MathHelper.getDoubleValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getDsLimit()) / MathHelper.getDoubleValue(100.0)) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getFunctlBusnPrsnlPropFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../IRPMFactor"))))));
		}
		else{
			this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../FinalBusnPrsnlPropRate"))) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getSpecifiedBPPTemporarilyAwayFromPremisesAllRiskFactor()) * (MathHelper.getDoubleValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getDsLimit()) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../IRPMFactor"))))));
		}
		}
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	SpecifiedBPPTemporarilyAwayFromPremisesAllRiskFactor();
	
	NamedPerilsBusnPrsnlPropFactor();
	
	SpecifiedBPPTemporarilyAwayFromPremisesNamedPerilsFactor();
	
	FunctlBusnPrsnlPropFactor();
	
	namedPerilsCredit_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void SpecifiedBPPTemporarilyAwayFromPremisesNamedPerilsFactor () throws LookupException,NumberFormatException {
	  this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setSpecifiedBPPTemporarilyAwayFromPremisesNamedPerilsFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SpecifiedBPPTemporarilyAwayFromPremisesNamedPerilsFactor",String.valueOf( "Y"))));

	  
	}
	public void NamedPerilsBusnPrsnlPropFactor () throws LookupException,NumberFormatException {
	  this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setNamedPerilsBusnPrsnlPropFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NamedPerilsBusnPrsnlPropFactor",String.valueOf( "No"))));

	  
	}
	public void namedPerilsCredit_1 ()  {
	  this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setNamedPerilsCredit_1(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../FinalBusnPrsnlPropRate"))) * MathHelper.getDoubleValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getNamedPerilsBusnPrsnlPropFactor())));

	  
	}
	public void FunctlBusnPrsnlPropFactor () throws LookupException,NumberFormatException {
	  this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setFunctlBusnPrsnlPropFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FunctlBusnPrsnlPropFactor",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}