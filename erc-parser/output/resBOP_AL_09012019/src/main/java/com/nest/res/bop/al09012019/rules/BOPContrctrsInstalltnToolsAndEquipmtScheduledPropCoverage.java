package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage;
	private double limitCount_1;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage,"../../InlandMarineLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage,"../DeductibleFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage,"../ScheduledLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage,"../../IRPMFactor")))));

	  
	}
	public  BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage (com.nest.res.bop.al09012019.domain.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage)  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage = BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage,"../../InlandMarineLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage,"../DeductibleFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage,"../ScheduledLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage,"../../IRPMFactor")))));

	  
	}
	public void limitCount_1 ()  {
	  this.limitCount_1 = MathHelper.getIntegerValue(0.0);

		for( Policy policy : XpathNode.selectNodes(BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage,"../BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsLimit"))) > MathHelper.getIntegerValue(0.0)){
			this.limitCount_1 = MathHelper.getIntegerValue(this.limitCount_1 + MathHelper.getIntegerValue(1.0));
		}		}

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.limitCount_1 > MathHelper.getIntegerValue(0.0)){
			this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ContractorsToolsAndEquipmentScheduledBasisRate",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	limitCount_1();
	
	CoverageOnPolicyIndicator();
	
	  
	}
	
	
	
	
	


	
}