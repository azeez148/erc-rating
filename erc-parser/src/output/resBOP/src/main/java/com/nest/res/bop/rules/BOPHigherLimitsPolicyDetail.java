package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPHigherLimitsPolicyDetail  {

	
	
	
	private com.nest.res.bop.domain.BOPHigherLimitsPolicyDetail BOPHigherLimitsPolicyDetail;
	
	
	
	public void RevisedAmountOfInsurance ()  {
	  
		if(this.BOPHigherLimitsPolicyDetail.getDescriptionOfCoverage().equals((String)"Electronic Data")){
			this.BOPHigherLimitsPolicyDetail.setRevisedAmountOfInsurance((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPHigherLimitsPolicyDetail,"../../BOPElectronicDataCoverage/dsLimit"))));
		}
		else{
		if(this.BOPHigherLimitsPolicyDetail.getDescriptionOfCoverage().equals((String)"Interruption Of Computer Operations")){
			this.BOPHigherLimitsPolicyDetail.setRevisedAmountOfInsurance((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPHigherLimitsPolicyDetail,"../../BOPInterruptionComputerOpsCoverage/dsLimit"))));
		}
		else{
		if(this.BOPHigherLimitsPolicyDetail.getDescriptionOfCoverage().equals((String)"Forgery And Alteration")){
			this.BOPHigherLimitsPolicyDetail.setRevisedAmountOfInsurance((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPHigherLimitsPolicyDetail,"../../BOPForgeryAlterationCoverage/dsLimit"))));
		}
		else{
			this.BOPHigherLimitsPolicyDetail.setRevisedAmountOfInsurance((int)0.0);
		}
		}
		}
	  
	}
	public void CommonRating1 ()  {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public  BOPHigherLimitsPolicyDetail (com.nest.res.bop.domain.BOPHigherLimitsPolicyDetail BOPHigherLimitsPolicyDetail)  {
	  this.BOPHigherLimitsPolicyDetail = BOPHigherLimitsPolicyDetail;

	  
	}
	public void AdditionalPremium ()  {
	  
		if(this.BOPHigherLimitsPolicyDetail.getDescriptionOfCoverage().equals((String)"Electronic Data")){
			this.BOPHigherLimitsPolicyDetail.setAdditionalPremium((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHigherLimitsPolicyDetail,"../../BOPElectronicDataCoverage/Premium"))));
		}
		else{
		if(this.BOPHigherLimitsPolicyDetail.getDescriptionOfCoverage().equals((String)"Interruption Of Computer Operations")){
			this.BOPHigherLimitsPolicyDetail.setAdditionalPremium((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHigherLimitsPolicyDetail,"../../BOPInterruptionComputerOpsCoverage/Premium"))));
		}
		else{
		if(this.BOPHigherLimitsPolicyDetail.getDescriptionOfCoverage().equals((String)"Forgery And Alteration")){
			this.BOPHigherLimitsPolicyDetail.setAdditionalPremium((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHigherLimitsPolicyDetail,"../../BOPForgeryAlterationCoverage/Premium"))));
		}
		else{
			this.BOPHigherLimitsPolicyDetail.setAdditionalPremium((double)0.0);
		}
		}
		}
	  
	}
	public void CommonRating1_CommonRatingSub1 ()  {
	  
	AdditionalPremium();
	
	RevisedAmountOfInsurance();
	
	  
	}
	
	
	
	
	


	
}