package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEmployeeDishtyCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPEmployeeDishtyCoverage BOPEmployeeDishtyCoverage;
	
	
	
	public void NumEmployees ()  {
	  this.BOPEmployeeDishtyCoverage.setDsNumEmployees(this.BOPEmployeeDishtyCoverage.getNumEmployeesTemp_1());

	  
	}
	public void bOPPhotography_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPEmployeeDishtyCoverage,"../BOPPhotography")) != null){
			this.BOPEmployeeDishtyCoverage.setBOPPhotography_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setBOPPhotography_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPEmployeeDishtyCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPEmployeeDishtyCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void numLocationsTemp_1 ()  {
	  this.BOPEmployeeDishtyCoverage.setNumLocationsTemp_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPEmployeeDishtyCoverage,"../BOPLocation") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"EmployeeDishtyApply"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPEmployeeDishtyCoverage.setNumLocationsTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPEmployeeDishtyCoverage.getNumLocationsTemp_1() + MathHelper.getIntegerValue(1.0))));
		}		}

	  
	}
	public void SelfStorageFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPEmployeeDishtyCoverage.getSelfStorageFacilityIndctr() == MathHelper.getIntegerValue(1.0)){
			this.BOPEmployeeDishtyCoverage.setSelfStorageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeDishtySelfStorageFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setSelfStorageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void FinalAddlEmployeePremium ()  {
	  this.BOPEmployeeDishtyCoverage.setFinalAddlEmployeePremium(MathHelper.getDoubleValue(this.BOPEmployeeDishtyCoverage.getAddlEmployeePremium() * this.BOPEmployeeDishtyCoverage.getAddlEmployeesCount()));

	  
	}
	public void noChargeLocCount ()  {
	  this.BOPEmployeeDishtyCoverage.setNoChargeLocCount(this.BOPEmployeeDishtyCoverage.getNoChargeLocCountTemp_1());

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void AddlEmployeePremium ()  {
	  this.BOPEmployeeDishtyCoverage.setAddlEmployeePremium(MathHelper.roundUpDoller(this.BOPEmployeeDishtyCoverage.getAddlEmployeeRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmployeeDishtyCoverage,"../CrimeLCM")))));

	  
	}
	public void numEmployeesTemp_1 ()  {
	  this.BOPEmployeeDishtyCoverage.setNumEmployeesTemp_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPEmployeeDishtyCoverage,"../BOPLocation") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"EmployeeDishtyApply"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPEmployeeDishtyCoverage.setNumEmployeesTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPEmployeeDishtyCoverage.getNumEmployeesTemp_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsNumEmployees"))))));
		}		}

	  
	}
	public void addlEmployeesCount ()  {
	  
		if(this.BOPEmployeeDishtyCoverage.getDsNumEmployees() <= MathHelper.getIntegerValue(5.0)){
			this.BOPEmployeeDishtyCoverage.setAddlEmployeesCount(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setAddlEmployeesCount(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPEmployeeDishtyCoverage.getDsNumEmployees() - MathHelper.getIntegerValue(5.0))));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	numLocationsTemp_1();
	
	numEmployeesTemp_1();
	
	noChargeLocCountTemp_1();
	
	NumLocations();
	
	NumEmployees();
	
	noChargeLocCount();
	
	addlLocationCount();
	
	addlEmployeesCount();
	
	employeeDishtyApplyCount_1();
	
	selfStorageFacilityCount_1();
	
	SelfStorageFacilityIndctr();
	
	AddlEmployeeRate();
	
	BaseRate();
	
	AddlLocationRate();
	
	SelfStorageFactor();
	
	bOPPhotography_1();
	
	PhotographyFactor();
	
	bOPApartmentBuildingsCount_1();
	
	ApartmentBuildingsFactor();
	
	bOPResCleaningServicesCount_1();
	
	ResidentialCleaningServicesFactor();
	
	bOPRestaurantCount_1();
	
	RestaurantFactor();
	
	AddlEmployeePremium();
	
	AddlLocationPremium();
	
	FinalAddlEmployeePremium();
	
	FinalAddlLocationPremium();
	
	calcPremium_1();
	
	PhotographyAdditionalPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPEmployeeDishtyCoverage,"../MicroBOP"))).equals(MathHelper.getStringValue("No"))){
		if(this.BOPEmployeeDishtyCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPEmployeeDishtyCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		}
		else{
			this.BOPEmployeeDishtyCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ApartmentBuildingsFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPEmployeeDishtyCoverage.getBOPApartmentBuildingsCount_1() > MathHelper.getIntegerValue(0.0)){
			this.BOPEmployeeDishtyCoverage.setApartmentBuildingsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ApartmentBuildingsEmployeeDishtyFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setApartmentBuildingsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void bOPApartmentBuildingsCount_1 ()  {
	  this.BOPEmployeeDishtyCoverage.setBOPApartmentBuildingsCount_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPEmployeeDishtyCoverage,"../BOPLocation") ){

		if(((XpathNode.selectNodeValue(policy,"BOPApartmentBuildings"))) != null){
			this.BOPEmployeeDishtyCoverage.setBOPApartmentBuildingsCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPEmployeeDishtyCoverage.getBOPApartmentBuildingsCount_1() + MathHelper.getIntegerValue(1.0))));
		}		}

	  
	}
	public void noChargeLocCountTemp_1 ()  {
	  this.BOPEmployeeDishtyCoverage.setNoChargeLocCountTemp_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPEmployeeDishtyCoverage,"../BOPLocation") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"EmployeeDishtyNoChargeLocation"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPEmployeeDishtyCoverage.setNoChargeLocCountTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPEmployeeDishtyCoverage.getNoChargeLocCountTemp_1() + MathHelper.getIntegerValue(1.0))));
		}		}

	  
	}
	public void NumLocations ()  {
	  this.BOPEmployeeDishtyCoverage.setNumLocations(this.BOPEmployeeDishtyCoverage.getNumLocationsTemp_1());

	  
	}
	public void RestaurantFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPEmployeeDishtyCoverage.getBOPRestaurantCount_1() > MathHelper.getIntegerValue(0.0)){
			this.BOPEmployeeDishtyCoverage.setRestaurantFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RestaurantEmployeeDishtyFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setRestaurantFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void AddlEmployeeRate () throws LookupException,NumberFormatException {
	  this.BOPEmployeeDishtyCoverage.setAddlEmployeeRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeDishtyAddlEmployeeRate",String.valueOf(this.BOPEmployeeDishtyCoverage.getDsLimit()))));

	  
	}
	public void PhotographyFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPEmployeeDishtyCoverage.getBOPPhotography_1() > MathHelper.getIntegerValue(0.0)){
			this.BOPEmployeeDishtyCoverage.setPhotographyFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PhotographyEmployeeDishtyFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setPhotographyFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void calcPremium_1 ()  {
	  this.BOPEmployeeDishtyCoverage.setCalcPremium_1(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmployeeDishtyCoverage,"../IRPMFactor"))) * MathHelper.roundUpDoller(MathHelper.getDoubleValue(this.BOPEmployeeDishtyCoverage.getRestaurantFactor()) * MathHelper.roundUpDoller(MathHelper.getDoubleValue(this.BOPEmployeeDishtyCoverage.getApartmentBuildingsFactor()) * MathHelper.roundUpDoller(MathHelper.getDoubleValue(this.BOPEmployeeDishtyCoverage.getSelfStorageFactor()) * MathHelper.roundUpDoller(MathHelper.getDoubleValue(this.BOPEmployeeDishtyCoverage.getResidentialCleaningServicesFactor()) * (MathHelper.getDoubleValue(this.BOPEmployeeDishtyCoverage.getFinalAddlEmployeePremium()) + MathHelper.getDoubleValue(this.BOPEmployeeDishtyCoverage.getFinalAddlLocationPremium()) + MathHelper.roundUpDoller(MathHelper.getDoubleValue(this.BOPEmployeeDishtyCoverage.getBaseRate()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmployeeDishtyCoverage,"../CrimeLCM")))))))))));

	  
	}
	public void PhotographyAdditionalPremium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPEmployeeDishtyCoverage,"../BOPPhotography")) != null){
			this.BOPEmployeeDishtyCoverage.setPhotographyAdditionalPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPEmployeeDishtyCoverage.getCalcPremium_1() * this.BOPEmployeeDishtyCoverage.getPhotographyFactor())));
		}
	  
	}
	public void ResidentialCleaningServicesFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPEmployeeDishtyCoverage.getBOPResCleaningServicesCount_1() > MathHelper.getIntegerValue(0.0)){
			this.BOPEmployeeDishtyCoverage.setResidentialCleaningServicesFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ResidentialCleaningServicesFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setResidentialCleaningServicesFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public  BOPEmployeeDishtyCoverage (com.nest.res.bop.al01012026.domain.BOPEmployeeDishtyCoverage BOPEmployeeDishtyCoverage)  {
	  this.BOPEmployeeDishtyCoverage = BOPEmployeeDishtyCoverage;

	  
	}
	public void bOPRestaurantCount_1 ()  {
	  this.BOPEmployeeDishtyCoverage.setBOPRestaurantCount_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPEmployeeDishtyCoverage,"../BOPLocation") ){

		if(((XpathNode.selectNodeValue(policy,"BOPRestaurants"))) != null){
			this.BOPEmployeeDishtyCoverage.setBOPRestaurantCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPEmployeeDishtyCoverage.getBOPRestaurantCount_1() + MathHelper.getIntegerValue(1.0))));
		}		}

	  
	}
	public void FinalAddlLocationPremium ()  {
	  
		if(this.BOPEmployeeDishtyCoverage.getAddlLocationCount() >= MathHelper.getIntegerValue(1.0)){
			this.BOPEmployeeDishtyCoverage.setFinalAddlLocationPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPEmployeeDishtyCoverage.getAddlLocationPremium() * this.BOPEmployeeDishtyCoverage.getAddlLocationCount())));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setFinalAddlLocationPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void selfStorageFacilityCount_1 ()  {
	  this.BOPEmployeeDishtyCoverage.setSelfStorageFacilityCount_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPEmployeeDishtyCoverage,"../BOPLocation/BOPStructure/BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Self-Storage Facility"))){
			this.BOPEmployeeDishtyCoverage.setSelfStorageFacilityCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPEmployeeDishtyCoverage.getSelfStorageFacilityCount_1() + MathHelper.getIntegerValue(1.0))));
		}		}

	  
	}
	public void Premium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPEmployeeDishtyCoverage,"../BOPPhotography")) != null){
			this.BOPEmployeeDishtyCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPEmployeeDishtyCoverage.getCalcPremium_1() + this.BOPEmployeeDishtyCoverage.getPhotographyAdditionalPremium())));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setPremium(MathHelper.getDoubleValue(this.BOPEmployeeDishtyCoverage.getCalcPremium_1()));
		}
	  
	}
	public void addlLocationCount ()  {
	  this.BOPEmployeeDishtyCoverage.setAddlLocationCount(MathHelper.getIntegerValue(this.BOPEmployeeDishtyCoverage.getNumLocations() - MathHelper.getIntegerValue(1.0) - this.BOPEmployeeDishtyCoverage.getNoChargeLocCount()));

		if(this.BOPEmployeeDishtyCoverage.getAddlLocationCount() <= MathHelper.getIntegerValue(0.0)){
			this.BOPEmployeeDishtyCoverage.setAddlLocationCount(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
		if(this.BOPEmployeeDishtyCoverage.getAddlLocationCount() <= MathHelper.getIntegerValue(24.0)){
			this.BOPEmployeeDishtyCoverage.setAddlLocationCount(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPEmployeeDishtyCoverage.getNumLocations() - MathHelper.getIntegerValue(1.0) - this.BOPEmployeeDishtyCoverage.getNoChargeLocCount())));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setAddlLocationCount(MathHelper.getIntegerValue(MathHelper.getIntegerValue(24.0)));
		}
		}
	  
	}
	public void employeeDishtyApplyCount_1 ()  {
	  this.BOPEmployeeDishtyCoverage.setEmployeeDishtyApplyCount_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPEmployeeDishtyCoverage,"../BOPLocation") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"EmployeeDishtyApply"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPEmployeeDishtyCoverage.setEmployeeDishtyApplyCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPEmployeeDishtyCoverage.getEmployeeDishtyApplyCount_1() + MathHelper.getIntegerValue(1.0))));
		}		}

	  
	}
	public void AddlLocationRate () throws LookupException,NumberFormatException {
	  this.BOPEmployeeDishtyCoverage.setAddlLocationRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeDishtyAddlLocationRate",String.valueOf(this.BOPEmployeeDishtyCoverage.getDsLimit()))));

	  
	}
	public void AddlLocationPremium ()  {
	  this.BOPEmployeeDishtyCoverage.setAddlLocationPremium(MathHelper.roundUpDoller(this.BOPEmployeeDishtyCoverage.getAddlLocationRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmployeeDishtyCoverage,"../CrimeLCM")))));

	  
	}
	public void bOPResCleaningServicesCount_1 ()  {
	  this.BOPEmployeeDishtyCoverage.setBOPResCleaningServicesCount_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPEmployeeDishtyCoverage,"../BOPLocation/BOPStructure/BOPClassification") ){

		if(((XpathNode.selectNodeValue(policy,"BOPResidentialCleaningServices"))) != null){
			this.BOPEmployeeDishtyCoverage.setBOPResCleaningServicesCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPEmployeeDishtyCoverage.getBOPResCleaningServicesCount_1() + MathHelper.getIntegerValue(1.0))));
		}		}

	  
	}
	public void SelfStorageFacilityIndctr ()  {
	  
		if(this.BOPEmployeeDishtyCoverage.getEmployeeDishtyApplyCount_1() > MathHelper.getIntegerValue(0.0) && this.BOPEmployeeDishtyCoverage.getSelfStorageFacilityCount_1() > MathHelper.getIntegerValue(0.0)){
			this.BOPEmployeeDishtyCoverage.setSelfStorageFacilityIndctr(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setSelfStorageFacilityIndctr(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPEmployeeDishtyCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeDishtyBaseRate",String.valueOf(this.BOPEmployeeDishtyCoverage.getDsLimit()))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPEmployeeDishtyCoverage,"../BOPPhotography")) != null){
			this.BOPEmployeeDishtyCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPEmployeeDishtyCoverage.getCalcPremium_1() + this.BOPEmployeeDishtyCoverage.getPhotographyAdditionalPremium())));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setPremium(MathHelper.getDoubleValue(this.BOPEmployeeDishtyCoverage.getCalcPremium_1()));
		}
	  
	}
	
	
	
	
	


	
}