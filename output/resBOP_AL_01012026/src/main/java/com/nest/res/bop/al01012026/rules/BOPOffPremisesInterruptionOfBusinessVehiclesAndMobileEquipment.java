package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail;

public class BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment  {

	
	
	
	private List<BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail> BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailList;
	private com.nest.res.bop.al01012026.rules.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailRule;
	private com.nest.res.bop.al01012026.domain.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment;
	
	
	
	public void CollisionLossCosts () throws LookupException,NumberFormatException {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setCollisionLossCosts(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesInterruptionOfBusinessVehiclesMobileEquipmentLossCost",String.valueOf( "Collision"))));

	  
	}
	public void OTCLossCosts () throws LookupException,NumberFormatException {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setOTCLossCosts(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesInterruptionOfBusinessVehiclesMobileEquipmentLossCost",String.valueOf( "Other Than Collision"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailList){
		for(BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail:BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailList){
			BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailRule = new com.nest.res.bop.al01012026.rules.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail(BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail);
			BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	OTCLossCosts();
	
	CollisionLossCosts();
	
	ExtendedBusinessIncomeFactor();
	
	BusinessIncomeNoWaitingPeriodOptionFactor();
	
	FloodCoverageFactor();
	
	EarthquakeCoverageFactor();
	
	WindHailExclusionFactor();
	
	  
	}
	public void EarthquakeCoverageFactor () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment,"../BOPStructure/BOPEQSubLimit").size() > 0.0 || XpathNode.selectNodes(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment,"../BOPStructure/BOPEarthquake").size() > 0.0){
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setEarthquakeCoverageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesEndorsementsModifyingCoveredCOLFactor",String.valueOf( "Earthquake And Volcanic Eruption Coverage")))));
		}
		else{
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setEarthquakeCoverageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void WindHailExclusionFactor () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment,"../BOPStructure/BOPWindstormOrHailExclusion").size() > 0.0){
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setWindHailExclusionFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesEndorsementsModifyingCoveredCOLFactor",String.valueOf( "Windstorm Or Hail Exclusion")))));
		}
		else{
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setWindHailExclusionFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment,"BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail") ){
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setPremium(MathHelper.getDoubleValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public void BusinessIncomeNoWaitingPeriodOptionFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.getBusinessIncomeNoWaitingPeriodOption().equals(MathHelper.getStringValue("Yes"))){
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setBusinessIncomeNoWaitingPeriodOptionFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesBusinessIncomeCoverageNoWaitingPeriodFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setBusinessIncomeNoWaitingPeriodOptionFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ExtendedBusinessIncomeFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.getExtendedBusinessIncome().equals(MathHelper.getStringValue("60"))){
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setExtendedBusinessIncomeFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesExtendedBusinessIncomeCoverageFactor",String.valueOf(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.getExtendedBusinessIncome())))));
		}
		else{
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setExtendedBusinessIncomeFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment (com.nest.res.bop.al01012026.domain.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment)  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment = BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment;
this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailList = BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.getBOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail();

	  
	}
	public void FloodCoverageFactor () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment,"../BOPFloodCov")) != null){
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setFloodCoverageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesEndorsementsModifyingCoveredCOLFactor",String.valueOf( "Flood Coverage")))));
		}
		else{
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setFloodCoverageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	
	
	
	
	


	
}