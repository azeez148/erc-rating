package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPApartmentBuildingsTenantsAutos  {

	
	
	
	private com.nest.res.bop.domain.BOPApartmentBuildingsTenantsAutos BOPApartmentBuildingsTenantsAutos;
	
	
	
	public void CommonRating1 ()  {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public void LimitConverted ()  {
	  
		if(this.BOPApartmentBuildingsTenantsAutos.getNumLimits() != (int)0.0){
			this.BOPApartmentBuildingsTenantsAutos.setLimitConverted(this.BOPApartmentBuildingsTenantsAutos.getNumLimits());
		}
		else{
			this.BOPApartmentBuildingsTenantsAutos.setLimitConverted((int)0.0);
		}
	  
	}
	public void CommonRating1_CommonRatingSub1 ()  {
	  
	LimitConverted();
	
	  
	}
	public  BOPApartmentBuildingsTenantsAutos (com.nest.res.bop.domain.BOPApartmentBuildingsTenantsAutos BOPApartmentBuildingsTenantsAutos)  {
	  this.BOPApartmentBuildingsTenantsAutos = BOPApartmentBuildingsTenantsAutos;

	  
	}
	
	
	
	
	


	
}