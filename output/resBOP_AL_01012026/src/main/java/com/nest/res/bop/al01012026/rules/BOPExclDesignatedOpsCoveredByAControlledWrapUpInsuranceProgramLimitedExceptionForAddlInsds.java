package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsDetail;

public class BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds;
	private List<BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsDetail> BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsDetailList;
	
	
	
	public void Premium ()  {
	  this.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds.setPremium(MathHelper.roundUpDoller(this.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds.setPremium(MathHelper.roundUpDoller(this.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds (com.nest.res.bop.al01012026.domain.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds)  {
	  this.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds = BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds;
this.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsDetailList = BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds.getBOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsDetail();

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}