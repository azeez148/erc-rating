package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPAddlInsdConcessionairesTradingUnderYourNameDetail;

public class BOPAddlInsdConcessionairesTradingUnderYourName  {

	
	
	
	private List<BOPAddlInsdConcessionairesTradingUnderYourNameDetail> BOPAddlInsdConcessionairesTradingUnderYourNameDetailList;
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdConcessionairesTradingUnderYourName BOPAddlInsdConcessionairesTradingUnderYourName;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdConcessionairesTradingUnderYourName.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdConcessionairesTradingUnderYourName.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdConcessionairesTradingUnderYourName,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPAddlInsdConcessionairesTradingUnderYourName (com.nest.res.bop.al01012026.domain.BOPAddlInsdConcessionairesTradingUnderYourName BOPAddlInsdConcessionairesTradingUnderYourName)  {
	  this.BOPAddlInsdConcessionairesTradingUnderYourName = BOPAddlInsdConcessionairesTradingUnderYourName;
this.BOPAddlInsdConcessionairesTradingUnderYourNameDetailList = BOPAddlInsdConcessionairesTradingUnderYourName.getBOPAddlInsdConcessionairesTradingUnderYourNameDetail();

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdConcessionairesTradingUnderYourName.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdConcessionairesTradingUnderYourName.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdConcessionairesTradingUnderYourName,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdConcessionairesTradingUnderYourName.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdConcessionairesTradingUnderYourName.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdConcessionairesTradingUnderYourName.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}