package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBrandsAndLabels  {

	
	
	
	private com.nest.res.bop.domain.BOPBrandsAndLabels BOPBrandsAndLabels;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPBrandsAndLabels.getPremium() != (double)0.0){
			this.BOPBrandsAndLabels.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPBrandsAndLabels.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPBrandsAndLabels (com.nest.res.bop.domain.BOPBrandsAndLabels BOPBrandsAndLabels)  {
	  this.BOPBrandsAndLabels = BOPBrandsAndLabels;

	  
	}
	public void Premium ()  {
	  this.BOPBrandsAndLabels.setPremium(MathHelper.roundUpDoller(((double)0.0 - ((double)1.0 - this.BOPBrandsAndLabels.getFactor())) * this.BOPBrandsAndLabels.getTotBPPPremium_1()));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	totBPPPremium_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPBrandsAndLabels.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BrandsAndLabelsFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void totBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPBrandsAndLabels,"../BOPClassificationBusnPrsnlPropCoverage").size() > 0.0){
			this.BOPBrandsAndLabels.setTotBPPPremium_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBrandsAndLabels,"../BOPClassificationBusnPrsnlPropCoverage/Premium"))));
		}
		else{
			this.BOPBrandsAndLabels.setTotBPPPremium_1((double)0.0);
		}
	  
	}
	
	
	
	
	


	
}