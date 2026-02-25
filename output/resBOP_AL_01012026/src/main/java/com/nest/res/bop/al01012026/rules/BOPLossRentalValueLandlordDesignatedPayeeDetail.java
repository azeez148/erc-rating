package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLossRentalValueLandlordDesignatedPayeeDetail  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPLossRentalValueLandlordDesignatedPayeeDetail BOPLossRentalValueLandlordDesignatedPayeeDetail;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLossRentalValueLandlordDesignatedPayeeDetail.setPremium(MathHelper.roundUpDoller(this.BOPLossRentalValueLandlordDesignatedPayeeDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLossRentalValueLandlordDesignatedPayeeDetail,"../../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLossRentalValueLandlordDesignatedPayeeDetail.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLossRentalValueLandlordDesignatedPayeeDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLossRentalValueLandlordDesignatedPayeeDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPLossRentalValueLandlordDesignatedPayeeDetail.setPremium(MathHelper.roundUpDoller(this.BOPLossRentalValueLandlordDesignatedPayeeDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLossRentalValueLandlordDesignatedPayeeDetail,"../../../IRPMFactor")))));

	  
	}
	public  BOPLossRentalValueLandlordDesignatedPayeeDetail (com.nest.res.bop.al01012026.domain.BOPLossRentalValueLandlordDesignatedPayeeDetail BOPLossRentalValueLandlordDesignatedPayeeDetail)  {
	  this.BOPLossRentalValueLandlordDesignatedPayeeDetail = BOPLossRentalValueLandlordDesignatedPayeeDetail;

	  
	}
	
	
	
	
	


	
}