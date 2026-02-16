package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPPhotography  {

	
	
	
	private com.nest.res.bop.domain.BOPPhotography BOPPhotography;
	
	
	
	public void TotalLimitOfInsurance ()  {
	  this.BOPPhotography.setTotalLimitOfInsurance(this.BOPPhotography.getTotalLimit_1());

	  
	}
	public void totalLimit_1 ()  {
	  this.BOPPhotography.setTotalLimit_1((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPPhotography,"BOPPhotographyDetail") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"LimitOfInsurance"))) != 0){
			this.BOPPhotography.setTotalLimit_1(Integer.valueOf(this.BOPPhotography.getTotalLimit_1()) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"LimitOfInsurance"))));
		}		}

	  
	}
	public  BOPPhotography (com.nest.res.bop.domain.BOPPhotography BOPPhotography)  {
	  this.BOPPhotography = BOPPhotography;

	  
	}
	public void PhotographyScheduledPhotographicEquipmentCharge () throws LookupException,NumberFormatException {
	  this.BOPPhotography.setPhotographyScheduledPhotographicEquipmentCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PhotographyScheduledPhotographicEquipmentCharge",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	PhotographyCharge();
	
	PhotographyScheduledPhotographicEquipmentCharge();
	
	totalLimit_1();
	
	TotalLimitOfInsurance();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PhotographyCharge () throws LookupException,NumberFormatException {
	  this.BOPPhotography.setPhotographyCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PhotographyCharge",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  
		if(this.BOPPhotography.getScheduledItems().equals((String)"Yes")){
			this.BOPPhotography.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPPhotography.getPhotographyCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotography,"../LCM")))) + (double)this.BOPPhotography.getTotalLimitOfInsurance() / (double)100.0 * MathHelper.roundToThousand(this.BOPPhotography.getPhotographyScheduledPhotographicEquipmentCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotography,"../LCM"))))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotography,"../IRPMFactor")))));
		}
		else{
			this.BOPPhotography.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPPhotography.getPhotographyCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotography,"../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPhotography,"../IRPMFactor")))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPPhotography.getPremium() != (double)0.0){
			this.BOPPhotography.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPPhotography.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}