package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgramDetail;

public class BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram  {

	
	
	
	private List<BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgramDetail> BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgramDetailList;
	private com.nest.res.bop.al01012026.domain.BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram.setPremium(MathHelper.roundUpDoller(this.BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram.setPremium(MathHelper.roundUpDoller(this.BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public  BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram (com.nest.res.bop.al01012026.domain.BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram)  {
	  this.BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram = BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram;
this.BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgramDetailList = BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram.getBOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgramDetail();

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLimitedExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}