package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBrandsAndLabels  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPBrandsAndLabels BOPBrandsAndLabels;
	
	
	
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPBrandsAndLabels.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BrandsAndLabelsFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPBrandsAndLabels.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(0.0) - (MathHelper.getDoubleValue(1.0) - this.BOPBrandsAndLabels.getFactor())) * this.BOPBrandsAndLabels.getTotBPPPremium_1()));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	totBPPPremium_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPBrandsAndLabels.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(0.0) - (MathHelper.getDoubleValue(1.0) - this.BOPBrandsAndLabels.getFactor())) * this.BOPBrandsAndLabels.getTotBPPPremium_1()));

	  
	}
	public void totBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPBrandsAndLabels,"../BOPClassificationBusnPrsnlPropCoverage").size() > 0.0){
			this.BOPBrandsAndLabels.setTotBPPPremium_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBrandsAndLabels,"../BOPClassificationBusnPrsnlPropCoverage/Premium")))));
		}
		else{
			this.BOPBrandsAndLabels.setTotBPPPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBrandsAndLabels.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPBrandsAndLabels.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBrandsAndLabels.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPBrandsAndLabels (com.nest.res.bop.al09012019.domain.BOPBrandsAndLabels BOPBrandsAndLabels)  {
	  this.BOPBrandsAndLabels = BOPBrandsAndLabels;

	  
	}
	
	
	
	
	


	
}