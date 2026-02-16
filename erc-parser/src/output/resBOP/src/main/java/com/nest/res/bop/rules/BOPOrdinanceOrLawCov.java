package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPOrdinanceOrLawCov1EQCoverage;
import com.nest.res.bop.domain.BOPOrdinanceOrLawCov2EQCoverage;
import com.nest.res.bop.domain.BOPOrdinanceOrLawCov2And3EQCoverage;
import com.nest.res.bop.domain.BOPOrdinanceOrLawCov2And3Coverage;
import com.nest.res.bop.domain.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage;
import com.nest.res.bop.domain.BOPOrdinanceOrLawCov3EQCoverage;
import com.nest.res.bop.domain.BOPOrdinanceOrLawCov2Coverage;
import com.nest.res.bop.domain.BOPOrdinanceOrLawCov1Coverage;
import com.nest.res.bop.domain.BOPOrdinanceOrLawCov3Coverage;
import com.nest.res.bop.domain.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage;

public class BOPOrdinanceOrLawCov  {

	
	
	
	private com.nest.res.bop.rules.BOPOrdinanceOrLawCov2EQCoverage BOPOrdinanceOrLawCov2EQCoverageRule;
	private List<BOPOrdinanceOrLawCov1EQCoverage> BOPOrdinanceOrLawCov1EQCoverageList;
	private List<BOPOrdinanceOrLawCov2EQCoverage> BOPOrdinanceOrLawCov2EQCoverageList;
	private com.nest.res.bop.rules.BOPOrdinanceOrLawCov2And3EQCoverage BOPOrdinanceOrLawCov2And3EQCoverageRule;
	private com.nest.res.bop.domain.BOPOrdinanceOrLawCov BOPOrdinanceOrLawCov;
	private List<BOPOrdinanceOrLawCov2And3EQCoverage> BOPOrdinanceOrLawCov2And3EQCoverageList;
	private List<BOPOrdinanceOrLawCov2And3Coverage> BOPOrdinanceOrLawCov2And3CoverageList;
	private com.nest.res.bop.rules.BOPOrdinanceOrLawCov1EQCoverage BOPOrdinanceOrLawCov1EQCoverageRule;
	private List<BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage> BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverageList;
	private com.nest.res.bop.rules.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3CoverageRule;
	private List<BOPOrdinanceOrLawCov3EQCoverage> BOPOrdinanceOrLawCov3EQCoverageList;
	private com.nest.res.bop.rules.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3CoverageRule;
	private List<BOPOrdinanceOrLawCov2Coverage> BOPOrdinanceOrLawCov2CoverageList;
	private com.nest.res.bop.rules.BOPOrdinanceOrLawCov3EQCoverage BOPOrdinanceOrLawCov3EQCoverageRule;
	private List<BOPOrdinanceOrLawCov1Coverage> BOPOrdinanceOrLawCov1CoverageList;
	private List<BOPOrdinanceOrLawCov3Coverage> BOPOrdinanceOrLawCov3CoverageList;
	private com.nest.res.bop.rules.BOPOrdinanceOrLawCov1Coverage BOPOrdinanceOrLawCov1CoverageRule;
	private com.nest.res.bop.rules.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverageRule;
	private List<BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage> BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverageList;
	private com.nest.res.bop.rules.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2CoverageRule;
	private com.nest.res.bop.rules.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverageRule;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	ProcessPremium1_CommonRatingSub2();
	
	ProcessPremium1_CommonRatingSub3();
	
