package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCondosCoOpsAssocsDirectorsAndOfficersLiab  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab BOPCondosCoOpsAssocsDirectorsAndOfficersLiab;
	
	
	
	public void ValidationCheckPremium ()  {
	  this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.setValidationCheckPremium(MathHelper.roundUpDoller(this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getManualBaseRate() * (this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getLOIFactor() - this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getDedDiscountFactor())));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.setPremium(MathHelper.roundUpDoller((MathHelper.roundUpDoller(this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getManualBaseRate() * (this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getLOIFactor() - this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getDedDiscountFactor())) + this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getExtendedReportingPeriodPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.setPremium(MathHelper.roundUpDoller((MathHelper.roundUpDoller(this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getManualBaseRate() * (this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getLOIFactor() - this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getDedDiscountFactor())) + this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getExtendedReportingPeriodPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	LOIFactor();
	
	DedDiscountFactor();
	
	ValidationCheckPremium();
	
	  
	}
	public void LOIFactor () throws LookupException,NumberFormatException {
	  this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.setLOIFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CondosDOLOIFactor",String.valueOf(this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getAggLimit()))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public  BOPCondosCoOpsAssocsDirectorsAndOfficersLiab (com.nest.res.bop.al01012026.domain.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab BOPCondosCoOpsAssocsDirectorsAndOfficersLiab)  {
	  this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab = BOPCondosCoOpsAssocsDirectorsAndOfficersLiab;

	  
	}
	public void DedDiscountFactor () throws LookupException,NumberFormatException {
	  this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.setDedDiscountFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CondosDODedDiscountFactor",String.valueOf(this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getDeductible()))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	LOIFactor();
	
	DedDiscountFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}