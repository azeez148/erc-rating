package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgramDetail;

public class BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram  {

	
	
	
	private List<BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgramDetail> BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgramDetailList;
	private com.nest.res.bop.al01012026.domain.BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram;
	
	
	
	public  BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram (com.nest.res.bop.al01012026.domain.BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram)  {
	  this.BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram = BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram;
this.BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgramDetailList = BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram.getBOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgramDetail();

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void Premium ()  {
	  this.BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram.setPremium(MathHelper.roundUpDoller(this.BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram.setPremium(MathHelper.roundUpDoller(this.BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclusionDesignatedOperationsCoveredByAControlledWrapUpInsuranceProgram.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}