	if(null != BOPOrdinanceOrLawCov1CoverageList){
		for(BOPOrdinanceOrLawCov1Coverage BOPOrdinanceOrLawCov1Coverage:BOPOrdinanceOrLawCov1CoverageList){
			BOPOrdinanceOrLawCov1CoverageRule = new com.nest.res.bop.rules.BOPOrdinanceOrLawCov1Coverage(BOPOrdinanceOrLawCov1Coverage);
			BOPOrdinanceOrLawCov1CoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCov1EQCoverageList){
		for(BOPOrdinanceOrLawCov1EQCoverage BOPOrdinanceOrLawCov1EQCoverage:BOPOrdinanceOrLawCov1EQCoverageList){
			BOPOrdinanceOrLawCov1EQCoverageRule = new com.nest.res.bop.rules.BOPOrdinanceOrLawCov1EQCoverage(BOPOrdinanceOrLawCov1EQCoverage);
			BOPOrdinanceOrLawCov1EQCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCov2CoverageList){
		for(BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage:BOPOrdinanceOrLawCov2CoverageList){
			BOPOrdinanceOrLawCov2CoverageRule = new com.nest.res.bop.rules.BOPOrdinanceOrLawCov2Coverage(BOPOrdinanceOrLawCov2Coverage);
			BOPOrdinanceOrLawCov2CoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCov2EQCoverageList){
		for(BOPOrdinanceOrLawCov2EQCoverage BOPOrdinanceOrLawCov2EQCoverage:BOPOrdinanceOrLawCov2EQCoverageList){
			BOPOrdinanceOrLawCov2EQCoverageRule = new com.nest.res.bop.rules.BOPOrdinanceOrLawCov2EQCoverage(BOPOrdinanceOrLawCov2EQCoverage);
			BOPOrdinanceOrLawCov2EQCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCov3CoverageList){
		for(BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage:BOPOrdinanceOrLawCov3CoverageList){
			BOPOrdinanceOrLawCov3CoverageRule = new com.nest.res.bop.rules.BOPOrdinanceOrLawCov3Coverage(BOPOrdinanceOrLawCov3Coverage);
			BOPOrdinanceOrLawCov3CoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCov3EQCoverageList){
		for(BOPOrdinanceOrLawCov3EQCoverage BOPOrdinanceOrLawCov3EQCoverage:BOPOrdinanceOrLawCov3EQCoverageList){
			BOPOrdinanceOrLawCov3EQCoverageRule = new com.nest.res.bop.rules.BOPOrdinanceOrLawCov3EQCoverage(BOPOrdinanceOrLawCov3EQCoverage);
			BOPOrdinanceOrLawCov3EQCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCov2And3CoverageList){
		for(BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage:BOPOrdinanceOrLawCov2And3CoverageList){
			BOPOrdinanceOrLawCov2And3CoverageRule = new com.nest.res.bop.rules.BOPOrdinanceOrLawCov2And3Coverage(BOPOrdinanceOrLawCov2And3Coverage);
			BOPOrdinanceOrLawCov2And3CoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCov2And3EQCoverageList){
		for(BOPOrdinanceOrLawCov2And3EQCoverage BOPOrdinanceOrLawCov2And3EQCoverage:BOPOrdinanceOrLawCov2And3EQCoverageList){
			BOPOrdinanceOrLawCov2And3EQCoverageRule = new com.nest.res.bop.rules.BOPOrdinanceOrLawCov2And3EQCoverage(BOPOrdinanceOrLawCov2And3EQCoverage);
			BOPOrdinanceOrLawCov2And3EQCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverageList){
		for(BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage:BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverageList){
			BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverageRule = new com.nest.res.bop.rules.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage(BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage);
			BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverageList){
		for(BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage:BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverageList){
			BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverageRule = new com.nest.res.bop.rules.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage(BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage);
			BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverageRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	public  BOPOrdinanceOrLawCov (com.nest.res.bop.domain.BOPOrdinanceOrLawCov BOPOrdinanceOrLawCov)  {
	  this.BOPOrdinanceOrLawCov = BOPOrdinanceOrLawCov;
this.BOPOrdinanceOrLawCov1EQCoverageList = BOPOrdinanceOrLawCov.getBOPOrdinanceOrLawCov1EQCoverage();
this.BOPOrdinanceOrLawCov2EQCoverageList = BOPOrdinanceOrLawCov.getBOPOrdinanceOrLawCov2EQCoverage();
this.BOPOrdinanceOrLawCov2And3EQCoverageList = BOPOrdinanceOrLawCov.getBOPOrdinanceOrLawCov2And3EQCoverage();
this.BOPOrdinanceOrLawCov2And3CoverageList = BOPOrdinanceOrLawCov.getBOPOrdinanceOrLawCov2And3Coverage();
this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverageList = BOPOrdinanceOrLawCov.getBOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage();
this.BOPOrdinanceOrLawCov3EQCoverageList = BOPOrdinanceOrLawCov.getBOPOrdinanceOrLawCov3EQCoverage();
this.BOPOrdinanceOrLawCov2CoverageList = BOPOrdinanceOrLawCov.getBOPOrdinanceOrLawCov2Coverage();
this.BOPOrdinanceOrLawCov1CoverageList = BOPOrdinanceOrLawCov.getBOPOrdinanceOrLawCov1Coverage();
this.BOPOrdinanceOrLawCov3CoverageList = BOPOrdinanceOrLawCov.getBOPOrdinanceOrLawCov3Coverage();
this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverageList = BOPOrdinanceOrLawCov.getBOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage();

	  
	}
	public void BOPOrdinanceOrLawCov3Coverage_Limit ()  {
	  
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals((String)"Coverage 1 Only")){
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage :BOPOrdinanceOrLawCov3CoverageList){
		BOPOrdinanceOrLawCov3Coverage.setDsLimit((int)10000.0);
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals((String)"Coverage 3 Only")){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov3Coverage/dsLimit"))) < (int)10000.0){
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage :BOPOrdinanceOrLawCov3CoverageList){
		BOPOrdinanceOrLawCov3Coverage.setDsLimit((int)10000.0);
		}
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals((String)"Coverages 1 and 2")){
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage :BOPOrdinanceOrLawCov3CoverageList){
		BOPOrdinanceOrLawCov3Coverage.setDsLimit((int)10000.0);
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals((String)"Coverages 1, 2 and 3")){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov3Coverage/dsLimit"))) < (int)10000.0){
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage :BOPOrdinanceOrLawCov3CoverageList){
		BOPOrdinanceOrLawCov3Coverage.setDsLimit((int)10000.0);
		}
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals((String)"Coverage 1 with Coverages 2 and 3 Combined")){
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage :BOPOrdinanceOrLawCov3CoverageList){
		BOPOrdinanceOrLawCov3Coverage.setDsLimit((int)0.0);
		}
		}
		else{
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage :BOPOrdinanceOrLawCov3CoverageList){
		BOPOrdinanceOrLawCov3Coverage.setDsLimit((int)0.0);
		}
		}
		}
		}
		}
		}
	  
	}
	public void BOPOrdinanceOrLawCov2And3Coverage_Limit ()  {
	  
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals((String)"Coverage 1 Only")){
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage :BOPOrdinanceOrLawCov2And3CoverageList){
		BOPOrdinanceOrLawCov2And3Coverage.setDsLimit((int)0.0);
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals((String)"Coverage 3 Only")){
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage :BOPOrdinanceOrLawCov2And3CoverageList){
		BOPOrdinanceOrLawCov2And3Coverage.setDsLimit((int)0.0);
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals((String)"Coverages 1 and 2")){
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage :BOPOrdinanceOrLawCov2And3CoverageList){
		BOPOrdinanceOrLawCov2And3Coverage.setDsLimit((int)0.0);
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals((String)"Coverages 1, 2 and 3")){
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage :BOPOrdinanceOrLawCov2And3CoverageList){
		BOPOrdinanceOrLawCov2And3Coverage.setDsLimit((int)0.0);
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals((String)"Coverage 1 with Coverages 2 and 3 Combined")){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov2And3Coverage/dsLimit"))) < (int)10000.0){
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage :BOPOrdinanceOrLawCov2And3CoverageList){
		BOPOrdinanceOrLawCov2And3Coverage.setDsLimit((int)10000.0);
		}
		}
		}
		else{
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage :BOPOrdinanceOrLawCov2And3CoverageList){
		BOPOrdinanceOrLawCov2And3Coverage.setDsLimit((int)0.0);
		}
		}
		}
		}
		}
		}
	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPOrdinanceOrLawCov1EQCoverageList != null && this.BOPOrdinanceOrLawCov1EQCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov1EQCoverage BOPOrdinanceOrLawCov1EQCoverage : BOPOrdinanceOrLawCov1EQCoverageList) {
				finalPremium = finalPremium + BOPOrdinanceOrLawCov1EQCoverage.getPremium();
			}
		}
		if(this.BOPOrdinanceOrLawCov2EQCoverageList != null && this.BOPOrdinanceOrLawCov2EQCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov2EQCoverage BOPOrdinanceOrLawCov2EQCoverage : BOPOrdinanceOrLawCov2EQCoverageList) {
				finalPremium = finalPremium + BOPOrdinanceOrLawCov2EQCoverage.getPremium();
			}
		}
		if(this.BOPOrdinanceOrLawCov2And3EQCoverageList != null && this.BOPOrdinanceOrLawCov2And3EQCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov2And3EQCoverage BOPOrdinanceOrLawCov2And3EQCoverage : BOPOrdinanceOrLawCov2And3EQCoverageList) {
				finalPremium = finalPremium + BOPOrdinanceOrLawCov2And3EQCoverage.getPremium();
			}
		}
		if(this.BOPOrdinanceOrLawCov2And3CoverageList != null && this.BOPOrdinanceOrLawCov2And3CoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage : BOPOrdinanceOrLawCov2And3CoverageList) {
				finalPremium = finalPremium + BOPOrdinanceOrLawCov2And3Coverage.getPremium();
			}
		}
		if(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverageList != null && this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage : BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverageList) {
				finalPremium = finalPremium + BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.getPremium();
			}
		}
		if(this.BOPOrdinanceOrLawCov3EQCoverageList != null && this.BOPOrdinanceOrLawCov3EQCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov3EQCoverage BOPOrdinanceOrLawCov3EQCoverage : BOPOrdinanceOrLawCov3EQCoverageList) {
				finalPremium = finalPremium + BOPOrdinanceOrLawCov3EQCoverage.getPremium();
			}
		}
		if(this.BOPOrdinanceOrLawCov2CoverageList != null && this.BOPOrdinanceOrLawCov2CoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage : BOPOrdinanceOrLawCov2CoverageList) {
				finalPremium = finalPremium + BOPOrdinanceOrLawCov2Coverage.getPremium();
			}
		}
		if(this.BOPOrdinanceOrLawCov1CoverageList != null && this.BOPOrdinanceOrLawCov1CoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov1Coverage BOPOrdinanceOrLawCov1Coverage : BOPOrdinanceOrLawCov1CoverageList) {
				finalPremium = finalPremium + BOPOrdinanceOrLawCov1Coverage.getPremium();
			}
		}
		if(this.BOPOrdinanceOrLawCov3CoverageList != null && this.BOPOrdinanceOrLawCov3CoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage : BOPOrdinanceOrLawCov3CoverageList) {
				finalPremium = finalPremium + BOPOrdinanceOrLawCov3Coverage.getPremium();
			}
		}
		if(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverageList != null && this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage : BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverageList) {
				finalPremium = finalPremium + BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.getPremium();
			}
		}
