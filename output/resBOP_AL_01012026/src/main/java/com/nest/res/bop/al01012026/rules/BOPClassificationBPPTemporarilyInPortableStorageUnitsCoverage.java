package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage;
	
	
	
	public void CommonRating1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("BPPTemporarilyInPortableStorageUnitsInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage,"../BusnPrsnlPropLimit"))) > MathHelper.getIntegerValue(0.0)) || ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage,"../BusnPrsnlPropLimit"))) <= MathHelper.getIntegerValue(0.0) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage,"../FunctlBusnPrsnlPropValtnApply"))).equals(MathHelper.getStringValue("Yes")))){
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void CommonRating1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public  BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage (com.nest.res.bop.al01012026.domain.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage)  {
	  this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage = BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage;

	  
	}
	
	
	
	
	


	
}