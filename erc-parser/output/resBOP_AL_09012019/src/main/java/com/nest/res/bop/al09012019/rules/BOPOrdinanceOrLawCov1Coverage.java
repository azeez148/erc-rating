package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOrdinanceOrLawCov1Coverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov1Coverage BOPOrdinanceOrLawCov1Coverage;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPOrdinanceOrLawCov1Coverage.setPremium(MathHelper.roundUpDoller(this.BOPOrdinanceOrLawCov1Coverage.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1Coverage,"../../BOPStructureBuildingCoverage/Premium")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPOrdinanceOrLawCov1Coverage (com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov1Coverage BOPOrdinanceOrLawCov1Coverage)  {
	  this.BOPOrdinanceOrLawCov1Coverage = BOPOrdinanceOrLawCov1Coverage;

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPOrdinanceOrLawCov1Coverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OrdinanceOrLawCov1Factor",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawCov1Coverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPOrdinanceOrLawCov1Coverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOrdinanceOrLawCov1Coverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1Coverage,"../Coverage"))).equals(MathHelper.getStringValue("Coverage 3 Only")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1Coverage,"../Coverage"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1Coverage,"../Coverage"))).equals(MathHelper.getStringValue("Neither Coverage 1, 2, or 3"))){
			this.BOPOrdinanceOrLawCov1Coverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOrdinanceOrLawCov1Coverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPOrdinanceOrLawCov1Coverage.setPremium(MathHelper.roundUpDoller(this.BOPOrdinanceOrLawCov1Coverage.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1Coverage,"../../BOPStructureBuildingCoverage/Premium")))));

	  
	}
	
	
	
	
	


	
}