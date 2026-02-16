package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	BasePremium();
	
	AdditionalPremiumCreditBICoverage();
	
	AdditionalPremiumBICoverageNoWaitingPeriod();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void AdditionalPremiumCreditBICoverage ()  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.setAdditionalPremiumCreditBICoverage(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../CollisionLossCosts"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../ExtendedBusinessIncomeFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../InsuranceToExposureFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../dsLimit"))) / (double)100.0)));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.getPremium() != (double)0.0){
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage (com.nest.res.bop.domain.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage)  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage = BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage;

	  
	}
	public void BasePremium ()  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.setBasePremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../CollisionLossCosts"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../InsuranceToExposureFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../dsLimit"))) / (double)100.0)));

	  
	}
	public void AdditionalPremiumBICoverageNoWaitingPeriod ()  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.setAdditionalPremiumBICoverageNoWaitingPeriod(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../CollisionLossCosts"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../BusinessIncomeNoWaitingPeriodOptionFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../InsuranceToExposureFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../dsLimit"))) / (double)100.0)));

	  
	}
	public void Premium ()  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.setPremium(MathHelper.roundUpDoller((this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.getBasePremium() + this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.getAdditionalPremiumCreditBICoverage() + this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage.getAdditionalPremiumBICoverageNoWaitingPeriod()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage,"../../../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}