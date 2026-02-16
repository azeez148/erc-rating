package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPIRPM  {

	
	
	
	private com.nest.res.bop.domain.BOPIRPM BOPIRPM;
	
	
	
	public  BOPIRPM (com.nest.res.bop.domain.BOPIRPM BOPIRPM)  {
	  this.BOPIRPM = BOPIRPM;

	  
	}
	public void LocationPctConverted () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIRPM.getLocationPct().equals((String)"")){
			this.BOPIRPM.setLocationPctConverted(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PercentageConversion",String.valueOf(BOPIRPM.getLocationPct()))));
		}
		else{
			this.BOPIRPM.setLocationPctConverted((double)0.0);
		}
	  
	}
	public void PremisesEquipmentPctConverted () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIRPM.getPremisesEquipmentPct().equals((String)"")){
			this.BOPIRPM.setPremisesEquipmentPctConverted(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PercentageConversion",String.valueOf(BOPIRPM.getPremisesEquipmentPct()))));
		}
		else{
			this.BOPIRPM.setPremisesEquipmentPctConverted((double)0.0);
		}
	  
	}
	public void EmployeesPctConverted () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIRPM.getEmployeesPct().equals((String)"")){
			this.BOPIRPM.setEmployeesPctConverted(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PercentageConversion",String.valueOf(BOPIRPM.getEmployeesPct()))));
		}
		else{
			this.BOPIRPM.setEmployeesPctConverted((double)0.0);
		}
	  
	}
	public void ManagementPctConverted () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIRPM.getManagementPct().equals((String)"")){
			this.BOPIRPM.setManagementPctConverted(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PercentageConversion",String.valueOf(BOPIRPM.getManagementPct()))));
		}
		else{
			this.BOPIRPM.setManagementPctConverted((double)0.0);
		}
	  
	}
	public void MaxCredit () throws LookupException,NumberFormatException {
	  this.BOPIRPM.setMaxCredit(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IRPMMaximumCredit",String.valueOf( "Y"))));

	  
	}
	public void MaxDebit () throws LookupException,NumberFormatException {
	  this.BOPIRPM.setMaxDebit(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IRPMMaximumDebit",String.valueOf( "Y"))));

	  
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
	public void ProtectionPctConverted () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIRPM.getProtectionPct().equals((String)"")){
			this.BOPIRPM.setProtectionPctConverted(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PercentageConversion",String.valueOf(BOPIRPM.getProtectionPct()))));
		}
		else{
			this.BOPIRPM.setProtectionPctConverted((double)0.0);
		}
	  
	}
	public void TotalModificationPct ()  {
	  this.BOPIRPM.setTotalModificationPct(this.BOPIRPM.getBuildingFeaturesPctConverted() + this.BOPIRPM.getEmployeesPctConverted() + this.BOPIRPM.getLocationPctConverted() + this.BOPIRPM.getManagementPctConverted() + this.BOPIRPM.getPremisesEquipmentPctConverted() + this.BOPIRPM.getProtectionPctConverted());

	  
	}
	public void BuildingFeaturesPctConverted () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIRPM.getBuildingFeaturesPct().equals((String)"")){
			this.BOPIRPM.setBuildingFeaturesPctConverted(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PercentageConversion",String.valueOf(BOPIRPM.getBuildingFeaturesPct()))));
		}
		else{
			this.BOPIRPM.setBuildingFeaturesPctConverted((double)0.0);
		}
	  
	}
	
	
	
	
	


	
}