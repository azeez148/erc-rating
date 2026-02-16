package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage;
	
	
	
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ContractorsToolsAndEquipmentScheduledBasisRate",String.valueOf( "Y"))));

	  
	}
	public  BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage (com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage)  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage = BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage,"../../InlandMarineLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage,"../DeductibleFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage,"../ScheduledLimit"))) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage,"../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.getPremium() != (double)0.0){
			this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}