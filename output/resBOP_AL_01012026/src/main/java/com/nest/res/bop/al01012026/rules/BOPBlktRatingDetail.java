package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBlktRatingDetail  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPBlktRatingDetail BOPBlktRatingDetail;
	
	
	
	public void bldgBlktCount ()  {
	  
		if(XpathNode.selectNodes(this.BOPBlktRatingDetail,"../../BOPLocation/BOPStructure").size() > 0.0){
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only")) || this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined"))){
			this.BOPBlktRatingDetail.setBldgBlktCount(MathHelper.getIntegerValue(this.BOPBlktRatingDetail.getStructureAndDetailMatchcount_1()));
		}
		else{
			this.BOPBlktRatingDetail.setBldgBlktCount(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
	  
	}
	public void TotPremium ()  {
	  
		if((this.BOPBlktRatingDetail.getIDNumber() != MathHelper.getIntegerValue(0.0) && (this.BOPBlktRatingDetail.getIDNumber() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getDuplicateID() < MathHelper.getIntegerValue(2.0))) && (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only")) && this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(1.0) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(1.0)) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined")) && (this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(0.0))))){
			this.BOPBlktRatingDetail.setTotPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPBlktRatingDetail.getTotBldgPremiumTemp_1() + this.BOPBlktRatingDetail.getTotBPPPremiumTemp_1())));
		}
	  
	}
	public void totBldgLimitTemp_1 ()  {
	  this.BOPBlktRatingDetail.setTotBldgLimitTemp_1(MathHelper.getIntegerValue(0.0));

		if((this.BOPBlktRatingDetail.getIDNumber() != MathHelper.getIntegerValue(0.0) && (this.BOPBlktRatingDetail.getIDNumber() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getDuplicateID() < MathHelper.getIntegerValue(2.0))) && (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only")) && this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(1.0) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(1.0)) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined")) && (this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(0.0))))){
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only"))){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) && ((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals(MathHelper.getStringValue("Actual Cash Value")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals(MathHelper.getStringValue("Replacement Cost")))){
		if(!((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))) == 0 || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))) == MathHelper.getIntegerValue(0.0))){
			this.BOPBlktRatingDetail.setTotBldgLimitTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPBlktRatingDetail.getTotBldgLimitTemp_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))))));
		}
		}		}

		}
		else{
		if(!(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")))){
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined"))){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) && ((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals(MathHelper.getStringValue("Actual Cash Value")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals(MathHelper.getStringValue("Replacement Cost")))){
		if(!((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))) == 0 || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))) == MathHelper.getIntegerValue(0.0))){
			this.BOPBlktRatingDetail.setTotBldgLimitTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPBlktRatingDetail.getTotBldgLimitTemp_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))))));
		}
		}		}

		}
		}
		}
		}
	  
	}
	public void totBPPPremiumTemp_1 ()  {
	  this.BOPBlktRatingDetail.setTotBPPPremiumTemp_1(MathHelper.getDoubleValue(0.0));

		if((this.BOPBlktRatingDetail.getIDNumber() != MathHelper.getIntegerValue(0.0) && (this.BOPBlktRatingDetail.getIDNumber() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getDuplicateID() < MathHelper.getIntegerValue(2.0))) && (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only")) && this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(1.0) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(1.0)) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined")) && (this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(0.0))))){
		if(!(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only")))){
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only"))){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
			this.BOPBlktRatingDetail.setTotBPPPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPBlktRatingDetail.getTotBPPPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"BOPClassificationBusnPrsnlPropCoverage/Premium"))))));
		}		}

		}
		else{
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined"))){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
			this.BOPBlktRatingDetail.setTotBPPPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPBlktRatingDetail.getTotBPPPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"BOPClassificationBusnPrsnlPropCoverage/Premium"))))));
		}		}

		}
		}
		}
		}
	  
	}
	public void CommonRating1_CommonRatingSub1 ()  {
	  
	duplicateID();
	
	structureAndDetailMatchcount_1();
	
	bldgBlktCount();
	
	classificationAndDetailMatchcount_1();
	
	bppBlktCount();
	
	totBldgLimitTemp_1();
	
	totBPPLimitTemp_1();
	
	totBldgPremiumTemp_1();
	
	totBPPPremiumTemp_1();
	
	TotLimit();
	
	TotPremium();
	
	AvgRate();
	
	BlanketPremium();
	
	  
	}
	public void bppBlktCount ()  {
	  
		if(XpathNode.selectNodes(this.BOPBlktRatingDetail,"../../BOPLocation/BOPStructure").size() > 0.0){
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")) || this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined"))){
			this.BOPBlktRatingDetail.setBppBlktCount(MathHelper.getIntegerValue(this.BOPBlktRatingDetail.getClassificationAndDetailMatchcount_1()));
		}
		else{
			this.BOPBlktRatingDetail.setBppBlktCount(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
	  
	}
	public void BlanketPremium ()  {
	  
		if((this.BOPBlktRatingDetail.getIDNumber() != MathHelper.getIntegerValue(0.0) && (this.BOPBlktRatingDetail.getIDNumber() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getDuplicateID() < MathHelper.getIntegerValue(2.0))) && (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only")) && this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(1.0) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(1.0)) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined")) && (this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(0.0))))){
			this.BOPBlktRatingDetail.setBlanketPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPBlktRatingDetail.getAvgRate() * (MathHelper.getDoubleValue(this.BOPBlktRatingDetail.getTotLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
	  
	}
	public void CommonRating1 ()  {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public void classificationAndDetailMatchcount_1 ()  {
	  
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")) || this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined"))){
			this.BOPBlktRatingDetail.setClassificationAndDetailMatchcount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if(((XpathNode.selectNodeValue(policy,"BlktIDNumber"))) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) != 0 && this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
			this.BOPBlktRatingDetail.setClassificationAndDetailMatchcount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPBlktRatingDetail.getClassificationAndDetailMatchcount_1() + MathHelper.getIntegerValue(1.0))));
		}		}

		}
	  
	}
	public void totBldgPremiumTemp_1 ()  {
	  this.BOPBlktRatingDetail.setTotBldgPremiumTemp_1(MathHelper.getDoubleValue(0.0));

		if((this.BOPBlktRatingDetail.getIDNumber() != MathHelper.getIntegerValue(0.0) && (this.BOPBlktRatingDetail.getIDNumber() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getDuplicateID() < MathHelper.getIntegerValue(2.0))) && (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only")) && this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(1.0) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(1.0)) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined")) && (this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(0.0))))){
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only"))){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) && ((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals(MathHelper.getStringValue("Actual Cash Value")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals(MathHelper.getStringValue("Replacement Cost")))){
			this.BOPBlktRatingDetail.setTotBldgPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPBlktRatingDetail.getTotBldgPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"BOPStructureBuildingCoverage/Premium"))))));
		}		}

		}
		else{
		if(!(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")))){
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined"))){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) && ((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals(MathHelper.getStringValue("Actual Cash Value")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals(MathHelper.getStringValue("Replacement Cost")))){
			this.BOPBlktRatingDetail.setTotBldgPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPBlktRatingDetail.getTotBldgPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"BOPStructureBuildingCoverage/Premium"))))));
		}		}

		}
		}
		}
		}
	  
	}
	public void duplicateID ()  {
	  this.BOPBlktRatingDetail.setDuplicateID(MathHelper.getIntegerValue(0.0));

		if(!(this.BOPBlktRatingDetail.getIDNumber() == MathHelper.getIntegerValue(0.0))){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../BOPBlktRatingDetail") ){

		if(((XpathNode.selectNodeValue(policy,"IDNumber"))) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"IDNumber"))) != 0 && this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"IDNumber")))){
			this.BOPBlktRatingDetail.setDuplicateID(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPBlktRatingDetail.getDuplicateID() + MathHelper.getIntegerValue(1.0))));
		}		}

		}
	  
	}
	public  BOPBlktRatingDetail (com.nest.res.bop.al01012026.domain.BOPBlktRatingDetail BOPBlktRatingDetail)  {
	  this.BOPBlktRatingDetail = BOPBlktRatingDetail;

	  
	}
	public void TotLimit ()  {
	  
		if((this.BOPBlktRatingDetail.getIDNumber() != MathHelper.getIntegerValue(0.0) && (this.BOPBlktRatingDetail.getIDNumber() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getDuplicateID() < MathHelper.getIntegerValue(2.0))) && (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only")) && this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(1.0) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(1.0)) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined")) && (this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(0.0))))){
			this.BOPBlktRatingDetail.setTotLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPBlktRatingDetail.getTotBldgLimitTemp_1() + this.BOPBlktRatingDetail.getTotBPPLimitTemp_1())));
		}
	  
	}
	public void structureAndDetailMatchcount_1 ()  {
	  
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only")) || this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined"))){
			this.BOPBlktRatingDetail.setStructureAndDetailMatchcount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure") ){

		if(((XpathNode.selectNodeValue(policy,"BlktIDNumber"))) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) != 0 && this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
			this.BOPBlktRatingDetail.setStructureAndDetailMatchcount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPBlktRatingDetail.getStructureAndDetailMatchcount_1() + MathHelper.getIntegerValue(1.0))));
		}		}

		}
	  
	}
	public void AvgRate ()  {
	  
		if((this.BOPBlktRatingDetail.getIDNumber() != MathHelper.getIntegerValue(0.0) && (this.BOPBlktRatingDetail.getIDNumber() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getDuplicateID() < MathHelper.getIntegerValue(2.0))) && (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only")) && this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(1.0) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(1.0)) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined")) && (this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(0.0))))){
		if(this.BOPBlktRatingDetail.getTotLimit() != MathHelper.getIntegerValue(0.0)){
			this.BOPBlktRatingDetail.setAvgRate(MathHelper.getDoubleValue(MathHelper.roundToThousand(this.BOPBlktRatingDetail.getTotPremium() / (MathHelper.getDoubleValue(this.BOPBlktRatingDetail.getTotLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
			this.BOPBlktRatingDetail.setAvgRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void totBPPLimitTemp_1 ()  {
	  this.BOPBlktRatingDetail.setTotBPPLimitTemp_1(MathHelper.getIntegerValue(0.0));

		if((this.BOPBlktRatingDetail.getIDNumber() != MathHelper.getIntegerValue(0.0) && (this.BOPBlktRatingDetail.getIDNumber() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getDuplicateID() < MathHelper.getIntegerValue(2.0))) && (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only")) && this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(1.0) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(1.0)) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined")) && (this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(0.0))))){
		if(!(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only")))){
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only"))){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
		if(!((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) == 0 || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) == MathHelper.getIntegerValue(0.0))){
			this.BOPBlktRatingDetail.setTotBPPLimitTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPBlktRatingDetail.getTotBPPLimitTemp_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))))));
		}
		}		}

		}
		else{
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined"))){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
		if(!((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) == 0 || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) == MathHelper.getIntegerValue(0.0))){
			this.BOPBlktRatingDetail.setTotBPPLimitTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPBlktRatingDetail.getTotBPPLimitTemp_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))))));
		}
		}		}

		}
		}
		}
		}
	  
	}
	
	
	
	
	


	
}