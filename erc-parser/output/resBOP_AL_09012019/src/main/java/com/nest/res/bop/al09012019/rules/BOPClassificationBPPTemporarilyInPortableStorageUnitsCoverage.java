package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage;
	
	
	
	public  BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage (com.nest.res.bop.al09012019.domain.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage)  {
	  this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage = BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void bOPFunctlBusnPrsnlPropValtnCoveragePremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage,"../BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage,"../BOPFunctlBusnPrsnlPropValtn/BOPFunctlBusnPrsnlPropValtnDetail/BOPFunctlBusnPrsnlPropValtnCoverage") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))) != 0.0){
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))))));
		}		}

		}
	  
	}
	public void CommonRating1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0) || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage,"../BusnPrsnlPropLimit"))) == MathHelper.getIntegerValue(0.0)){
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void CommonRating1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	classBPPPremium_1();
	
	bOPFunctlBusnPrsnlPropValtnCoveragePremium_1();
	
	classFuncBPPPremium_1();
	
	InclddLimit();
	
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.getClassBPPPremium_1() != MathHelper.getDoubleValue(0.0) || this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.getClassFuncBPPPremium_1() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setInclddLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("BPPTemporarilyInPortableStorageUnitsInclddLimit",String.valueOf( "Y")))));
		}
		else{
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setInclddLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void classBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage,"../BOPClassificationBusnPrsnlPropCoverage").size() == 0.0){
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setClassBPPPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setClassBPPPremium_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage,"../BOPClassificationBusnPrsnlPropCoverage/Premium")))));
		}
	  
	}
	public void classFuncBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage,"../BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setClassFuncBPPPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1())));
		}
		else{
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setClassFuncBPPPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}