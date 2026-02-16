package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdLessorsLeasedEquipmtDetail  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPAddlInsdLessorsLeasedEquipmtDetail BOPAddlInsdLessorsLeasedEquipmtDetail;
	
	
	
	public void Premium ()  {
	  this.BOPAddlInsdLessorsLeasedEquipmtDetail.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPAddlInsdLessorsLeasedEquipmtDetail.getAddlInsdRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdLessorsLeasedEquipmtDetail,"../../GeneralLiabilityLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdLessorsLeasedEquipmtDetail,"../../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdLessorsLeasedEquipmtDetail.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdLessorsLeasedEquipmtDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdLessorsLeasedEquipmtDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPAddlInsdLessorsLeasedEquipmtDetail (com.nest.res.bop.al09012019.domain.BOPAddlInsdLessorsLeasedEquipmtDetail BOPAddlInsdLessorsLeasedEquipmtDetail)  {
	  this.BOPAddlInsdLessorsLeasedEquipmtDetail = BOPAddlInsdLessorsLeasedEquipmtDetail;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	AddlInsdRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdLessorsLeasedEquipmtDetail.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPAddlInsdLessorsLeasedEquipmtDetail.getAddlInsdRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdLessorsLeasedEquipmtDetail,"../../GeneralLiabilityLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdLessorsLeasedEquipmtDetail,"../../../IRPMFactor")))));

	  
	}
	public void AddlInsdRate () throws LookupException,NumberFormatException {
	  
		if(!this.BOPAddlInsdLessorsLeasedEquipmtDetail.getTypeRisk().equals(MathHelper.getStringValue(""))){
			this.BOPAddlInsdLessorsLeasedEquipmtDetail.setAddlInsdRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AddlInsdLessorLeasedEquipmtRate",String.valueOf(this.BOPAddlInsdLessorsLeasedEquipmtDetail.getTypeRisk())))));
		}
		else{
			this.BOPAddlInsdLessorsLeasedEquipmtDetail.setAddlInsdRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}