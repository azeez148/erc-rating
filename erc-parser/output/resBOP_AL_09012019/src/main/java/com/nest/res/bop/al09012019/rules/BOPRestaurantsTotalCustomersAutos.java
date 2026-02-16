package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPRestaurantsTotalCustomersAutos  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPRestaurantsTotalCustomersAutos BOPRestaurantsTotalCustomersAutos;
	
	
	
	public void LimitConverted ()  {
	  this.BOPRestaurantsTotalCustomersAutos.setLimitConverted(this.BOPRestaurantsTotalCustomersAutos.getLimit_1());

	  
	}
	public void CollisionDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPRestaurantsTotalCustomersAutos,"../BOPLocation/BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"CollisionDed"))).equals(MathHelper.getStringValue(""))){
			this.BOPRestaurantsTotalCustomersAutos.setCollisionDed(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"CollisionDed")))));
		}		}

	  
	}
	public void OTCAnyOneEventDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPRestaurantsTotalCustomersAutos,"../BOPLocation/BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCAnyOneEventDed"))).equals(MathHelper.getStringValue(""))){
			this.BOPRestaurantsTotalCustomersAutos.setOTCAnyOneEventDed(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCAnyOneEventDed")))));
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
	public void Premium ()  {
	  this.BOPRestaurantsTotalCustomersAutos.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPRestaurantsTotalCustomersAutos.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsTotalCustomersAutos,"../LCM")))) * this.BOPRestaurantsTotalCustomersAutos.getDedFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsTotalCustomersAutos,"../IRPMFactor")))));

	  
	}
	public void limit_1 ()  {
	  this.BOPRestaurantsTotalCustomersAutos.setLimit_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPRestaurantsTotalCustomersAutos,"../BOPLocation/BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"LimitConverted"))) != 0){
			this.BOPRestaurantsTotalCustomersAutos.setLimit_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPRestaurantsTotalCustomersAutos.getLimit_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"LimitConverted"))))));
		}		}

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPRestaurantsTotalCustomersAutos.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPRestaurantsTotalCustomersAutos.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsTotalCustomersAutos,"../LCM")))) * this.BOPRestaurantsTotalCustomersAutos.getDedFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsTotalCustomersAutos,"../IRPMFactor")))));

	  
	}
	public void Charge () throws LookupException,NumberFormatException {
	  this.BOPRestaurantsTotalCustomersAutos.setCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RestaurantCustomersAutoCharge",String.valueOf(this.BOPRestaurantsTotalCustomersAutos.getLimitConverted()))));

	  
	}
	public void DedFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPRestaurantsTotalCustomersAutos.getOTCEachAutoDed().equals(MathHelper.getStringValue("")) && !this.BOPRestaurantsTotalCustomersAutos.getOTCAnyOneEventDed().equals(MathHelper.getStringValue("")) && !this.BOPRestaurantsTotalCustomersAutos.getCollisionDed().equals(MathHelper.getStringValue(""))){
			this.BOPRestaurantsTotalCustomersAutos.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RestaurantBuildingsCustomersAutosDedFactor",String.valueOf(this.BOPRestaurantsTotalCustomersAutos.getOTCEachAutoDed()),String.valueOf(this.BOPRestaurantsTotalCustomersAutos.getOTCAnyOneEventDed()),String.valueOf(this.BOPRestaurantsTotalCustomersAutos.getCollisionDed())))));
		}
		else{
			this.BOPRestaurantsTotalCustomersAutos.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPRestaurantsTotalCustomersAutos.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPRestaurantsTotalCustomersAutos.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPRestaurantsTotalCustomersAutos.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void OTCEachAutoDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPRestaurantsTotalCustomersAutos,"../BOPLocation/BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCEachAutoDed"))).equals(MathHelper.getStringValue(""))){
			this.BOPRestaurantsTotalCustomersAutos.setOTCEachAutoDed(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCEachAutoDed")))));
		}		}

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPRestaurantsTotalCustomersAutos (com.nest.res.bop.al09012019.domain.BOPRestaurantsTotalCustomersAutos BOPRestaurantsTotalCustomersAutos)  {
	  this.BOPRestaurantsTotalCustomersAutos = BOPRestaurantsTotalCustomersAutos;

	  
	}
	
	
	
	
	


	
}