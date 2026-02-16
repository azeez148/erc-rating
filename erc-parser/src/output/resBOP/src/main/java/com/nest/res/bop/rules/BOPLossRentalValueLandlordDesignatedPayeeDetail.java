package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLossRentalValueLandlordDesignatedPayeeDetail  {

	
	
	
	private com.nest.res.bop.domain.BOPLossRentalValueLandlordDesignatedPayeeDetail BOPLossRentalValueLandlordDesignatedPayeeDetail;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPLossRentalValueLandlordDesignatedPayeeDetail.setPremium(MathHelper.roundUpDoller(this.BOPLossRentalValueLandlordDesignatedPayeeDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLossRentalValueLandlordDesignatedPayeeDetail,"../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLossRentalValueLandlordDesignatedPayeeDetail.getPremium() != (double)0.0){
			this.BOPLossRentalValueLandlordDesignatedPayeeDetail.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPLossRentalValueLandlordDesignatedPayeeDetail.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPLossRentalValueLandlordDesignatedPayeeDetail (com.nest.res.bop.domain.BOPLossRentalValueLandlordDesignatedPayeeDetail BOPLossRentalValueLandlordDesignatedPayeeDetail)  {
	  this.BOPLossRentalValueLandlordDesignatedPayeeDetail = BOPLossRentalValueLandlordDesignatedPayeeDetail;

	  
	}
	
	
	
	
	


	
}