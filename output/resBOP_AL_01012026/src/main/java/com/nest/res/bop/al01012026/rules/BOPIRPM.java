package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPIRPM  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPIRPM BOPIRPM;
	
	
	
	public void LocationPctConverted () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIRPM.getLocationPct().equals(MathHelper.getStringValue(""))){
			this.BOPIRPM.setLocationPctConverted(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PercentageConversion",String.valueOf(this.BOPIRPM.getLocationPct())))));
		}
		else{
			this.BOPIRPM.setLocationPctConverted(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProtectionPctConverted () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIRPM.getProtectionPct().equals(MathHelper.getStringValue(""))){
			this.BOPIRPM.setProtectionPctConverted(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PercentageConversion",String.valueOf(this.BOPIRPM.getProtectionPct())))));
		}
		else{
			this.BOPIRPM.setProtectionPctConverted(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPIRPM (com.nest.res.bop.al01012026.domain.BOPIRPM BOPIRPM)  {
	  this.BOPIRPM = BOPIRPM;

	  
	}
	public void ManagementPctConverted () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIRPM.getManagementPct().equals(MathHelper.getStringValue(""))){
			this.BOPIRPM.setManagementPctConverted(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PercentageConversion",String.valueOf(this.BOPIRPM.getManagementPct())))));
		}
		else{
			this.BOPIRPM.setManagementPctConverted(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void MaxCredit () throws LookupException,NumberFormatException {
	  this.BOPIRPM.setMaxCredit(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IRPMMaximumCredit",String.valueOf( "Y"))));

	  
	}
	public void TotalModificationPct ()  {
	  this.BOPIRPM.setTotalModificationPct(MathHelper.getDoubleValue(this.BOPIRPM.getBuildingFeaturesPctConverted() + this.BOPIRPM.getEmployeesPctConverted() + this.BOPIRPM.getLocationPctConverted() + this.BOPIRPM.getManagementPctConverted() + this.BOPIRPM.getPremisesEquipmentPctConverted() + this.BOPIRPM.getProtectionPctConverted()));

	  
	}
	public void BuildingFeaturesPctConverted () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIRPM.getBuildingFeaturesPct().equals(MathHelper.getStringValue(""))){
			this.BOPIRPM.setBuildingFeaturesPctConverted(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PercentageConversion",String.valueOf(this.BOPIRPM.getBuildingFeaturesPct())))));
		}
		else{
			this.BOPIRPM.setBuildingFeaturesPctConverted(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PremisesEquipmentPctConverted () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIRPM.getPremisesEquipmentPct().equals(MathHelper.getStringValue(""))){
			this.BOPIRPM.setPremisesEquipmentPctConverted(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PercentageConversion",String.valueOf(this.BOPIRPM.getPremisesEquipmentPct())))));
		}
		else{
			this.BOPIRPM.setPremisesEquipmentPctConverted(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void MaxDebit () throws LookupException,NumberFormatException {
	  this.BOPIRPM.setMaxDebit(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IRPMMaximumDebit",String.valueOf( "Y"))));

	  
	}
	public void EmployeesPctConverted () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIRPM.getEmployeesPct().equals(MathHelper.getStringValue(""))){
			this.BOPIRPM.setEmployeesPctConverted(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PercentageConversion",String.valueOf(this.BOPIRPM.getEmployeesPct())))));
		}
		else{
			this.BOPIRPM.setEmployeesPctConverted(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CommonRating1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	BuildingFeaturesPctConverted();
	
	EmployeesPctConverted();
	
	LocationPctConverted();
	
	ManagementPctConverted();
	
	PremisesEquipmentPctConverted();
	
	ProtectionPctConverted();
	
	MaxCredit();
	
	MaxDebit();
	
	TotalModificationPct();
	
	  
	}
	public void CommonRating1 () throws LookupException,NumberFormatException {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	
	
	
	
	


	
}