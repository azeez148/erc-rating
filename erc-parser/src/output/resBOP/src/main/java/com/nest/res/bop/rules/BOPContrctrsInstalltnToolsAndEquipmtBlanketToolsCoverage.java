package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage;
	
	
	
	public void ActualCashValueFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.getActualCashValueOption().equals((String)"Yes")){
			this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.setActualCashValueFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ContractorsToolsAndEquipmentBlanketBasisActualCashValueFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.setActualCashValueFactor((double)1.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage,"../../InlandMarineLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage,"../DeductibleFactor")))) * ((double)this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.getDsLimit() / (double)100.0)) * this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.getActualCashValueFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage,"../../IRPMFactor")))));

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ContractorsToolsAndEquipmentBlanketBasisRate",((String)XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage," ../SubLimitNotInExcess")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.getPremium() != (double)0.0){
			this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage (com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage)  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage = BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	ActualCashValueFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}