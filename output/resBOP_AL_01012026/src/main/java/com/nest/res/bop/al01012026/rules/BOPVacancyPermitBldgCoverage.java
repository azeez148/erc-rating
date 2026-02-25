package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPVacancyPermitBldgCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPVacancyPermitBldgCoverage BOPVacancyPermitBldgCoverage;
	private double bOPStructureBuildingCoveragePremiumCount_1;
	
	
	
	public  BOPVacancyPermitBldgCoverage (com.nest.res.bop.al01012026.domain.BOPVacancyPermitBldgCoverage BOPVacancyPermitBldgCoverage)  {
	  this.BOPVacancyPermitBldgCoverage = BOPVacancyPermitBldgCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void bOPStructureBuildingCoveragePremiumCount_1 ()  {
	  this.bOPStructureBuildingCoveragePremiumCount_1 = MathHelper.getIntegerValue(0.0);

		for( Policy policy : XpathNode.selectNodes(BOPVacancyPermitBldgCoverage,"../../BOPStructureBuildingCoverage") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))) > MathHelper.getDoubleValue(0.0)){
			this.bOPStructureBuildingCoveragePremiumCount_1 = MathHelper.getIntegerValue(this.bOPStructureBuildingCoveragePremiumCount_1 + MathHelper.getIntegerValue(1.0));
		}		}

	  
	}
	public void Premium ()  {
	  this.BOPVacancyPermitBldgCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../../FinalBuildingRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../Factor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../../BuildingLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../../../../IRPMFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../VacancyPermitProRateFactor")))));

	  
	}
	public void ProRateIndicator ()  {
	  this.BOPVacancyPermitBldgCoverage.setProRateIndicator(MathHelper.getIntegerValue(0.0));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	bOPStructureBuildingCoveragePremiumCount_1();
	
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws ParseException {
	  
	ProRateIndicator();
	
	EffectiveDt();
	
	ExpirationDt();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPVacancyPermitBldgCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../../FinalBuildingRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../Factor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../../BuildingLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../../../../IRPMFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../VacancyPermitProRateFactor")))));

	  
	}
	public void ExpirationDt () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../EndDate"))) != null){
			this.BOPVacancyPermitBldgCoverage.setExpirationDt(MathHelper.getDateValue((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../EndDate")))));
		}
	  
	}
	public void EffectiveDt () throws ParseException {
	  
		if((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../StartDate"))) != null && (MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../EndDate"))) != null){
			this.BOPVacancyPermitBldgCoverage.setEffectiveDt(MathHelper.getDateValue((MathHelper.getDateValue(XpathNode.selectNodeValue(this.BOPVacancyPermitBldgCoverage,"../StartDate")))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPVacancyPermitBldgCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPVacancyPermitBldgCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPVacancyPermitBldgCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.bOPStructureBuildingCoveragePremiumCount_1 > MathHelper.getIntegerValue(0.0)){
			this.BOPVacancyPermitBldgCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPVacancyPermitBldgCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws ParseException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	
	
	
	
	


	
}