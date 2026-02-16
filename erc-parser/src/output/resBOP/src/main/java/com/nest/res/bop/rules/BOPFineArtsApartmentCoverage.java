package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPFineArtsApartmentCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPFineArtsApartmentCoverage BOPFineArtsApartmentCoverage;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPFineArtsApartmentCoverage (com.nest.res.bop.domain.BOPFineArtsApartmentCoverage BOPFineArtsApartmentCoverage)  {
	  this.BOPFineArtsApartmentCoverage = BOPFineArtsApartmentCoverage;

	  
	}
	public void Charge ()  {
	  this.BOPFineArtsApartmentCoverage.setCharge((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArtsApartmentCoverage,"../ApartmentCharge"))));

	  
	}
	public void Premium ()  {
	  this.BOPFineArtsApartmentCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPFineArtsApartmentCoverage.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArtsApartmentCoverage,"../../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArtsApartmentCoverage,"../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Charge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPFineArtsApartmentCoverage.getPremium() != (double)0.0){
			this.BOPFineArtsApartmentCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPFineArtsApartmentCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}