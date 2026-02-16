package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage;
	
	
	
	public  BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage (com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage)  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage = BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.getPremium() != (double)0.0){
			this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage,"../../InlandMarineLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage,"../DeductibleFactor")))) * ((double)this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.getDsLimit() / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage,"../../IRPMFactor")))));

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NonOwnedToolsAndEquipmentRate",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}