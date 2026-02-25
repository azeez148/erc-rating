package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMedExpensesExcl  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMedExpensesExcl BOPMedExpensesExcl;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPMedExpensesExcl,"../../BOPStructureLiabMedExpensesBldgCoverage")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMedExpensesExcl,"../../BOPStructureLiabMedExpensesBldgCoverage/Premium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPMedExpensesExcl.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMedExpensesExcl,"../../TotLessorsLiabPremium"))) * this.BOPMedExpensesExcl.getFactor()) * -1)));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPMedExpensesExcl,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMedExpensesExcl,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/Premium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPMedExpensesExcl.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMedExpensesExcl,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/Premium"))) * this.BOPMedExpensesExcl.getFactor()) * -1)));
		}
		else{
			this.BOPMedExpensesExcl.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public  BOPMedExpensesExcl (com.nest.res.bop.al01012026.domain.BOPMedExpensesExcl BOPMedExpensesExcl)  {
	  this.BOPMedExpensesExcl = BOPMedExpensesExcl;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMedExpensesExcl.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPMedExpensesExcl.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMedExpensesExcl.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPMedExpensesExcl.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MedicalExpensesFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	  
	}
	public void ProcessPremium2 ()  {
	  
	ProcessPremium2_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
	  
	}
	public void ProcessPremium2_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}