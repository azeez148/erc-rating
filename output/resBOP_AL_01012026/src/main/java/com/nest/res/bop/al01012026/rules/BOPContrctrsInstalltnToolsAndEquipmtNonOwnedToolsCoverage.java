package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public  BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage (com.nest.res.bop.al01012026.domain.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage)  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage = BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage;

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NonOwnedToolsAndEquipmentRate",String.valueOf( "Y"))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage,"../../InlandMarineLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage,"../DeductibleFactor")))) * (MathHelper.getDoubleValue(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage,"../../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage,"../../InlandMarineLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage,"../DeductibleFactor")))) * (MathHelper.getDoubleValue(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage,"../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}