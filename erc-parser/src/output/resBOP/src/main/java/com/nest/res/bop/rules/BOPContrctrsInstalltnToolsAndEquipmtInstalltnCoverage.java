package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.getPremium() != (double)0.0){
			this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage (com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage)  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage = BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage;

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ContractorsInstallationRate",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage,"../../InlandMarineLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage,"../DeductibleFactor")))) * ((double)this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.getDsLimit() / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage,"../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}