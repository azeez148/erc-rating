package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPMicroClassification;

public class BOPMicroLocation  {

	
	
	
	private com.nest.res.bop.al01012026.rules.BOPMicroClassification BOPMicroClassificationRule;
	private com.nest.res.bop.al01012026.domain.BOPMicroLocation BOPMicroLocation;
	private List<BOPMicroClassification> BOPMicroClassificationList;
	
	
	
	public  BOPMicroLocation (com.nest.res.bop.al01012026.domain.BOPMicroLocation BOPMicroLocation)  {
	  this.BOPMicroLocation = BOPMicroLocation;
this.BOPMicroClassificationList = BOPMicroLocation.getBOPMicroClassification();

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	MicroLCM();
	
	OptionalDeductibleFactor();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPMicroClassificationList){
		for(BOPMicroClassification BOPMicroClassification:BOPMicroClassificationList){
			BOPMicroClassificationRule = new com.nest.res.bop.al01012026.rules.BOPMicroClassification(BOPMicroClassification);
			BOPMicroClassificationRule.ProcessPremium1();

		}
	}
	  
	}
	public void MicroLCM ()  {
	  this.BOPMicroLocation.setMicroLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroLocation,"../MicroLCM"))));

	  
	}
	public void OptionalDeductibleFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPMicroLocation.getOptionalDeductible().equals(MathHelper.getStringValue(""))){
			this.BOPMicroLocation.setOptionalDeductibleFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroPropertyDeductibleOptionFactor",String.valueOf(this.BOPMicroLocation.getOptionalDeductible())))));
		}
		else{
			this.BOPMicroLocation.setOptionalDeductibleFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium2 () throws LookupException,NumberFormatException {
	  
	if(null != BOPMicroClassificationList){
		for(BOPMicroClassification BOPMicroClassification:BOPMicroClassificationList){
			BOPMicroClassificationRule = new com.nest.res.bop.al01012026.rules.BOPMicroClassification(BOPMicroClassification);
			BOPMicroClassificationRule.ProcessPremium2();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPMicroLocation,"BOPMicroClassification") ){
			this.BOPMicroLocation.setPremium(MathHelper.getDoubleValue(this.BOPMicroLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	
	
	
	
	


	
}