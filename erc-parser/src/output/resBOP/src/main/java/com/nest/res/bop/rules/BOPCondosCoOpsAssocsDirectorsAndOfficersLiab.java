package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCondosCoOpsAssocsDirectorsAndOfficersLiab  {

	
	
	
	private com.nest.res.bop.domain.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab BOPCondosCoOpsAssocsDirectorsAndOfficersLiab;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getPremium() != (double)0.0){
			this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPCondosCoOpsAssocsDirectorsAndOfficersLiab (com.nest.res.bop.domain.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab BOPCondosCoOpsAssocsDirectorsAndOfficersLiab)  {
	  this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab = BOPCondosCoOpsAssocsDirectorsAndOfficersLiab;

	  
	}
	public void LOIFactor () throws LookupException,NumberFormatException {
	  this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.setLOIFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CondosDOLOIFactor",String.valueOf(BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getAggLimit()))));

	  
	}
	public void DedDiscountFactor () throws LookupException,NumberFormatException {
	  this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.setDedDiscountFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CondosDODedDiscountFactor",String.valueOf(BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getDeductible()))));

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	LOIFactor();
	
	DedDiscountFactor();
	
	ValidationCheckPremium();
	
	  
	}
	public void Premium ()  {
	  this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.setPremium(MathHelper.roundUpDoller((MathHelper.roundUpDoller(this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getManualBaseRate() * (this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getLOIFactor() - this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getDedDiscountFactor())) + this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getExtendedReportingPeriodPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab,"../IRPMFactor")))));

	  
	}
	public void ValidationCheckPremium ()  {
	  this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.setValidationCheckPremium(MathHelper.roundUpDoller(this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getManualBaseRate() * (this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getLOIFactor() - this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getDedDiscountFactor())));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	LOIFactor();
	
	DedDiscountFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	
	
	
	
	


	
}