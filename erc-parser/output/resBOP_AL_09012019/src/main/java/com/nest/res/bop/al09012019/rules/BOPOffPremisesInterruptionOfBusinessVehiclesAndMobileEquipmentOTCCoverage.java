package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage;
	
	
	
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void BasePremium ()  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.setBasePremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../OTCLossCosts"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../InsuranceToExposureFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.setPremium(MathHelper.roundUpDoller((this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.getBasePremium() + this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.getAdditionalPremiumCreditEndorsements() + this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.getAdditionalPremiumCreditBICoverage() + this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.getAdditionalPremiumBICoverageNoWaitingPeriod()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(1.0));

	  
	}
	public void Premium ()  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.setPremium(MathHelper.roundUpDoller((this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.getBasePremium() + this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.getAdditionalPremiumCreditEndorsements() + this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.getAdditionalPremiumCreditBICoverage() + this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.getAdditionalPremiumBICoverageNoWaitingPeriod()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void AdditionalPremiumCreditBICoverage ()  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.setAdditionalPremiumCreditBICoverage(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../OTCLossCosts"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../ExtendedBusinessIncomeFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../InsuranceToExposureFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void AdditionalPremiumCreditEndorsements ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../../BOPFloodCov")) != null || XpathNode.selectNodes(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../../BOPStructure/BOPEQSubLimit").size() > 0.0 || XpathNode.selectNodes(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../../BOPStructure/BOPEarthquake").size() > 0.0 || XpathNode.selectNodes(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../../BOPStructure/BOPWindstormOrHailExclusion").size() > 0.0){
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.setAdditionalPremiumCreditEndorsements(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(((MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../OTCLossCosts"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../FloodCoverageFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../EarthquakeCoverageFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../WindHailExclusionFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../InsuranceToExposureFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.setAdditionalPremiumCreditEndorsements(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	BasePremium();
	
	AdditionalPremiumCreditEndorsements();
	
	AdditionalPremiumCreditBICoverage();
	
	AdditionalPremiumBICoverageNoWaitingPeriod();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage (com.nest.res.bop.al09012019.domain.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage)  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage = BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage;

	  
	}
	public void AdditionalPremiumBICoverageNoWaitingPeriod ()  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage.setAdditionalPremiumBICoverageNoWaitingPeriod(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../OTCLossCosts"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../../BusinessIncomeNoWaitingPeriodOptionFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../InsuranceToExposureFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	
	
	
	
	


	
}