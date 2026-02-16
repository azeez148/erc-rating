package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems.setPremium(MathHelper.roundUpDoller(this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems,"../IRPMFactor")))));

	  
	}
	public  BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems (com.nest.res.bop.al09012019.domain.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems)  {
	  this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems = BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems.setPremium(MathHelper.roundUpDoller(this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}