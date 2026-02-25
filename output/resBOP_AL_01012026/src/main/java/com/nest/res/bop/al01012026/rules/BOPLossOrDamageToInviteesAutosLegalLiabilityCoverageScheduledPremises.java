package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremisesDetail;

public class BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises;
	private List<BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremisesDetail> BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremisesDetailList;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	limit_1();
	
	Limit();
	
	OTCEachAutoDed();
	
	OTCAnyOneEventDed();
	
	CollisionDed();
	
	Charge();
	
	DedFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises (com.nest.res.bop.al01012026.domain.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises)  {
	  this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises = BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises;
this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremisesDetailList = BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.getBOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremisesDetail();

	  
	}
	public void Charge () throws LookupException,NumberFormatException {
	  
		if(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.getDsLimit() > MathHelper.getIntegerValue(0.0)){
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.setCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LossOrDamageToInviteesAutosScheduledPremisesRate",String.valueOf(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.getDsLimit())))));
		}
		else{
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.setCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void Limit ()  {
	  this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.setDsLimit(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.getLimit_1());

	  
	}
	public void DedFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.getOTCEachAutoDed().equals(MathHelper.getStringValue("")) && !this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.getOTCAnyOneEventDed().equals(MathHelper.getStringValue("")) && !this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.getCollisionDed().equals(MathHelper.getStringValue(""))){
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LossOrDamageToInviteesAutosScheduledPremisesDeductibleFactor",String.valueOf(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.getOTCEachAutoDed()),String.valueOf(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.getOTCAnyOneEventDed()),String.valueOf(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.getCollisionDed())))));
		}
		else{
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises,"../LCM")))) * this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.getDedFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises,"../IRPMFactor")))));

	  
	}
	public void OTCAnyOneEventDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises,"BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremisesDetail") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCAnyOneEventDed"))).equals(MathHelper.getStringValue(""))){
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.setOTCAnyOneEventDed(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCAnyOneEventDed")))));
		}		}

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void Premium ()  {
	  this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises,"../LCM")))) * this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.getDedFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises,"../IRPMFactor")))));

	  
	}
	public void OTCEachAutoDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises,"BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremisesDetail") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCEachAutoDed"))).equals(MathHelper.getStringValue(""))){
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.setOTCEachAutoDed(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCEachAutoDed")))));
		}		}

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void limit_1 ()  {
	  this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.setLimit_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises,"BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremisesDetail") ){
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.setLimit_1(MathHelper.getIntegerValue(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.getLimit_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsLimit")))));
		}

	  
	}
	public void CollisionDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises,"BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremisesDetail") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"CollisionDed"))).equals(MathHelper.getStringValue(""))){
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageScheduledPremises.setCollisionDed(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"CollisionDed")))));
		}		}

	  
	}
	
	
	
	
	


	
}