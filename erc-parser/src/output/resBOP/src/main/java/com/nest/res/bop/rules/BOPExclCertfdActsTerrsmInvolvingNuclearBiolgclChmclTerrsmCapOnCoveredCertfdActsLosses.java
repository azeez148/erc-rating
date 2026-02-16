package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses  {

	
	
	
	private com.nest.res.bop.domain.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses.getPremium() != (double)0.0){
			this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses (com.nest.res.bop.domain.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses)  {
	  this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses = BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses.setPremium(MathHelper.roundUpDoller(this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}