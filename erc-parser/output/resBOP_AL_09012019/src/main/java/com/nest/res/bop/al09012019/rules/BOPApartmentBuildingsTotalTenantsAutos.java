package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPApartmentBuildingsTotalTenantsAutos  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPApartmentBuildingsTotalTenantsAutos BOPApartmentBuildingsTotalTenantsAutos;
	
	
	
	public void DedFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPApartmentBuildingsTotalTenantsAutos.getOTCEachAutoDed().equals(MathHelper.getStringValue("")) && !this.BOPApartmentBuildingsTotalTenantsAutos.getOTCAnyOneEventDed().equals(MathHelper.getStringValue("")) && !this.BOPApartmentBuildingsTotalTenantsAutos.getCollisionDed().equals(MathHelper.getStringValue(""))){
			this.BOPApartmentBuildingsTotalTenantsAutos.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ApartmentBuildingsTenantsAutosDedFactor",String.valueOf(this.BOPApartmentBuildingsTotalTenantsAutos.getOTCEachAutoDed()),String.valueOf(this.BOPApartmentBuildingsTotalTenantsAutos.getOTCAnyOneEventDed()),String.valueOf(this.BOPApartmentBuildingsTotalTenantsAutos.getCollisionDed())))));
		}
		else{
			this.BOPApartmentBuildingsTotalTenantsAutos.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void limit_1 ()  {
	  this.BOPApartmentBuildingsTotalTenantsAutos.setLimit_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPApartmentBuildingsTotalTenantsAutos,"../BOPLocation/BOPApartmentBuildingsTenantsAutos") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"LimitConverted"))) != 0){
			this.BOPApartmentBuildingsTotalTenantsAutos.setLimit_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPApartmentBuildingsTotalTenantsAutos.getLimit_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"LimitConverted"))))));
		}		}

	  
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
	public void setTotalPremiumForCoverage ()  {
	  this.BOPApartmentBuildingsTotalTenantsAutos.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPApartmentBuildingsTotalTenantsAutos.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPApartmentBuildingsTotalTenantsAutos,"../LCM")))) * this.BOPApartmentBuildingsTotalTenantsAutos.getDedFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPApartmentBuildingsTotalTenantsAutos,"../IRPMFactor")))));

	  
	}
	public void LimitConverted ()  {
	  this.BOPApartmentBuildingsTotalTenantsAutos.setLimitConverted(this.BOPApartmentBuildingsTotalTenantsAutos.getLimit_1());

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPApartmentBuildingsTotalTenantsAutos.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPApartmentBuildingsTotalTenantsAutos.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPApartmentBuildingsTotalTenantsAutos.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void OTCEachAutoDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPApartmentBuildingsTotalTenantsAutos,"../BOPLocation/BOPApartmentBuildingsTenantsAutos") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCEachAutoDed"))).equals(MathHelper.getStringValue(""))){
			this.BOPApartmentBuildingsTotalTenantsAutos.setOTCEachAutoDed(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCEachAutoDed")))));
		}		}

	  
	}
	public void Charge () throws LookupException,NumberFormatException {
	  this.BOPApartmentBuildingsTotalTenantsAutos.setCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ApartmentBuildingsTenantsAutosCharge",String.valueOf(this.BOPApartmentBuildingsTotalTenantsAutos.getLimitConverted()))));

	  
	}
	public void CollisionDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPApartmentBuildingsTotalTenantsAutos,"../BOPLocation/BOPApartmentBuildingsTenantsAutos") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"CollisionDed"))).equals(MathHelper.getStringValue(""))){
			this.BOPApartmentBuildingsTotalTenantsAutos.setCollisionDed(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"CollisionDed")))));
		}		}

	  
	}
	public  BOPApartmentBuildingsTotalTenantsAutos (com.nest.res.bop.al09012019.domain.BOPApartmentBuildingsTotalTenantsAutos BOPApartmentBuildingsTotalTenantsAutos)  {
	  this.BOPApartmentBuildingsTotalTenantsAutos = BOPApartmentBuildingsTotalTenantsAutos;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void OTCAnyOneEventDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPApartmentBuildingsTotalTenantsAutos,"../BOPLocation/BOPApartmentBuildingsTenantsAutos") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCAnyOneEventDed"))).equals(MathHelper.getStringValue(""))){
			this.BOPApartmentBuildingsTotalTenantsAutos.setOTCAnyOneEventDed(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCAnyOneEventDed")))));
		}		}

	  
	}
	public void Premium ()  {
	  this.BOPApartmentBuildingsTotalTenantsAutos.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPApartmentBuildingsTotalTenantsAutos.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPApartmentBuildingsTotalTenantsAutos,"../LCM")))) * this.BOPApartmentBuildingsTotalTenantsAutos.getDedFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPApartmentBuildingsTotalTenantsAutos,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}