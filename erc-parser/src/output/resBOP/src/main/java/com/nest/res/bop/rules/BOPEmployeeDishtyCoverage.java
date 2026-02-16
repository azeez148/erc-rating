package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEmployeeDishtyCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPEmployeeDishtyCoverage BOPEmployeeDishtyCoverage;
	
	
	
	public void NumLocations ()  {
	  this.BOPEmployeeDishtyCoverage.setNumLocations((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPEmployeeDishtyCoverage,"../BOPLocation") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"EmployeeDishtyApply"))).equals((String)"Yes")){
			this.BOPEmployeeDishtyCoverage.setNumLocations(this.BOPEmployeeDishtyCoverage.getNumLocations() + (int)1.0);
		}		}

	  
	}
	public void PhotographyAdditionalPremium ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPEmployeeDishtyCoverage,"../BOPPhotography"))) != null){
			this.BOPEmployeeDishtyCoverage.setPhotographyAdditionalPremium(MathHelper.roundUpDoller(this.BOPEmployeeDishtyCoverage.getCalcPremium_1() * this.BOPEmployeeDishtyCoverage.getPhotographyFactor()));
		}
	  
	}
	public void AddlEmployeeRate () throws LookupException,NumberFormatException {
	  this.BOPEmployeeDishtyCoverage.setAddlEmployeeRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeDishtyAddlEmployeeRate",String.valueOf(BOPEmployeeDishtyCoverage.getDsLimit()))));

	  
	}
	public void RestaurantFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPEmployeeDishtyCoverage.getBOPRestaurantCount_1() > (int)0.0){
			this.BOPEmployeeDishtyCoverage.setRestaurantFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RestaurantEmployeeDishtyFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setRestaurantFactor((double)1.0);
		}
	  
	}
	public void AddlLocationPremium ()  {
	  this.BOPEmployeeDishtyCoverage.setAddlLocationPremium(MathHelper.roundUpDoller(this.BOPEmployeeDishtyCoverage.getAddlLocationRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmployeeDishtyCoverage,"../CrimeLCM")))));

	  
	}
	public void addlEmployeesCount ()  {
	  
		if(this.BOPEmployeeDishtyCoverage.getDsNumEmployees() <= (int)5.0){
			this.BOPEmployeeDishtyCoverage.setAddlEmployeesCount((int)0.0);
		}
		else{
			this.BOPEmployeeDishtyCoverage.setAddlEmployeesCount(Integer.valueOf(this.BOPEmployeeDishtyCoverage.getDsNumEmployees()) - (int)5.0);
		}
	  
	}
	public void AddlEmployeePremium ()  {
	  this.BOPEmployeeDishtyCoverage.setAddlEmployeePremium(MathHelper.roundUpDoller(this.BOPEmployeeDishtyCoverage.getAddlEmployeeRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmployeeDishtyCoverage,"../CrimeLCM")))));

	  
	}
	public void AddlLocationRate () throws LookupException,NumberFormatException {
	  this.BOPEmployeeDishtyCoverage.setAddlLocationRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeDishtyAddlLocationRate",String.valueOf(BOPEmployeeDishtyCoverage.getDsLimit()))));

	  
	}
	public void FinalAddlEmployeePremium ()  {
	  this.BOPEmployeeDishtyCoverage.setFinalAddlEmployeePremium(this.BOPEmployeeDishtyCoverage.getAddlEmployeePremium() * this.BOPEmployeeDishtyCoverage.getAddlEmployeesCount());

	  
	}
	public void FinalAddlLocationPremium ()  {
	  
		if(this.BOPEmployeeDishtyCoverage.getAddlLocationCount() >= (int)1.0){
			this.BOPEmployeeDishtyCoverage.setFinalAddlLocationPremium(this.BOPEmployeeDishtyCoverage.getAddlLocationPremium() * this.BOPEmployeeDishtyCoverage.getAddlLocationCount());
		}
		else{
			this.BOPEmployeeDishtyCoverage.setFinalAddlLocationPremium((double)0.0);
		}
	  
	}
	public void bOPPhotography_1 ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPEmployeeDishtyCoverage,"../BOPPhotography"))) != null){
			this.BOPEmployeeDishtyCoverage.setBOPPhotography_1((int)1.0);
		}
		else{
			this.BOPEmployeeDishtyCoverage.setBOPPhotography_1((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
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
	public void ApartmentBuildingsFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPEmployeeDishtyCoverage.getBOPApartmentBuildingsCount_1() > (int)0.0){
			this.BOPEmployeeDishtyCoverage.setApartmentBuildingsFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ApartmentBuildingsEmployeeDishtyFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setApartmentBuildingsFactor((double)1.0);
		}
	  
	}
	public void noChargeLocCount ()  {
	  this.BOPEmployeeDishtyCoverage.setNoChargeLocCount((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPEmployeeDishtyCoverage,"../BOPLocation") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"EmployeeDishtyNoChargeLocation"))).equals((String)"Yes")){
			this.BOPEmployeeDishtyCoverage.setNoChargeLocCount(Integer.valueOf(this.BOPEmployeeDishtyCoverage.getNoChargeLocCount()) + (int)1.0);
		}		}

	  
	}
	public  BOPEmployeeDishtyCoverage (com.nest.res.bop.domain.BOPEmployeeDishtyCoverage BOPEmployeeDishtyCoverage)  {
	  this.BOPEmployeeDishtyCoverage = BOPEmployeeDishtyCoverage;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void addlLocationCount ()  {
	  this.BOPEmployeeDishtyCoverage.setAddlLocationCount(Integer.valueOf(this.BOPEmployeeDishtyCoverage.getNumLocations()) - (int)1.0 - Integer.valueOf(this.BOPEmployeeDishtyCoverage.getNoChargeLocCount()));

		if(this.BOPEmployeeDishtyCoverage.getAddlLocationCount() <= (int)0.0){
			this.BOPEmployeeDishtyCoverage.setAddlLocationCount((int)0.0);
		}
		else{
		if(this.BOPEmployeeDishtyCoverage.getAddlLocationCount() <= (int)24.0){
			this.BOPEmployeeDishtyCoverage.setAddlLocationCount(Integer.valueOf(this.BOPEmployeeDishtyCoverage.getNumLocations()) - (int)1.0 - Integer.valueOf(this.BOPEmployeeDishtyCoverage.getNoChargeLocCount()));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setAddlLocationCount((int)24.0);
		}
		}
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPEmployeeDishtyCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeDishtyBaseRate",String.valueOf(BOPEmployeeDishtyCoverage.getDsLimit()))));

	  
	}
	public void calcPremium_1 ()  {
	  this.BOPEmployeeDishtyCoverage.setCalcPremium_1(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmployeeDishtyCoverage,"../IRPMFactor"))) * MathHelper.roundUpDoller(Double.valueOf(this.BOPEmployeeDishtyCoverage.getRestaurantFactor()) * MathHelper.roundUpDoller(Double.valueOf(this.BOPEmployeeDishtyCoverage.getApartmentBuildingsFactor()) * MathHelper.roundUpDoller(Double.valueOf(this.BOPEmployeeDishtyCoverage.getSelfStorageFactor()) * MathHelper.roundUpDoller(Double.valueOf(this.BOPEmployeeDishtyCoverage.getResidentialCleaningServicesFactor()) * (Double.valueOf(this.BOPEmployeeDishtyCoverage.getFinalAddlEmployeePremium()) + Double.valueOf(this.BOPEmployeeDishtyCoverage.getFinalAddlLocationPremium()) + MathHelper.roundUpDoller(Double.valueOf(this.BOPEmployeeDishtyCoverage.getBaseRate()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmployeeDishtyCoverage,"../CrimeLCM")))))))))));

	  
	}
	public void SelfStorageFacilityIndctr ()  {
	  
		if(this.BOPEmployeeDishtyCoverage.getEmployeeDishtyApplyCount_1() > (int)0.0 && this.BOPEmployeeDishtyCoverage.getSelfStorageFacilityCount_1() > (int)0.0){
			this.BOPEmployeeDishtyCoverage.setSelfStorageFacilityIndctr((int)1.0);
		}
		else{
			this.BOPEmployeeDishtyCoverage.setSelfStorageFacilityIndctr((int)0.0);
		}
	  
	}
	public void bOPRestaurantCount_1 ()  {
	  this.BOPEmployeeDishtyCoverage.setBOPRestaurantCount_1((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPEmployeeDishtyCoverage,"../BOPLocation") ){

		if(((XpathNode.selectNodeValue(policy,"BOPRestaurants"))) != null){
			this.BOPEmployeeDishtyCoverage.setBOPRestaurantCount_1(Integer.valueOf(this.BOPEmployeeDishtyCoverage.getBOPRestaurantCount_1()) + (int)1.0);
		}		}

	  
	}
	public void bOPApartmentBuildingsCount_1 ()  {
	  this.BOPEmployeeDishtyCoverage.setBOPApartmentBuildingsCount_1((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPEmployeeDishtyCoverage,"../BOPLocation") ){

		if(((XpathNode.selectNodeValue(policy,"BOPApartmentBuildings"))) != null){
			this.BOPEmployeeDishtyCoverage.setBOPApartmentBuildingsCount_1(Integer.valueOf(this.BOPEmployeeDishtyCoverage.getBOPApartmentBuildingsCount_1()) + (int)1.0);
		}		}

	  
	}
	public void NumEmployees ()  {
	  this.BOPEmployeeDishtyCoverage.setDsNumEmployees((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPEmployeeDishtyCoverage,"../BOPLocation") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"EmployeeDishtyApply"))).equals((String)"Yes")){
			this.BOPEmployeeDishtyCoverage.setDsNumEmployees(this.BOPEmployeeDishtyCoverage.getDsNumEmployees() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsNumEmployees"))));
		}		}

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPEmployeeDishtyCoverage.getPremium() != (double)0.0){
			this.BOPEmployeeDishtyCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPEmployeeDishtyCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ResidentialCleaningServicesFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPEmployeeDishtyCoverage.getBOPResCleaningServicesCount_1() > (int)0.0){
			this.BOPEmployeeDishtyCoverage.setResidentialCleaningServicesFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ResidentialCleaningServicesFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setResidentialCleaningServicesFactor((double)1.0);
		}
	  
	}
	public void selfStorageFacilityCount_1 ()  {
	  this.BOPEmployeeDishtyCoverage.setSelfStorageFacilityCount_1((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPEmployeeDishtyCoverage,"../BOPLocation/BOPStructure/BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Self-Storage Facility")){
			this.BOPEmployeeDishtyCoverage.setSelfStorageFacilityCount_1(Integer.valueOf(this.BOPEmployeeDishtyCoverage.getSelfStorageFacilityCount_1()) + (int)1.0);
		}		}

	  
	}
	public void bOPResCleaningServicesCount_1 ()  {
	  this.BOPEmployeeDishtyCoverage.setBOPResCleaningServicesCount_1((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPEmployeeDishtyCoverage,"../BOPLocation/BOPStructure/BOPClassification") ){

		if(((XpathNode.selectNodeValue(policy,"BOPResidentialCleaningServices"))) != null){
			this.BOPEmployeeDishtyCoverage.setBOPResCleaningServicesCount_1(Integer.valueOf(this.BOPEmployeeDishtyCoverage.getBOPResCleaningServicesCount_1()) + (int)1.0);
		}		}

	  
	}
	public void SelfStorageFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPEmployeeDishtyCoverage.getSelfStorageFacilityIndctr() == (int)1.0){
			this.BOPEmployeeDishtyCoverage.setSelfStorageFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeeDishtySelfStorageFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setSelfStorageFactor((double)1.0);
		}
	  
	}
	public void employeeDishtyApplyCount_1 ()  {
	  this.BOPEmployeeDishtyCoverage.setEmployeeDishtyApplyCount_1((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPEmployeeDishtyCoverage,"../BOPLocation") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"EmployeeDishtyApply"))).equals((String)"Yes")){
			this.BOPEmployeeDishtyCoverage.setEmployeeDishtyApplyCount_1(Integer.valueOf(this.BOPEmployeeDishtyCoverage.getEmployeeDishtyApplyCount_1()) + (int)1.0);
		}		}

	  
	}
	public void Premium ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPEmployeeDishtyCoverage,"../BOPPhotography"))) != null){
			this.BOPEmployeeDishtyCoverage.setPremium(this.BOPEmployeeDishtyCoverage.getCalcPremium_1() + this.BOPEmployeeDishtyCoverage.getPhotographyAdditionalPremium());
		}
		else{
			this.BOPEmployeeDishtyCoverage.setPremium(this.BOPEmployeeDishtyCoverage.getCalcPremium_1());
		}
	  
	}
	public void PhotographyFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPEmployeeDishtyCoverage.getBOPPhotography_1() > (int)0.0){
			this.BOPEmployeeDishtyCoverage.setPhotographyFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PhotographyEmployeeDishtyFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPEmployeeDishtyCoverage.setPhotographyFactor((double)1.0);
		}
	  
	}
	
	
	
	
	


	
}