package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPDiscretionaryPayrollExpenseDetail;

public class BOPDiscretionaryPayrollExpense  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPDiscretionaryPayrollExpense BOPDiscretionaryPayrollExpense;
	private List<BOPDiscretionaryPayrollExpenseDetail> BOPDiscretionaryPayrollExpenseDetailList;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPDiscretionaryPayrollExpense.setPremium(MathHelper.roundUpDoller(this.BOPDiscretionaryPayrollExpense.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDiscretionaryPayrollExpense,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void Premium ()  {
	  this.BOPDiscretionaryPayrollExpense.setPremium(MathHelper.roundUpDoller(this.BOPDiscretionaryPayrollExpense.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDiscretionaryPayrollExpense,"../IRPMFactor")))));

	  
	}
	public  BOPDiscretionaryPayrollExpense (com.nest.res.bop.al09012019.domain.BOPDiscretionaryPayrollExpense BOPDiscretionaryPayrollExpense)  {
	  this.BOPDiscretionaryPayrollExpense = BOPDiscretionaryPayrollExpense;
this.BOPDiscretionaryPayrollExpenseDetailList = BOPDiscretionaryPayrollExpense.getBOPDiscretionaryPayrollExpenseDetail();

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPDiscretionaryPayrollExpense.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPDiscretionaryPayrollExpense.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPDiscretionaryPayrollExpense.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}