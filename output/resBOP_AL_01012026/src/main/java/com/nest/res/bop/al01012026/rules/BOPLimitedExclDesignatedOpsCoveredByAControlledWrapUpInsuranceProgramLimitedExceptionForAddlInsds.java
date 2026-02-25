package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsDetail;

public class BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds;
	private List<BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsDetail> BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsDetailList;
	
	
	
	public  BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds (com.nest.res.bop.al01012026.domain.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds)  {
	  this.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds = BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds;
this.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsDetailList = BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds.getBOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsDetail();

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds.setPremium(MathHelper.roundUpDoller(this.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds,"../../../../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds.setPremium(MathHelper.roundUpDoller(this.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds,"../../../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}