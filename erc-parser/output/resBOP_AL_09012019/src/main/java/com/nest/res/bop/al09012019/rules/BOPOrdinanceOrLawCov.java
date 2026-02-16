package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov1EQCoverage;
import com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2EQCoverage;
import com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2And3EQCoverage;
import com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2And3Coverage;
import com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage;
import com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov3EQCoverage;
import com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2Coverage;
import com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov1Coverage;
import com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov3Coverage;
import com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage;

public class BOPOrdinanceOrLawCov  {

	
	
	
	private com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov2EQCoverage BOPOrdinanceOrLawCov2EQCoverageRule;
	private List<BOPOrdinanceOrLawCov1EQCoverage> BOPOrdinanceOrLawCov1EQCoverageList;
	private List<BOPOrdinanceOrLawCov2EQCoverage> BOPOrdinanceOrLawCov2EQCoverageList;
	private com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov2And3EQCoverage BOPOrdinanceOrLawCov2And3EQCoverageRule;
	private com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov BOPOrdinanceOrLawCov;
	private List<BOPOrdinanceOrLawCov2And3EQCoverage> BOPOrdinanceOrLawCov2And3EQCoverageList;
	private List<BOPOrdinanceOrLawCov2And3Coverage> BOPOrdinanceOrLawCov2And3CoverageList;
	private com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov1EQCoverage BOPOrdinanceOrLawCov1EQCoverageRule;
	private List<BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage> BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverageList;
	private com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3CoverageRule;
	private List<BOPOrdinanceOrLawCov3EQCoverage> BOPOrdinanceOrLawCov3EQCoverageList;
	private com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3CoverageRule;
	private List<BOPOrdinanceOrLawCov2Coverage> BOPOrdinanceOrLawCov2CoverageList;
	private com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov3EQCoverage BOPOrdinanceOrLawCov3EQCoverageRule;
	private List<BOPOrdinanceOrLawCov1Coverage> BOPOrdinanceOrLawCov1CoverageList;
	private List<BOPOrdinanceOrLawCov3Coverage> BOPOrdinanceOrLawCov3CoverageList;
	private com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov1Coverage BOPOrdinanceOrLawCov1CoverageRule;
	private com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverageRule;
	private List<BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage> BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverageList;
	private com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2CoverageRule;
	private com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverageRule;
	
	
	
	public  BOPOrdinanceOrLawCov (com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov BOPOrdinanceOrLawCov)  {
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
	public void BOPOrdinanceOrLawCov2Coverage_Limit ()  {
	  
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals(MathHelper.getStringValue("Coverage 1 Only"))){
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage :BOPOrdinanceOrLawCov2CoverageList){
		BOPOrdinanceOrLawCov2Coverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals(MathHelper.getStringValue("Coverage 3 Only"))){
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage :BOPOrdinanceOrLawCov2CoverageList){
		BOPOrdinanceOrLawCov2Coverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals(MathHelper.getStringValue("Coverages 1 and 2"))){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov2Coverage/dsLimit"))) < MathHelper.getIntegerValue(0.0)){
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage :BOPOrdinanceOrLawCov2CoverageList){
		BOPOrdinanceOrLawCov2Coverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals(MathHelper.getStringValue("Coverages 1, 2 and 3"))){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov2Coverage/dsLimit"))) < MathHelper.getIntegerValue(0.0)){
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage :BOPOrdinanceOrLawCov2CoverageList){
		BOPOrdinanceOrLawCov2Coverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals(MathHelper.getStringValue("Coverage 1 with Coverages 2 and 3 Combined"))){
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage :BOPOrdinanceOrLawCov2CoverageList){
		BOPOrdinanceOrLawCov2Coverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
		else{
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage :BOPOrdinanceOrLawCov2CoverageList){
		BOPOrdinanceOrLawCov2Coverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
		}
		}
		}
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	ProcessPremium1_CommonRatingSub2();
	
	ProcessPremium1_CommonRatingSub3();
	
