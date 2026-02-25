package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdManagersLessorsPremisesDetail  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdManagersLessorsPremisesDetail BOPAddlInsdManagersLessorsPremisesDetail;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	AddlInsdRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPAddlInsdManagersLessorsPremisesDetail (com.nest.res.bop.al01012026.domain.BOPAddlInsdManagersLessorsPremisesDetail BOPAddlInsdManagersLessorsPremisesDetail)  {
	  this.BOPAddlInsdManagersLessorsPremisesDetail = BOPAddlInsdManagersLessorsPremisesDetail;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdManagersLessorsPremisesDetail.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPAddlInsdManagersLessorsPremisesDetail.getAddlInsdRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdManagersLessorsPremisesDetail,"../../GeneralLiabilityLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdManagersLessorsPremisesDetail,"../../../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdManagersLessorsPremisesDetail.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPAddlInsdManagersLessorsPremisesDetail.getAddlInsdRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdManagersLessorsPremisesDetail,"../../GeneralLiabilityLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdManagersLessorsPremisesDetail,"../../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdManagersLessorsPremisesDetail.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdManagersLessorsPremisesDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdManagersLessorsPremisesDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void AddlInsdRate () throws LookupException,NumberFormatException {
	  
		if(!this.BOPAddlInsdManagersLessorsPremisesDetail.getTypeRisk().equals(MathHelper.getStringValue(""))){
			this.BOPAddlInsdManagersLessorsPremisesDetail.setAddlInsdRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AddlInsdManagerLessorRate",String.valueOf(this.BOPAddlInsdManagersLessorsPremisesDetail.getTypeRisk())))));
		}
		else{
			this.BOPAddlInsdManagersLessorsPremisesDetail.setAddlInsdRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}