package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPFineArtsApartmentCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPFineArtsApartmentCoverage BOPFineArtsApartmentCoverage;
	
	
	
	public void Charge ()  {
	  this.BOPFineArtsApartmentCoverage.setCharge((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArtsApartmentCoverage,"../ApartmentCharge"))));

	  
	}
	public  BOPFineArtsApartmentCoverage (com.nest.res.bop.al09012019.domain.BOPFineArtsApartmentCoverage BOPFineArtsApartmentCoverage)  {
	  this.BOPFineArtsApartmentCoverage = BOPFineArtsApartmentCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPFineArtsApartmentCoverage,"../../BOPApartmentBuildings")) != null){
			this.BOPFineArtsApartmentCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPFineArtsApartmentCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPFineArtsApartmentCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPFineArtsApartmentCoverage.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArtsApartmentCoverage,"../../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArtsApartmentCoverage,"../../../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPFineArtsApartmentCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPFineArtsApartmentCoverage.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArtsApartmentCoverage,"../../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArtsApartmentCoverage,"../../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPFineArtsApartmentCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPFineArtsApartmentCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPFineArtsApartmentCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Charge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}