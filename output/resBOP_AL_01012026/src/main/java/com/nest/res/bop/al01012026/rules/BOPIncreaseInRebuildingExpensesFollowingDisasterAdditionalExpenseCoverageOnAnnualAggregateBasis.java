package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.setPremium(MathHelper.roundUpDoller((MathHelper.roundUpDoller((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis,"../BuildingLimit"))) * this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.getAdditionalExpenseCovPercentage() / MathHelper.getDoubleValue(100.0)) / MathHelper.getDoubleValue(100.0) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis,"../FinalBuildingRate"))) * this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.getIncreaseInRebuildingExpensesFollowingDisasterAdditonalExpenseCoverageOnAnnualAggregateBasisFactor())) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis,"../../../IRPMFactor")))));

	  
	}
	public  BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis (com.nest.res.bop.al01012026.domain.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis)  {
	  this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis = BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.setPremium(MathHelper.roundUpDoller((MathHelper.roundUpDoller((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis,"../BuildingLimit"))) * this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.getAdditionalExpenseCovPercentage() / MathHelper.getDoubleValue(100.0)) / MathHelper.getDoubleValue(100.0) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis,"../FinalBuildingRate"))) * this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.getIncreaseInRebuildingExpensesFollowingDisasterAdditonalExpenseCoverageOnAnnualAggregateBasisFactor())) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis,"../../../IRPMFactor")))));

	  
	}
	public void IncreaseInRebuildingExpensesFollowingDisasterAdditonalExpenseCoverageOnAnnualAggregateBasisFactor () throws LookupException,NumberFormatException {
	  this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.setIncreaseInRebuildingExpensesFollowingDisasterAdditonalExpenseCoverageOnAnnualAggregateBasisFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IncreaseInRebuildingExpensesFollowDisasterAddlExpenseCovOnAnnualAggBasisFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	IncreaseInRebuildingExpensesFollowingDisasterAdditonalExpenseCoverageOnAnnualAggregateBasisFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}