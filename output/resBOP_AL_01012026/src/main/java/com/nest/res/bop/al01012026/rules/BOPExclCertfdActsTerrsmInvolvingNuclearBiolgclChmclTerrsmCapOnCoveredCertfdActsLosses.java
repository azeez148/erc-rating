package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses (com.nest.res.bop.al01012026.domain.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses)  {
	  this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses = BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses.setPremium(MathHelper.roundUpDoller(this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses.setPremium(MathHelper.roundUpDoller(this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}