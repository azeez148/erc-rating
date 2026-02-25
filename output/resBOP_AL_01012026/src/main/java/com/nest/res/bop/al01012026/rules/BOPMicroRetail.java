package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPMicroRetailCoverage;
import com.nest.res.bop.al01012026.domain.BOPMicroRetailStockCoverage;

public class BOPMicroRetail  {

	
	
	
	private com.nest.res.bop.al01012026.rules.BOPMicroRetailStockCoverage BOPMicroRetailStockCoverageRule;
	private List<BOPMicroRetailCoverage> BOPMicroRetailCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPMicroRetailCoverage BOPMicroRetailCoverageRule;
	private com.nest.res.bop.al01012026.domain.BOPMicroRetail BOPMicroRetail;
	private List<BOPMicroRetailStockCoverage> BOPMicroRetailStockCoverageList;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPMicroRetail.setPremium(MathHelper.getDoubleValue(this.BOPMicroRetail.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroRetail,"BOPMicroRetailCoverage/Premium")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPMicroRetailStockCoverageList){
		for(BOPMicroRetailStockCoverage BOPMicroRetailStockCoverage:BOPMicroRetailStockCoverageList){
			BOPMicroRetailStockCoverageRule = new com.nest.res.bop.al01012026.rules.BOPMicroRetailStockCoverage(BOPMicroRetailStockCoverage);
			BOPMicroRetailStockCoverageRule.CommonRating1();

		}
	}
	if(null != BOPMicroRetailCoverageList){
		for(BOPMicroRetailCoverage BOPMicroRetailCoverage:BOPMicroRetailCoverageList){
			BOPMicroRetailCoverageRule = new com.nest.res.bop.al01012026.rules.BOPMicroRetailCoverage(BOPMicroRetailCoverage);
			BOPMicroRetailCoverageRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public  BOPMicroRetail (com.nest.res.bop.al01012026.domain.BOPMicroRetail BOPMicroRetail)  {
	  this.BOPMicroRetail = BOPMicroRetail;
this.BOPMicroRetailCoverageList = BOPMicroRetail.getBOPMicroRetailCoverage();
this.BOPMicroRetailStockCoverageList = BOPMicroRetail.getBOPMicroRetailStockCoverage();

	  
	}
	
	
	
	
	


	
}