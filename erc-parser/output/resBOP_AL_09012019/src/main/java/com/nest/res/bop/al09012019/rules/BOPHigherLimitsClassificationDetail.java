package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPHigherLimitsClassificationDetail  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPHigherLimitsClassificationDetail BOPHigherLimitsClassificationDetail;
	
	
	
	public void CommonRating1 ()  {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public  BOPHigherLimitsClassificationDetail (com.nest.res.bop.al09012019.domain.BOPHigherLimitsClassificationDetail BOPHigherLimitsClassificationDetail)  {
	  this.BOPHigherLimitsClassificationDetail = BOPHigherLimitsClassificationDetail;

	  
	}
	public void RevisedAmountOfInsurance ()  {
	  
		if(this.BOPHigherLimitsClassificationDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Theft Limitations"))){
			this.BOPHigherLimitsClassificationDetail.setRevisedAmountOfInsurance(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPHigherLimitsClassificationDetail,"../../BOPTheftLimitationsCoverage/dsLimit")))));
		}
		else{
		if(this.BOPHigherLimitsClassificationDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Accounts Receivable"))){
			this.BOPHigherLimitsClassificationDetail.setRevisedAmountOfInsurance(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPHigherLimitsClassificationDetail,"../../BOPClassificationAccountsReceivableCoverage/dsLimit")))));
		}
		else{
		if(this.BOPHigherLimitsClassificationDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Valuable Papers"))){
			this.BOPHigherLimitsClassificationDetail.setRevisedAmountOfInsurance(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPHigherLimitsClassificationDetail,"../../BOPClassificationValuablePapersCoverage/dsLimit")))));
		}
		else{
		if(this.BOPHigherLimitsClassificationDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Business Income From Dependent Properties"))){
			this.BOPHigherLimitsClassificationDetail.setRevisedAmountOfInsurance(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPHigherLimitsClassificationDetail,"../../BOPClassificationBusnIncomeDependentPropCoverage/dsLimit")))));
		}
		else{
		if(this.BOPHigherLimitsClassificationDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Specified BPP Temporarily Away From Premises"))){
		if((XpathNode.selectNodeValue(this.BOPHigherLimitsClassificationDetail,"../../BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises")) != null){
			this.BOPHigherLimitsClassificationDetail.setRevisedAmountOfInsurance(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPHigherLimitsClassificationDetail,"../../BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises/dsLimit")))));
		}
		else{
			this.BOPHigherLimitsClassificationDetail.setRevisedAmountOfInsurance(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		else{
		if(this.BOPHigherLimitsClassificationDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Outdoor Property"))){
			this.BOPHigherLimitsClassificationDetail.setRevisedAmountOfInsurance(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPHigherLimitsClassificationDetail,"../../BOPClassificationOutdoorPropertyCoverage/dsLimit")))));
		}
		else{
			this.BOPHigherLimitsClassificationDetail.setRevisedAmountOfInsurance(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		}
		}
		}
		}
	  
	}
	public void CommonRating1_CommonRatingSub1 ()  {
	  
	AdditionalPremium();
	
	RevisedAmountOfInsurance();
	
	  
	}
	public void AdditionalPremium ()  {
	  
		if(this.BOPHigherLimitsClassificationDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Theft Limitations"))){
			this.BOPHigherLimitsClassificationDetail.setAdditionalPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHigherLimitsClassificationDetail,"../../BOPTheftLimitationsCoverage/Premium")))));
		}
		else{
		if(this.BOPHigherLimitsClassificationDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Accounts Receivable"))){
			this.BOPHigherLimitsClassificationDetail.setAdditionalPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHigherLimitsClassificationDetail,"../../BOPClassificationAccountsReceivableCoverage/Premium")))));
		}
		else{
		if(this.BOPHigherLimitsClassificationDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Valuable Papers"))){
			this.BOPHigherLimitsClassificationDetail.setAdditionalPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHigherLimitsClassificationDetail,"../../BOPClassificationValuablePapersCoverage/Premium")))));
		}
		else{
		if(this.BOPHigherLimitsClassificationDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Business Income From Dependent Properties"))){
			this.BOPHigherLimitsClassificationDetail.setAdditionalPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHigherLimitsClassificationDetail,"../../BOPClassificationBusnIncomeDependentPropCoverage/Premium")))));
		}
		else{
		if(this.BOPHigherLimitsClassificationDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Specified BPP Temporarily Away From Premises"))){
		if((XpathNode.selectNodeValue(this.BOPHigherLimitsClassificationDetail,"../../BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises")) != null){
			this.BOPHigherLimitsClassificationDetail.setAdditionalPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHigherLimitsClassificationDetail,"../../BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises/Premium")))));
		}
		else{
			this.BOPHigherLimitsClassificationDetail.setAdditionalPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
		if(this.BOPHigherLimitsClassificationDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Outdoor Property"))){
			this.BOPHigherLimitsClassificationDetail.setAdditionalPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHigherLimitsClassificationDetail,"../../BOPClassificationOutdoorPropertyCoverage/Premium")))));
		}
		else{
			this.BOPHigherLimitsClassificationDetail.setAdditionalPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
		}
		}
	  
	}
	
	
	
	
	


	
}