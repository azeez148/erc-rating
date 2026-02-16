package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPPhotographyDetail;

public class BOPPhotography  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPPhotography BOPPhotography;
	private List<BOPPhotographyDetail> BOPPhotographyDetailList;
	
	
	
	public  BOPPhotography (com.nest.res.bop.al09012019.domain.BOPPhotography BOPPhotography)  {
	  this.BOPPhotography = BOPPhotography;
this.BOPPhotographyDetailList = BOPPhotography.getBOPPhotographyDetail();

	  
	}
	public void Premium ()  {
	  
		if(this.BOPPhotography.getScheduledItems().equals(MathHelper.getStringValue("Yes"))){
			this.BOPPhotography.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPPhotography.getPhotographyCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotography,"../LCM")))) + MathHelper.getDoubleValue(this.BOPPhotography.getTotalLimitOfInsurance()) / MathHelper.getDoubleValue(100.0) * MathHelper.roundToThousand(this.BOPPhotography.getPhotographyScheduledPhotographicEquipmentCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotography,"../LCM"))))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotography,"../IRPMFactor"))))));
		}
		else{
			this.BOPPhotography.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPPhotography.getPhotographyCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotography,"../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotography,"../IRPMFactor"))))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPPhotography.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPPhotography.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPPhotography.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	PhotographyCharge();
	
	PhotographyScheduledPhotographicEquipmentCharge();
	
	totalLimit_1();
	
	TotalLimitOfInsurance();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPPhotography.getScheduledItems().equals(MathHelper.getStringValue("Yes"))){
			this.BOPPhotography.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPPhotography.getPhotographyCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotography,"../LCM")))) + MathHelper.getDoubleValue(this.BOPPhotography.getTotalLimitOfInsurance()) / MathHelper.getDoubleValue(100.0) * MathHelper.roundToThousand(this.BOPPhotography.getPhotographyScheduledPhotographicEquipmentCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotography,"../LCM"))))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotography,"../IRPMFactor"))))));
		}
		else{
			this.BOPPhotography.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPPhotography.getPhotographyCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotography,"../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotography,"../IRPMFactor"))))));
		}
	  
	}
	public void PhotographyScheduledPhotographicEquipmentCharge () throws LookupException,NumberFormatException {
	  this.BOPPhotography.setPhotographyScheduledPhotographicEquipmentCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PhotographyScheduledPhotographicEquipmentCharge",String.valueOf( "Y"))));

	  
	}
	public void TotalLimitOfInsurance ()  {
	  this.BOPPhotography.setTotalLimitOfInsurance(this.BOPPhotography.getTotalLimit_1());

	  
	}
	public void PhotographyCharge () throws LookupException,NumberFormatException {
	  this.BOPPhotography.setPhotographyCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PhotographyCharge",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void totalLimit_1 ()  {
	  this.BOPPhotography.setTotalLimit_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPPhotography,"BOPPhotographyDetail") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"LimitOfInsurance"))) != 0){
			this.BOPPhotography.setTotalLimit_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPPhotography.getTotalLimit_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"LimitOfInsurance"))))));
		}		}

	  
	}
	
	
	
	
	


	
}