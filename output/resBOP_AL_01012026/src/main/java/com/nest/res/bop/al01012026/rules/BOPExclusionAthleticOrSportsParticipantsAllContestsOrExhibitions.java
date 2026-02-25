package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitionsDetail;

public class BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions;
	private List<BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitionsDetail> BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitionsDetailList;
	
	
	
	public  BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions (com.nest.res.bop.al01012026.domain.BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions)  {
	  this.BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions = BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions;
this.BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitionsDetailList = BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions.getBOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitionsDetail();

	  
	}
	public void Premium ()  {
	  this.BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions.setPremium(MathHelper.roundUpDoller(this.BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions.setPremium(MathHelper.roundUpDoller(this.BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionAthleticOrSportsParticipantsAllContestsOrExhibitions,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}