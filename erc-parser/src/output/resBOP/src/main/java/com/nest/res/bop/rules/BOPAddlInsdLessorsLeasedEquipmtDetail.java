package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdLessorsLeasedEquipmtDetail  {

	
	
	
	private com.nest.res.bop.domain.BOPAddlInsdLessorsLeasedEquipmtDetail BOPAddlInsdLessorsLeasedEquipmtDetail;
	
	
	
	public void AddlInsdRate () throws LookupException,NumberFormatException {
	  
		if(!this.BOPAddlInsdLessorsLeasedEquipmtDetail.getTypeRisk().equals((String)"")){
			this.BOPAddlInsdLessorsLeasedEquipmtDetail.setAddlInsdRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AddlInsdLessorLeasedEquipmtRate",String.valueOf(BOPAddlInsdLessorsLeasedEquipmtDetail.getTypeRisk()))));
		}
		else{
			this.BOPAddlInsdLessorsLeasedEquipmtDetail.setAddlInsdRate((double)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	AddlInsdRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdLessorsLeasedEquipmtDetail.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPAddlInsdLessorsLeasedEquipmtDetail.getAddlInsdRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdLessorsLeasedEquipmtDetail,"../../GeneralLiabilityLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdLessorsLeasedEquipmtDetail,"../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPAddlInsdLessorsLeasedEquipmtDetail (com.nest.res.bop.domain.BOPAddlInsdLessorsLeasedEquipmtDetail BOPAddlInsdLessorsLeasedEquipmtDetail)  {
	  this.BOPAddlInsdLessorsLeasedEquipmtDetail = BOPAddlInsdLessorsLeasedEquipmtDetail;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdLessorsLeasedEquipmtDetail.getPremium() != (double)0.0){
			this.BOPAddlInsdLessorsLeasedEquipmtDetail.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPAddlInsdLessorsLeasedEquipmtDetail.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}