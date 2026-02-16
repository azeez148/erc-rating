package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMedExpensesExcl  {

	
	
	
	private com.nest.res.bop.domain.BOPMedExpensesExcl BOPMedExpensesExcl;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	  
	}
	public void Premium ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPMedExpensesExcl,"../../BOPStructureLiabMedExpensesBldgCoverage"))) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMedExpensesExcl,"../../BOPStructureLiabMedExpensesBldgCoverage/Premium"))) > (double)0.0){
			this.BOPMedExpensesExcl.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMedExpensesExcl,"../../TotLessorsLiabPremium"))) * this.BOPMedExpensesExcl.getFactor()) * -1);
		}
		else{
		if(((XpathNode.selectNodeValue(this.BOPMedExpensesExcl,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage"))) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMedExpensesExcl,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/Premium"))) > (double)0.0){
			this.BOPMedExpensesExcl.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMedExpensesExcl,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/Premium"))) * this.BOPMedExpensesExcl.getFactor()) * -1);
		}
		else{
			this.BOPMedExpensesExcl.setPremium((double)0.0);
		}
		}
	  
	}
	public void ProcessPremium2 ()  {
	  
	ProcessPremium2_ProcessPremiumSub1();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPMedExpensesExcl.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MedicalExpensesFactor",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMedExpensesExcl.getPremium() != (double)0.0){
			this.BOPMedExpensesExcl.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPMedExpensesExcl.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium2_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPMedExpensesExcl (com.nest.res.bop.domain.BOPMedExpensesExcl BOPMedExpensesExcl)  {
	  this.BOPMedExpensesExcl = BOPMedExpensesExcl;

	  
	}
	
	
	
	
	


	
}