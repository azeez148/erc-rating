package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPVacancyPermitBldgCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPVacancyPermitBldgCoverage BOPVacancyPermitBldgCoverage;
	
	
	
	public void ExpirationDt () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../EndDate"))) != null){
			this.BOPVacancyPermitBldgCoverage.setExpirationDt((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../EndDate"))));
		}
	  
	}
	public  BOPVacancyPermitBldgCoverage (com.nest.res.bop.domain.BOPVacancyPermitBldgCoverage BOPVacancyPermitBldgCoverage)  {
	  this.BOPVacancyPermitBldgCoverage = BOPVacancyPermitBldgCoverage;

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws ParseException {
	  
	ProRateIndicator();
	
	EffectiveDt();
	
	ExpirationDt();
	
	  
	}
	public void Premium ()  {
	  this.BOPVacancyPermitBldgCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../../FinalBuildingRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../Factor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../../BuildingLimit"))) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../../../../IRPMFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../VacancyPermitProRateFactor")))));

	  
	}
	public void EffectiveDt () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../EndDate"))) != null){
			this.BOPVacancyPermitBldgCoverage.setEffectiveDt((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../StartDate"))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPVacancyPermitBldgCoverage.getPremium() != (double)0.0){
			this.BOPVacancyPermitBldgCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPVacancyPermitBldgCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProRateIndicator ()  {
	  this.BOPVacancyPermitBldgCoverage.setProRateIndicator((int)0.0);

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws ParseException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	
	
	
	
	


	
}