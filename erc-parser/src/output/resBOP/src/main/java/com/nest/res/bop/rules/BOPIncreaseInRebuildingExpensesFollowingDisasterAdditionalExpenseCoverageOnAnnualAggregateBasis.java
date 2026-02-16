package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis  {

	
	
	
	private com.nest.res.bop.domain.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis;
	
	
	
	public void Premium ()  {
	  this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.setPremium(MathHelper.roundUpDoller((MathHelper.roundUpDoller((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis,"../BuildingLimit"))) * this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.getAdditionalExpenseCovPercentage() / (double)100.0) / (double)100.0 * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis,"../FinalBuildingRate"))) * this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.getIncreaseInRebuildingExpensesFollowingDisasterAdditonalExpenseCoverageOnAnnualAggregateBasisFactor())) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis,"../../../IRPMFactor")))));

	  
	}
	public  BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis (com.nest.res.bop.domain.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis)  {
	  this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis = BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.getPremium() != (double)0.0){
			this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	IncreaseInRebuildingExpensesFollowingDisasterAdditonalExpenseCoverageOnAnnualAggregateBasisFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void IncreaseInRebuildingExpensesFollowingDisasterAdditonalExpenseCoverageOnAnnualAggregateBasisFactor () throws LookupException,NumberFormatException {
	  this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.setIncreaseInRebuildingExpensesFollowingDisasterAdditonalExpenseCoverageOnAnnualAggregateBasisFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IncreaseInRebuildingExpensesFollowDisasterAddlExpenseCovOnAnnualAggBasisFactor",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}