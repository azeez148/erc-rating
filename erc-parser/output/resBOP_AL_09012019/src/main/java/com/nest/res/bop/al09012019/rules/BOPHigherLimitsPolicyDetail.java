package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPHigherLimitsPolicyDetail  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPHigherLimitsPolicyDetail BOPHigherLimitsPolicyDetail;
	
	
	
	public void RevisedAmountOfInsurance ()  {
	  
		if(this.BOPHigherLimitsPolicyDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Electronic Data"))){
			this.BOPHigherLimitsPolicyDetail.setRevisedAmountOfInsurance(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPHigherLimitsPolicyDetail,"../../BOPElectronicDataCoverage/dsLimit")))));
		}
		else{
		if(this.BOPHigherLimitsPolicyDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Interruption Of Computer Operations"))){
			this.BOPHigherLimitsPolicyDetail.setRevisedAmountOfInsurance(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPHigherLimitsPolicyDetail,"../../BOPInterruptionComputerOpsCoverage/dsLimit")))));
		}
		else{
		if(this.BOPHigherLimitsPolicyDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Forgery And Alteration"))){
			this.BOPHigherLimitsPolicyDetail.setRevisedAmountOfInsurance(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPHigherLimitsPolicyDetail,"../../BOPForgeryAlterationCoverage/dsLimit")))));
		}
		else{
			this.BOPHigherLimitsPolicyDetail.setRevisedAmountOfInsurance(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		}
	  
	}
	public  BOPHigherLimitsPolicyDetail (com.nest.res.bop.al09012019.domain.BOPHigherLimitsPolicyDetail BOPHigherLimitsPolicyDetail)  {
	  this.BOPHigherLimitsPolicyDetail = BOPHigherLimitsPolicyDetail;

	  
	}
	public void CommonRating1 ()  {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public void AdditionalPremium ()  {
	  
		if(this.BOPHigherLimitsPolicyDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Electronic Data"))){
			this.BOPHigherLimitsPolicyDetail.setAdditionalPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHigherLimitsPolicyDetail,"../../BOPElectronicDataCoverage/Premium")))));
		}
		else{
		if(this.BOPHigherLimitsPolicyDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Interruption Of Computer Operations"))){
			this.BOPHigherLimitsPolicyDetail.setAdditionalPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHigherLimitsPolicyDetail,"../../BOPInterruptionComputerOpsCoverage/Premium")))));
		}
		else{
		if(this.BOPHigherLimitsPolicyDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Forgery And Alteration"))){
			this.BOPHigherLimitsPolicyDetail.setAdditionalPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHigherLimitsPolicyDetail,"../../BOPForgeryAlterationCoverage/Premium")))));
		}
		else{
			this.BOPHigherLimitsPolicyDetail.setAdditionalPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public void CommonRating1_CommonRatingSub1 ()  {
	  
	AdditionalPremium();
	
	RevisedAmountOfInsurance();
	
	  
	}
	
	
	
	
	


	
}