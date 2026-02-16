package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises  {

	
	
	
	private com.nest.res.bop.domain.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises;
	
	
	
	public void SpecifiedBPPTemporarilyAwayFromPremisesAllRiskFactor () throws LookupException,NumberFormatException {
	  this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setSpecifiedBPPTemporarilyAwayFromPremisesAllRiskFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SpecifiedBPPTemporarilyAwayFromPremisesAllRiskFactor",String.valueOf( "Y"))));

	  
	}
	public  BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises (com.nest.res.bop.domain.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises)  {
	  this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises = BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises;

	  
	}
	public void Premium ()  {
	  
		if((((XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../BOPNamedPerils"))) != null || ((XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../BOPNamedPerilsBldg"))) != null || ((XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../BOPNamedPerilsBusnPrsnlProp"))) != null) && ((XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../BOPFunctlBusnPrsnlPropValtn"))) != null){
			this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../FinalBusnPrsnlPropRate"))) - this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getNamedPerilsCredit_1()) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getSpecifiedBPPTemporarilyAwayFromPremisesNamedPerilsFactor()) * ((double)this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getDsLimit() / (double)100.0) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getFunctlBusnPrsnlPropFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../IRPMFactor")))));
		}
		else{
		if(((XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../BOPNamedPerils"))) != null || ((XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../BOPNamedPerilsBldg"))) != null || ((XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../BOPNamedPerilsBusnPrsnlProp"))) != null){
			this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setPremium(MathHelper.roundUpDoller((MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../FinalBusnPrsnlPropRate"))) - this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getNamedPerilsCredit_1()) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getSpecifiedBPPTemporarilyAwayFromPremisesNamedPerilsFactor()) * ((double)this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getDsLimit() / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../IRPMFactor")))));
		}
		else{
		if(((XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../BOPFunctlBusnPrsnlPropValtn"))) != null){
			this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../FinalBusnPrsnlPropRate"))) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getSpecifiedBPPTemporarilyAwayFromPremisesAllRiskFactor()) * ((double)this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getDsLimit() / (double)100.0) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getFunctlBusnPrsnlPropFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../IRPMFactor")))));
		}
		else{
			this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setPremium(MathHelper.roundUpDoller((MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../FinalBusnPrsnlPropRate"))) * this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getSpecifiedBPPTemporarilyAwayFromPremisesAllRiskFactor()) * ((double)this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getDsLimit() / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../../../../IRPMFactor")))));
		}
		}
		}
	  
	}
	public void NamedPerilsBusnPrsnlPropFactor () throws LookupException,NumberFormatException {
	  this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setNamedPerilsBusnPrsnlPropFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NamedPerilsBusnPrsnlPropFactor",String.valueOf( "No"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
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
	public void namedPerilsCredit_1 ()  {
	  this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setNamedPerilsCredit_1(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises,"../FinalBusnPrsnlPropRate"))) * Double.valueOf(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getNamedPerilsBusnPrsnlPropFactor())));

	  
	}
	public void FunctlBusnPrsnlPropFactor () throws LookupException,NumberFormatException {
	  this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setFunctlBusnPrsnlPropFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FunctlBusnPrsnlPropFactor",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getPremium() != (double)0.0){
			this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}