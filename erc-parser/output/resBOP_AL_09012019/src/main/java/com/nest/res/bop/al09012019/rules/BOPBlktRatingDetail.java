package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBlktRatingDetail  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPBlktRatingDetail BOPBlktRatingDetail;
	
	
	
	public void BlanketPremium ()  {
	  
		if((this.BOPBlktRatingDetail.getIDNumber() != MathHelper.getIntegerValue(0.0) && (this.BOPBlktRatingDetail.getIDNumber() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getDuplicateID() < MathHelper.getIntegerValue(2.0))) && (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only")) && this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(1.0) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(1.0)) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined")) && (this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(0.0))))){
			this.BOPBlktRatingDetail.setBlanketPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPBlktRatingDetail.getAvgRate() * (MathHelper.getDoubleValue(this.BOPBlktRatingDetail.getTotLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
	  
	}
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
	public void CommonRating1 ()  {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public void AvgRate ()  {
	  
		if((this.BOPBlktRatingDetail.getIDNumber() != MathHelper.getIntegerValue(0.0) && (this.BOPBlktRatingDetail.getIDNumber() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getDuplicateID() < MathHelper.getIntegerValue(2.0))) && (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only")) && this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(1.0) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(1.0)) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined")) && (this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(0.0))))){
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only"))){
		if(this.BOPBlktRatingDetail.getTotLimit() != MathHelper.getIntegerValue(0.0)){
			this.BOPBlktRatingDetail.setAvgRate(MathHelper.getDoubleValue(MathHelper.roundToThousand(this.BOPBlktRatingDetail.getTotPremium() / (MathHelper.getDoubleValue(this.BOPBlktRatingDetail.getTotLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
			this.BOPBlktRatingDetail.setAvgRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only"))){
		if(this.BOPBlktRatingDetail.getTotLimit() != MathHelper.getIntegerValue(0.0)){
			this.BOPBlktRatingDetail.setAvgRate(MathHelper.getDoubleValue(MathHelper.roundToThousand(this.BOPBlktRatingDetail.getTotPremium() / (MathHelper.getDoubleValue(this.BOPBlktRatingDetail.getTotLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
			this.BOPBlktRatingDetail.setAvgRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined"))){
		if(this.BOPBlktRatingDetail.getTotLimit() != MathHelper.getIntegerValue(0.0)){
			this.BOPBlktRatingDetail.setAvgRate(MathHelper.getDoubleValue(MathHelper.roundToThousand(this.BOPBlktRatingDetail.getTotPremium() / (MathHelper.getDoubleValue(this.BOPBlktRatingDetail.getTotLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
			this.BOPBlktRatingDetail.setAvgRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
		}
	  
	}
	public  BOPBlktRatingDetail (com.nest.res.bop.al09012019.domain.BOPBlktRatingDetail BOPBlktRatingDetail)  {
	  this.BOPBlktRatingDetail = BOPBlktRatingDetail;

	  
	}
	public void TotPremium ()  {
	  this.BOPBlktRatingDetail.setTotPremium(MathHelper.getDoubleValue(0.0));

		if((this.BOPBlktRatingDetail.getIDNumber() != MathHelper.getIntegerValue(0.0) && (this.BOPBlktRatingDetail.getIDNumber() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getDuplicateID() < MathHelper.getIntegerValue(2.0))) && (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only")) && this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(1.0) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(1.0)) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined")) && (this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(0.0))))){
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only"))){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) && ((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals(MathHelper.getStringValue("Actual Cash Value")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals(MathHelper.getStringValue("Replacement Cost")))){
			this.BOPBlktRatingDetail.setTotPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPBlktRatingDetail.getTotPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"BOPStructureBuildingCoverage/Premium"))))));
		}		}

		}
		else{
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only"))){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
			this.BOPBlktRatingDetail.setTotPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPBlktRatingDetail.getTotPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"BOPClassificationBusnPrsnlPropCoverage/Premium"))))));
		}		}

		}
		else{
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined"))){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) && ((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals(MathHelper.getStringValue("Actual Cash Value")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals(MathHelper.getStringValue("Replacement Cost")))){
			this.BOPBlktRatingDetail.setTotPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPBlktRatingDetail.getTotPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"BOPStructureBuildingCoverage/Premium"))))));
		}		}

		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
			this.BOPBlktRatingDetail.setTotPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPBlktRatingDetail.getTotPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"BOPClassificationBusnPrsnlPropCoverage/Premium"))))));
		}		}

		}
		}
		}
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
	public void classificationAndDetailMatchcount_1 ()  {
	  
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")) || this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined"))){
			this.BOPBlktRatingDetail.setClassificationAndDetailMatchcount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if(((XpathNode.selectNodeValue(policy,"BlktIDNumber"))) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) != 0 && this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
			this.BOPBlktRatingDetail.setClassificationAndDetailMatchcount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPBlktRatingDetail.getClassificationAndDetailMatchcount_1() + MathHelper.getIntegerValue(1.0))));
		}		}

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
	public void CommonRating1_CommonRatingSub1 ()  {
	  
	duplicateID();
	
	structureAndDetailMatchcount_1();
	
	bldgBlktCount();
	
	classificationAndDetailMatchcount_1();
	
	bppBlktCount();
	
	TotLimit();
	
	TotPremium();
	
	AvgRate();
	
	BlanketPremium();
	
	  
	}
	public void TotLimit ()  {
	  this.BOPBlktRatingDetail.setTotLimit(MathHelper.getIntegerValue(0.0));

		if((this.BOPBlktRatingDetail.getIDNumber() != MathHelper.getIntegerValue(0.0) && (this.BOPBlktRatingDetail.getIDNumber() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getDuplicateID() < MathHelper.getIntegerValue(2.0))) && (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only")) && this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(1.0) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only")) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(1.0)) || (this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined")) && (this.BOPBlktRatingDetail.getBldgBlktCount() > MathHelper.getIntegerValue(0.0) && this.BOPBlktRatingDetail.getBppBlktCount() > MathHelper.getIntegerValue(0.0))))){
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building Only"))){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) && ((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals(MathHelper.getStringValue("Actual Cash Value")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals(MathHelper.getStringValue("Replacement Cost")))){
		if(!((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))) == 0 || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))) == MathHelper.getIntegerValue(0.0))){
			this.BOPBlktRatingDetail.setTotLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPBlktRatingDetail.getTotLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))))));
		}
		}		}

		}
		else{
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Business Personal Property Only"))){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
		if(!((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) == 0 || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) == MathHelper.getIntegerValue(0.0))){
			this.BOPBlktRatingDetail.setTotLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPBlktRatingDetail.getTotLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))))));
		}
		}		}

		}
		else{
		if(this.BOPBlktRatingDetail.getType().equals(MathHelper.getStringValue("Building and Business Personal Property Combined"))){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) && ((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals(MathHelper.getStringValue("Actual Cash Value")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals(MathHelper.getStringValue("Replacement Cost")))){
		if(!((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))) == 0 || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))) == MathHelper.getIntegerValue(0.0))){
			this.BOPBlktRatingDetail.setTotLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPBlktRatingDetail.getTotLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))))));
		}
		}		}

		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
		if(!((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) == 0 || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) == MathHelper.getIntegerValue(0.0))){
			this.BOPBlktRatingDetail.setTotLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPBlktRatingDetail.getTotLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))))));
		}
		}		}

		}
		}
		}
		}
	  
	}
	
	
	
	
	


	
}