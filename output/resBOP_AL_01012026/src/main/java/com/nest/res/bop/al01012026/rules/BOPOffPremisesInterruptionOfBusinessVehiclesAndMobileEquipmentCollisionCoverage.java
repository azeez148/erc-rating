package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage;
	
	
	
	public  BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage (com.nest.res.bop.al01012026.domain.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage)  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage = BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.setPremium(MathHelper.roundUpDoller((this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.getBasePremium() + this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.getAdditionalPremiumCreditBICoverage() + this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.getAdditionalPremiumBICoverageNoWaitingPeriod()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	BasePremium();
	
	AdditionalPremiumCreditBICoverage();
	
	AdditionalPremiumBICoverageNoWaitingPeriod();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.setPremium(MathHelper.roundUpDoller((this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.getBasePremium() + this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.getAdditionalPremiumCreditBICoverage() + this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.getAdditionalPremiumBICoverageNoWaitingPeriod()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../CollisionCoveredCauseOfLoss"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void AdditionalPremiumBICoverageNoWaitingPeriod ()  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.setAdditionalPremiumBICoverageNoWaitingPeriod(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../CollisionLossCosts"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../BusinessIncomeNoWaitingPeriodOptionFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../InsuranceToExposureFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void BasePremium ()  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.setBasePremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../CollisionLossCosts"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../InsuranceToExposureFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void AdditionalPremiumCreditBICoverage ()  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.setAdditionalPremiumCreditBICoverage(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../CollisionLossCosts"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../ExtendedBusinessIncomeFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../InsuranceToExposureFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	
	
	
	
	


	
}