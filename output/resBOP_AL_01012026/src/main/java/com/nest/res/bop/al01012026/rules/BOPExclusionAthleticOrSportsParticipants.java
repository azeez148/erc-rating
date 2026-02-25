package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPExclusionAthleticOrSportsParticipantsDetail;

public class BOPExclusionAthleticOrSportsParticipants  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclusionAthleticOrSportsParticipants BOPExclusionAthleticOrSportsParticipants;
	private List<BOPExclusionAthleticOrSportsParticipantsDetail> BOPExclusionAthleticOrSportsParticipantsDetailList;
	
	
	
	public  BOPExclusionAthleticOrSportsParticipants (com.nest.res.bop.al01012026.domain.BOPExclusionAthleticOrSportsParticipants BOPExclusionAthleticOrSportsParticipants)  {
	  this.BOPExclusionAthleticOrSportsParticipants = BOPExclusionAthleticOrSportsParticipants;
this.BOPExclusionAthleticOrSportsParticipantsDetailList = BOPExclusionAthleticOrSportsParticipants.getBOPExclusionAthleticOrSportsParticipantsDetail();

	  
	}
	public void Premium ()  {
	  this.BOPExclusionAthleticOrSportsParticipants.setPremium(MathHelper.roundUpDoller(this.BOPExclusionAthleticOrSportsParticipants.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionAthleticOrSportsParticipants,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclusionAthleticOrSportsParticipants.setPremium(MathHelper.roundUpDoller(this.BOPExclusionAthleticOrSportsParticipants.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionAthleticOrSportsParticipants,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclusionAthleticOrSportsParticipants.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclusionAthleticOrSportsParticipants.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclusionAthleticOrSportsParticipants.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}