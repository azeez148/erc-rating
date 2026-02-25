package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControlDetail;

public class BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl;
	private List<BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControlDetail> BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControlDetailList;
	
	
	
	public void Charge () throws LookupException,NumberFormatException {
	  
		if(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.getDsLimit() > MathHelper.getIntegerValue(0.0)){
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.setCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LossOrDamageToInviteesAutosCareCustodyOrControlRate",String.valueOf(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.getDsLimit())))));
		}
		else{
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.setCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void limit_1 ()  {
	  this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.setLimit_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl,"BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControlDetail") ){
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.setLimit_1(MathHelper.getIntegerValue(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.getLimit_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsLimit")))));
		}

	  
	}
	public void OTCEachAutoDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl,"BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControlDetail") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCEachAutoDed"))).equals(MathHelper.getStringValue(""))){
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.setOTCEachAutoDed(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCEachAutoDed")))));
		}		}

	  
	}
	public  BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl (com.nest.res.bop.al01012026.domain.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl)  {
	  this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl = BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl;
this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControlDetailList = BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.getBOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControlDetail();

	  
	}
	public void Limit ()  {
	  this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.setDsLimit(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.getLimit_1());

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl,"../LCM")))) * this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.getDedFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl,"../LCM")))) * this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.getDedFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl,"../IRPMFactor")))));

	  
	}
	public void OTCAnyOneEventDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl,"BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControlDetail") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCAnyOneEventDed"))).equals(MathHelper.getStringValue(""))){
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.setOTCAnyOneEventDed(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"OTCAnyOneEventDed")))));
		}		}

	  
	}
	public void CollisionDed ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl,"BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControlDetail") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"CollisionDed"))).equals(MathHelper.getStringValue(""))){
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.setCollisionDed(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"CollisionDed")))));
		}		}

	  
	}
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
	public void DedFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.getOTCEachAutoDed().equals(MathHelper.getStringValue("")) && !this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.getOTCAnyOneEventDed().equals(MathHelper.getStringValue("")) && !this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.getCollisionDed().equals(MathHelper.getStringValue(""))){
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LossOrDamageToInviteesAutosCareCustodyOrControlDeductibleFactor",String.valueOf(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.getOTCEachAutoDed()),String.valueOf(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.getOTCAnyOneEventDed()),String.valueOf(this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.getCollisionDed())))));
		}
		else{
			this.BOPLossOrDamageToInviteesAutosLegalLiabilityCoverageCareCustodyOrControl.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}