	if(null != BOPOrdinanceOrLawCov1CoverageList){
		for(BOPOrdinanceOrLawCov1Coverage BOPOrdinanceOrLawCov1Coverage:BOPOrdinanceOrLawCov1CoverageList){
			BOPOrdinanceOrLawCov1CoverageRule = new com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov1Coverage(BOPOrdinanceOrLawCov1Coverage);
			BOPOrdinanceOrLawCov1CoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCov1EQCoverageList){
		for(BOPOrdinanceOrLawCov1EQCoverage BOPOrdinanceOrLawCov1EQCoverage:BOPOrdinanceOrLawCov1EQCoverageList){
			BOPOrdinanceOrLawCov1EQCoverageRule = new com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov1EQCoverage(BOPOrdinanceOrLawCov1EQCoverage);
			BOPOrdinanceOrLawCov1EQCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCov2CoverageList){
		for(BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage:BOPOrdinanceOrLawCov2CoverageList){
			BOPOrdinanceOrLawCov2CoverageRule = new com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov2Coverage(BOPOrdinanceOrLawCov2Coverage);
			BOPOrdinanceOrLawCov2CoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCov2EQCoverageList){
		for(BOPOrdinanceOrLawCov2EQCoverage BOPOrdinanceOrLawCov2EQCoverage:BOPOrdinanceOrLawCov2EQCoverageList){
			BOPOrdinanceOrLawCov2EQCoverageRule = new com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov2EQCoverage(BOPOrdinanceOrLawCov2EQCoverage);
			BOPOrdinanceOrLawCov2EQCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCov3CoverageList){
		for(BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage:BOPOrdinanceOrLawCov3CoverageList){
			BOPOrdinanceOrLawCov3CoverageRule = new com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov3Coverage(BOPOrdinanceOrLawCov3Coverage);
			BOPOrdinanceOrLawCov3CoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCov3EQCoverageList){
		for(BOPOrdinanceOrLawCov3EQCoverage BOPOrdinanceOrLawCov3EQCoverage:BOPOrdinanceOrLawCov3EQCoverageList){
			BOPOrdinanceOrLawCov3EQCoverageRule = new com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov3EQCoverage(BOPOrdinanceOrLawCov3EQCoverage);
			BOPOrdinanceOrLawCov3EQCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCov2And3CoverageList){
		for(BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage:BOPOrdinanceOrLawCov2And3CoverageList){
			BOPOrdinanceOrLawCov2And3CoverageRule = new com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov2And3Coverage(BOPOrdinanceOrLawCov2And3Coverage);
			BOPOrdinanceOrLawCov2And3CoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCov2And3EQCoverageList){
		for(BOPOrdinanceOrLawCov2And3EQCoverage BOPOrdinanceOrLawCov2And3EQCoverage:BOPOrdinanceOrLawCov2And3EQCoverageList){
			BOPOrdinanceOrLawCov2And3EQCoverageRule = new com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov2And3EQCoverage(BOPOrdinanceOrLawCov2And3EQCoverage);
			BOPOrdinanceOrLawCov2And3EQCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverageList){
		for(BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage:BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverageList){
			BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverageRule = new com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage(BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage);
			BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverageList){
		for(BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage:BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverageList){
			BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverageRule = new com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage(BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage);
			BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverageRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void ProcessPremium1_CommonRatingSub1 ()  {
	  
	BOPOrdinanceOrLawCov2Coverage_Limit();
	
	  
	}
	public void ProcessPremium1_CommonRatingSub2 ()  {
	  
	BOPOrdinanceOrLawCov3Coverage_Limit();
	
	  
	}
	public void BOPOrdinanceOrLawCov2And3Coverage_Limit ()  {
	  
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals(MathHelper.getStringValue("Coverage 1 Only"))){
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage :BOPOrdinanceOrLawCov2And3CoverageList){
		BOPOrdinanceOrLawCov2And3Coverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals(MathHelper.getStringValue("Coverage 3 Only"))){
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage :BOPOrdinanceOrLawCov2And3CoverageList){
		BOPOrdinanceOrLawCov2And3Coverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals(MathHelper.getStringValue("Coverages 1 and 2"))){
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage :BOPOrdinanceOrLawCov2And3CoverageList){
		BOPOrdinanceOrLawCov2And3Coverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals(MathHelper.getStringValue("Coverages 1, 2 and 3"))){
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage :BOPOrdinanceOrLawCov2And3CoverageList){
		BOPOrdinanceOrLawCov2And3Coverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals(MathHelper.getStringValue("Coverage 1 with Coverages 2 and 3 Combined"))){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov2And3Coverage/dsLimit"))) < MathHelper.getIntegerValue(10000.0)){
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage :BOPOrdinanceOrLawCov2And3CoverageList){
		BOPOrdinanceOrLawCov2And3Coverage.setDsLimit(MathHelper.getIntegerValue(10000.0));
		}
		}
		}
		else{
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage :BOPOrdinanceOrLawCov2And3CoverageList){
		BOPOrdinanceOrLawCov2And3Coverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
		}
		}
		}
		}
	  
	}
	public void BOPOrdinanceOrLawCov3Coverage_Limit ()  {
	  
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals(MathHelper.getStringValue("Coverage 1 Only"))){
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage :BOPOrdinanceOrLawCov3CoverageList){
		BOPOrdinanceOrLawCov3Coverage.setDsLimit(MathHelper.getIntegerValue(10000.0));
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals(MathHelper.getStringValue("Coverage 3 Only"))){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov3Coverage/dsLimit"))) < MathHelper.getIntegerValue(10000.0)){
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage :BOPOrdinanceOrLawCov3CoverageList){
		BOPOrdinanceOrLawCov3Coverage.setDsLimit(MathHelper.getIntegerValue(10000.0));
		}
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals(MathHelper.getStringValue("Coverages 1 and 2"))){
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage :BOPOrdinanceOrLawCov3CoverageList){
		BOPOrdinanceOrLawCov3Coverage.setDsLimit(MathHelper.getIntegerValue(10000.0));
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals(MathHelper.getStringValue("Coverages 1, 2 and 3"))){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov3Coverage/dsLimit"))) < MathHelper.getIntegerValue(10000.0)){
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage :BOPOrdinanceOrLawCov3CoverageList){
		BOPOrdinanceOrLawCov3Coverage.setDsLimit(MathHelper.getIntegerValue(10000.0));
		}
		}
		}
		else{
		if(this.BOPOrdinanceOrLawCov.getCoverage().equals(MathHelper.getStringValue("Coverage 1 with Coverages 2 and 3 Combined"))){
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage :BOPOrdinanceOrLawCov3CoverageList){
		BOPOrdinanceOrLawCov3Coverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
		else{
		for(com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage :BOPOrdinanceOrLawCov3CoverageList){
		BOPOrdinanceOrLawCov3Coverage.setDsLimit(MathHelper.getIntegerValue(0.0));
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
	public void setTotalPremiumForCoverage ()  {
	  this.BOPOrdinanceOrLawCov.setPremium(MathHelper.getDoubleValue(this.BOPOrdinanceOrLawCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov1Coverage/Premium")))));
this.BOPOrdinanceOrLawCov.setPremium(MathHelper.getDoubleValue(this.BOPOrdinanceOrLawCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov1EQCoverage/Premium")))));
this.BOPOrdinanceOrLawCov.setPremium(MathHelper.getDoubleValue(this.BOPOrdinanceOrLawCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov2And3Coverage/Premium")))));
this.BOPOrdinanceOrLawCov.setPremium(MathHelper.getDoubleValue(this.BOPOrdinanceOrLawCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov2And3EQCoverage/Premium")))));
this.BOPOrdinanceOrLawCov.setPremium(MathHelper.getDoubleValue(this.BOPOrdinanceOrLawCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov2Coverage/Premium")))));
this.BOPOrdinanceOrLawCov.setPremium(MathHelper.getDoubleValue(this.BOPOrdinanceOrLawCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov2EQCoverage/Premium")))));
this.BOPOrdinanceOrLawCov.setPremium(MathHelper.getDoubleValue(this.BOPOrdinanceOrLawCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov3Coverage/Premium")))));
this.BOPOrdinanceOrLawCov.setPremium(MathHelper.getDoubleValue(this.BOPOrdinanceOrLawCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawCov3EQCoverage/Premium")))));
this.BOPOrdinanceOrLawCov.setPremium(MathHelper.getDoubleValue(this.BOPOrdinanceOrLawCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage/Premium")))));
this.BOPOrdinanceOrLawCov.setPremium(MathHelper.getDoubleValue(this.BOPOrdinanceOrLawCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov,"BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage/Premium")))));

	  
	}
	
	
	
	
	


	
}