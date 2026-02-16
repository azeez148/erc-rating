package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBlktRatingDetail  {

	
	
	
	private com.nest.res.bop.domain.BOPBlktRatingDetail BOPBlktRatingDetail;
	
	
	
	public void bldgBlktCount ()  {
	  
		if(XpathNode.selectNodes(this.BOPBlktRatingDetail,"../../BOPLocation/BOPStructure").size() > 0.0){
		if(this.BOPBlktRatingDetail.getType().equals((String)"Building Only") || this.BOPBlktRatingDetail.getType().equals((String)"Building and Business Personal Property Combined")){
			this.BOPBlktRatingDetail.setBldgBlktCount(Integer.valueOf(this.BOPBlktRatingDetail.getStructureAndDetailMatchcount_1()));
		}
		else{
			this.BOPBlktRatingDetail.setBldgBlktCount((int)0.0);
		}
		}
	  
	}
	public void structureAndDetailMatchcount_1 ()  {
	  
		if(this.BOPBlktRatingDetail.getType().equals((String)"Building Only") || this.BOPBlktRatingDetail.getType().equals((String)"Building and Business Personal Property Combined")){
			this.BOPBlktRatingDetail.setStructureAndDetailMatchcount_1((int)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure") ){

		if(((XpathNode.selectNodeValue(policy,"BlktIDNumber"))) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) != 0 && this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
			this.BOPBlktRatingDetail.setStructureAndDetailMatchcount_1(Integer.valueOf(this.BOPBlktRatingDetail.getStructureAndDetailMatchcount_1()) + (int)1.0);
		}		}

		}
	  
	}
	public void bppBlktCount ()  {
	  
		if(XpathNode.selectNodes(this.BOPBlktRatingDetail,"../../BOPLocation/BOPStructure").size() > 0.0){
		if(this.BOPBlktRatingDetail.getType().equals((String)"Business Personal Property Only") || this.BOPBlktRatingDetail.getType().equals((String)"Building and Business Personal Property Combined")){
			this.BOPBlktRatingDetail.setBppBlktCount(Integer.valueOf(this.BOPBlktRatingDetail.getClassificationAndDetailMatchcount_1()));
		}
		else{
			this.BOPBlktRatingDetail.setBppBlktCount((int)0.0);
		}
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
	public void CommonRating1 ()  {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public void AvgRate ()  {
	  
		if((this.BOPBlktRatingDetail.getIDNumber() != (int)0.0 && (this.BOPBlktRatingDetail.getIDNumber() > (int)0.0 && this.BOPBlktRatingDetail.getDuplicateID() < (int)2.0)) && (this.BOPBlktRatingDetail.getType().equals((String)"Building Only") && this.BOPBlktRatingDetail.getBldgBlktCount() > (int)1.0 || (this.BOPBlktRatingDetail.getType().equals((String)"Business Personal Property Only") && this.BOPBlktRatingDetail.getBppBlktCount() > (int)1.0) || (this.BOPBlktRatingDetail.getType().equals((String)"Building and Business Personal Property Combined") && (this.BOPBlktRatingDetail.getBldgBlktCount() > (int)0.0 && this.BOPBlktRatingDetail.getBppBlktCount() > (int)0.0)))){
		if(this.BOPBlktRatingDetail.getType().equals((String)"Building Only")){
		if(this.BOPBlktRatingDetail.getTotLimit() != (int)0.0){
			this.BOPBlktRatingDetail.setAvgRate(MathHelper.roundToThousand(this.BOPBlktRatingDetail.getTotPremium() / ((double)this.BOPBlktRatingDetail.getTotLimit() / (double)100.0)));
		}
		else{
			this.BOPBlktRatingDetail.setAvgRate((double)0.0);
		}
		}
		else{
		if(this.BOPBlktRatingDetail.getType().equals((String)"Business Personal Property Only")){
		if(this.BOPBlktRatingDetail.getTotLimit() != (int)0.0){
			this.BOPBlktRatingDetail.setAvgRate(MathHelper.roundToThousand(this.BOPBlktRatingDetail.getTotPremium() / ((double)this.BOPBlktRatingDetail.getTotLimit() / (double)100.0)));
		}
		else{
			this.BOPBlktRatingDetail.setAvgRate((double)0.0);
		}
		}
		else{
		if(this.BOPBlktRatingDetail.getType().equals((String)"Building and Business Personal Property Combined")){
		if(this.BOPBlktRatingDetail.getTotLimit() != (int)0.0){
			this.BOPBlktRatingDetail.setAvgRate(MathHelper.roundToThousand(this.BOPBlktRatingDetail.getTotPremium() / ((double)this.BOPBlktRatingDetail.getTotLimit() / (double)100.0)));
		}
		else{
			this.BOPBlktRatingDetail.setAvgRate((double)0.0);
		}
		}
		}
		}
		}
	  
	}
	public void BlanketPremium ()  {
	  
		if((this.BOPBlktRatingDetail.getIDNumber() != (int)0.0 && (this.BOPBlktRatingDetail.getIDNumber() > (int)0.0 && this.BOPBlktRatingDetail.getDuplicateID() < (int)2.0)) && (this.BOPBlktRatingDetail.getType().equals((String)"Building Only") && this.BOPBlktRatingDetail.getBldgBlktCount() > (int)1.0 || (this.BOPBlktRatingDetail.getType().equals((String)"Business Personal Property Only") && this.BOPBlktRatingDetail.getBppBlktCount() > (int)1.0) || (this.BOPBlktRatingDetail.getType().equals((String)"Building and Business Personal Property Combined") && (this.BOPBlktRatingDetail.getBldgBlktCount() > (int)0.0 && this.BOPBlktRatingDetail.getBppBlktCount() > (int)0.0)))){
			this.BOPBlktRatingDetail.setBlanketPremium(MathHelper.roundUpDoller(this.BOPBlktRatingDetail.getAvgRate() * ((double)this.BOPBlktRatingDetail.getTotLimit() / (double)100.0)));
		}
	  
	}
	public void classificationAndDetailMatchcount_1 ()  {
	  
		if(this.BOPBlktRatingDetail.getType().equals((String)"Business Personal Property Only") || this.BOPBlktRatingDetail.getType().equals((String)"Building and Business Personal Property Combined")){
			this.BOPBlktRatingDetail.setClassificationAndDetailMatchcount_1((int)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if(((XpathNode.selectNodeValue(policy,"BlktIDNumber"))) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) != 0 && this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
			this.BOPBlktRatingDetail.setClassificationAndDetailMatchcount_1(Integer.valueOf(this.BOPBlktRatingDetail.getClassificationAndDetailMatchcount_1()) + (int)1.0);
		}		}

		}
	  
	}
	public void TotLimit ()  {
	  this.BOPBlktRatingDetail.setTotLimit((int)0.0);

		if((this.BOPBlktRatingDetail.getIDNumber() != (int)0.0 && (this.BOPBlktRatingDetail.getIDNumber() > (int)0.0 && this.BOPBlktRatingDetail.getDuplicateID() < (int)2.0)) && (this.BOPBlktRatingDetail.getType().equals((String)"Building Only") && this.BOPBlktRatingDetail.getBldgBlktCount() > (int)1.0 || (this.BOPBlktRatingDetail.getType().equals((String)"Business Personal Property Only") && this.BOPBlktRatingDetail.getBppBlktCount() > (int)1.0) || (this.BOPBlktRatingDetail.getType().equals((String)"Building and Business Personal Property Combined") && (this.BOPBlktRatingDetail.getBldgBlktCount() > (int)0.0 && this.BOPBlktRatingDetail.getBppBlktCount() > (int)0.0)))){
		if(this.BOPBlktRatingDetail.getType().equals((String)"Building Only")){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) && ((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals((String)"Actual Cash Value") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals((String)"Replacement Cost"))){
		if(!((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))) == 0 || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))) == (int)0.0)){
			this.BOPBlktRatingDetail.setTotLimit(this.BOPBlktRatingDetail.getTotLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))));
		}
		}		}

		}
		else{
		if(this.BOPBlktRatingDetail.getType().equals((String)"Business Personal Property Only")){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
		if(!((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) == 0 || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) == (int)0.0)){
			this.BOPBlktRatingDetail.setTotLimit(this.BOPBlktRatingDetail.getTotLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))));
		}
		}		}

		}
		else{
		if(this.BOPBlktRatingDetail.getType().equals((String)"Building and Business Personal Property Combined")){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) && ((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals((String)"Actual Cash Value") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals((String)"Replacement Cost"))){
		if(!((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))) == 0 || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))) == (int)0.0)){
			this.BOPBlktRatingDetail.setTotLimit(this.BOPBlktRatingDetail.getTotLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))));
		}
		}		}

		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
		if(!((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) == 0 || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) == (int)0.0)){
			this.BOPBlktRatingDetail.setTotLimit(this.BOPBlktRatingDetail.getTotLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))));
		}
		}		}

		}
		}
		}
		}
	  
	}
	public void TotPremium ()  {
	  this.BOPBlktRatingDetail.setTotPremium((double)0.0);

		if((this.BOPBlktRatingDetail.getIDNumber() != (int)0.0 && (this.BOPBlktRatingDetail.getIDNumber() > (int)0.0 && this.BOPBlktRatingDetail.getDuplicateID() < (int)2.0)) && (this.BOPBlktRatingDetail.getType().equals((String)"Building Only") && this.BOPBlktRatingDetail.getBldgBlktCount() > (int)1.0 || (this.BOPBlktRatingDetail.getType().equals((String)"Business Personal Property Only") && this.BOPBlktRatingDetail.getBppBlktCount() > (int)1.0) || (this.BOPBlktRatingDetail.getType().equals((String)"Building and Business Personal Property Combined") && (this.BOPBlktRatingDetail.getBldgBlktCount() > (int)0.0 && this.BOPBlktRatingDetail.getBppBlktCount() > (int)0.0)))){
		if(this.BOPBlktRatingDetail.getType().equals((String)"Building Only")){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) && ((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals((String)"Actual Cash Value") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals((String)"Replacement Cost"))){
			this.BOPBlktRatingDetail.setTotPremium(this.BOPBlktRatingDetail.getTotPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"BOPStructureBuildingCoverage/Premium"))));
		}		}

		}
		else{
		if(this.BOPBlktRatingDetail.getType().equals((String)"Business Personal Property Only")){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
			this.BOPBlktRatingDetail.setTotPremium(this.BOPBlktRatingDetail.getTotPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"BOPClassificationBusnPrsnlPropCoverage/Premium"))));
		}		}

		}
		else{
		if(this.BOPBlktRatingDetail.getType().equals((String)"Building and Business Personal Property Combined")){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber"))) && ((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals((String)"Actual Cash Value") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RatingBasis"))).equals((String)"Replacement Cost"))){
			this.BOPBlktRatingDetail.setTotPremium(this.BOPBlktRatingDetail.getTotPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"BOPStructureBuildingCoverage/Premium"))));
		}		}

		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../../BOPLocation/BOPStructure/BOPClassification") ){

		if(this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlktIDNumber")))){
			this.BOPBlktRatingDetail.setTotPremium(this.BOPBlktRatingDetail.getTotPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"BOPClassificationBusnPrsnlPropCoverage/Premium"))));
		}		}

		}
		}
		}
		}
	  
	}
	public  BOPBlktRatingDetail (com.nest.res.bop.domain.BOPBlktRatingDetail BOPBlktRatingDetail)  {
	  this.BOPBlktRatingDetail = BOPBlktRatingDetail;

	  
	}
	public void duplicateID ()  {
	  this.BOPBlktRatingDetail.setDuplicateID((int)0.0);

		if(!(this.BOPBlktRatingDetail.getIDNumber() == (int)0.0)){
		for( Policy policy : XpathNode.selectNodes(BOPBlktRatingDetail,"../BOPBlktRatingDetail") ){

		if(((XpathNode.selectNodeValue(policy,"IDNumber"))) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"IDNumber"))) != 0 && this.BOPBlktRatingDetail.getIDNumber() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"IDNumber")))){
			this.BOPBlktRatingDetail.setDuplicateID(Integer.valueOf(this.BOPBlktRatingDetail.getDuplicateID()) + (int)1.0);
		}		}

		}
	  
	}
	
	
	
	
	


	
}