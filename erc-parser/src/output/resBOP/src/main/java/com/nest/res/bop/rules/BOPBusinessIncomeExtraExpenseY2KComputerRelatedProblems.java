package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems  {

	
	
	
	private com.nest.res.bop.domain.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems.setPremium(MathHelper.roundUpDoller(this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems,"../IRPMFactor")))));

	  
	}
	public  BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems (com.nest.res.bop.domain.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems)  {
	  this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems = BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems.getPremium() != (double)0.0){
			this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}