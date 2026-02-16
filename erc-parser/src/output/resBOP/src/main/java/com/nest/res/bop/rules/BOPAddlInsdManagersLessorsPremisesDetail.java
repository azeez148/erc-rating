package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdManagersLessorsPremisesDetail  {

	
	
	
	private com.nest.res.bop.domain.BOPAddlInsdManagersLessorsPremisesDetail BOPAddlInsdManagersLessorsPremisesDetail;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void AddlInsdRate () throws LookupException,NumberFormatException {
	  
		if(!this.BOPAddlInsdManagersLessorsPremisesDetail.getTypeRisk().equals((String)"")){
			this.BOPAddlInsdManagersLessorsPremisesDetail.setAddlInsdRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AddlInsdManagerLessorRate",String.valueOf(BOPAddlInsdManagersLessorsPremisesDetail.getTypeRisk()))));
		}
		else{
			this.BOPAddlInsdManagersLessorsPremisesDetail.setAddlInsdRate((double)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdManagersLessorsPremisesDetail.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPAddlInsdManagersLessorsPremisesDetail.getAddlInsdRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdManagersLessorsPremisesDetail,"../../GeneralLiabilityLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdManagersLessorsPremisesDetail,"../../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdManagersLessorsPremisesDetail.getPremium() != (double)0.0){
			this.BOPAddlInsdManagersLessorsPremisesDetail.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPAddlInsdManagersLessorsPremisesDetail.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	AddlInsdRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPAddlInsdManagersLessorsPremisesDetail (com.nest.res.bop.domain.BOPAddlInsdManagersLessorsPremisesDetail BOPAddlInsdManagersLessorsPremisesDetail)  {
	  this.BOPAddlInsdManagersLessorsPremisesDetail = BOPAddlInsdManagersLessorsPremisesDetail;

	  
	}
	
	
	
	
	


	
}