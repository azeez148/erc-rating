package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage;
	
	
	
	public void CommonRating1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	classBPPPremium_1();
	
	bOPFunctlBusnPrsnlPropValtnCoveragePremium_1();
	
	classFuncBPPPremium_1();
	
	InclddLimit();
	
	  
	}
	public  BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage (com.nest.res.bop.domain.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage)  {
	  this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage = BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage;

	  
	}
	public void classFuncBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage,"../BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setClassFuncBPPPremium_1(Double.valueOf(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1()));
		}
		else{
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setClassFuncBPPPremium_1((double)0.0);
		}
	  
	}
	public void bOPFunctlBusnPrsnlPropValtnCoveragePremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage,"../BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1((double)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage,"../BOPFunctlBusnPrsnlPropValtn/BOPFunctlBusnPrsnlPropValtnDetail/BOPFunctlBusnPrsnlPropValtnCoverage") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))) != 0.0){
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1(Double.valueOf(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))));
		}		}

		}
	  
	}
	public void classBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage,"../BOPClassificationBusnPrsnlPropCoverage").size() == 0.0){
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setClassBPPPremium_1((double)0.0);
		}
		else{
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setClassBPPPremium_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage,"../BOPClassificationBusnPrsnlPropCoverage/Premium"))));
		}
	  
	}
	public void CommonRating1 () throws LookupException,NumberFormatException {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.getClassBPPPremium_1() != (double)0.0 || this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.getClassFuncBPPPremium_1() != (double)0.0){
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("BPPTemporarilyInPortableStorageUnitsInclddLimit",String.valueOf( "Y"))));
		}
		else{
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setInclddLimit((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}