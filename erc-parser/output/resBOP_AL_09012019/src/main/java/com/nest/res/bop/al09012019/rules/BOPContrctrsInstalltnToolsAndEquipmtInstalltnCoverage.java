package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage;
	
	
	
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage,"../../InlandMarineLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage,"../DeductibleFactor")))) * (MathHelper.getDoubleValue(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage,"../../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage,"../../InlandMarineLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage,"../DeductibleFactor")))) * (MathHelper.getDoubleValue(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage,"../../IRPMFactor")))));

	  
	}
	public  BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage (com.nest.res.bop.al09012019.domain.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage)  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage = BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ContractorsInstallationRate",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}