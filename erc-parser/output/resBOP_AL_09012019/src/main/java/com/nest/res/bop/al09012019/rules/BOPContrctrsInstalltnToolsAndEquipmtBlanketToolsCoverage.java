package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage;
	
	
	
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public  BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage (com.nest.res.bop.al09012019.domain.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage)  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage = BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage;

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ContractorsToolsAndEquipmentBlanketBasisRate",String.valueOf(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage,"../SubLimitNotInExcess")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	ActualCashValueFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage,"../../InlandMarineLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage,"../DeductibleFactor")))) * (MathHelper.getDoubleValue(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0))) * this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.getActualCashValueFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage,"../../IRPMFactor")))));

	  
	}
	public void ActualCashValueFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.getActualCashValueOption().equals(MathHelper.getStringValue("Yes"))){
			this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.setActualCashValueFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ContractorsToolsAndEquipmentBlanketBasisActualCashValueFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.setActualCashValueFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage,"../../InlandMarineLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage,"../DeductibleFactor")))) * (MathHelper.getDoubleValue(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0))) * this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.getActualCashValueFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage,"../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}