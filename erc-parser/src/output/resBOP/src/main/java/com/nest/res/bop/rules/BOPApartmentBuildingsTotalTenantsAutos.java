package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPApartmentBuildingsTotalTenantsAutos  {

	
	
	
	private com.nest.res.bop.domain.BOPApartmentBuildingsTotalTenantsAutos BOPApartmentBuildingsTotalTenantsAutos;
	
	
	
	public void Premium ()  {
	  this.BOPApartmentBuildingsTotalTenantsAutos.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPApartmentBuildingsTotalTenantsAutos.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPApartmentBuildingsTotalTenantsAutos,"../LCM")))) * this.BOPApartmentBuildingsTotalTenantsAutos.getDedFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPApartmentBuildingsTotalTenantsAutos,"../IRPMFactor")))));

	  
	}
	public void limit_1 ()  {
	  this.BOPApartmentBuildingsTotalTenantsAutos.setLimit_1((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPApartmentBuildingsTotalTenantsAutos,"../BOPLocation/BOPApartmentBuildingsTenantsAutos") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"LimitConverted"))) != 0){
			this.BOPApartmentBuildingsTotalTenantsAutos.setLimit_1(Integer.valueOf(this.BOPApartmentBuildingsTotalTenantsAutos.getLimit_1()) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"LimitConverted"))));
		}		}

	  
	}
	public void CollisionDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPApartmentBuildingsTotalTenantsAutos,"../BOPLocation/BOPApartmentBuildingsTenantsAutos") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"CollisionDed"))).equals((String)"")){
			this.BOPApartmentBuildingsTotalTenantsAutos.setCollisionDed((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"CollisionDed"))));
		}		}

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void DedFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPApartmentBuildingsTotalTenantsAutos.getOTCEachAutoDed().equals((String)"") && !this.BOPApartmentBuildingsTotalTenantsAutos.getOTCAnyOneEventDed().equals((String)"") && !this.BOPApartmentBuildingsTotalTenantsAutos.getCollisionDed().equals((String)"")){
			this.BOPApartmentBuildingsTotalTenantsAutos.setDedFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ApartmentBuildingsTenantsAutosDedFactor",String.valueOf(BOPApartmentBuildingsTotalTenantsAutos.getOTCEachAutoDed()),String.valueOf(BOPApartmentBuildingsTotalTenantsAutos.getOTCAnyOneEventDed()),String.valueOf(BOPApartmentBuildingsTotalTenantsAutos.getCollisionDed()))));
		}
		else{
			this.BOPApartmentBuildingsTotalTenantsAutos.setDedFactor((double)0.0);
		}
	  
	}
	public void Charge () throws LookupException,NumberFormatException {
	  this.BOPApartmentBuildingsTotalTenantsAutos.setCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ApartmentBuildingsTenantsAutosCharge",String.valueOf(BOPApartmentBuildingsTotalTenantsAutos.getLimitConverted()))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPApartmentBuildingsTotalTenantsAutos.getPremium() != (double)0.0){
			this.BOPApartmentBuildingsTotalTenantsAutos.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPApartmentBuildingsTotalTenantsAutos.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPApartmentBuildingsTotalTenantsAutos (com.nest.res.bop.domain.BOPApartmentBuildingsTotalTenantsAutos BOPApartmentBuildingsTotalTenantsAutos)  {
	  this.BOPApartmentBuildingsTotalTenantsAutos = BOPApartmentBuildingsTotalTenantsAutos;

	  
	}
	public void LimitConverted ()  {
	  this.BOPApartmentBuildingsTotalTenantsAutos.setLimitConverted(this.BOPApartmentBuildingsTotalTenantsAutos.getLimit_1());

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	limit_1();
	
	LimitConverted();
	
	OTCEachAutoDed();
	
	OTCAnyOneEventDed();
	
	CollisionDed();
	
	Charge();
	
	DedFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void OTCAnyOneEventDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPApartmentBuildingsTotalTenantsAutos,"../BOPLocation/BOPApartmentBuildingsTenantsAutos") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCAnyOneEventDed"))).equals((String)"")){
			this.BOPApartmentBuildingsTotalTenantsAutos.setOTCAnyOneEventDed((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCAnyOneEventDed"))));
		}		}

	  
	}
	public void OTCEachAutoDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPApartmentBuildingsTotalTenantsAutos,"../BOPLocation/BOPApartmentBuildingsTenantsAutos") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCEachAutoDed"))).equals((String)"")){
			this.BOPApartmentBuildingsTotalTenantsAutos.setOTCEachAutoDed((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCEachAutoDed"))));
		}		}

	  
	}
	
	
	
	
	


	
}