package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPRestaurantsTotalCustomersAutos  {

	
	
	
	private com.nest.res.bop.domain.BOPRestaurantsTotalCustomersAutos BOPRestaurantsTotalCustomersAutos;
	
	
	
	public  BOPRestaurantsTotalCustomersAutos (com.nest.res.bop.domain.BOPRestaurantsTotalCustomersAutos BOPRestaurantsTotalCustomersAutos)  {
	  this.BOPRestaurantsTotalCustomersAutos = BOPRestaurantsTotalCustomersAutos;

	  
	}
	public void limit_1 ()  {
	  this.BOPRestaurantsTotalCustomersAutos.setLimit_1((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPRestaurantsTotalCustomersAutos,"../BOPLocation/BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"LimitConverted"))) != 0){
			this.BOPRestaurantsTotalCustomersAutos.setLimit_1(Integer.valueOf(this.BOPRestaurantsTotalCustomersAutos.getLimit_1()) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"LimitConverted"))));
		}		}

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPRestaurantsTotalCustomersAutos.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPRestaurantsTotalCustomersAutos.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsTotalCustomersAutos,"../LCM")))) * this.BOPRestaurantsTotalCustomersAutos.getDedFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsTotalCustomersAutos,"../IRPMFactor")))));

	  
	}
	public void DedFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPRestaurantsTotalCustomersAutos.getOTCEachAutoDed().equals((String)"") && !this.BOPRestaurantsTotalCustomersAutos.getOTCAnyOneEventDed().equals((String)"") && !this.BOPRestaurantsTotalCustomersAutos.getCollisionDed().equals((String)"")){
			this.BOPRestaurantsTotalCustomersAutos.setDedFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RestaurantBuildingsCustomersAutosDedFactor",String.valueOf(BOPRestaurantsTotalCustomersAutos.getOTCEachAutoDed()),String.valueOf(BOPRestaurantsTotalCustomersAutos.getOTCAnyOneEventDed()),String.valueOf(BOPRestaurantsTotalCustomersAutos.getCollisionDed()))));
		}
		else{
			this.BOPRestaurantsTotalCustomersAutos.setDedFactor((double)0.0);
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPRestaurantsTotalCustomersAutos.getPremium() != (double)0.0){
			this.BOPRestaurantsTotalCustomersAutos.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPRestaurantsTotalCustomersAutos.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void LimitConverted ()  {
	  this.BOPRestaurantsTotalCustomersAutos.setLimitConverted(this.BOPRestaurantsTotalCustomersAutos.getLimit_1());

	  
	}
	public void CollisionDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPRestaurantsTotalCustomersAutos,"../BOPLocation/BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"CollisionDed"))).equals((String)"")){
			this.BOPRestaurantsTotalCustomersAutos.setCollisionDed((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"CollisionDed"))));
		}		}

	  
	}
	public void OTCAnyOneEventDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPRestaurantsTotalCustomersAutos,"../BOPLocation/BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCAnyOneEventDed"))).equals((String)"")){
			this.BOPRestaurantsTotalCustomersAutos.setOTCAnyOneEventDed((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCAnyOneEventDed"))));
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
	public void Charge () throws LookupException,NumberFormatException {
	  this.BOPRestaurantsTotalCustomersAutos.setCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RestaurantCustomersAutoCharge",String.valueOf(BOPRestaurantsTotalCustomersAutos.getLimitConverted()))));

	  
	}
	public void OTCEachAutoDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPRestaurantsTotalCustomersAutos,"../BOPLocation/BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCEachAutoDed"))).equals((String)"")){
			this.BOPRestaurantsTotalCustomersAutos.setOTCEachAutoDed((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCEachAutoDed"))));
		}		}

	  
	}
	
	
	
	
	


	
}