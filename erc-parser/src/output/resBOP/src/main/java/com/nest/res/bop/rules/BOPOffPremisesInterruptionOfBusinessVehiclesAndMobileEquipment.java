package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail;

public class BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment  {

	
	
	
	private List<BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail> BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailList;
	private com.nest.res.bop.rules.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailRule;
	private com.nest.res.bop.domain.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment;
	
	
	
	public  BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment (com.nest.res.bop.domain.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment)  {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment = BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment;
this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailList = BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.getBOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail();

	  
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
	public void ExtendedBusinessIncomeFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.getExtendedBusinessIncome().equals((String)"60")){
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setExtendedBusinessIncomeFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesExtendedBusinessIncomeCoverageFactor",String.valueOf(BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.getExtendedBusinessIncome()))));
		}
		else{
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setExtendedBusinessIncomeFactor((double)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailList){
		for(BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail:BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailList){
			BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailRule = new com.nest.res.bop.rules.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail(BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail);
			BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	public void EarthquakeCoverageFactor () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment,"../BOPStructure/BOPEQSubLimit").size() > 0.0 || XpathNode.selectNodes(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment,"../BOPStructure/BOPEarthquake").size() > 0.0){
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setEarthquakeCoverageFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesEndorsementsModifyingCoveredCOLFactor",String.valueOf( "Earthquake And Volcanic Eruption Coverage"))));
		}
		else{
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setEarthquakeCoverageFactor((double)1.0);
		}
	  
	}
	public void OTCLossCosts () throws LookupException,NumberFormatException {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setOTCLossCosts(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesInterruptionOfBusinessVehiclesMobileEquipmentLossCost",String.valueOf( "Other Than Collision"))));

	  
	}
	public void CollisionLossCosts () throws LookupException,NumberFormatException {
	  this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setCollisionLossCosts(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesInterruptionOfBusinessVehiclesMobileEquipmentLossCost",String.valueOf( "Collision"))));

	  
	}
	public void FloodCoverageFactor () throws LookupException,NumberFormatException {
	  
		if(((XpathNode.selectNodeValue(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment,"../BOPFloodCov"))) != null){
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setFloodCoverageFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesEndorsementsModifyingCoveredCOLFactor",String.valueOf( "Flood Coverage"))));
		}
		else{
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setFloodCoverageFactor((double)1.0);
		}
	  
	}
	public void BusinessIncomeNoWaitingPeriodOptionFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.getBusinessIncomeNoWaitingPeriodOption().equals((String)"Yes")){
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setBusinessIncomeNoWaitingPeriodOptionFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesBusinessIncomeCoverageNoWaitingPeriodFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setBusinessIncomeNoWaitingPeriodOptionFactor((double)0.0);
		}
	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailList != null && this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailList.size() > 0){
			for(com.nest.res.bop.domain.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail : BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetailList) {
				finalPremium = finalPremium + BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail.getPremium();
			}
		}
this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setPremium(finalPremium) ;
	  
	}
	public void WindHailExclusionFactor () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment,"../BOPStructure/BOPWindstormOrHailExclusion").size() > 0.0){
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setWindHailExclusionFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesEndorsementsModifyingCoveredCOLFactor",String.valueOf( "Windstorm Or Hail Exclusion"))));
		}
		else{
			this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.setWindHailExclusionFactor((double)1.0);
		}
	  
	}
	
	
	
	
	


	
}