this.BOPOrdinanceOrLawCov.setPremium(finalPremium) ;
	  
	}
	public void ProcessPremium1_CommonRatingSub2 ()  {
	  
	BOPOrdinanceOrLawCov3Coverage_Limit();
	
	  
	}
	public void ProcessPremium1_CommonRatingSub1 ()  {
	  
	BOPOrdinanceOrLawCov2Coverage_Limit();
	
	  
	}
	public void BOPOrdinanceOrLawCov2Coverage_Limit ()  {
	  
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals((String)"Coverage 1 Only")){
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage :BOPOrdinanceOrLawCov2CoverageList){
		BOPOrdinanceOrLawCov2Coverage.setDsLimit((int)0.0);
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals((String)"Coverage 3 Only")){
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage :BOPOrdinanceOrLawCov2CoverageList){
		BOPOrdinanceOrLawCov2Coverage.setDsLimit((int)0.0);
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals((String)"Coverages 1 and 2")){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov2Coverage/dsLimit"))) < (int)0.0){
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage :BOPOrdinanceOrLawCov2CoverageList){
		BOPOrdinanceOrLawCov2Coverage.setDsLimit((int)0.0);
		}
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals((String)"Coverages 1, 2 and 3")){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov2Coverage/dsLimit"))) < (int)0.0){
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage :BOPOrdinanceOrLawCov2CoverageList){
		BOPOrdinanceOrLawCov2Coverage.setDsLimit((int)0.0);
		}
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals((String)"Coverage 1 with Coverages 2 and 3 Combined")){
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage :BOPOrdinanceOrLawCov2CoverageList){
		BOPOrdinanceOrLawCov2Coverage.setDsLimit((int)0.0);
		}
		}
		else{
		for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage :BOPOrdinanceOrLawCov2CoverageList){
		BOPOrdinanceOrLawCov2Coverage.setDsLimit((int)0.0);
		}
		}
		}
		}
		}
		}
	  
	}
	public void ProcessPremium1_CommonRatingSub3 ()  {
	  
	BOPOrdinanceOrLawCov2And3Coverage_Limit();
	
	  
	}
	
	
	
	
	


	
}