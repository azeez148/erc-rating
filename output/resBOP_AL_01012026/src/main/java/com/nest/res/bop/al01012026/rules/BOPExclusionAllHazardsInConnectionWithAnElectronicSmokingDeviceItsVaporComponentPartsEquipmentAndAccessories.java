package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories.setPremium(MathHelper.roundUpDoller(this.BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories.setPremium(MathHelper.roundUpDoller(this.BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories (com.nest.res.bop.al01012026.domain.BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories)  {
	  this.BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories = BOPExclusionAllHazardsInConnectionWithAnElectronicSmokingDeviceItsVaporComponentPartsEquipmentAndAccessories;

	  
	}
	
	
	
	
	


	
}