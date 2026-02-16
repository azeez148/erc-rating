package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage;
	
	
	
	public void Premium ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage,"../../InlandMarineLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage,"../DeductibleFactor")))) * (MathHelper.getDoubleValue(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage,"../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage,"../../InlandMarineLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage,"../DeductibleFactor")))) * (MathHelper.getDoubleValue(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage,"../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public  BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage (com.nest.res.bop.al09012019.domain.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage)  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage = BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage;

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeToolsRate",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}