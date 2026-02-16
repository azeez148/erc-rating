package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage;
	
	
	
	public  BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage (com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage)  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage = BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.getPremium() != (double)0.0){
			this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage,"../../InlandMarineLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage,"../DeductibleFactor")))) * ((double)this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.getDsLimit() / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage,"../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeToolsRate",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}