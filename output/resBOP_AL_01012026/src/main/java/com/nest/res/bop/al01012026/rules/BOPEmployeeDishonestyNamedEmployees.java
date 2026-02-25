package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPEmployeeDishonestyNamedEmployeesDetail;

public class BOPEmployeeDishonestyNamedEmployees  {

	
	
	
	private List<BOPEmployeeDishonestyNamedEmployeesDetail> BOPEmployeeDishonestyNamedEmployeesDetailList;
	private com.nest.res.bop.al01012026.domain.BOPEmployeeDishonestyNamedEmployees BOPEmployeeDishonestyNamedEmployees;
	
	
	
	public  BOPEmployeeDishonestyNamedEmployees (com.nest.res.bop.al01012026.domain.BOPEmployeeDishonestyNamedEmployees BOPEmployeeDishonestyNamedEmployees)  {
	  this.BOPEmployeeDishonestyNamedEmployees = BOPEmployeeDishonestyNamedEmployees;
this.BOPEmployeeDishonestyNamedEmployeesDetailList = BOPEmployeeDishonestyNamedEmployees.getBOPEmployeeDishonestyNamedEmployeesDetail();

	  
	}
	public void Premium ()  {
	  this.BOPEmployeeDishonestyNamedEmployees.setPremium(MathHelper.roundUpDoller(this.BOPEmployeeDishonestyNamedEmployees.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmployeeDishonestyNamedEmployees,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPEmployeeDishonestyNamedEmployees.setPremium(MathHelper.roundUpDoller(this.BOPEmployeeDishonestyNamedEmployees.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmployeeDishonestyNamedEmployees,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPEmployeeDishonestyNamedEmployees.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPEmployeeDishonestyNamedEmployees.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPEmployeeDishonestyNamedEmployees.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}