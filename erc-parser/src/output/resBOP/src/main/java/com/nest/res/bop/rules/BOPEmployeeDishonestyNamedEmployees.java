package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEmployeeDishonestyNamedEmployees  {

	
	
	
	private com.nest.res.bop.domain.BOPEmployeeDishonestyNamedEmployees BOPEmployeeDishonestyNamedEmployees;
	
	
	
	public  BOPEmployeeDishonestyNamedEmployees (com.nest.res.bop.domain.BOPEmployeeDishonestyNamedEmployees BOPEmployeeDishonestyNamedEmployees)  {
	  this.BOPEmployeeDishonestyNamedEmployees = BOPEmployeeDishonestyNamedEmployees;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPEmployeeDishonestyNamedEmployees.getPremium() != (double)0.0){
			this.BOPEmployeeDishonestyNamedEmployees.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPEmployeeDishonestyNamedEmployees.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPEmployeeDishonestyNamedEmployees.setPremium(MathHelper.roundUpDoller(this.BOPEmployeeDishonestyNamedEmployees.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmployeeDishonestyNamedEmployees,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}