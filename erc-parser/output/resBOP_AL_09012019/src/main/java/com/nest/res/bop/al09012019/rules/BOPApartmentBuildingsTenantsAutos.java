package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPApartmentBuildingsTenantsAutos  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPApartmentBuildingsTenantsAutos BOPApartmentBuildingsTenantsAutos;
	
	
	
	public  BOPApartmentBuildingsTenantsAutos (com.nest.res.bop.al09012019.domain.BOPApartmentBuildingsTenantsAutos BOPApartmentBuildingsTenantsAutos)  {
	  this.BOPApartmentBuildingsTenantsAutos = BOPApartmentBuildingsTenantsAutos;

	  
	}
	public void CommonRating1_CommonRatingSub1 ()  {
	  
	LimitConverted();
	
	  
	}
	public void CommonRating1 ()  {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public void LimitConverted ()  {
	  
		if(this.BOPApartmentBuildingsTenantsAutos.getNumLimits() != MathHelper.getIntegerValue(0.0)){
			this.BOPApartmentBuildingsTenantsAutos.setLimitConverted(MathHelper.getIntegerValue(this.BOPApartmentBuildingsTenantsAutos.getNumLimits()));
		}
		else{
			this.BOPApartmentBuildingsTenantsAutos.setLimitConverted(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}