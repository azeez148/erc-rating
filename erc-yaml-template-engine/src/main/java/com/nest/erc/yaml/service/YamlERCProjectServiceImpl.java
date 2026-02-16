package com.nest.erc.yaml.service;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import javax.swing.text.AsyncBoxView.ChildState;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xslf.model.geom.IfElseExpression;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.Mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nest.erc.domain.AvailableLOBCoverage;
import com.nest.erc.domain.CommonConfig;
import com.nest.erc.domain.CommonDomainEntry;
import com.nest.erc.domain.CommonDomainTable;
import com.nest.erc.domain.ERCFunctionType;
import com.nest.erc.domain.ERCProcessorOutput;
import com.nest.erc.domain.EntityOrderType;
import com.nest.erc.domain.LOBName;
import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.alg.inter.HasExecutable;
import com.nest.erc.domain.alg.alg.inter.RatingExecutable;
import com.nest.erc.domain.alg.ds.Column;
import com.nest.erc.domain.alg.ds.DSWrapper;
import com.nest.erc.domain.alg.ds.Table;
import com.nest.erc.domain.alg.ds.Tables;
import com.nest.erc.domain.alg.impl.Argument;
import com.nest.erc.domain.alg.impl.ClassComponent;
import com.nest.erc.domain.alg.impl.FlowClass;
import com.nest.erc.domain.alg.impl.FlowVariable;
import com.nest.erc.domain.alg.impl.Lob;
import com.nest.erc.domain.alg.impl.Pch;
import com.nest.erc.domain.alg.impl.Reference;
import com.nest.erc.domain.alg.impl.TableName;
import com.nest.erc.domain.alg.impl.ThenPart;
import com.nest.erc.domain.alg.impl.executable.Assign;
import com.nest.erc.domain.alg.impl.executable.IfAndElse;
import com.nest.erc.domain.alg.impl.executable.Loop;
import com.nest.erc.domain.alg.impl.expressional.Bracket;
import com.nest.erc.domain.alg.impl.expressional.Expression;
import com.nest.erc.domain.alg.impl.expressional.Function;
import com.nest.erc.domain.alg.impl.expressional.Ratetable;
import com.nest.erc.domain.alg.rc.DomainTable;
import com.nest.erc.domain.alg.rc.DomainTableEntry;
import com.nest.erc.domain.alg.rc.DomainTableKey;
import com.nest.erc.domain.alg.rc.Field;
import com.nest.erc.domain.alg.rc.Form;
import com.nest.erc.domain.alg.rc.Forms;
import com.nest.erc.domain.alg.rc.RCWrapper;
import com.nest.erc.domain.alg.rc.RateBook;
import com.nest.erc.domain.alg.rc.RateTable;
import com.nest.erc.domain.alg.rc.RateTableEntry;
import com.nest.erc.domain.alg.rc.RateTableKey;
import com.nest.erc.domain.alg.rc.RateTableValue;
import com.nest.erc.domain.alg.re.constructs.impl.AlgParserOutput;
import com.nest.erc.domain.util.XmlConstructUtils;
import com.nest.erc.yaml.domain.Calculation;
import com.nest.erc.yaml.domain.CoverageLevelType;
import com.nest.erc.yaml.domain.DomainVariableType;
import com.nest.erc.yaml.domain.EnumFieldOption;
import com.nest.erc.yaml.domain.Limit;
import com.nest.erc.yaml.domain.Lines;
import com.nest.erc.yaml.domain.MappingCalculation;
import com.nest.erc.yaml.domain.MappingCalculations;
import com.nest.erc.yaml.domain.MappingRow;
import com.nest.erc.yaml.domain.Product;
import com.nest.erc.yaml.domain.RCFieldType;
import com.nest.erc.yaml.domain.RIskItemPresence;
import com.nest.erc.yaml.domain.ALGVariableType;
import com.nest.erc.yaml.domain.RateTableDefault;
import com.nest.erc.yaml.domain.RateTableSource;
import com.nest.erc.yaml.domain.RiskField;
import com.nest.erc.yaml.domain.RiskFieldType;
import com.nest.erc.yaml.domain.RiskItem;
import com.nest.erc.yaml.domain.RiskItemLimitType;
import com.nest.erc.yaml.domain.RiskType;
import com.nest.erc.yaml.domain.RiskTypeEntitiesOrder;
import com.nest.erc.yaml.domain.RiskTypes;
import com.nest.erc.yaml.domain.YAMLCompntIdentifier;
import com.nest.erc.yaml.domain.YAMLObject;
import com.nest.erc.yaml.domain.YAMLObjectType;
import com.nest.erc.yaml.domain.YamlBase;
import com.nest.erc.yaml.properties.ProjectYamlProperties;
import com.nest.erc.yaml.utils.YAMLConstants;
import com.nest.erc.yaml.utils.YAMLUtil;

@Component
public class YamlERCProjectServiceImpl implements YamlERCProjectService {

	private static final String RC_CLASS_TYPE_COVERAGE = "coverage";

	@Autowired
	YamlService yamlService;

	@Autowired
	private ProjectYamlProperties projectYamlProperties;

	private Map<String, List<Object>> yamlObjects = new HashMap<String, List<Object>>();
	private Map<String, Table> dsTables = new HashMap<String, Table>();
	private Map<String, Form> rcForms = new HashMap<String, Form>();
	private Map<String, Form> rcFormsMerged = new HashMap<String, Form>();
	private Map<String,Map<String, Form>> stateRCFormsMerged = new HashMap<String, Map<String,Form>>();
	private Map<String, TableName>tableNames = new HashMap<String, TableName>();
	private Map<String, DomainTable> rcDomainTables = new HashMap<String, DomainTable>();
	private Map<String, DomainTable> rcDomainTablesCW = new HashMap<String, DomainTable>();
	private Map<String, DomainTable> rcDomainTablesMerged = new HashMap<String, DomainTable>();
	private Map<String, List<ClassComponent>> flowClassComponents = new HashMap<String, List<ClassComponent>>();
	private Map<String, Map<Integer, List<String>>> rcRateTableCodeList = new HashMap<String, Map<Integer, List<String>>>();
	private AvailableLOBCoverage availableLOBCoverage;
	private Map<String,Integer> classHierarchy = new HashMap<String, Integer>();
	//private YamlBase yamlBase;
	//private DSWrapper dsWrapper;
	private Reference flowClassReference;
	//private RCWrapper rcWrapper;
	private Set<String> xPathVariableType;
	private Set<String> ordinaryVariables;
	private String firstHierarchicalClass;	
	private List<String> ercVariableList = new ArrayList<String>();//for checking duplicate variable in Riskfield/calculation
	//private List<String> ercRiskTypeList = new ArrayList<String>();//For checking dulicate RiskTypes 

	private List<String> ercHierarchyTypes = null;
	final List<String> allowedRiskTypes = Arrays.asList("policy", "risk", "form", "schedule"); // got details from rc
	// xml file
	final List<String> allowedRiskItemTypes = Arrays.asList(RC_CLASS_TYPE_COVERAGE); // got details from rc xml file
	final List<String> allowedClassFlowTypes = Arrays.asList("Premium Calculation", "Common Rating"); // got details
	// from alg xml

	private Set<String> validPrimitiveOperators = new HashSet<String>();
	private Set<String> validFunctionalOperators = new HashSet<String>();
	private final String limitString ="limit";
	private final String premiumString ="Premium";

	private XmlConstructUtils xmlConstructUtils = new XmlConstructUtils();
	private CommonConfig commonConfig;
	
	private Map<String,RiskType> riskTypesCW = new HashMap<String, RiskType>();
	private Map<String,RateTable> rateTablesCW = new HashMap<String, RateTable>();
	private Map<String,Map<String,RateTable>> rateTablesMerged = new HashMap<String,Map<String,RateTable>>();
	private Map<String,RateTable> rateTablesMergedState = new HashMap<String, RateTable>();
	private Map<String,Map<String,DomainTable>> statesDomainTablesMerged
	= new HashMap<String, Map<String,DomainTable>>();
	private String childState;
	private Map<String,List<String>> excludedPCH = new HashMap<String, List<String>>();
	private Map<String,List<String>> logs = new HashMap<String, List<String>>();
	private Map<String,String> rateTablemap = new HashMap<String,String>();
	private Map<String,List<MappingRow>> mappingTable = new HashMap<String, List<MappingRow>>();


	@Override
	public List<YAMLObject> buildYAMLProject(ERCProcessorOutput ercProcessorOutput, String lobName) throws Exception {

		setOperators();
		List<YAMLObject> yamlObjectList = new ArrayList<YAMLObject>();
		Map<String,AlgParserOutput> algParserOutputs = ercProcessorOutput.getAlgParserOutputs();
		//AlgParserOutput algParserOutputState = algParserOutputs.get("State");
		
		//childState = algParserOutputs.get("AL").getFlowChart().getState();

		DSWrapper dsWrapper = ercProcessorOutput.getDsWrapper(); // DS file parsed details
		Map<String, RCWrapper> rcWrappers = ercProcessorOutput.getRcWrappers(); // RC file parsed details
		availableLOBCoverage = ercProcessorOutput.getAvailableLOBCoverage();
		xPathVariableType = new HashSet<String>();
		xPathVariableType.addAll(Arrays.asList("XPATH_DATE", "XPATH_STRING", "XPATH_NUMERIC"));
		ordinaryVariables = new HashSet<String>();
		ordinaryVariables.addAll(Arrays.asList("LV_INTEGER", "LV_BOOLEAN", "COLUMN_NUMERIC", "LV_TIMESPAN", "LV_DOUBLE",
				"COLUMN_STRING", "LV_DATE", "LV_STRING", "UI"));		
		commonConfig = ercProcessorOutput.getCommonConfig(); // Set common data
		generateDsTableMap(dsWrapper.getTables(),"");	
		

		//RCWrapper rcWrapper = rcWrappers.get("merged");// need to handle CW and state separately
		//for (Map.Entry<String,RCWrapper> rcWrapperEntry : rcWrappers.entrySet()) {
		ercHierarchyTypes = new ArrayList<>(algParserOutputs.keySet());
		//always process country wide yaml first.
		String item = "CW";
	    int itemIdx = ercHierarchyTypes.indexOf(item);
	    ercHierarchyTypes.remove(itemIdx);
	    ercHierarchyTypes.add(0, item );
	    
	    // copy the fist state ratetables if any of the rate table entry is missing in cw.
	    for (Map.Entry<String,RCWrapper> entry : rcWrappers.entrySet()) {  
	    	if(null != entry.getKey() && entry.getKey().length()>2) {
	    		//rateTablesMerged = entry.getValue().getRateTableMap();
	    		rateTablesMerged.put(entry.getKey(), entry.getValue().getRateTableMap());
	    		statesDomainTablesMerged.put(entry.getKey(),entry.getValue().getDomainTableMap());
	    		generateRCFormMap(entry.getValue().getFormsList(), true);
	    		stateRCFormsMerged.put(entry.getKey(), rcFormsMerged);
	    	}
	    }
	    
	    for (Map.Entry<String,RCWrapper> entry : rcWrappers.entrySet()) {  
	    	if(null != entry.getKey() && entry.getKey().length()>2) {
	    		//rateTablesMerged = entry.getValue().getRateTableMap();
	    		break;
	    	}
            
	    }
	    
		for(String ercHierarchy : ercHierarchyTypes) {
			boolean isStateData = false;
			excludedPCH = new HashMap<String, List<String>>();
			logs = new HashMap<String, List<String>>();
			AlgParserOutput algParserOutput = algParserOutputs.get(ercHierarchy);
			RCWrapper rcWrapper = rcWrappers.get(ercHierarchy);
			rcForms = new HashMap<String, Form>();
			generateRCFormMap(rcWrapper.getFormsList(), false);
			if(ercHierarchy.equals("CW")) {
				rateTablesCW = rcWrapper.getRateTableMap();
				generateRCDomainTableList(rcWrapper.getDomainTableList(),false);
			}else {
				rcDomainTables = new HashMap<String, DomainTable>();
				rcDomainTablesMerged = new HashMap<String, DomainTable>();
				isStateData = true;
				rateTablesMergedState = rcWrappers.get("CW"+ercHierarchy).getRateTableMap();
				generateRCDomainTableList(rcWrapper.getDomainTableList(),true);
				RCWrapper rcWrapperMerged = rcWrappers.get("CW"+ercHierarchy);
				rcDomainTablesMerged = rcWrapperMerged.getDomainTableMap();
				generateRCFormMap(rcWrapperMerged.getFormsList(), true);
				mapDomainTableChangesToField();
			}
			flowClassReference = algParserOutput.getFlowChart(); // ALG file parsed details
			yamlObjects = new HashMap<String, List<Object>>();
			rcRateTableCodeList = new  HashMap<String, Map<Integer,List<String>>>();
			tableNames = new HashMap<String, TableName>();
			flowClassComponents = new HashMap<String, List<ClassComponent>>();
			generateAlgTableNameMap(algParserOutput.getTables().getTableNames());
			generateFlowClassComponents(flowClassReference.getClasses());
			generateRateTableFiles(rcWrapper.getRateTableList(), isStateData, ercHierarchy);
			YamlBase yamlBase = generateYAMLObjectByDS(lobName,dsWrapper,rcWrapper,isStateData,ercHierarchy);
			if(ercHierarchy.equals("CW")) {
				yamlBase.getProduct().getChildren().addAll(ercHierarchyTypes);
				yamlBase.getProduct().getChildren().remove("CW");
				lowercase(yamlBase.getProduct().getChildren());
			}
			YamlBase yamlBaseCopy = new YamlBase(yamlBase);
			YAMLObject yamlObject  = new YAMLObject();
			yamlObject.setStateData(isStateData);
			yamlObject.setYamlBase(yamlBaseCopy);	
			yamlObject.setState(ercHierarchy);
			yamlObjectList.add(yamlObject);
		}
		//}
		//}

		return yamlObjectList;

	}
	public static void lowercase(List<String> strings)
	{
	    ListIterator<String> iterator = strings.listIterator();
	    while (iterator.hasNext())
	    {
	        iterator.set(iterator.next().toLowerCase());
	    }
	}

	/**
	 * Method used to generate the flow class components for the Rating logic.
	 * 
	 * @param classes
	 */
	private void generateFlowClassComponents(List<FlowClass> flowClasses) {
		List<FlowClass> flowClassList = flowClasses;
		processFlowClass(flowClassList);
	}

	/**
	 * Method used to process the flow class
	 * 
	 * @param flowClassList
	 */
	private void processFlowClass(List<FlowClass> flowClassList) {

		for (FlowClass flowClass : flowClassList) {
			if (null != flowClass) {
				processSubComponents(flowClass);
			}
		}

	}

	/**
	 * Method used to process the subcomponents.
	 * 
	 * @param flowClass
	 */
	private void processSubComponents(FlowClass flowClass) {
		List<XmlConstruct> subComponents = flowClass.getSubComponents();
		for (XmlConstruct subComponent : subComponents) {

			if (subComponent instanceof ClassComponent) {
				ClassComponent classComponent = (ClassComponent) subComponent;

				String className = classComponent.getClassName();	

				if (isClassAllowed(className)) {
					String classType = getClassType(className);

					if (allowedRiskTypes.contains(classType) || allowedRiskItemTypes.contains(classType)) {
						if (allowedClassFlowTypes.contains(classComponent.getType())) {
							List<ClassComponent> classComponents = flowClassComponents
									.get(classComponent.getClassName());

							if (classComponents == null) {
								classComponents = new ArrayList<ClassComponent>();
							}
							classComponents.add(classComponent);
							flowClassComponents.put(classComponent.getClassName(), classComponents);
						}
					} else {
						//System.out.println("Error : Risktype is not authenticated for Class :" + className + "Class type is : " + classType);
					}
				}

			} else if (subComponent instanceof FlowClass) {

				FlowClass flowClassDetails = (FlowClass) subComponent;
				if(flowClassDetails.getParent() instanceof FlowClass) {
					FlowClass parent = (FlowClass)flowClassDetails.getParent();
					//System.out.println("here");
				}
				processSubComponents(flowClassDetails);
			}

		}

	}

	/**
	 * // * Method used to generate RateTable JSON files for YAML.
	 * 
	 * @param lobName
	 */

	private void generateRateTableFiles(List<RateTable> rateTableList, boolean isStateData, String ercHierarchy) {

		if (rateTableList != null) {

			List<RateTableKey> rateTableKeys = new ArrayList<RateTableKey>();
			List<RateTableValue> rateTableValues = new ArrayList<RateTableValue>();
			List<RateTableEntry> rateTableEntries = new ArrayList<RateTableEntry>();

			List<String> rateTableJsonValues = null;
			List<String> rateTableJsonNameValues = null;
			List<List<String>> rateTableJsonList = null;

			for (RateTable rateTable : rateTableList) {

				rateTableJsonList = new ArrayList<List<String>>();
				rateTableJsonValues = new ArrayList<String>();
				rateTableKeys = rateTable.getRateTableKeyList();
				rateTableValues = rateTable.getRateTableValueList();
				rateTableEntries = rateTable.getRateTableEntryList();
				
				if(!isStateData) {//CW
					if(null == rateTableEntries && null != rateTablesMerged && rateTablesMerged.size() > 0) {
						for(Map.Entry<String, Map<String,RateTable>> entry : rateTablesMerged.entrySet()) {
							rateTableEntries = entry.getValue().get(rateTable.getName()).getRateTableEntryList();
							if(null != rateTableEntries && rateTableEntries.size()>0) {
								break;// assign any of state rate table entries
							}
						}
						
					}
				}
				
				for (RateTableKey tableKey : rateTableKeys) {
					rateTableJsonValues.add(tableKey.getName());
				}
				for (RateTableValue tableValue : rateTableValues) {
					rateTableJsonValues.add(tableValue.getColumnName());
				}

				rateTableJsonList.add(rateTableJsonValues);

				if (rateTableEntries != null) {
					Map<Integer, List<String>> tableCodeValueMap = new HashMap<Integer, List<String>>();
					List<String> tabelCodeList = null;

					for (RateTableEntry tableEntry : rateTableEntries) {
						rateTableJsonNameValues = new ArrayList<String>();
						int i = 0;
						HashMap<String, String> rateTableKeyValues = tableEntry.getRateTableKeyValues();
						for (String jsonKey : rateTableJsonValues) {
							String value = rateTableKeyValues.get(jsonKey).trim();	
							if(YAMLUtil.isNumeric(value)) {
								value = value.replace(",", "");
							}
							rateTableJsonNameValues.add(value);
							if (i != rateTableJsonValues.size() - 1) {
								tabelCodeList = tableCodeValueMap.get(i);
								if (tabelCodeList == null) {
									tabelCodeList = new ArrayList<String>();
								}
								if (!tabelCodeList.contains(value)) {									
									tabelCodeList.add(value);
									tableCodeValueMap.put(i, tabelCodeList);
								}
							}
							i++;
						}

						rateTableJsonList.add(rateTableJsonNameValues);

					}
					rcRateTableCodeList.put(rateTable.getName(), tableCodeValueMap);
				}else {
					List<String> msgs = new ArrayList<String>();
					msgs.add("Rate Table");
					msgs.add(rateTable.getId());
					msgs.add(rateTable.getName());
					msgs.add("Rate Table entries not exist");
					logs.put("rt_"+rateTable.getName(), msgs);
					
				}

				generateRateTableJsonFiles(rateTable.getName(), rateTableJsonList, isStateData, ercHierarchy);

			}
		}
	}

	/**
	 * Method used to generate json files for RateTable.
	 * 
	 * @param fileName
	 * @param rateTableJsonList
	 * @param objectJsonMapper 
	 */
	private void generateRateTableJsonFiles(String fileName, List<List<String>> rateTableJsonList, boolean isStateData, String ercHierarchy) {

		String filePath = projectYamlProperties.getContainerlocation()+projectYamlProperties.getRateTableFolderName()+"\\";
		
		if(isStateData) {
			filePath = projectYamlProperties.getStateContainerLocation()+ercHierarchy.toLowerCase()+"\\"+projectYamlProperties.getRateTableFolderName()+"\\";
		}
		File directory = new File(filePath);
		if (! directory.exists()){
		   directory.mkdirs();
		}
		File jsonFile = new File(filePath + fileName + ".json");

		try {

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			Writer writer = new FileWriter(jsonFile);

			gson.toJson(rateTableJsonList, writer);

			writer.close();


		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	private void setOperators() {
		validPrimitiveOperators.addAll(Arrays.asList("==", "&&", "||", "<=", "*", "+", "-", "/", "<", "!=", ">", ">=", "Subtract"));
		validFunctionalOperators.addAll(Arrays.asList("Round Up Dollar", "Round To Hundredth", "Round To Thousandth",
				"Round To Ten Thousandth", "Not", "Round To Thousand Millionths"));
	}



	/**
	 * Iterating domain tables and adding to map for easy fetching
	 * 
	 * @param domainTableList
	 */
	private void generateRCDomainTableList(List<DomainTable> domainTableList, boolean isStateData) {

		if (domainTableList != null) {
			for (DomainTable domainTable : domainTableList) {
				if(isStateData) {
					rcDomainTables.put(domainTable.getName(), domainTable);
				}else {
					rcDomainTablesCW.put(domainTable.getName(), domainTable);
				}
			}
		} else {
			//System.out.println("Error: Domain Table is not loaded !");
		}
	}
	
	private void mapDomainTableChangesToField() {
		for(Map.Entry<String,DomainTable> entry :rcDomainTables.entrySet()) {
			DomainTable domainTable = entry.getValue();
			if(null != domainTable && null != domainTable.getDomainTableEntryList() && domainTable.getDomainTableEntryList().size() > 0) {
				DomainTable domainTableCW = rcDomainTablesCW.get(domainTable.getName());
				if(null != domainTableCW && null == domainTableCW.getDomainTableEntryList() || null != domainTableCW && null != domainTableCW.getDomainTableEntryList() && domainTableCW.getDomainTableEntryList().size() != domainTable.getDomainTableEntryList().size()) {
					for(Map.Entry<String,Form> formEntry :rcFormsMerged.entrySet()) {
						Form rcForm = formEntry.getValue();
						List<Field> fieldList = rcForm.getFieldList();
						if(null != fieldList && fieldList.size()>0) {
							for(Field field : fieldList) {
								if(null != field.getDomainTableName() && field.getDomainTableName().equals(domainTable.getName())) {
								   boolean isFieldExist = false;
								   if(null != rcForms.get(rcForm.getTableName())) {
									   Form rcState = rcForms.get(rcForm.getTableName());
									   List<Field> fieldListState = rcState.getFieldList();
									   if(null != fieldListState && fieldListState.size()>0) {
										   for(Field fieldState : fieldListState) {
											   if(fieldState.getColumnName().equals(field.getColumnName())) {
												   isFieldExist = true;
											   }
										   }
										   if(!isFieldExist) {
											   //domainTableCW.setDomainTableEntryList(domainTable.getDomainTableEntryList());
											   rcForms.get(rcForm.getTableName()).getFieldList().add(field);
											   //System.out.println("here3");
										   }
									   }
								   }
								}
							}
						}
					}
				}
			}
			
			
		}
	}

	/**
	 * Iterating forms list and adding individual form for easy access
	 * 
	 * @param forms
	 */
	private void generateRCFormMap(List<Forms> listForms, boolean isMerged) {

		for(Forms forms : listForms) {
			Form form = forms.getForm();

			if (form != null) {
				if(isMerged) {
					rcFormsMerged.put(form.getTableName(), form);
				}else {
					rcForms.put(form.getTableName(), form);
				}
				List<Forms> formList = form.getFormsList();
				if (formList != null) {
					generateRCFormMap(formList, isMerged);
				}
				/*
				 * if (formList != null) { for (Forms frmList : formList) {
				 * generateRCFormMap(frmList); } }
				 */
			}
		}

	}
	
	/**
	 * Iterating forms list and adding individual form for easy access
	 * 
	 * @param forms
	 */
	private void generateAlgTableNameMap(List<TableName> tableNameList) {

		for(TableName tableName : tableNameList) {
			tableNames.put(tableName.getName(), tableName);
			if(null!=tableName.getTableNames())
				generateAlgTableNameMap(tableName.getTableNames());
		}

	}
	

	/**
	 * Creating DS table map for accessing ds table details.
	 * 
	 * @param tables
	 */
	int hierarchyCount=0;
	private void generateDsTableMap(Tables tables, String parentTableName) {

		Table table = tables.getTable();
		table.setParentTableName(parentTableName);
		if (table != null) {
			dsTables.put(table.getName(), table);
			if(hierarchyCount == 0) {
				firstHierarchicalClass =table.getName();
			}

			//if(hierarchyCount > 0 && table.getType().equals("coverage")) {
			//	hierarchyCount--;
			//}
			classHierarchy.put(table.getName(), hierarchyCount);			
		}

		List<Tables> tableList = table.getTablesList();

		if (tableList != null && tableList.size() > 0) {

			for (Tables tablesData : tableList) {
				hierarchyCount++;
				generateDsTableMap(tablesData, table.getName());
			}
		}
		hierarchyCount--;
	}

	/**
	 * Generate YAMAL object from the ERC parsed xml files
	 * @param dsWrapper 
	 * @param rcWrapper 
	 * @param isStateData 
	 * @return 
	 * @return 
	 * @throws Exception 
	 */
	private YamlBase generateYAMLObjectByDS(String lobName, DSWrapper dsWrapper, RCWrapper rcWrapper, boolean isStateData, String ercHierarchy) throws Exception {

		RateBook rateBookDetails = rcWrapper.getRateBook();

		YamlBase yamlBase = generateYAMLBase(lobName, rateBookDetails, ercHierarchy);

		Tables tables = dsWrapper.getTables();
		try {
			if (null != tables) {			
				processDSClasess(tables, null,isStateData);
				writeExcludedPCHToExcel(isStateData);
				writeProcessingLogsToExcel(isStateData);
				writeMappingTableToExcel(isStateData);
				importManualCalculationJsonFile(isStateData);
				//System.out.println("-------------------------"+pchs.size());
			}
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}

		
		return yamlBase;

	}

	/**
	 * Method used to generate YAMAL Structure using DS
	 * 
	 * @param tables
	 * @param isStateData 
	 * @param object
	 * @return 
	 * @throws Exception
	 */
	private void processDSClasess(Tables tables, Table parentTable, boolean isStateData) throws Exception {

		Table table = tables.getTable();
		if (table != null) {

			processTableClass(table, parentTable,isStateData);
		}


		List<Tables> tableList = table.getTablesList();

		if (tableList != null && tableList.size() > 0) {
			for (Tables tablesData : tableList) {

				processDSClasess(tablesData, table,isStateData);
			}
		}		

	}

	/**
	 * Method used to identify RiskType and RiskItem based on the table type.
	 * 
	 * @param table
	 * @param parentTable
	 * @param isStateData 
	 * @throws Exception
	 */

	private void processTableClass(Table table, Table parentTable, boolean isStateData) throws Exception {

		String className = table.getName();
		String parentClassName = parentTable!=null?parentTable.getName():null;

		if (isClassAllowed(className, parentClassName, table.getType(), isStateData)) {

			processFormType(table, parentTable, className, isStateData);

			processFormFields(className,isStateData);

			processCalculations(className,isStateData);
			/* For deleted rate tables in state rc. that rate table defenitions are written back to state product yaml
			 * and its deleted flag is set to true*/
			if(isStateData) {
				RiskType riskType = getRiskType(className);
				RiskType risktypeCW = riskTypesCW.get(riskType.getName());
				if(null != risktypeCW) {
					List<com.nest.erc.yaml.domain.RateTable> rateTables = risktypeCW.getRate_tables();
					if(null!=rateTables) {
						for(com.nest.erc.yaml.domain.RateTable rateTable:rateTables) {
							RateTable rateTableCW = rateTablesMergedState.get(rateTable.getLabel());
							if(null!=rateTableCW && null!=rateTableCW.getAddChangeDeleteFlag() && rateTableCW.getAddChangeDeleteFlag().equals("D")) {
								com.nest.erc.yaml.domain.RateTable rateTableCopy = SerializationUtils.clone(rateTable);
								rateTableCopy.setDeleted(true);
								riskType.getRate_tables().add(rateTableCopy);
							}
						}
					}
				}
			}
			/* is some rate table arguments type is UI. But in some case that field is not present in RC.
			 * In such cases we just check a PCH is exist in that name.If PCH is exist that calcuation is written as source of rate table*/
			RiskType riskType = getRiskType(className);
			List<com.nest.erc.yaml.domain.RateTable> rateTableList = riskType.getRate_tables();
			if(null!=rateTableList) {
				for(com.nest.erc.yaml.domain.RateTable rateTable:rateTableList) {
					List<RateTableSource> sourceList = rateTable.getSources();
					if(null!=sourceList) {
						for(RateTableSource rateTableSource:sourceList) {
							if(rateTableSource.getName().startsWith("field_") && !is_field_exist(rateTableSource.getName(), className)) {
							//revisit
								String fieldName = rateTableSource.getName().substring(rateTableSource.getName().indexOf("_")+1);
								if(StringUtils.countOccurrencesOf(rateTableSource.getName(), "_") > 1) {
									fieldName = rateTableSource.getName().substring(rateTableSource.getName().indexOf("_")+1,rateTableSource.getName().lastIndexOf("_"));
								}
								String calculated_field_name = "calc_"+fieldName+"_"+className;
//								List<MappingRow> mappingRows = mappingTable.get("calc_"+fieldName);
//								if(null != mappingRows && mappingRows.size() > 0) {
//									for(MappingRow mappingRow : mappingRows) {
//										if(mappingRow.getClassName().equals(className) && mappingRow.getFormattedTypeName().equals( "calc_"+fieldName+"_"+className)) {
//											calculated_field_name = mappingRow.getMappedTypeName();
//										}
//									}
//								}
								
								if(is_calculation_exist(calculated_field_name, className)) {
									rateTableSource.setName(calculated_field_name);
								}
							}
						}
					}
				}
			}

		}

	}

	/**
	 * Add form field for the risk type class
	 * @param className
	 * @param isStateData 
	 */
	private void processFormFields(String className, boolean isStateData) {
		// TODO Auto-generated method stub

		RiskType riskType = getRiskType(className);

		ArrayList<RiskField> riskFields = addRiskFields(className, isStateData);

		if(riskFields != null) {
			riskType.addFields(riskFields);
			if(isStateData) {
				riskFields = addRiskFieldsMerged(className, isStateData); // entity order required both CW and state specific field
			}
			for(RiskField riskField : riskFields) {
				String formattedFieldName = riskField.getName();
				if(!checkRiskTypeEntitiesOrderExist(riskType, EntityOrderType.RISKFIELD, formattedFieldName)) {
					addRiskTypeEntitiesOrder(riskType, EntityOrderType.RISKFIELD, formattedFieldName);
				}
			}
		}

	}

	/**
	 * @param className
	 * @return
	 */
	private RiskType getRiskType(String className) {
		RiskType riskType = (RiskType) getYamlObject(className, YAMLObjectType.RiskType);
		if(riskType == null ) {
			RiskItem riskItem = (RiskItem) getYamlObject(className, YAMLObjectType.RiskItem);			
			if(riskItem != null) {				
				riskType = riskItem.getParentRiskType();				
			}
		}
		return riskType;
	}

	/**
	 * Add calculations based on workflow to corresponding risktype.
	 * Ratetables are also added from with in the calculation logic.
	 * @param className
	 * @param isStateData 
	 * @throws Exception
	 */
	private void processCalculations(String className, boolean isStateData) throws Exception {

		Lob lobDetails = (Lob) flowClassReference.getParent();

		List<ClassComponent> classComponents = flowClassComponents.get(className);

		if (classComponents != null) {
			for (ClassComponent classComponent : classComponents) {
				processRatingorPremium(classComponent, lobDetails,isStateData);
			}
		}
		
	}
	
	private boolean writeExcludedPCHToExcel(boolean isStateData) {
		if(excludedPCH.size()>0) {
			try {
			String fileName="ExcludedPCHsCW.xlsx";
			if(isStateData) {
				fileName = "ExcludedPCHsState.xlsx";
			}
			File existingFile = new File(projectYamlProperties.getContainerlocation()+fileName);
			if(existingFile.exists()) {
				existingFile.delete();
			}
			
			XSSFWorkbook workbook = new XSSFWorkbook();
		    XSSFSheet spreadsheet = workbook.createSheet( "Status Details ");
		    XSSFRow row;

		    int rowid = 0;
		    row = spreadsheet.createRow(rowid++);
		    int cellid = 0;
  		  	Cell headerCell = row.createCell(cellid++);
  		  	headerCell.setCellValue("No");
  		  	
  		  	headerCell = row.createCell(cellid++);
		  	headerCell.setCellValue("Class Name");
		  	
		  	headerCell = row.createCell(cellid++);
  		  	headerCell.setCellValue("PCH Name");
  		  	
  		  	headerCell = row.createCell(cellid++);
		  	headerCell.setCellValue("Reason");
		    
		  	rowid = 1;
		    for (Map.Entry<String,List<String>> entry : excludedPCH.entrySet())  {
		    	  row = spreadsheet.createRow(rowid++);
		    	  
		    	  
		    	  List<String> statusDetails = entry.getValue();
		    	  if(null != statusDetails && statusDetails.size() > 0) {
		    		  cellid = 0;
		    		  Cell cell = row.createCell(cellid++);
		    		  cell.setCellValue(rowid-1);
		    		  for(String statusDetail:statusDetails) {
		    			  cell = row.createCell(cellid++);
				          cell.setCellValue((String)statusDetail);
		    		  }
		    	  }
		      }   
		      //Write the workbook in file system
		      FileOutputStream out = new FileOutputStream(new File(projectYamlProperties.getContainerlocation()+fileName));
		      
		      workbook.write(out);
		      out.close();
		      System.out.println("Writesheet.xlsx written successfully");
		      }catch(Exception e) {
		    	  e.printStackTrace();
		      }
		}
		return true;
	}
	private boolean writeMappingTableToExcel(boolean isStateData) {

		if(mappingTable.size()>0) {
			try {
			String fileName="MappingTable.xlsx";
			if(isStateData) {
				fileName = "MappingTableState.xlsx";
			}
			File existingFile = new File(projectYamlProperties.getContainerlocation()+fileName);
			if(existingFile.exists()) {
				existingFile.delete();
			}
			
			XSSFWorkbook workbook = new XSSFWorkbook();
		    XSSFSheet spreadsheet = workbook.createSheet( "Mapping Table Details ");
		    XSSFRow row;

		    int rowid = 0;
		    row = spreadsheet.createRow(rowid++);
		    int cellid = 0;
  		  	Cell headerCell = row.createCell(cellid++);
  		  	headerCell.setCellValue("No");
  		  	
  		  	headerCell = row.createCell(cellid++);
		  	headerCell.setCellValue("Type");
		  	
		  	headerCell = row.createCell(cellid++);
  		  	headerCell.setCellValue("Type Name");
  		  	
  			headerCell = row.createCell(cellid++);
  		  	headerCell.setCellValue("Class Name");
  		  	
  		  	headerCell = row.createCell(cellid++);
		  	headerCell.setCellValue("Full Reference Name");
  		  	
  		  	headerCell = row.createCell(cellid++);
		  	headerCell.setCellValue("Mapped Reference Name");
		    
		  	rowid = 1;
		    for (Map.Entry<String,List<MappingRow>> entry : mappingTable.entrySet())  {
		    	  List<MappingRow> mappingRows = entry.getValue();
		    	  if(null != mappingRows && mappingRows.size() > 0) {
		    		  for(MappingRow mappingRow : mappingRows) {
		    			  row = spreadsheet.createRow(rowid++);
		    			  cellid = 0;
			    		  Cell cell = row.createCell(cellid++);
			    		  cell.setCellValue(rowid-1);
		    			  cell = row.createCell(cellid++);
				          cell.setCellValue(mappingRow.getType());
				          cell = row.createCell(cellid++);
				          cell.setCellValue(mappingRow.getTypeName());
				          cell = row.createCell(cellid++);
				          cell.setCellValue(mappingRow.getClassName());
				          cell = row.createCell(cellid++);
				          cell.setCellValue(mappingRow.getFormattedTypeName());
				          cell = row.createCell(cellid++);
				          cell.setCellValue(mappingRow.getMappedTypeName());
		    		  }
		    	  }
		      }   
		      //Write the workbook in file system
		      FileOutputStream out = new FileOutputStream(new File(projectYamlProperties.getContainerlocation()+fileName));
		      
		      workbook.write(out);
		      out.close();
		      System.out.println(fileName+" written successfully");
		      }catch(Exception e) {
		    	  e.printStackTrace();
		      }
		}
		return true;
	
	}
	/**
	 * 
	 * @param isStateData
	 * @return
	 */
	private boolean writeProcessingLogsToExcel(boolean isStateData) {
		if(logs.size()>0) {
			try {
			String fileName="logsCW.xlsx";
			if(isStateData) {
				fileName = "logsState.xlsx";
			}
			File existingFile = new File(projectYamlProperties.getContainerlocation()+fileName);
			if(existingFile.exists()) {
				existingFile.delete();
			}
			
			XSSFWorkbook workbook = new XSSFWorkbook();
		    XSSFSheet spreadsheet = workbook.createSheet( "Logs Details ");
		    XSSFRow row;

		    int rowid = 0;
		    row = spreadsheet.createRow(rowid++);
		    int cellid = 0;
  		  	Cell headerCell = row.createCell(cellid++);
  		  	headerCell.setCellValue("No");
  		  	
  		  	headerCell = row.createCell(cellid++);
		  	headerCell.setCellValue("Type");
		  	
		  	headerCell = row.createCell(cellid++);
  		  	headerCell.setCellValue("Id");
  		  	
  		  	headerCell = row.createCell(cellid++);
		  	headerCell.setCellValue("Name");
		  	
		  	headerCell = row.createCell(cellid++);
		  	headerCell.setCellValue("Reason");
		    
		  	rowid = 1;
		    for (Map.Entry<String,List<String>> entry : logs.entrySet())  {
		    	  row = spreadsheet.createRow(rowid++);
		    	  
		    	  
		    	  List<String> logs = entry.getValue();
		    	  if(null != logs && logs.size() > 0) {
		    		  cellid = 0;
		    		  Cell cell = row.createCell(cellid++);
		    		  cell.setCellValue(rowid-1);
		    		  for(String log:logs) {
		    			  cell = row.createCell(cellid++);
				          cell.setCellValue((String)log);
		    		  }
		    	  }
		      }   
		      //Write the workbook in file system
		      FileOutputStream out = new FileOutputStream(new File(projectYamlProperties.getContainerlocation()+fileName));
		      
		      workbook.write(out);
		      out.close();
		      System.out.println("Writesheet.xlsx written successfully");
		      }catch(Exception e) {
		    	  e.printStackTrace();
		      }
		}
		return true;
	}

	/**
	 * Add Risktype or RiskItem based on conditions
	 * @param table
	 * @param parentTable
	 * @param className
	 * @throws Exception
	 */
	private void processFormType(Table table, Table parentTable, String className, boolean isStateData)
			throws Exception {
		RiskType parentRiskType = null;
		String parentTableName = "";
		String classDescription = table.getDescription();
		/**
		 * If parent table is null means, its first record.
		 */
		if(parentTable == null && table.getName().equals(firstHierarchicalClass)) {
			parentTableName="policy";
		}
		else {
			parentTableName = parentTable.getName();
		}
		//if (parentTable != null) {

		parentRiskType = (RiskType) getYamlObject(parentTableName, YAMLObjectType.RiskType);
		//}

		String classType = table.getType();			


		if (allowedRiskTypes.contains(classType)) {

			RiskType newriskType = addRiskType(className, classDescription, parentRiskType, false);
			/**
			 * If class type is 'form' or Schedule and it has Premium field  exist then we need to create risk
			 * item for the class.
			 */

			if (classType.equals(RiskTypes.form.toString()) || classType.equals(RiskTypes.schedule.toString())) {

				String premiumCalculation = getRiskFieldCalculation(className, premiumString);	
				String premiumIndicatorCalculation = getRiskFieldCalculation(className, "PremiumIndicator");	
				if (premiumCalculation.trim().length() > 0 && premiumIndicatorCalculation.trim().length() > 0) {
					addRiskItem(className, classDescription, newriskType, true, premiumCalculation, isStateData);
				}
			}

		} else if (allowedRiskItemTypes.contains(classType)) {
			//System.out.println("FlowClass : " + className);
			/**
			 * If UI fields exist then we need to create RiskType wrapper for this coverage
			 * and add coverage risk items as items to this RiskType. Same rule applies to
			 * RateTable.
			 * 04.27.2020 As per the latest change, all RiskItem need to have a
			 * wrapper RisType.So Condition is Commenting
			 */
			RiskType newriskType = parentRiskType;
			boolean iswrapper = false;
			// if(isRiskFieldsExist(className)) {
			//iswrapper = true;
			//newriskType = addRiskType(className, classDescription, parentRiskType, iswrapper);
			// }
			addRiskItem(className, classDescription, newriskType, iswrapper, "", isStateData);

		}
	}

	/**
	 * Setting YAML base settings
	 * 
	 * @param lobName
	 * @throws Exception 
	 */
	private YamlBase generateYAMLBase(String lobName, RateBook rateBookDetails, String ercHierarchy) throws Exception {

		String lobDescription = lobName.toString();
		if (rateBookDetails != null) {
			lobDescription = rateBookDetails.getTitle();
		}
		YamlBase yamlBaseObject = new YamlBase();
		String templateText =projectYamlProperties.getYamlTemplateText();


		String schemaversion = projectYamlProperties.getYamlSchemaversion();	
		yamlBaseObject.setSchema_version(schemaversion);
		Product product = new Product();
		product.setLabel(lobDescription + " " +ercHierarchy+" "+templateText);
		product.setName(org.springframework.util.StringUtils.uncapitalize(lobName.toString()+ercHierarchy+templateText));

		ArrayList<Lines> linesList = new ArrayList<Lines>();
		Lines line = new Lines();
		line.setLabel(lobDescription+ " " + templateText);
		line.setName(org.springframework.util.StringUtils.uncapitalize(lobName.toString()+templateText));
		line.setDescription(lobDescription);

		linesList.add(line);

		product.setLines(linesList);

		ArrayList<String> productChildren = new ArrayList<String>();

		product.setChildren(productChildren);

		yamlBaseObject.setProduct(product);

		addToYamalObject("Product", product);

		addRiskType("policy", "Policy", null, false);

		return yamlBaseObject;

	}

	private void addToYamalObject(String name, Object yamalObject) {

		List<Object> yamlObjectList = yamlObjects.get(name);
		if (yamlObjectList == null) {
			yamlObjectList = new ArrayList<Object>();
		}

		yamlObjectList.add(yamalObject);

		yamlObjects.put(name, yamlObjectList);
	}

	private Object getYamlObject(String name, YAMLObjectType yamlObjectType) {

		List<Object> objects = yamlObjects.get(name);

		if (objects != null) {
			for (Object object : objects) {
				switch (yamlObjectType) {				

				case Product:

					if (object instanceof Product) {
						return object;
					}
					break;

				case RiskItem:

					if (object instanceof RiskItem) {
						return object;
					}
					break;

				case RiskType:

					if (object instanceof RiskType) {
						return object;
					}
					break;
				}
			}
		}

		return null;

	}

	/**
	 * Method used to get the type of DS table. (policy, risk, form.. etc)
	 * 
	 * @param tableName
	 * @return
	 */
	private String getClassType(String tableName) {
		Table table = getTableDetails(tableName);

		if (table != null) {
			return table.getType();
		}
		return "";
	}

	/**
	 * Method used to get the corresponding table details
	 * 
	 * @param tableName
	 * @return
	 */
	private Table getTableDetails(String tableName) {

		return dsTables.get(tableName);
	}	

	/**
	 * Method used to create RiskItem for particular class and setting its parent
	 * RiskType.
	 * 
	 * @param className
	 * @param classDescription
	 * @param parentClassName
	 * @param flowClassDetails
	 * @throws Exception
	 */
	private void addRiskItem(String className, String classDescription, RiskType parentRiskType,
			boolean isWrapperAvailable, String premiumVariable, boolean isStateData) throws Exception {


		RiskItem riskItem = (RiskItem) getYamlObject(className, YAMLObjectType.RiskItem);
		if (riskItem == null) {
			riskItem = new RiskItem();
			addToYamalObject(className, riskItem);			
            if(isCoverageReferenceExist(className, parentRiskType.getLabel(), isStateData)) {
            	riskItem.setDeleted(false);
            }else {
            	riskItem.setDeleted(true);
            }
            if(null!=YAMLUtil.uncapitalizeValue(className) && YAMLUtil.uncapitalizeValue(className).length() > 250) {
				List<String> msgs = new ArrayList<String>();
				msgs.add("Risk Item");
				msgs.add(YAMLUtil.uncapitalizeValue(className));
				msgs.add(className);
				msgs.add("Risk Item name length > 250");
				logs.put(YAMLUtil.uncapitalizeValue(className), msgs);
			}

			riskItem.setName(YAMLUtil.uncapitalizeValue(className));
			riskItem.setLabel(classDescription);
			riskItem.setType(RC_CLASS_TYPE_COVERAGE);
			/**
			 * As per the discussion now all risk items are considered as "MANDATORY"
			 */
			//if (isRiskItemMandatory(className)) {
			riskItem.setPresence(RIskItemPresence.MANDATORY.toString().toLowerCase());
			//} else {
			//	riskItem.setPresence(RIskItemPresence.OPTIONAL.toString().toLowerCase());
			//}
			riskItem.setWrapperAvailable(isWrapperAvailable);
			//if(parentRiskType != null) {
			parentRiskType.setItems(riskItem);
			//}			
			riskItem.setParentRiskType(parentRiskType);
			List<Calculation> variables = new ArrayList<Calculation>();

			if(premiumVariable.trim().length() > 0) {
				addRiskItemPremium(riskItem, premiumVariable);
			}
			List<Limit> limits = new ArrayList<Limit>();
			riskItem.setVariables(variables);

			riskItem.setLimits(limits);
			addRiskTypeEntitiesOrder(parentRiskType, EntityOrderType.RISKITEM, YAMLUtil.uncapitalizeValue(className));
			addRiskLimit(riskItem, className, isStateData);//Eldho comment added for temp
			addRiskDeductible(riskItem, className, isStateData);
			//System.out.println("Process Risk Item : " + className);
		}

	}
	/**
	 * This method is used to check the deleted coverage in state 
	 * first check coverage exist in alg then check coverage refernce exist in form fields
	 * whose add change delete flag is D
	 * @param className
	 * @param parentClassName
	 * @return
	 */
	private boolean isCoverageReferenceExist(String className, String parentClassName, boolean isStateData) {
		if(null == tableNames.get(className)) {
			if(null == rcForms.get(className)) {
				Form form = null;
				if(isStateData) {
					form = rcFormsMerged.get(parentClassName);
				}else {
					form = rcForms.get(parentClassName);
				}
					// may be only some fields are deleted others may exist. IN this case  coverage have an existance
					
				if(null != form) {
					List<Field> fieldListMerged = form.getFieldList();
			    	int fieldCntMerged = 0;
			    	int deletedCntMerged = 0;
			    	if(null != fieldListMerged) {
			        	for(Field field:fieldListMerged) {
			       			if(field.getColumnName().contains(className+".")) {
			       				fieldCntMerged++;
			       				if(field.getAddChangeDeleteFlag().equals("D")) {
			       					deletedCntMerged++;
			       				}
			       			}
			       		}
			    	}
			    	if((deletedCntMerged > 0  && fieldCntMerged >0 && deletedCntMerged == fieldCntMerged) || fieldCntMerged == 0) {// all fields are deleted
			    		return false;
			    	}else {
			    		return true;
			    	}
				}else {
					return false;
				}
			}else {
				return true;
			}
			
				
			
		}else {
			return true;
		}
			
	}

	/**
	 * Adding deductible to the RiskItem based on the form with field name contains deductible
	 * @param riskItem
	 * @param className
	 */
	private void addRiskDeductible(RiskItem riskItem, String className, boolean isStateData) {

		Field field = getRiskField(className, "deductible", isStateData);	
		if(field != null) {

			String riskFieldName = field.getColumnName();
			String deductibleName1 =formatVariableName(riskFieldName, className, "field","");
			String deductibleName = deductibleName1;
			if(!isMatchLengthCriteria(deductibleName1)) {
				MappingRow mappingRow = getMappingName(className, "field", riskFieldName, deductibleName1);
				deductibleName = mappingRow.getMappedTypeName();
			}

			Calculation calculation = new Calculation();
			//calculation.setCalculation("1");AMF
			calculation.setCalculation(deductibleName.trim());
			calculation.setDeleted(false);
			calculation.setName("deductible");
			calculation.setDescription("");			

			riskItem.setDeductible(calculation);

		}

	}

	/**
	 * Adding RiskItem limit based on form with field name contains limit
	 * @param riskItem
	 * @param className
	 */
	private void addRiskLimit(RiskItem riskItem, String className, boolean isStateData) {

		Field field = getRiskField(className, limitString, isStateData);	
		if(field != null) {

			String riskFieldName = field.getColumnName();
			String limitName1 = formatVariableName(riskFieldName, className, "field", "");//revisit
			String limitName = limitName1;
			if(!isMatchLengthCriteria(limitName1)) {
				MappingRow mappingRow = getMappingName(className, "field", riskFieldName, limitName1);
				limitName = mappingRow.getMappedTypeName();
			}

			List<Limit> limits = new ArrayList<Limit>();
			Limit limit = new Limit();
			Calculation calculation = new Calculation();
			calculation.setCalculation(limitName);//AMF calculation.setCalculation("1");
			calculation.setDeleted(false);
			calculation.setName("limitcalculation");
			calculation.setDescription("");

			limit.setCalculation(calculation);
			limit.setDeleted(false);
			limit.setName(limitString);
			limit.setLabel(limitString);
			limit.setType(RiskItemLimitType.per_occurrence_limit.toString());
			limits.add(limit);

			riskItem.setLimits(limits);		

		}
	}

	/**
	 * Method used to check whether UI fields exist or not.
	 * @param className
	 * @param fieldName
	 * @return
	 */

	private boolean checkFieldExist(String className,String fieldName,boolean isStateData) {
		Field field =getRiskField(className, fieldName, isStateData) ;
		if(field == null) {
			return false;
		}
		else {
			//if(field.getPolicyReadOnly().equals("1") || field.getPolicyDisplay().equals("0")) {
			//	return false;
			//}

			return true;
		}
	}


	/**
	 * Method used to check whether UI fields exist for the particular class.
	 * @param className
	 * @return
	 */
	private Field getRiskField(String className, String fieldName, boolean isStateData) {
		Form form =rcForms.get(className);
		if(isStateData) {
			form = rcFormsMerged.get(className);
		}
		if(form != null) {			
			List<Field> fieldList= form.getFieldList();
			if(fieldList != null) {
				for(Field field : fieldList){
					if(field.getColumnName().equals(fieldName)) {
						return field;
					}
				}
			}
		}

		return getFieldInForms(className, fieldName);

	}

	/**
	 * Checking Field exist in any form for limit and deductable field
	 * example :  Field "BOPEmployeeDishtyCoverage.Limit" exist in BOP form. So this coverage should have a wrapper RiskType
	 * 
	 * @param className
	 * @return
	 */
	private Field getFieldInForms(String className, String fieldName) {
		for (Map.Entry<String,Form> mapElement : rcForms.entrySet()) { 
			Form form=  mapElement.getValue();
			if(form != null) {
				List<Field> fieldList= form.getFieldList();
				if(fieldList != null) {
					for(Field field : fieldList) {						
						String[] fieldNames = field.getColumnName().split("\\.");
						if(fieldNames != null && fieldNames.length > 1) {
							if(fieldNames[0].equalsIgnoreCase(className) ){
								if(fieldNames[1] != null ) {
									String fldName =fieldNames[1].toLowerCase();
									if(fieldName.equals("limit") || fieldName.equals("deductible")) {
										if(fldName.contains(fieldName.toLowerCase())){
											return field;
										}
									}
									else {
										if(fldName.equalsIgnoreCase(fieldName.toLowerCase())){
											return field;
										}
									}
								}
							}
						}
					}

				}
			}

		}


		return null;
	}

	/**
	 * Method used to create RiskType
	 * 
	 * @param className
	 * @param classDescription
	 * @param riskTypeParent
	 * @param isWrapper denote whether the risk type is wrapper coverage or not
	 * @return
	 * @throws Exception
	 */
	private RiskType addRiskType(String className, String classDescription, RiskType riskTypeParent,
			boolean isWrapper) throws Exception {

		String yamlObjectKeyName = className;

		// if(isWrapper) {
		// yamlObjectKeyName = yamlObjectKeyName+ "wrapper";
		// }
		String riskLabel =className;
		RiskType riskType = (RiskType) getYamlObject(yamlObjectKeyName, YAMLObjectType.RiskType);

		if (riskType == null) {

			riskType = new RiskType();
			if (riskTypeParent == null ) {
				if( yamlObjects.size() == 1) { //For adding Product.
					Product product = (Product) getYamlObject("Product", YAMLObjectType.Product);
					product.setRisk_type(riskType);
					riskLabel ="Policy";
				}
				else {
					//System.out.println("Risk Parent null for class: " + flowClassName);
				}

			} else {

				riskTypeParent.setChildren(riskType);
				riskType.setParentRisk(riskTypeParent);
			}
			addToYamalObject(yamlObjectKeyName, riskType);
			
			if(null!=YAMLUtil.uncapitalizeValue(riskLabel) && YAMLUtil.uncapitalizeValue(riskLabel).length() > 250) {
				List<String> msgs = new ArrayList<String>();
				msgs.add("Risk Type");
				msgs.add(YAMLUtil.uncapitalizeValue(riskLabel));
				msgs.add(className);
				msgs.add("Risk Type name length > 250");
				logs.put(YAMLUtil.uncapitalizeValue(riskLabel), msgs);
			}

			riskType.setName(YAMLUtil.uncapitalizeValue(riskLabel));
			riskType.setLabel(riskLabel);
			riskType.setDescription(classDescription);
			String riskNameTemplate = "{{ riskType.label }} {{ number }}"; //Hard coded value, may need to change the logic.
			riskType.setRisk_name_template(riskNameTemplate);

			//Adding default Values
			List<Calculation> caluclations = new ArrayList<Calculation>();
			List<com.nest.erc.yaml.domain.RateTable> rateTables = new ArrayList<com.nest.erc.yaml.domain.RateTable>();
			riskType.setCalculations(caluclations);
			riskType.setRate_tables(rateTables);
			List<RiskItem>  riskItems = new ArrayList<RiskItem>();
			riskType.setItems(riskItems);
			List<RiskType> riskTypes = new ArrayList<RiskType>();
			riskType.setChildren(riskTypes);
			//List<String> entitiesOrder = new ArrayList<String>();
			RiskTypeEntitiesOrder entities_order = new RiskTypeEntitiesOrder();
			riskType.setEntities_order(entities_order);			
			List<RiskField> riskFields = new ArrayList<RiskField>();
			riskType.setFields(riskFields);		

		}
		return riskType;
	}


	/**
	 * Check whether the Risk Item class is mandatory or not.
	 * 
	 * @param className
	 * @return
	 */
	private boolean isRiskItemMandatory(String className) {

		Form form = rcForms.get(className);
		if (form != null) {
			try {
				int maxOccurs = Integer.parseInt(form.getMinOccurs());
				if (maxOccurs > 0) {
					return true;
				}
			} catch (Exception e) {
				return false;
			}
		}
		return false;
	}

	/**
	 * Method used to fetch all UI fields for the corresponding Risk based on class
	 * name.
	 * 
	 * @param riskType
	 * @param className
	 */
	private ArrayList<RiskField> addRiskFields(String className, boolean isStateData) {

		//RiskField riskField = null;
		ArrayList<RiskField> riskFields = new ArrayList<RiskField>();
		//riskType.setFields(riskFields);//Initializing the RiskField in RiskType
		Form form = rcForms.get(className);
		if (form != null) {
			List<Field> fieldList = form.getFieldList();
			if (fieldList != null) {
				for (Field rcField : fieldList) {
					RiskField riskField = addRiskField(rcField, className, isStateData);
					if(riskField != null) {
						riskFields.add(riskField);
						if(null == riskField.getType() || null != riskField.getType() && riskField.getType().trim().length() == 0) {
							//System.out.println("here");
						}
					}
				}
			} else {
				//System.out.println("Error: Risk Fields are not available for Form : " + form.getName());
			}

		} else {
			//System.out.println("Error : Risk form is not available for Class : " + className);
		}

		return riskFields;

	}
	private ArrayList<RiskField> addRiskFieldsMerged(String className, boolean isStateData) {

		//RiskField riskField = null;
		ArrayList<RiskField> riskFields = new ArrayList<RiskField>();
		//riskType.setFields(riskFields);//Initializing the RiskField in RiskType
		Form form = rcFormsMerged.get(className);
		if (form != null) {
			List<Field> fieldList = form.getFieldList();
			if (fieldList != null) {
				for (Field rcField : fieldList) {
					RiskField riskField = addRiskField(rcField, className, isStateData);
					if(riskField != null) {
						riskFields.add(riskField);
					}
				}
			} else {
				//System.out.println("Error: Risk Fields are not available for Form : " + form.getName());
			}

		} else {
			//System.out.println("Error : Risk form is not available for Class : " + className);
		}

		return riskFields;

	}

	private RiskField addRiskField(Field rcField, String className, boolean isStateData) {	


		RiskField riskField = new RiskField();

		String riskFieldName = rcField.getColumnName();

		//if(riskFieldName.equals("ZipCode")) {
		//System.out.println(riskFieldName);
		//}
		if(canSkipField(riskFieldName)) {
			return null;
		}
		
       
		//String formattedFieldName1 =  formatVariableName(riskFieldName,className,"field","");
		String formattedFieldName =  formatVariableName(riskFieldName,className,"field",""); // revisit
		String formattedFieldName1 = formattedFieldName;
		if(!isMatchLengthCriteria(formattedFieldName)) {
			MappingRow mappingRow = getMappingName(className, "field", riskFieldName, formattedFieldName);
			formattedFieldName1 = mappingRow.getMappedTypeName();
		}
		String riskFieldLabel1 = YAMLUtil.beautifyLabelValue(rcField.getLabel(),riskFieldName);	
		riskField.setName(formattedFieldName1);
		riskField.setDescription(riskFieldLabel1);
		riskField.setLabel(riskFieldLabel1);
		riskField.setField_format("");
		
		if(null!=formattedFieldName1 && formattedFieldName1.length() > 250) {
			List<String> msgs = new ArrayList<String>();
			msgs.add("Risk Field");
			msgs.add(formattedFieldName1);
			msgs.add(className);
			msgs.add("Risk Field name length > 250");
			logs.put(formattedFieldName1, msgs);
		}

		/**
		 * If field is read only/display only then considered as "COMPUTED" field.
		 */
		if (rcField.getPolicyReadOnly().equals("1") || rcField.getPolicyDisabled().equals("1")) {

			String calculation = getRiskFieldCalculation(className, riskFieldName);		
			if(calculation.trim().length() > 0) {
				if(null!= riskFieldName && riskFieldName.equalsIgnoreCase("premium")) {
					riskField.setCalculation(calculation);
					riskField.setType(RiskFieldType.COMPUTED.toString().toLowerCase());	
				}else{
					// if a field and calculation with same exist we consider only field and its calculation is implemnetd using brite rules.
					if(rcField.getDefaultValue() != null && rcField.getDefaultValue().trim().length() > 0) {
						riskField.setCalculation(rcField.getDefaultValue());
						riskField.setType(RiskFieldType.COMPUTED.toString().toLowerCase());	
					}else {
						String returnValue ="0";
						riskField.setCalculation(returnValue+" if (1 == 1) else "+returnValue); 
						riskField.setType(RiskFieldType.COMPUTED.toString().toLowerCase());	
					}
				}
			}
			else {
				//If the field is read only and no variable available in flow variable then check the default value else skip the field.
				if(rcField.getDefaultValue() != null && rcField.getDefaultValue().trim().length() > 0) {
					riskField.setCalculation(rcField.getDefaultValue());
					riskField.setType(RiskFieldType.COMPUTED.toString().toLowerCase());	
					//riskField.setDefaultValue(rcField.getDefaultValue());
					//riskField.setType(RiskFieldType.NUMBER.toString().toLowerCase());
				}
				else {
					return null;
				}
			}

		} else {

			if (rcField.getType().equals(RCFieldType.SELECT.toString())) {
				riskField.setType(RiskFieldType.ENUM.toString().toLowerCase());
				addRiskFieldOptions(riskField, rcField, isStateData, className);
			} else {
				String variableType =getVariableType(className, riskFieldName);
				if(variableType.equalsIgnoreCase(DomainVariableType.INT.name()) || variableType.equalsIgnoreCase(DomainVariableType.INTEGER.name()) || variableType.equalsIgnoreCase(DomainVariableType.DECIMAL.name())) {
					riskField.setType(RiskFieldType.NUMBER.toString().toLowerCase());
				}
				else if(variableType.equalsIgnoreCase(DomainVariableType.DATETIME.name()) ) {
					riskField.setType(RiskFieldType.DATE.toString().toLowerCase());
				}
				else if(rcField.getType().equalsIgnoreCase(RCFieldType.RADIO.name())) {
					riskField.setType(RiskFieldType.BOOLEAN.toString().toLowerCase());
					if(rcField.getDefaultValue() != null && rcField.getDefaultValue().trim().length() > 0) {
						String defaultValue = "true";
						if(rcField.getDefaultValue().equals("No")) {
							defaultValue ="false";
						}
						riskField.setDefaultValue(defaultValue);
					}
				}
				else {
					riskField.setType(RiskFieldType.STRING.toString().toLowerCase());
				}
			}
		}

		if(null != rcField.getAddChangeDeleteFlag() && rcField.getAddChangeDeleteFlag().equals("D")) {
			riskField.setDeleted(true);
		}else {
			riskField.setDeleted(false);
		}
		riskField.setSupplemental(false);
		riskField.setOptional(false);
		if(rcField.getPolicyDisplay().equals("1") || rcField.getPolicyRequired().equals("1")) {
			riskField.setSupplemental(true);
		}
		if(rcField.getPolicyRequired().equals("1")) {
			riskField.setOptional(false);
		}
		else {
			riskField.setOptional(true);
		}
		if(null!= riskField.getType() && riskField.getType().equals(RiskFieldType.ENUM.toString().toLowerCase())) {
			if(null == riskField.getOptions() || null!=riskField.getOptions() && riskField.getOptions().size() == 0) {// No domain table attached
				//return null;
			}
		}
		return (riskField);

	}
    private MappingRow getMappingName(String className, String type, String typeName, String formattedTypeName) {
    	String columnName = typeName;
    	int uuid = 0;
    	List<MappingRow> mappingRows = new ArrayList<MappingRow>();
    	
    	if(typeName.endsWith(".Date") || typeName.endsWith(".Days")) { // egg: endOfTRIA_1.Date in pch dateDiff_1 / calc_VacancyPermitProRateFactor_BOPVacancyPermit
    		typeName = typeName.substring(0, typeName.length()-5);
		}
		String[] typeNames = null;
		if(typeName.contains("/")) {
			typeNames = typeName.split("/");
		}
		else {
			typeNames =  typeName.split("\\.");
		}
		if (typeNames.length == 2) {
			typeName =typeNames[1];
		}
		
    	
    	if(type.equals("field") || type.equals(ALGVariableType.UI.toString())){
    		typeName =YAMLCompntIdentifier.field_.name()+typeName;
		}
		else if(type.equals("calculations")) {
			typeName =YAMLCompntIdentifier.calc_.name()+typeName;
		}else if(type.equals("RateTable")) {
			typeName =YAMLCompntIdentifier.rt_.name()+typeName;
		}else {
			typeName ="Other_"+typeName;
		}
    	
    	if(null != mappingTable.get(typeName)) {
    		mappingRows = mappingTable.get(typeName);
    		for(MappingRow mappingRow:mappingRows) {
    			if(null != mappingRow.getFormattedTypeName() && mappingRow.getFormattedTypeName().equals(formattedTypeName)) {
    				return mappingRow;
    			}
    		}
    		if(null != mappingRows && mappingRows.size() > 0) {
    			uuid =  mappingRows.get(mappingRows.size() -1).getUuid();
    		}
    		uuid = uuid + 1;
    	}else {
    		mappingTable.put(typeName, mappingRows);
    	}
    	
    	MappingRow mappingRow  = new MappingRow();
    	mappingRow.setClassName(className);
    	mappingRow.setType(type);
    	mappingRow.setTypeName(columnName);
    	mappingRow.setFormattedTypeName(formattedTypeName);
    	//mappingRow.setMappedTypeName(typeName);
    	//if(uuid > 0) {
    	mappingRow.setMappedTypeName(typeName+"_"+uuid);
    	//}
    	mappingRow.setUuid(uuid);
    	mappingTable.get(typeName).add(mappingRow);
    	
    	return mappingRow;
    }
	/**
	 * Logic for skip fields that does not need in Britecore point of view.
	 * @param riskFieldName
	 * @return
	 */
	private boolean canSkipField(String riskFieldName) {
		String[] variableNames = null;
		String skipVariableName ="";
		if(riskFieldName.contains("/")) {
			variableNames = riskFieldName.split("/");
		}
		else {
			variableNames = riskFieldName.split("\\.");
		}

		if(variableNames.length == 2) {

			skipVariableName = variableNames[1];
		}
		else {
			skipVariableName = variableNames[0];
		}

		if(skipVariableName.equalsIgnoreCase("PolicyTermPremium")) {
			return true;
		}
		return false;
	}

	private String formatVariableName(String variableName,String className,String type,String pchName) {

		if(variableName.endsWith(".Date") || variableName.endsWith(".Days")) { // egg: endOfTRIA_1.Date in pch dateDiff_1 / calc_VacancyPermitProRateFactor_BOPVacancyPermit
			variableName = variableName.substring(0, variableName.length()-5);
		}
		String[] variableNames = null;
		if(variableName.contains("/")) {
			variableNames = variableName.split("/");
		}
		else {
			variableNames =  variableName.split("\\.");
		}
		String formattedVariable="";
		if (variableNames.length == 2) {
			// format should be - variable name + class name
			formattedVariable =variableNames[1] + "_" + variableNames[0];
		}
		else {
			formattedVariable= variableName+"_"+className;
		}

		if(type.equals("field") || type.equals(ALGVariableType.UI.toString())){
			formattedVariable =YAMLCompntIdentifier.field_.name()+formattedVariable;
		}
		else if(type.equals("calculations")) {
			if(null != excludedPCH.get(className+variableName) && excludedPCH.get(className+variableName).size() > 0) {
				if(null != excludedPCH.get(className+pchName) && excludedPCH.get(className+pchName).size() > 0) {
					List<String>msgs = excludedPCH.get(className+pchName);
					if(!msgs.get(2).contains(variableName+"-"+className)) {
						String msg= msgs.get(2)+", "+variableName+"-"+className;
						msgs.add(2,msg);
					}
				}else {
					List<String>msgs = new ArrayList<String>();
					msgs.add(className);
					msgs.add(pchName);
					msgs.add("Depends on : "+variableName+"-"+className);
					excludedPCH.put(className+pchName, msgs);
				}
				
			}
			formattedVariable =YAMLCompntIdentifier.calc_.name()+formattedVariable;
			
		}
		else {
			formattedVariable =YAMLCompntIdentifier.calc_.name()+formattedVariable;
		}

		return formattedVariable;

	}


	/**
	 * 
	 * 
	 * @param riskFieldName
	 * @return
	 */
	private String getRiskFieldCalculation(String className,String riskFieldName) {		

		List<ClassComponent> classComponents = flowClassComponents.get(className);
		if(classComponents != null) {
			for (ClassComponent classComponent : classComponents) {
				if(classComponent.getVariables() != null) {
					for (FlowVariable flowVariable : classComponent.getVariables()) {	

						if(flowVariable.getName().equalsIgnoreCase(riskFieldName)) {
							String formattedVariableName  = formatVariableName(riskFieldName, className, "calculations","");
							if(!isMatchLengthCriteria(formattedVariableName)){
								MappingRow mappingRow = getMappingName(className, "calculations", riskFieldName, formattedVariableName);
								return mappingRow.getMappedTypeName();//revisit
							}
							return formattedVariableName;//revisit
						}
					}
				}
			}
		}
		else {
			//System.out.println(className);
		}
		return "";
	}


	/**
	 * Adding domain table entries for the RiskField
	 * 
	 * @param riskField
	 * @param rcField
	 */
	private void addRiskFieldOptions(RiskField riskField, Field rcField, boolean isStateData, String className) {

		ArrayList<EnumFieldOption> enumFieldOptions = new ArrayList<EnumFieldOption>();

		DomainTable domainTable = rcField.getDomainTable();

		if (domainTable == null) {
			// Why domain table is null, need to check later. Eldho
			if(isStateData) {
				domainTable = rcDomainTablesMerged.get(rcField.getDomainTableName());
			}else {
				domainTable = rcDomainTablesCW.get(rcField.getDomainTableName());
			}
		}

		if (domainTable != null) {

			List<DomainTableEntry> domainTableEntries = domainTable.getDomainTableEntryList();
			List<DomainTableKey> domainTableKeyList = domainTable.getDomainTableKeyList();
			List<String> domainTableKeyNameValues =null;
			if(null == domainTableEntries && !isStateData) { //copy first state domain entries to cw
				domainTableEntries = getStateDomainTables(domainTable, className, riskField, rcField);
			}
			if (domainTableEntries != null) {
				List<String> domainTableKeyNames = new ArrayList<String>();
				if(domainTableKeyList != null) {
					for(DomainTableKey domainKey : domainTableKeyList) {
						domainTableKeyNames.add(domainKey.getName());
					}
				}

				int i = 0;
				List<String> duplicateEntryChecking = new  ArrayList<String>();

				for (DomainTableEntry domainTableEntry : domainTableEntries) {

					EnumFieldOption enumFieldOption = new EnumFieldOption();
					domainTableKeyNameValues= new ArrayList<String>();
					domainTableKeyNameValues.addAll(domainTableEntry.getDomainKeyValues().values());
					String enumLabelValue = YAMLUtil.trimTrailingWhitespace(domainTableEntry.getDisplayValue().replaceAll(",", ""));
					String enumDataValue =  YAMLUtil.trimTrailingWhitespace(domainTableEntry.getDataValue().replaceAll(",", ""));

					enumFieldOption.setValue(enumDataValue);
					enumFieldOption.setLabel(enumLabelValue);
					/**
					 * As there is duplicate domain names, appending name with data value for making it unique.
					 */
					String domainName = YAMLUtil.generateDomainOptionNameValue( riskField.getName() ,enumDataValue,null);

					int tempLength = domainName.length();
					if(tempLength > 150) {
						System.out.println("Domain name option length is : " + tempLength + "domain name : "+ domainName );
					}
					enumFieldOption.setName(domainName);
					if(!duplicateEntryChecking.contains(domainName)) {
						enumFieldOptions.add(enumFieldOption);
						duplicateEntryChecking.add(domainName);
						if (i == 0) {
							riskField.setDefaultValue(domainName);
						}
					}
					i++;
				}
				riskField.setOptions(enumFieldOptions);
			} else {
				System.out.println("Error1: Domain Table Entries are not avaiable for field " + rcField.getColumnName() + " domain table id is " + rcField.getDomainTableId());
				EnumFieldOption enumFieldOption = new EnumFieldOption();
				enumFieldOption.setValue("1000");
				enumFieldOption.setLabel("1000");
				enumFieldOption.setName(riskField.getName()+"_1000");
				enumFieldOptions.add(enumFieldOption);
				riskField.setOptions(enumFieldOptions);
				
				List<String> msgs = new ArrayList<String>();
				msgs.add("Domain Table");
				msgs.add(rcField.getDomainTableId());
				msgs.add(className+" - "+rcField.getColumnName());
				msgs.add("Domain table entries not exist");
				logs.put("dt_"+rcField.getDomainTableId(), msgs);
				
			}

		} else {

			System.out.println("Error2: Domain Table is not avaiable for field " + rcField.getColumnName()+ " domain table id is " + rcField.getDomainTableId());
			CommonDomainTable commonDomainTable = getCommonTable(rcField.getDomainTableName());

			if(commonDomainTable != null) {
				List<CommonDomainEntry> domainEntries = commonDomainTable.getDomainEntries();
				if(domainEntries != null) {
					int i =0;
					for(CommonDomainEntry commonDomainEntry : domainEntries) {

						String displayValue = commonDomainEntry.getDisplayValue();
						EnumFieldOption enumFieldOption = new EnumFieldOption();
						String domainName = YAMLUtil.generateDomainOptionNameValue( riskField.getName() ,displayValue,null);

						enumFieldOption.setValue(displayValue);
						enumFieldOption.setLabel(displayValue);
						enumFieldOption.setName(domainName);
						enumFieldOptions.add(enumFieldOption);
						if(i==0) {
							riskField.setDefaultValue(domainName);
							i++;
						}
						riskField.setOptions(enumFieldOptions);
					}
				}
			}		
		}

	}
	private List<DomainTableEntry> getStateDomainTables(DomainTable domainTable, String className, RiskField riskField, Field rcField) {
		List<DomainTableEntry> domainTableEntries = null;
		for (Map.Entry<String,Map<String,DomainTable>> entry : statesDomainTablesMerged.entrySet()) {  
			domainTableEntries = entry.getValue().get(domainTable.getName()).getDomainTableEntryList();
			if(null != domainTableEntries && domainTableEntries.size()>0) {
				return domainTableEntries;
			}
		}
		if(null == domainTableEntries) {
			// check any state rc the field is over rided.
			for (Map.Entry<String,Map<String,Form>> entry : stateRCFormsMerged.entrySet()) {
				Map<String,Form> rcFormMap = entry.getValue();
				
				Form form = rcFormMap.get(className);
				List<Field> fieldList = form.getFieldList();
				if(null != fieldList && fieldList.size()>0) {
					for(Field field:fieldList) {
						if(field.getColumnName().equals(rcField.getColumnName())) {
							if(null != field.getDomainTableName() && field.getDomainTableName().length() >0) {
								domainTableEntries = statesDomainTablesMerged.get(entry.getKey()).get(field.getDomainTableName()).getDomainTableEntryList();
								if(null != domainTableEntries && domainTableEntries.size()>0) {
									return domainTableEntries;
								}
							}
						}
						
					}
				}
				
			}
			
		}
		
		return null;
	}

	/**
	 * Method used to get the non-lob specific domain table details.
	 * @param string
	 */
	private CommonDomainTable getCommonTable(String tableName) {
		List<CommonDomainTable> commonDomainTables = commonConfig.getCommonDomainTables();
		if(commonDomainTables != null) {
			for(CommonDomainTable commonDomainTable : commonDomainTables) {
				if(commonDomainTable.getName().equalsIgnoreCase(tableName)){
					return commonDomainTable;
				}
			}
		}

		return null;
	}


	/**
	 * Process the class component for the rating logic and other details. For
	 * RiskType PCH variables are added to calculations. 
	 *  
	 * @param subComponent
	 * @param isStateData 
	 * @throws Exception
	 */
	private void processRatingorPremium(ClassComponent subComponent, Lob lobDetails, boolean isStateData) throws Exception {

		String className = subComponent.getClassName();		

		if (subComponent.getVariables() != null) {

			Reference matchedReference = lobDetails.getReferenceFromDbTablesAndType(className, subComponent.getType());
			for (FlowVariable flowVariable : subComponent.getVariables()) {	

				if(!flowVariable.getName().equals("PremiumIndicator")){		 // No need to add Premium Indicator in Calculations

					if(flowVariable.getName().equals("IRPMFactor")) {
						System.out.println("IRPMFactor");
					}
					Pch matchedPch = matchedReference.getScope(className, flowVariable.getPass())
							.getPch(flowVariable.getName());
					String pchName = flowVariable.getName();
					//System.out.println("matchedPch : "+pchName);
					if((matchedPch.getState().equals("CW"))) {
						if(isStateData) {
							/**
							 *Sate data is processing and pch corresponding to "CW" then add variable name to entity order
							 */
							String calcVariableName1 = formatVariableName(pchName,className,"calculations",pchName);//revisit
							String calcVariableName  = calcVariableName1;
							if(!isMatchLengthCriteria(calcVariableName1)) {
								MappingRow mappingRow = getMappingName(className, "calculations", pchName, calcVariableName1);
								calcVariableName = mappingRow.getMappedTypeName();
							}
							RiskType riskType = getRiskType(className);
							if(!checkRiskTypeEntitiesOrderExist(riskType, EntityOrderType.CALCULATION, calcVariableName)) {
								addRiskTypeEntitiesOrder(riskType, EntityOrderType.CALCULATION, calcVariableName);
							}

							/**
							 * Need to add ratetable name also to entity order
							 */
							
							addERateTablesEntityOrderForState(riskType);
							addRateTablesDefnitionForState(riskType);
							
						}
						else {
							String calcValue = processPch(matchedPch, className, flowVariable.getName(),isStateData);
							if(null != calcValue && !calcValue.equals(YAMLConstants.HANDLE_WITH_RULES_CALCULATION)) {
								addCalculation(flowVariable.getName(), className,calcValue);
							}
							RiskType riskType = getRiskType(className);
							riskTypesCW.put(riskType.getName(), riskType);
						}
					}
					else {
						if(!isStateData) {
							/**
							 *Sate data is processing and pch corresponding to "CW" then add variable name to entity order
							 */
							String calcVariableName = formatVariableName(pchName,className,"calculations",pchName);
							RiskType riskType = getRiskType(className);
							if(!checkRiskTypeEntitiesOrderExist(riskType, EntityOrderType.CALCULATION, calcVariableName)) {
								addRiskTypeEntitiesOrder(riskType, EntityOrderType.CALCULATION, calcVariableName);
							}
							
							riskTypesCW.put(riskType.getName(), riskType);

							/**
							 * Need to add ratetable name also to entity order
							 */
							
							addERateTablesEntityOrderForState(riskType);
							addRateTablesDefnitionForState(riskType);
						}
						else {
							String calcValue = processPch(matchedPch, className, flowVariable.getName(),isStateData);
							if(null != calcValue && !calcValue.equals(YAMLConstants.HANDLE_WITH_RULES_CALCULATION)) {
								addCalculation(flowVariable.getName(), className,calcValue);
							}
						}
					}

				}

			}

		}		
	}

	private void addERateTablesEntityOrderForState(RiskType riskType) {
		RiskType riskTypeCW = riskTypesCW.get(riskType.getName());
		List<String> rateTableNamesCW = riskTypeCW.getEntities_order().getRate_tables();
		List<String> rateTableNames= riskType.getEntities_order().getRate_tables();
		if(null!=rateTableNamesCW) {
			for(String nameCW:rateTableNamesCW) {
				if(null!=rateTableNames && !rateTableNames.contains(nameCW)) {
					rateTableNames.add(nameCW);
				}else {
					if(null == rateTableNames) {
						rateTableNames = new ArrayList<String>();
						rateTableNames.add(nameCW);
						riskType.getEntities_order().setRate_tables(rateTableNames);
					}
				}
			}
		}
	}
	
	
	private void addRateTablesDefnitionForState(RiskType riskType) {
		RiskType riskTypeCW = riskTypesCW.get(riskType.getName());
		List<com.nest.erc.yaml.domain.RateTable> rateTablesCW = riskTypeCW.getRate_tables();
		List<com.nest.erc.yaml.domain.RateTable> rateTablesState = riskType.getRate_tables();
		
		for(com.nest.erc.yaml.domain.RateTable rateTableCW:rateTablesCW) {
			RateTable rateTableMerged = rateTablesMergedState.get(rateTableCW.getLabel());
			if(null != rateTableMerged && null != rateTableMerged.getAddChangeDeleteFlag() && !rateTableMerged.getAddChangeDeleteFlag().equals("D")) {
				if(!isRateTablesDefnitionExists(rateTablesState, rateTableMerged.getName())) {
					rateTablesState.add(rateTableCW);
				}
			}
		}
		
	}
	private boolean isRateTablesDefnitionExists(List<com.nest.erc.yaml.domain.RateTable> rateTablesState , String rateTableName) {
		for(com.nest.erc.yaml.domain.RateTable rateTableState:rateTablesState) {
			if(rateTableState.getLabel().equals(rateTableName)) {
				return true;
			}
		}
		return false;
		
	}



	/**
	 * Method for adding calculations to RiskType In the YAML object we may have
	 * Calculation value will be added later in PCH process.
	 * RiskType and RiskItem with same class name (because we are adding wrapper
	 * RiskTypes for Some RiskItems)
	 * 
	 * @param pchName
	 * @param calcValue 
	 * @param yamlObject
	 * @param calculations
	 * @throws Exception
	 */
	private Calculation addCalculation(String pchName, String className, String calcValue) throws Exception {

		List<Calculation> calculations = null;
		String calcVariableName = pchName;
		boolean isRiskItem = false;
		RiskItem riskItem = null;
		RiskType riskTypeYamlaOBject = (RiskType) getYamlObject(className, YAMLObjectType.RiskType);
		if(riskTypeYamlaOBject == null ) {
			riskItem = (RiskItem) getYamlObject(className, YAMLObjectType.RiskItem);			
			if(riskItem != null) {
				isRiskItem = true;
				riskTypeYamlaOBject = riskItem.getParentRiskType();				
			}
		}

		String calcVariableName1 = formatVariableName(calcVariableName,className,"calculations",pchName); //revisit
		calcVariableName = calcVariableName1;
		if(!isMatchLengthCriteria(calcVariableName1)) {
			MappingRow mappingRow = getMappingName(className, "calculations", calcVariableName, calcVariableName1);
			calcVariableName  = mappingRow.getMappedTypeName();
		}
		
		/**
		 * Adding premium reference to Riskitem.
		 */
		if(pchName.equals(premiumString) && isRiskItem) {
			addRiskItemPremium(riskItem,calcVariableName);
		}

		if(!checkRiskTypeEntitiesOrderExist(riskTypeYamlaOBject, EntityOrderType.CALCULATION, calcVariableName)) {

			if(!checkRiskTypeEntitiesOrderExist(riskTypeYamlaOBject, EntityOrderType.RISKFIELD, calcVariableName)) {


				if (riskTypeYamlaOBject != null) {

					calculations = riskTypeYamlaOBject.getCalculations();
					if (calculations == null) {
						calculations = new ArrayList<Calculation>();
					}
					riskTypeYamlaOBject.setCalculations(calculations);
					addRiskTypeEntitiesOrder(riskTypeYamlaOBject, EntityOrderType.CALCULATION, calcVariableName);

				} else {

					//throw new Exception("Error: We are not expecting here (processRatingorPremium) !. Class Name : " + className + " PCH Name: " + pchName);
				}
				if(null!=calcVariableName && calcVariableName.length() > 250) {
					List<String> msgs = new ArrayList<String>();
					msgs.add("Calculation");
					msgs.add(calcVariableName);
					msgs.add(className);
					msgs.add("Calculation name length > 250");
					logs.put(calcVariableName, msgs);
				}
				Calculation calculation = new Calculation();
				calculation.setName(calcVariableName);
				calculation.setDeleted(false);
				calculation.setDescription(pchName);
				calculation.setCalculation(calcValue.trim());//AMF calculation.setCalculation("1");
				calculations.add(calculation);	

				return calculation;
			}
			else {
				//System.out.println("Duplicate Risk Field exist for '" + pchName + "' in class: " + className +", skip adding calculation. ");
				return null;
			}
		}
		else {
			//System.out.println("Calculation already added for '" + pchName + "' in class: " + className +", skip adding calculation. ");
			return null;
		}

	}
    private boolean isMatchLengthCriteria(String name) {
    	if(null != name && name.length() > 250) {
    		return false;
    	}
    	return true;
    }
	private void addRiskItemPremium(RiskItem riskItem, String calcVariableName) {
		// TODO Auto-generated method stub
		Calculation itemCalculation = riskItem.getPremium();
		if(itemCalculation == null) {
			itemCalculation = new Calculation();
			riskItem.setPremium(itemCalculation);
		}
		itemCalculation.setCalculation(calcVariableName.trim());//itemCalculation.setCalculation("1");AMF
		itemCalculation.setName(premiumString.toLowerCase());
		itemCalculation.setDeleted(false);
		itemCalculation.setDescription("");
		
		if(null!=premiumString && premiumString.length() > 250) {
			List<String> msgs = new ArrayList<String>();
			msgs.add("Calculation");
			msgs.add(premiumString);
			msgs.add(riskItem.getLabel());
			msgs.add("Calculation name length > 250");
			logs.put(premiumString, msgs);
		}


	}

	/**
	 * Method used to process the PCH variable
	 * 
	 * @param hasExecutable
	 * @param calculation
	 * @param condition
	 * @throws Exception
	 */
	public String processPch(HasExecutable hasExecutable, String className, String pchName, boolean isStateData)
			throws Exception {
		
//		if(null!=pchs  &&  null == pchs.get(className+pchName)) { code for taling total count of pchs
//			
//			pchs.put(className+pchName, pchName);
//			System.out.println(pchName);
//		}

		if (hasExecutable.getExecutables() != null) {
			String status = canProcessPCH(hasExecutable.getExecutables(), className, pchName, isStateData);
			
			if(status.length()>0) {
				//System.out.println("pchName : className  : Reason ---- "+pchName+" : "+className+" : "+status);
				List<String> statusDetail = new ArrayList<String>();
				statusDetail.add(className);
				statusDetail.add(pchName);
				statusDetail.add(status);
				excludedPCH.put(className+pchName,statusDetail);
				
				if(status.equals(YAMLConstants.HANDLE_WITH_RULES_CALCULATION)) {
					// there is no need to write those calculations in yaml
					return YAMLConstants.HANDLE_WITH_RULES_CALCULATION;
					
				}
				return "1";
			}
			else {
				String expressionValue="";
				if(className.equals("BOPLocationMoneySecuritiesOnPremCoverage")) {
					if(pchName.equals("Rate")) {
						//System.out.println(className);
					}
				}
				for (RatingExecutable ratingExecutable : hasExecutable.getExecutables()) {
					if (ratingExecutable instanceof IfAndElse) {
						if(!isReassignmentExpression(hasExecutable.getExecutables())) {
							String ifElseCondition = handleIfAndElse((IfAndElse) ratingExecutable, className, pchName, "", isStateData);
							expressionValue = generateConditionalExpression((IfAndElse) ratingExecutable, expressionValue, ifElseCondition);
						}
						else {
							System.out.println("Unable to automate reassignment Condition, Expression not written completely! Class name : "+ className +" pch name : "+ pchName +" Please contact administrator");
						}
					} else if (ratingExecutable instanceof Assign) {
						if (canProcessAssign(ratingExecutable)) {
							expressionValue = expressionValue +handleAssignOnly((Assign) ratingExecutable, className, pchName,"", isStateData);
						}
					} else if (ratingExecutable instanceof Loop) {
	
	
						if(!isReassignmentExpression(hasExecutable.getExecutables())) {
							String loopThroughVariable =((Loop)ratingExecutable).getThrough();
							//String loopClass = getTheIterated(loopCondition);				
	
							String loopExpression = handleLoopOnly((Loop) ratingExecutable, className, pchName,loopThroughVariable,isStateData);
	
							expressionValue = generateLoopExpression((Loop) ratingExecutable, expressionValue, loopExpression);
	
						}
						else {
							System.out.println("Unable to automate reassignment Condition, Expression not written completely! Class name : "+ className +" pch name : "+ pchName +" Please contact administrator");
						}
					}
				}
	
				return expressionValue;
			}
		}
		return "";
		

	}

	/**
	 * This should only be called from processPCH function.
	 * If the expressions have "Assign" first and identify whether the assigned value is reassigned or not.
	 * In that case it wont be able to automate the condition.
	 * Please refer "addlLocationCount" in "BOPEmployeeDishtyCoverage" coverage	or  "LocationMoneyFlag" in "CR_Classification"
	 * @param ratingExecutables
	 * @return
	 */
	private boolean isReassignmentExpression(List<RatingExecutable> ratingExecutables) {

		if( ratingExecutables != null) {

			RatingExecutable ratingExecutable = ratingExecutables.get(0);
			/**
			 * Checking first expression is Assignment
			 */
			if (ratingExecutable instanceof Assign) {
				Assign assignExecutable = (Assign)ratingExecutable;
				if(assignExecutable != null && assignExecutable.getExpression() != null ) {


					if(assignExecutable.getExpression().getCharacterContent() != null && (assignExecutable.getExpression().getCharacterContent().equals("0.0") || assignExecutable.getExpression().getCharacterContent().equals("0") || assignExecutable.getExpression().getCharacterContent().trim().length() ==0 )) {
						return false;
					}
					else {

						List<RatingExecutable> nextExecutables = new ArrayList<RatingExecutable>();

						/**
						 * Check the next assignment, first assignment expression should be skipped for that
						 */

						nextExecutables =ratingExecutables.subList(1, ratingExecutables.size());

						Assign nextAssign =getNextAssignmentExpression(nextExecutables);
						if(nextAssign != null) {
							if(assignExecutable.getlValue().equals(nextAssign.getlValue())) {
								if(nextAssign.getExpression() != null && nextAssign.getExpression().getLeftExpression() != null) {
									Expression leftExpression =nextAssign.getExpression().getLeftExpression() ;

									if(leftExpression.getCharacterContent().equals(assignExecutable.getlValue())) {
										return false;
									}
									return  true;
								}
								else {
									return true;
								}
							}
						}
					}

				}
				else {
					System.out.println("null in isReassignmentExpression");
				}
			}
		}

		return false;
	}
	
	
	/**
	 * Function to check a reassigmnet exist in any of the blcks under pch
	 * @param ratingExecutables
	 * @return
	 */
	private String canProcessPCH(List<RatingExecutable> ratingExecutables, String className, String pchName, boolean isStateData) {
		
		List<String> statusList = new ArrayList<String>();
		if( ratingExecutables != null) {
			// Rule 1 : field and pch have same then we skip that pchs and implement those pch with brite rules
			if(null != pchName && !pchName.equalsIgnoreCase("premium")) {
				if(checkFieldExist(className, pchName, isStateData)) {
					//return YAMLConstants.HANDLE_WITH_RULES_CALCULATION;
					statusList.add(YAMLConstants.HANDLE_WITH_RULES_CALCULATION);
				}
			}
			
			
			// Rule 2 :Reassignment
			List<Object> returnList = getNextAssignmentExpressionAndList(ratingExecutables);
			if( null != returnList && returnList.size() >0 && null!= returnList.get(0) && returnList.get(0) instanceof Assign) {
				Assign assignExecutable = (Assign)returnList.get(0);
				if(null != returnList.get(1)) {
					List<RatingExecutable> nextExecutables = (List<RatingExecutable>) returnList.get(1);
					if(nextExecutables.size() > 0) {
						Assign nextAssign =getNextAssignmentExpressionWithGivenLValue(nextExecutables, assignExecutable.getlValue());
						if(nextAssign != null) {
							if(assignExecutable.getlValue().equals(nextAssign.getlValue())) {
								//return YAMLConstants.REASSIGNMENT_CALCULATION;
								statusList.add(YAMLConstants.REASSIGNMENT_CALCULATION);
							}
						}
					}
				}else {
					// check any assignments in root folder
					returnList = getRootAssignmentAndReference(ratingExecutables);
					if( null != returnList && returnList.size() >0 && null!= returnList.get(0) && returnList.get(0) instanceof Assign) {
						assignExecutable = (Assign)returnList.get(0);
						if(null != returnList.get(1)) {
							List<RatingExecutable> nextExecutables = (List<RatingExecutable>) returnList.get(1);
							if(nextExecutables.size() > 0) {
								Assign nextAssign =getNextAssignmentExpressionWithGivenLValue(nextExecutables, assignExecutable.getlValue());
								if(nextAssign != null) {
									if(assignExecutable.getlValue().equals(nextAssign.getlValue())) {
										//return YAMLConstants.REASSIGNMENT_CALCULATION;
										statusList.add(YAMLConstants.REASSIGNMENT_CALCULATION);
									}
								}
							}
						}
					}
					
				}
			}
			
			// Rule 3 : Skipping sibling loop
			String status = isSiblingLoop(ratingExecutables);
			if( null != status && status.length() >0) {
				//return status;
				statusList.add(status);
			}
			// Rule 3 : Skipping else inside loop
			status = isElseBlockInLoop(ratingExecutables, false);
			if( null != status && status.length() >0) {
				//return status;
				statusList.add(status);
			}
			// Rule 4 : If without else
			status = checkIfWithoutElse(ratingExecutables);
			if( null != status && status.length() >0) {
				// if without else with simple assignmet can handle in code. So it is not listed in excluded pch list
				//if(!isReassignmentInIfWithoutElse(ratingExecutables)) {
					//return status;
					statusList.add(status);
//				}else {
					//System.out.println("*****"+pchName+","+className);
				//}
			}
			
		}
		if(null!= statusList && statusList.size()>0) {
			return String.join(",", statusList);
		}
		return "";
	}
	/**
	 * Function to check a sibling loop exist in any of the pch
	 * @param ratingExecutables
	 * @return
	 */
	private boolean isSiblingLoopExist(List<RatingExecutable> ratingExecutables) {
		
		if( ratingExecutables != null) {
			List<Object> returnList = getNextAssignmentExpressionAndList(ratingExecutables);
			
			if( null != returnList && returnList.size() >0 && null!= returnList.get(0)) {
				Assign assignExecutable = (Assign)returnList.get(0);
				if(null != returnList.get(1)) {
					List<RatingExecutable> nextExecutables = (List<RatingExecutable>) returnList.get(1);
					if(nextExecutables.size() > 0) {
						Assign nextAssign =getNextAssignmentExpressionWithGivenLValue(nextExecutables, assignExecutable.getlValue());
						if(nextAssign != null) {
							if(assignExecutable.getlValue().equals(nextAssign.getlValue())) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

	/**
	 * Method used to identify how the ifelse condition should append with previous condition.
	 * @param expression
	 * @param previousCondition
	 * @param ifelseCondition
	 * @return
	 */
	private String generateConditionalExpression(IfAndElse expression, String previousCondition,String ifelseCondition) {
		//String finalExpression="";
		/**
		 * Identify whether the assigned value is reassigned or not.n that case it wont be able to automate the condition.
		 * Please refer "addlLocationCount" in "BOPEmployeeDishtyCoverage" coverage
		 */
		if(previousCondition.trim().length() > 0 && (expression.getPreviousSibling() instanceof Assign)){
			Assign previousAssign = (Assign)expression.getPreviousSibling();
			Assign nextAssign = getNextAssignmentExpression(expression.getThenPart().getExecutables());
			if(nextAssign == null) {
				nextAssign = getNextAssignmentExpression(expression.getElsePart().getExecutables());
			}

			if(nextAssign != null) {	

				if(previousAssign.getlValue().equals(nextAssign.getlValue())){
					Expression assignExpression = nextAssign.getExpression();
					if(assignExpression!= null && assignExpression.getVariableType() != null && assignExpression.getVariableType().equals(ALGVariableType.CONSTANT.name())) {
						//log.write("Unable to automate, Expression not written completely ! Please contact administrator."
						return previousCondition;

					}
				}			

			}			

		}

		return previousCondition + ifelseCondition;


	}

	/**
	 * Method used to find the next available "Assign" expression.
	 * @param execuatableList
	 * @return
	 */
	private Assign getNextAssignmentExpression(List<RatingExecutable> execuatableList) {

		//for()

		for (int i = 0; i < execuatableList.size(); i++) {

			if (execuatableList.get(i) instanceof Assign) {

				return (Assign) execuatableList.get(i);
			}
			else if(execuatableList.get(i) instanceof IfAndElse) {
				Assign assign =getNextAssignmentExpression(((IfAndElse)execuatableList.get(i)).getThenPart().getExecutables());
				if(assign == null) {
					assign = getNextAssignmentExpression(((IfAndElse)execuatableList.get(i)).getElsePart().getExecutables());
				}
				if(assign != null) {
					return assign;
				}
			}
			else if(execuatableList.get(i) instanceof Loop) {
				return getNextAssignmentExpression(((Loop)execuatableList.get(i)).getExecutables());
			}
		}

		return null;
	}
	private List<Object> getNextAssignmentExpressionAndList(List<RatingExecutable> execuatableList) {

		ArrayList<Object> retList = new ArrayList<Object>();
		for (int i = 0; i < execuatableList.size(); i++) {

			if (execuatableList.get(i) instanceof Assign) {
				
				retList.add((Assign) execuatableList.get(i));
				if(execuatableList.size() > i+1) {
					retList.add(execuatableList.subList(i+1, execuatableList.size()));
				}else {
					retList.add(null);
				}
				break;
			}
			else if(execuatableList.get(i) instanceof IfAndElse) {
				List<Object> retunList =getNextAssignmentExpressionAndList(((IfAndElse)execuatableList.get(i)).getThenPart().getExecutables());
				if(null!= retunList && retunList.get(0) == null) {
					return getNextAssignmentExpressionAndList(((IfAndElse)execuatableList.get(i)).getElsePart().getExecutables());
				}else{
					if(retunList.size()>0) {
						return retunList;
					}
				}
			}
			else if(execuatableList.get(i) instanceof Loop) {
				return getNextAssignmentExpressionAndList(((Loop)execuatableList.get(i)).getExecutables());
			}
		}
		return retList;

	}
	private String checkIfWithoutElse(List<RatingExecutable> execuatableList) {

		for (int i = 0; i < execuatableList.size(); i++) {

			if (execuatableList.get(i) instanceof Assign) {
				//System.out.println("here");
			}
			else if(execuatableList.get(i) instanceof IfAndElse) {
				if(null == ((IfAndElse)execuatableList.get(i)).getElsePart()){
					if(null != execuatableList.get(i).getParent() && execuatableList.get(i).getParent() instanceof Loop) {
						// if a loop not a sibling loop have an else  without if can handle using filter. so it can handle
						Loop parentLoop = (Loop)execuatableList.get(i).getParent();
						if(null != parentLoop) {
							return checkIfWithoutElse(((IfAndElse)execuatableList.get(i)).getThenPart().getExecutables()); 
						}
					}
					return YAMLConstants.IF_WITHOUT_ELSE;
				}else {
					String msg = checkIfWithoutElse(((IfAndElse)execuatableList.get(i)).getThenPart().getExecutables());
					if(null!= msg && msg.length()<=0) {
						return checkIfWithoutElse(((IfAndElse)execuatableList.get(i)).getElsePart().getExecutables());
					}
				}
			}
			else if(execuatableList.get(i) instanceof Loop) {
				return checkIfWithoutElse(((Loop)execuatableList.get(i)).getExecutables());
			}
		}
		return "";

	}
	
	private List<Object> getRootAssignmentAndReference(List<RatingExecutable> execuatableList) {

		ArrayList<Object> retList = new ArrayList<Object>();
		for (int i = 0; i < execuatableList.size(); i++) {

			if (execuatableList.get(i) instanceof Assign) {
				
				retList.add((Assign) execuatableList.get(i));
				if(execuatableList.size() > i+1) {
					retList.add(execuatableList.subList(i+1, execuatableList.size()));
				}else {
					retList.add(null);
				}
				break;
			}
		}
		return retList;

	}
	
	private String isSiblingLoop(List<RatingExecutable> execuatableList) {

		for (int i = 0; i < execuatableList.size(); i++) {
			
			if(execuatableList.get(i) instanceof Loop) {
				
				Loop loop = (Loop)execuatableList.get(i) ;
				if(null != loop.getThrough() && loop.getThrough().startsWith("../")) {
					return YAMLConstants.SIBLING_LOOP_CALCULATION;
				}else {
					return isSiblingLoop(((Loop)execuatableList.get(i)).getExecutables());
				}
			}
			else if(execuatableList.get(i) instanceof IfAndElse) {
				return isSiblingLoop(((IfAndElse)execuatableList.get(i)).getThenPart().getExecutables());
				 
			}
			
		}

		return null;
	}
	
	private String isElseBlockInLoop(List<RatingExecutable> execuatableList, boolean isLoop) {

		for (int i = 0; i < execuatableList.size(); i++) {
			
			if(execuatableList.get(i) instanceof Loop) {
				Loop loop = (Loop)execuatableList.get(i) ;
				return isElseBlockInLoop(((Loop)execuatableList.get(i)).getExecutables(), true);
			}
			else if(execuatableList.get(i) instanceof IfAndElse) {
				 if(null != ((IfAndElse)execuatableList.get(i)).getElsePart() && isLoop) {
					 return YAMLConstants.ELSE_IN_LOOP_CALCULATION;
				 }else {
					 return isElseBlockInLoop(((IfAndElse)execuatableList.get(i)).getThenPart().getExecutables(), isLoop);
				 }
			}
			
		}

		return null;
	}
	
	private Assign getNextAssignmentExpressionWithGivenLValue(List<RatingExecutable> execuatableList, String lValue) {

		for (int i = 0; i < execuatableList.size(); i++) {

			if (execuatableList.get(i) instanceof Assign) {
				Assign nextAssign = (Assign) execuatableList.get(i);
				if(lValue.equals(nextAssign.getlValue())){
					return nextAssign;
				}
			}
			else if(execuatableList.get(i) instanceof IfAndElse) {
				Assign assign =getNextAssignmentExpressionWithGivenLValue(((IfAndElse)execuatableList.get(i)).getThenPart().getExecutables(), lValue);
				if(assign == null) {
					assign = getNextAssignmentExpressionWithGivenLValue(((IfAndElse)execuatableList.get(i)).getElsePart().getExecutables(), lValue);
				}
				if(assign != null) {
					if(lValue.equals(assign.getlValue())){
						return assign;
					}
				}
			}
			else if(execuatableList.get(i) instanceof Loop) {
				return getNextAssignmentExpressionWithGivenLValue(((Loop)execuatableList.get(i)).getExecutables(), lValue);
			}
		}

		return null;
	}
	
	private boolean isReassignmentInIfWithoutElse(List<RatingExecutable> execuatableList) {
		if (null != execuatableList  && execuatableList.size() ==2 && execuatableList.get(0) instanceof Assign && execuatableList.get(1) instanceof IfAndElse) {
			Assign assign = (Assign) execuatableList.get(0);
			if(execuatableList.get(1) instanceof IfAndElse) {
				if(null == ((IfAndElse)execuatableList.get(1)).getElsePart()) {
					if(null != ((IfAndElse)execuatableList.get(1)).getThenPart().getExecutables() && ((IfAndElse)execuatableList.get(1)).getThenPart().getExecutables().size() == 1) {
						if(((IfAndElse)execuatableList.get(1)).getThenPart().getExecutables().get(0) instanceof Assign) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}


	/**
	 * Method used to identify how the loop condition should append with other previous condition.
	 * @param expression
	 * @param previousCondition
	 * @param loopCondition
	 * @return
	 */
	private String generateLoopExpression(Loop expression,String previousCondition,String loopCondition) {

		String loopExression ="";

		/**
		 * Based on previous "Assign" expression - if the previous assignment is added to the loop conditional value
		 */
		if(previousCondition.trim().length() > 0 && (expression.getPreviousSibling() instanceof Assign || expression.getPreviousSibling() instanceof Loop)){

			loopExression = previousCondition +" + " + loopCondition;
		}else {				

			loopExression = previousCondition + loopCondition;
		}

		return loopExression;

	}

	/**
	 * Method used to identify the level of class based on loop variable 
	 * @param className
	 * @param loopVariable
	 * @return
	 */
	private String getCoverageLevel(String className, String loopVariable) {

		String classType =getClassType(className);
		boolean isParent =false;
		boolean isSibling =false;
		boolean isChild = false;
		boolean isSelf =false;
		int parentCount=0;
		int childCount=0;
		int parentRefrenceCount = 0;
		if (loopVariable != null) {
			String[] loopVariables = loopVariable.split("/");
			for(String value : loopVariables ) {
				if(value.trim().equals("..")) {
					if(classType.equals(RC_CLASS_TYPE_COVERAGE) && parentRefrenceCount != 0) {
						parentRefrenceCount++;
						continue;
					}
					else {
						parentCount++;
						continue;
					}
				}			
				Table  table = dsTables.get(value);
				if(table != null && !table.getType().equals(RC_CLASS_TYPE_COVERAGE)) {
					childCount++;
				}
			}

			if(parentCount > 0 ) {
				isParent =true;
				if(childCount > 0) {
					isParent=false;
					isSibling =true;
				}
			}else {
				if(childCount > 0) {
					isChild =true;
				}
				else {
					isSelf =true;
				}
			}


			if(isParent) {
				return CoverageLevelType.PARENT.name();
			}
			else if(isSibling) {
				return CoverageLevelType.SIBLING.name();
			}
			else if(isChild) {
				return CoverageLevelType.CHILD.name();
			}
			else if(isSelf) {
				return CoverageLevelType.SELF.name();
			}

		}
		return "";


	}

	/**
	 * Function used to handle assignment condition
	 * 
	 * @param ratingExecutable
	 * @param varName
	 * @throws Exception
	 */
	private String handleAssignOnly(Assign ratingExecutable, String className, String pchName, String loopVariable, boolean isStateData) throws Exception {

		return handleAssign(ratingExecutable, className, pchName,loopVariable,isStateData);
	}	


	/**
	 * Method used to evaluate the assignment expression for the PCH
	 * 
	 * @param ratingExecutable
	 * @param className
	 * @param pchName
	 * @param classOfIteratedLocalVar 
	 * @return
	 * @throws Exception
	 */
	private String handleAssign(Assign ratingExecutable, String className, String pchName, String loopVariable, boolean isStateData) throws Exception {
		return evaluateExpressionForYAML(ratingExecutable.getExpression(), className, pchName,loopVariable,false,"",isStateData);
	}

	/**
	 * This function is used to handle if else
	 * 
	 * @param ratingExecutable
	 * @param classOfIteratedLocalVar 
	 * @param parentRule
	 * @throws Exception
	 */
	private String handleIfAndElse(IfAndElse ratingExecutable, String className, String pchName, String loopThroughVariable, boolean isStateData) throws Exception {
		StringBuilder expressionString= new StringBuilder();
		String condition;
		boolean isDirectAssignment =false;// in loop whether the assignment is string constant or aggregate method

		String elsePart="";
		String thenPart = "";
		
		condition = evaluateExpressionForYAML(ratingExecutable.getCondition().getTheCondition(), className,pchName,loopThroughVariable,false,"",isStateData);


		String loopInitailCondition = getLoopInitialConidtion(className, loopThroughVariable,condition,ratingExecutable);


		Reference reference = xmlConstructUtils.findParentReference(ratingExecutable);

		List<RatingExecutable> executablesInThen = ratingExecutable.getThenPart().getStatementsInThen();
		List<RatingExecutable> executablesInElse = null;
		if (ratingExecutable.getElsePart() != null && ratingExecutable.getElsePart().getStatementsInElse() != null) {
			executablesInElse = ratingExecutable.getElsePart().getStatementsInElse();
		}

		for (int i = 0; i < executablesInThen.size(); i++) {
			RatingExecutable executableInThen = executablesInThen.get(i);

			if (executablesInThen.get(i) instanceof Assign) {

				if(canProcessAssign(executableInThen)) {
					thenPart = handleAssign((Assign) executableInThen, className, pchName,loopThroughVariable,isStateData);		
					/**
					 * For loop condition, the string variable assignment is handled differently.
					 */
					isDirectAssignment = isDirectAssignment((Assign)executableInThen);
					if(loopThroughVariable.length() > 0) {	
						if(isDirectAssignment) {
							thenPart = generateStringAssignmentForLoop((Assign)executableInThen,thenPart,loopInitailCondition,condition);
						}
					}
				}

			} else {
				if (executableInThen instanceof Loop) {
					String loopVariable = ((Loop) executableInThen).getThrough();
					//loopInitailCondition = getLoopInitialConidtion(className, loopThroughVariable,condition);
					//isStringAssignment = isStringAssignment(executablesInThen);
					thenPart =handleLoopOnly((Loop) executableInThen, className, pchName,loopVariable,isStateData);
				} else if (executableInThen instanceof IfAndElse) {
					thenPart =handleIfAndElse((IfAndElse) executableInThen, className, pchName,loopThroughVariable,isStateData);
				}
			}
		}



		if(loopThroughVariable.length() == 0) {	

			expressionString.append(thenPart);
			expressionString.append(" ");
			expressionString.append("if");
			expressionString.append(" ");
			expressionString.append("(");
			expressionString.append(condition);
			expressionString.append(")");
		}
		else {			

			if(isDirectAssignment) {				

				expressionString.append(thenPart);
				expressionString.append(" ");
				expressionString.append("if");
				expressionString.append("(");
				expressionString.append(loopInitailCondition);	
				expressionString.append("(");
				expressionString.append(condition);		
				//expressionString.append(")).count() > 0"); // eldho Bracket
				expressionString.append(").count() == 1");
				expressionString.append(")");

			}
			else {

				String conditionalExpression ="";
				if(condition.length() > 0) {
					conditionalExpression = "(" + condition + ")";
				}
				expressionString.append(loopInitailCondition);
				expressionString.append(conditionalExpression);				
				expressionString.append(thenPart);
			}
		}


		if (executablesInElse != null) {
			expressionString.append(" ");
			expressionString.append("else");
			for (int i = 0; i < executablesInElse.size(); i++) {
				if (executablesInElse.get(i) instanceof Assign) {
					elsePart = handleAssign((Assign) executablesInElse.get(i), className, pchName,loopThroughVariable,isStateData);		

				} else {
					if (executablesInElse.get(i) instanceof Loop) {
						loopThroughVariable = ((Loop) executablesInElse.get(i)).getThrough();
						elsePart =handleLoopOnly((Loop) executablesInElse.get(i), className, pchName,loopThroughVariable,isStateData);
					} else if (executablesInElse.get(i) instanceof IfAndElse) {
						elsePart= handleIfAndElse((IfAndElse) executablesInElse.get(i), className, pchName,loopThroughVariable,isStateData);
					}
				}
			}			

			expressionString.append(" ");
			expressionString.append(elsePart);	

		}
		else{
			if(thenPart != null && thenPart.trim().length() > 0) { //If there is only if-then and its an string constant assignment and no else part, we should assign default value
				boolean isStringAssignment = isStringAssignment(executablesInThen);
				if(isStringAssignment) {
					expressionString.append(" ");
					expressionString.append("else ''");
				}
				else
				{
					if(loopThroughVariable.trim().length() == 0 || loopThroughVariable.trim().length() > 0 && isDirectAssignment) { // loop with sum or aggregate function doesn't require else part. This portion is commented because of pch FinalMaxBusnPrsnlPropRate
						expressionString.append(" ");
						expressionString.append("else 0");
					}
				}
			}
		}

		return expressionString.toString();

	}

	/**
	 * Method used to generate string assignment part based on the loop
	 * Verify whether the assignment is String CONSTANT or string XPATH value.
	 * @param executablesInThen
	 * @param thenPart
	 * @param loopInitailCondition
	 * @param condition
	 * @return
	 */
	private String generateStringAssignmentForLoop(Assign assignExpression, String thenPart,
			String loopInitailCondition, String condition) {

		if (assignExpression != null) {

			Expression expression = assignExpression.getExpression();
			if(!expression.getVariableType().equals(ALGVariableType.CONSTANT.name())) {
				String conditionValue = loopInitailCondition;
				if(condition.trim().length() > 0) {
					conditionValue = loopInitailCondition + "(" +condition +")"  ;
				}
				//String assignmentValue = ").get(" + thenPart +")"; //Eldho Bracket
				String assignmentValue = ".get(" + thenPart +")";
				return conditionValue+ assignmentValue;
			}

		} 
		// TODO Auto-generated method stub
		return thenPart;
	}

	/**
	 * Method used to
	 * For loop, there is an initial filter condition based on the iterated loop class
	 * @param className
	 * @param loopThroughVariable
	 * @param condition
	 * @param xmlConstruct 
	 * @return
	 */
	private String getLoopInitialConidtion(String className, String loopThroughVariable, String condition, RatingExecutable expression) {
		String loopInitailCondition ="";
		if(loopThroughVariable.trim().length() > 0) {
			String coverageLevel =getCoverageLevel(className, loopThroughVariable);
			String loopClass = getTheIterated(loopThroughVariable);
			String filterClass = getFilterClass(loopThroughVariable);
			int descendantCount =0;
			String conditionalFilter ="";

			if(expression.getParent() != null && !(expression.getParent() instanceof ThenPart)) {
				if(condition.trim().length()> 0) {
					//conditionalFilter =".filter("; //Eldho bracket
					conditionalFilter =".filter";
				}

				if(coverageLevel.equals(CoverageLevelType.SIBLING.name())) {
					descendantCount = getHierarchyLevelofChildClass(firstHierarchicalClass, loopClass);
					loopInitailCondition ="bc.risk.descendants("+descendantCount+").filter(type__name='"+YAMLUtil.uncapitalizeValue(filterClass)+"')";

				}
				else {
					descendantCount = getHierarchyLevelofChildClass(className, loopClass);
					loopInitailCondition ="bc.risk.descendants("+descendantCount+").filter(type__name='"+YAMLUtil.uncapitalizeValue(filterClass)+"')";

				}
			}
			else {
				if(condition.trim().length()> 0) {
					conditionalFilter =".filter";
				}
			}

			loopInitailCondition= loopInitailCondition+conditionalFilter;
		}
		return loopInitailCondition;
	}


	/**
	 * Get filter class from the loop variable. Skip "coverage" class.
	 * @param loopThroughVariable
	 * @return
	 */
	private String getFilterClass(String loopThroughVariable) {

		if (loopThroughVariable != null && loopThroughVariable.trim().length() > 0) {
			String[] splitIterated = loopThroughVariable.split("/");
			for(int i = splitIterated.length-1 ; i >=0 ; i-- ) {
				String className = splitIterated[i];
				Table  table = dsTables.get(className);
				if(table != null && !table.getType().equals(RC_CLASS_TYPE_COVERAGE)) {
					return className;
				}
			}
		}
		return "";
	}

	/**
	 * This method is used to determine whether the assignment is direct assignment with in the loop.
	 * Direct assignment in loop is handled differently.
	 * @param assignExecutable
	 * @return
	 */
	private boolean isDirectAssignment(Assign assignExecutable) {
		if (assignExecutable != null) {
			Expression assignExpression =assignExecutable.getExpression();
			if(assignExpression.getExpressions() == null) {
				//if(assignExecutable.getVariableType().equals(ALGVariableType.LV_STRING.name()) || assignExecutable.getVariableType().equals(ALGVariableType.COLUMN_STRING.name())) {
				//	return true;
				//}
				//Expression assignExpression =assignExecutable.getExpression();
				if(assignExpression.getOperatorAsInElement() ==null) {
					return true;
				}
			}
		} 	

		return false;
	}

	/**
	 * Method used to identify whether the assignment is string value or not
	 * @param executablesInThen
	 * @return
	 */
	private boolean isStringAssignment(List<RatingExecutable> executablesInThen) {

		for (int i = 0; i < executablesInThen.size(); i++) {
			RatingExecutable executableInThen = executablesInThen.get(i);

			if (executableInThen instanceof Assign) {

				Assign assign = (Assign) executableInThen;
				if(assign.getVariableType() != null) {
					if(assign.getVariableType().equals(ALGVariableType.LV_STRING.name()) || assign.getVariableType().equals(ALGVariableType.COLUMN_STRING.name())) {
						return true;
					}					
				}
			} 
			else if(executableInThen instanceof Loop){

				return isStringAssignment(((Loop)executableInThen).getExecutables());
			}
			else if(executableInThen instanceof IfAndElse) {

				return isStringAssignment(((IfAndElse)executableInThen).getThenPart().getExecutables());
			}
			else {
				System.out.println("Unhandled");
			}



		}

		return false;
	}

	/**
	 * Function used to handle loop conditions
	 * 
	 * @param ratingExecutable
	 * @param loopClass 
	 * @param varName
	 * @throws Exception 
	 */
	private String handleLoopOnly(Loop ratingExecutable, String className, String pchName, String loopThroughVariable, boolean isStateData) throws Exception {

		Reference reference = xmlConstructUtils.findParentReference(((Loop) ratingExecutable).getParent());

		String coverageLevel =getCoverageLevel(className, loopThroughVariable);

		String loopCondition = handleLoop(ratingExecutable, className, pchName,loopThroughVariable,isStateData);

		/**
		 * If the coverage is sibling then we need to write the calculation in TOPMOST class.
		 * The calculation name should have "sbl" value appended
		 */
		if(coverageLevel.equals(CoverageLevelType.SIBLING.name())) {
			String loopCalVariableName = YAMLCompntIdentifier.calc_.name()+YAMLCompntIdentifier.sbl_.name()+pchName+"_"+className;			
			RiskType riskType = (RiskType)getYamlObject(firstHierarchicalClass, YAMLObjectType.RiskType);
			addCalculationToRiskType(riskType, loopCondition, loopCalVariableName);
			return loopCalVariableName;
		}

		return  loopCondition;
	}

	/**
	 * Method used to handle the loop expression for the PCH
	 * 
	 * @param ratingExecutable
	 * @param className
	 * @param pchName
	 * @param loopClass 
	 * @return
	 * @throws Exception 
	 */

	private String handleLoop(Loop ratingExecutable, String className, String pchName, String loopThroughVariable, boolean isStateData) throws Exception {

		Reference parentReference = xmlConstructUtils.findParentReference(ratingExecutable);
		String classOfRef = parentReference.getDbTables();		

		String loopCondition="";
		//String assignXondition
		try {
			for (int i = 0; i < ratingExecutable.getExecutables().size(); i++) {
				RatingExecutable loopRatingExecutable = ratingExecutable.getExecutables().get(i);

				if (loopRatingExecutable instanceof IfAndElse) {					
					loopCondition = loopCondition +  handleIfAndElse((IfAndElse) loopRatingExecutable, className, pchName,loopThroughVariable,isStateData);					

				} else if (loopRatingExecutable instanceof Assign) {
					boolean isDircetAssign =false;
					if(loopCondition.trim().length()==0) {
						loopCondition = getLoopInitialConidtion(className, loopThroughVariable,"",loopRatingExecutable);
						isDircetAssign = isDirectAssignment((Assign) loopRatingExecutable);
					}
					String assignValue= handleAssignOnly((Assign) loopRatingExecutable, className, pchName,loopThroughVariable,isStateData);

					if(isDircetAssign) {
						loopCondition = generateStringAssignmentForLoop((Assign) loopRatingExecutable, assignValue, loopCondition, "");
					}
					else {

						loopCondition = loopCondition + assignValue;
					}

				} else if (loopRatingExecutable instanceof Loop) {
					loopThroughVariable = ((Loop) loopRatingExecutable).getThrough();
					loopCondition = loopCondition + handleLoopOnly((Loop) loopRatingExecutable, className, pchName,loopThroughVariable,isStateData);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return loopCondition;
	}

	/**
	 * Method used to identify whether the assignment can be skipped or not, 
	 * If the first expression is assignment and next expression is loop and 
	 * we are assigning initial value as "0" then we can skip the assignment.
	 * Otherwise we may not able to automate the entire expressions.
	 * @param ratingExecutable
	 * @param elementId
	 * @return
	 */
	private boolean canProcessAssign(RatingExecutable ratingExecutable) {

		if(ratingExecutable.getNextSibling() instanceof Loop  && (((Assign)ratingExecutable).getExpression().getCharacterContent().equals("0.0") || ((Assign)ratingExecutable).getExpression().getCharacterContent().equals("0"))) {
			return false;
		}	
		return true;

	}

	/**
	 * Method used to evaluate the particular expressions for the coverage.
	 * 
	 * @param expression
	 * @param className
	 * @param pchName
	 * @return
	 * @throws Exception
	 */

	public String evaluateExpressionForYAML(Expression expression, String className, String pchName, String loopThroughVariable,boolean isRightEpression,String functionOperatorElement,boolean isStateData) throws Exception {

		String leftExpression = null;
		String rightExpression = null;		
		if (expression == null) {
			return null;
		}

		if (validPrimitiveOperators.contains(expression.getOperatorAsInElement())) {

			if (expression.getExpressions() != null && expression.getExpressions().size() > 0
					&& expression.getExpressions().get(0) instanceof Bracket) {
				if (((Bracket) expression.getExpressions().get(0)).getExpression().getSide().equals("left")) {
					leftExpression = "(" + evaluateExpressionForYAML(
							((Bracket) expression.getExpressions().get(0)).getExpression(), className, pchName,loopThroughVariable,false,functionOperatorElement,isStateData) + ")";
				} else if (((Bracket) expression.getExpressions().get(0)).getExpression().getSide().equals("right")) {
					rightExpression = "(" + evaluateExpressionForYAML(
							((Bracket) expression.getExpressions().get(0)).getExpression(), className, pchName,loopThroughVariable,true,functionOperatorElement,isStateData) + ")";
				}
			}
			if (expression.getExpressions() != null && expression.getExpressions().size() > 1
					&& expression.getExpressions().get(1) instanceof Bracket) {
				if (((Bracket) expression.getExpressions().get(1)).getExpression().getSide().equals("left")) {
					leftExpression = "(" + evaluateExpressionForYAML(
							((Bracket) expression.getExpressions().get(1)).getExpression(), className, pchName,loopThroughVariable,false,functionOperatorElement,isStateData) + ")";
				} else if (((Bracket) expression.getExpressions().get(1)).getExpression().getSide().equals("right")) {
					rightExpression = "(" + evaluateExpressionForYAML(
							((Bracket) expression.getExpressions().get(1)).getExpression(), className, pchName,loopThroughVariable,true,functionOperatorElement,isStateData) + ")";
				}
			}

			if (expression.getLeftExpression() != null) {
				leftExpression = evaluateExpressionForYAML(expression.getLeftExpression(), className, pchName,loopThroughVariable,false,functionOperatorElement,isStateData);
			}

			if (expression.getRightExpression() != null) {
				rightExpression = evaluateExpressionForYAML(expression.getRightExpression(), className, pchName,loopThroughVariable,true,functionOperatorElement,isStateData);
			}


			return generateExpression(expression, className, loopThroughVariable, leftExpression, rightExpression,pchName,functionOperatorElement,isStateData);


		} else if (validFunctionalOperators.contains(expression.getOperatorAsInElement())) {
			Expression functionalExpression = ((Bracket) expression.getExpressions().get(0)).getExpression();
			String functionOperator = functionalOperatorMapping(expression.getOperatorAsInElement());
			if(functionOperator.length() > 0) {
				if(functionOperator.equals("~")) {
					String conditionalValue = evaluateExpressionForYAML(functionalExpression, className, pchName,loopThroughVariable,false,functionOperator,isStateData) ;
					return  "(" + conditionalValue + ")";
				}
				return "(" +functionOperator +"(" + evaluateExpressionForYAML(functionalExpression, className, pchName,loopThroughVariable,false,functionOperator,isStateData) + "))";
			}
			else {
				return "(" + evaluateExpressionForYAML(functionalExpression, className, pchName,loopThroughVariable,false,functionOperatorElement,isStateData) + ")";
			}
		} else if (expression.getExpressions() != null) {
			if (expression.getExpressions().get(0) instanceof Function) {
				Function function = (Function) expression.getExpressions().get(0);
				return handleFunctionExpression(function,className);//getCommaSeperatedArgs(function.getArgs()) + ".size";
			} else if (expression.getExpressions().get(0) instanceof Ratetable) {

				Ratetable rcRatetable = (Ratetable) expression.getExpressions().get(0);
				/**
				 *Generate Ratetable and add Ratetable to Risk type
				 */
				com.nest.erc.yaml.domain.RateTable rateTable = generateRateTableforRisk(rcRatetable, className, pchName, isStateData);				
				addRateTableToRiskType(rateTable,className);

				return rateTable.getName();

			}
		} else if (expression.getExpressions() == null) {
			if (expression.getOperatorAsInElement() != null && expression.getOperatorAsInElement().equals("Subtract")) {
				return null;
			}

			if (expression.getVariableType().equals(ALGVariableType.XPATH.name())) {

				return converALGExPressiontoYAMLExpression(expression, className, loopThroughVariable, isRightEpression, pchName, isStateData);
			} else if (xPathVariableType.contains(expression.getVariableType())) {
				if(loopThroughVariable.length() > 0 && expression.getParent() instanceof Assign ) {
					Assign parentAssign= (Assign) expression.getParent();
					if(parentAssign.getParent() != null && (parentAssign.getParent() instanceof Loop)) {
						//System.out.println("Unhandled loop scenario :" +expression.getCharacterContent() + " class name : " + className + " pch name : "+ pchName);
					}
				}
				return converALGExPressiontoYAMLExpression(expression, className, loopThroughVariable, isRightEpression, pchName, isStateData) ;

			} else if (ordinaryVariables.contains(expression.getVariableType())) {

				return converALGExPressiontoYAMLExpression(expression, className, loopThroughVariable, isRightEpression, pchName, isStateData);
			} else if (expression.getVariableType().equals(ALGVariableType.CONSTANT.name())) {
				if (expression.getCharacterContent().equals("Negative 1")) {
					return "-1";
				}
			}
			return converALGExPressiontoYAMLExpression(expression, className, loopThroughVariable, isRightEpression, pchName, isStateData);
		}
		return null;

	}

	/**
	 * Add ratetable to riskType
	 * @param rateTable
	 * @param className
	 */
	private void addRateTableToRiskType(com.nest.erc.yaml.domain.RateTable rateTable,String className) {
		// TODO Auto-generated method stub

		RiskType riskType = getRiskType(className);

		List<com.nest.erc.yaml.domain.RateTable> rateTables = null;

		if (riskType != null) {
			if (canAddRateTable(riskType.getEntities_order(), rateTable.getName())) {

				rateTables = riskType.getRate_tables();

				if (rateTables == null) {
					rateTables = new ArrayList<com.nest.erc.yaml.domain.RateTable>();
					riskType.setRate_tables(rateTables);
				}				
				rateTables.add(rateTable);
				addRiskTypeEntitiesOrder(riskType, EntityOrderType.RATETABLE, rateTable.getName());
			}
		}

	}

	/**
	 * Create single expression from left side expression and right side expression with operator element.
	 * @param expression
	 * @param className
	 * @param loopVariable
	 * @param leftExpression
	 * @param rightExpression
	 * @return
	 */
	private String generateExpression(Expression expression, String className, String loopThroughVariable,
			String leftExpression, String rightExpression,String pchName,String functionalOperator,boolean isStateData) {

		if(leftExpression.trim().length() >0  || expression.getOperatorAsInElement().trim().length() > 0 || rightExpression.trim().length() > 0) {

			boolean inLoop =loopThroughVariable.length() > 0 ;

			String formattedOperator = formatOperatorElement(expression.getOperatorAsInElement(), inLoop,functionalOperator);
			//Expression parentExpression = expression.getParent()
			if(inLoop) {
				//If multiple of conditions are available in the loop filter condition, we need to handle seperatly.
				if(isPartofMultipleExpression(expression)) {

					return "Q("+leftExpression +  formattedOperator +  rightExpression+")";
				}

				if(expression.getParent() != null && expression.getParent() instanceof Assign ) {
					//The assignment in loop needs to handled separately.
					return getLoopAssignment(expression,leftExpression,rightExpression,className,loopThroughVariable,isStateData,pchName);
				}

				return leftExpression + formattedOperator +  rightExpression;
			}

			if(isCoverageChecking(expression)) {

				return generateCoverageCondition(expression, className, leftExpression, rightExpression,expression.getOperatorAsInElement(),pchName);
			}

			if(expression.getParent() != null && expression.getParent() instanceof Assign) {

				Assign parentExpression = (Assign) expression.getParent();

				if(parentExpression.getPreviousSibling() != null && parentExpression.getPreviousSibling() instanceof Loop) {

					Loop siblingExpression = (Loop) parentExpression.getPreviousSibling() ;

					if(siblingExpression.getNextSibling() != null && siblingExpression.getNextSibling() instanceof Assign) {
						String iVlueExpression = ((Assign)siblingExpression.getNextSibling()).getlValue();
						String variableType = ((Assign)siblingExpression.getNextSibling()).getVariableType();
						String formattedIvalue = appendVariableIdentifier(className, iVlueExpression, variableType, false, "","", true, isStateData, pchName);
						if(formattedIvalue.equals(leftExpression)) {
							return formattedOperator + rightExpression;
						}
					}

				}
			}


			return leftExpression + formattedOperator + rightExpression;
		}
		else {
			return "";
		}
	}

	/**
	 * Method used to identify whether there are multiple conditions available in "if" condition.
	 * @param expression
	 * @return
	 */
	private boolean isPartofMultipleExpression(Expression expression) {

		if(!(expression.getOperatorAsInElement().equals("&&") || expression.getOperatorAsInElement().equals("||"))) {
			Expression parentExpression = null;
			if(expression.getParent() != null && expression.getParent() instanceof Expression) {
				parentExpression =(Expression) expression.getParent();
				if(parentExpression.getOperatorAsInElement() != null) {
					if(parentExpression.getOperatorAsInElement().equals("&&") || parentExpression.getOperatorAsInElement().equals("||")) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Method used to format the Operator element based on different criteria.
	 * @param operatorAsInElement
	 * @param inLoop
	 * @return
	 */
	private String formatOperatorElement(String operatorAsInElement, boolean inLoop,String functionalOperator) {

		String operatorElement = operatorAsInElement;
		if(functionalOperator.equals("~") || functionalOperator.equals("Not")) {
			if(operatorAsInElement.equals("!=")){
				operatorElement = "==";
			}
			else if(operatorAsInElement.equals("==")) {
				operatorElement = "!=";
			}
			else if(operatorElement.equals("||")) {
				operatorElement = "&&";
			}
		}

		if(operatorElement.equals("!=")) {
			if(inLoop) {
				return "__neq= ";				
			}
		}
		else if(operatorElement.equals("==")) {
			if(inLoop) {
				return " = ";
			}
		}
		else if(operatorElement.equals("&&")) {
			if(inLoop) {
				return " & ";
			}
			return " and ";
		}
		else if(operatorElement.equals("||")) {
			if(inLoop) {
				return " | ";
			}
			return " or ";
		}
		else if(operatorElement.equals("Subtract")) {
			return " - ";
		}
		return " " +operatorElement +" ";
	}

	/**
	 * Conversion logic for a class existence check. means" class != null will be converted to ".count() > 0
	 * IF		
		(	
			../BOPApartmentBuildings	XPATH
				Not Equal To	
			null						CONSTANT
		)	

	 * @param expression
	 * @param className
	 * @param leftExpression
	 * @param rightExpression
	 * @param operatorAsInElement
	 * @return
	 */
	private String generateCoverageCondition(Expression expression, String className, String leftExpression,
			String rightExpression, String operatorAsInElement,String pchName) {


		String combineExpression ="";
		String leftCondition = "";
		List<String> expressions = extractSourceNames(leftExpression);
		String coverageLevel = getCoverageLevel(className, leftExpression);
		String xpathClass =expressions.get(expressions.size() -1);
		String formattedXpathValue = YAMLUtil.uncapitalizeValue(xpathClass);
		
		
		
		
		int descendantCount =0;
		String hierarchicalClass = null;
		if(coverageLevel.equals(CoverageLevelType.CHILD.name())) {
			descendantCount = getHierarchyLevelofChildClass(className, xpathClass);				
		}
		else if(coverageLevel.equals(CoverageLevelType.SIBLING.name())){
			
			//get the root class of xpath expression
			int parentCount = 0;
			for(String value : expressions ) {
				if(value.trim().equals("..")) {
					parentCount++;
				}
			}
			hierarchicalClass = getHierarchicalParent(className, parentCount);
			descendantCount = getHierarchyLevelofChildClass(hierarchicalClass, xpathClass);

			//descendantCount = getHierarchyLevelofChildClass(firstHierarchicalClass, xpathClass);	//to-do for checking sibling access		
		}

		leftCondition = "( bc.risk.descendants("+descendantCount+").filter(type__name='"+formattedXpathValue+"').count() )";

		String rightCondition ="";
		if(rightExpression.equals("None")) {
			if(operatorAsInElement.equals("!=")) {			
				rightCondition = "> 0";			
			}
			else if(operatorAsInElement.equals("==")) {
				rightCondition = "== 0";
			}
		}
		combineExpression=  leftCondition + " " + rightCondition;

		/**
		 * If the coverage is sibling then we need to write the calculation in TOPMOST class.
		 * The calculation name should have "sbl" value appended
		 */
		if(coverageLevel.equals(CoverageLevelType.SIBLING.name())) {
			String calVariableName = YAMLCompntIdentifier.calc_.name()+YAMLCompntIdentifier.sbl_.name()+xpathClass+"_"+pchName+"_"+className;
			RiskType riskType = (RiskType)getYamlObject(hierarchicalClass, YAMLObjectType.RiskType);
			//RiskType riskType = (RiskType)getYamlObject(firstHierarchicalClass, YAMLObjectType.RiskType);//to-do for checking sibling access		
			addCalculationToRiskType(riskType, combineExpression, calVariableName);
			return calVariableName;
		}

		return combineExpression;
	}
	/**
	 * @param className
	 * @param parentCount
	 */
	private String getHierarchicalParent(String className, int parentCount) {
		if(parentCount>0) {
			Table table = dsTables.get(className);
			String ParentTable = table.getParentTableName();
			parentCount = parentCount-1;
			return getHierarchicalParent(ParentTable, parentCount);
		}else {
		return className;
		}
		
	}

	/**
	 * 
	 * @param expression
	 * @return
	 */
	private boolean isCoverageChecking(Expression expression) {
		Expression leftExpression = expression.getLeftExpression();
		if(leftExpression != null  && leftExpression.getVariableType() != null) {
			if(leftExpression.getVariableType().equals(ALGVariableType.XPATH.name())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Method to generate loop assignment syntax
	 * @param expression
	 * @param leftExpression
	 * @param rightExpression
	 * @param className
	 * @param loopVariable
	 * @return
	 */
	private String getLoopAssignment(Expression expression, String leftExpression, String rightExpression,String className,String loopThroughVariable,boolean isStateData, String pchName) {
		Assign assignExpression =(Assign) expression.getParent();
		String lValue = assignExpression.getlValue();
		String operatorAsInElement=expression.getOperatorAsInElement();
		String variableType = assignExpression.getVariableType();
		String formattedlValue = appendVariableIdentifier(className, lValue, variableType, false, "","",false,isStateData,pchName);
		String bracketString="";
		/**
		 * Close filter conditional bracket at the end the conditions.
		 */
		if(assignExpression.getParent() != null && assignExpression.getParent() instanceof ThenPart) {
			//bracketString=")"; //Eldho Bracket
		}
		if(formattedlValue.equals(leftExpression) && operatorAsInElement.equals("+")) {
			if(!YAMLUtil.isNumeric(rightExpression)) {
				/*
				 * String answerVariable = "field_answers.";
				 * if(rightExpression.startsWith(YAMLCompntIdentifier.calc_.name())){
				 * answerVariable = "calculations."; }
				 */
				String answerVariable = appendYAMLVariableType(rightExpression,"");
				return bracketString+".sum("+answerVariable+rightExpression+")";
			}
			else {

				return bracketString+".count()";
			}
		}
		return "";
	}

	/**
	 * Method used to generate ALG expression to corresponding YAML python expression
	 * @param characterContent
	 * @param variableType
	 * @param className
	 * @return
	 */
	private String converALGExPressiontoYAMLExpression(Expression expression, String className, String loopThroughVariable, boolean isRightEpression, String pchName, boolean isStateData) {
		String characterContent = expression.getCharacterContent();
		String variableType = expression.getVariableType();
		boolean isCoverageVariable =false;
		String loopClass = getTheIterated(loopThroughVariable);
		if(characterContent.equals("../State[Id=../StateId]/Name")) {
			return "'AL'";
		}
		if(!characterContent.equals("../State[Id=../StateId]/Name")) { //Need to handle separately.


			List<String> expressions= new ArrayList<String>();
			String leftExpressionField ="";
			String leftExpressionFieldClass ="";
			//Find the variable Field of Left expression
			if(isRightEpression && variableType.equals(ALGVariableType.CONSTANT.name()) ) {

				String characterOfleftExpression = expression.getPreviousSibling() != null ? expression.getPreviousSibling().getCharacterContent() != null ? expression.getPreviousSibling().getCharacterContent():"":"";
				if(characterOfleftExpression.trim().length() > 0) {
					List<String> leftexpressionFields =  extractSourceNameForLoop(characterOfleftExpression,loopClass);
					List<String> leftSourceList = extractSourceNames(characterOfleftExpression);
					if(leftSourceList.size() ==1) {
						isCoverageVariable = true;
					}
					else {
						leftExpressionField = leftexpressionFields.get(leftexpressionFields.size()-1);
						leftExpressionFieldClass =getParentClassName(className, leftSourceList);
					}
				}
			}

			if(loopClass.length() > 0) {

				if(variableType.equals(ALGVariableType.CONSTANT.name())){
					expressions.add(characterContent);
				}
				else {
					expressions= extractSourceNameForLoop(characterContent,loopClass);
				}
				String formattedFieldName="";
				if(expressions.size() > 0) {	

					if(characterContent.contains(loopClass)) { //Format Loop Coverage Variable
						formattedFieldName=appendVariableIdentifier(loopClass, expressions.get(expressions.size() -1), variableType,isRightEpression,leftExpressionField,leftExpressionFieldClass,isCoverageVariable,isStateData,pchName);

						if(isRightEpression) {
							return formattedFieldName;
						}

						if(expression.getParent() instanceof Assign ) {

							Assign loopAssign = (Assign) expression.getParent();

							if(loopAssign != null) {
								if(loopAssign.getVariableType().equals(ALGVariableType.COLUMN_STRING.name())) {

									String answerVariable = appendYAMLVariableType(formattedFieldName,"");
									return answerVariable+formattedFieldName;
								}
							}
						}

						String answerVariable = appendYAMLVariableType(formattedFieldName,"filter");

						return answerVariable+formattedFieldName;
					}
					else {
						//Constant values or PCH Coverage Variable
						if(!variableType.equals(ALGVariableType.CONSTANT.name())) { // if loop variable not contains and variable type is not constant
							isCoverageVariable =true;
						}
						if(isCoverageVariable ) {
							formattedFieldName=appendVariableIdentifier(className, expressions.get(expressions.size() -1), variableType,isRightEpression,leftExpressionField,leftExpressionFieldClass,isCoverageVariable,isStateData,pchName);
						}
						else {
							formattedFieldName=appendVariableIdentifier(loopClass, expressions.get(expressions.size() -1), variableType,isRightEpression,leftExpressionField,leftExpressionFieldClass,isCoverageVariable,isStateData,pchName);
						}
						return formattedFieldName;
					}

				}

			}
			else {	

				expressions= extractSourceNames(characterContent);

				if(variableType.equals(ALGVariableType.XPATH.name())) {  			

					/**
					 * XPATH means coverage class checking, both left and right needs to be handled combines.
					 * Logic written in method "generateCoverageCondition"
					 */

					return characterContent;
				}
				else {

					if(expressions.size() ==1) {	

						return	appendVariableIdentifier(className, expressions.get(0), variableType,isRightEpression,leftExpressionField,leftExpressionFieldClass,isCoverageVariable,isStateData,pchName);

					}
					else if(expressions.size() > 1)
					{

						String fieldName= expressions.get(expressions.size() -1);	


						String coverageClass=getParentClassName(className, expressions);
						String formattedFieldName = appendVariableIdentifier(coverageClass, fieldName, variableType,isRightEpression,leftExpressionField,leftExpressionFieldClass,isCoverageVariable,isStateData,pchName);		
						
						if(null != expressions && expressions.size() > 1 && expressions.get(0).contains("ancestor::") && expressions.get(1).equals("EffDate")) {
						//if(formattedFieldName.contains("ancestor::")) {// revisit
							int firstIdx = expressions.get(0).indexOf("'");//formattedFieldName.indexOf("'");
							int secondIdx = expressions.get(0).indexOf("'", firstIdx + 1);//formattedFieldName.indexOf("'", firstIdx + 1);
							String parent = expressions.get(0).substring(firstIdx+1, secondIdx);//formattedFieldName.substring(firstIdx+1, secondIdx);
							if(null != parent && parent.matches("Policy|Quote") && null != fieldName && fieldName.equals("EffDate")) {
								return "bc.policyTermEffectiveDate"; 
							}
						}
						
						String coverageLevel = getCoverageLevel(className, characterContent);

						/**
						 * Parent field can be accessed directly with variable name. For child it should be taken by filter syntax.
						 */
						if(coverageLevel.equals(CoverageLevelType.PARENT.name()) || coverageLevel.equals(CoverageLevelType.SELF.name())) {
							return  formattedFieldName;
						}else if(coverageLevel.equals(CoverageLevelType.SIBLING.name())) {
							String coverageName = YAMLUtil.uncapitalizeValue(coverageClass);	
							String fieldVariableType = getVariableType(coverageClass, fieldName).toUpperCase();
							
							int parentCount = 0;
							for(String value : expressions ) {
								if(value.trim().equals("..")) {
									parentCount++;
								}
							}
							
							String hierarchicalClass = getHierarchicalParent(className, parentCount);
							int descendantCount = getHierarchyLevelofChildClass(hierarchicalClass, coverageClass);
							
							String elseValue ="";
							if(fieldVariableType.equals(DomainVariableType.INT.name()) || fieldVariableType.equals(DomainVariableType.INTEGER.name()) || fieldVariableType.equals(DomainVariableType.DECIMAL.name())){
								elseValue ="0";
							}
							else if(fieldVariableType.equals(DomainVariableType.NVARCHAR.name())) {
								elseValue = "\"\"";
							}
							String answerVariable = appendYAMLVariableType(formattedFieldName,"");
							String variableName = "( bc.risk.descendants("+ descendantCount +").filter(type__name='"+coverageName+"').get("+answerVariable+formattedFieldName+") if bc.risk.descendants("+descendantCount+").filter(type__name='"+coverageName+"').count() == 1 else "+elseValue +" )";
							
							
							String calVariableName = YAMLCompntIdentifier.calc_.name()+YAMLCompntIdentifier.sbl_.name()+fieldName+"_"+coverageClass+"_"+pchName+"_"+className;
							RiskType riskType = (RiskType)getYamlObject(hierarchicalClass, YAMLObjectType.RiskType);
							//RiskType riskType = (RiskType)getYamlObject(firstHierarchicalClass, YAMLObjectType.RiskType);//to-do for checking sibling access		
							addCalculationToRiskType(riskType, variableName, calVariableName);
							return calVariableName;
						}
						else if(coverageLevel.equals(CoverageLevelType.CHILD.name()))
						{ 

							String coverageName = YAMLUtil.uncapitalizeValue(coverageClass);	
							String fieldVariableType = getVariableType(coverageClass, fieldName).toUpperCase();
							String elseValue ="";
							if(fieldVariableType.equals(DomainVariableType.INT.name()) || fieldVariableType.equals(DomainVariableType.INTEGER.name()) || fieldVariableType.equals(DomainVariableType.DECIMAL.name())){
								elseValue ="0";
							}
							else if(fieldVariableType.equals(DomainVariableType.NVARCHAR.name())) {
								elseValue = "\"\"";
							}

							/*
							 * String answerVariable = "field_answers.";
							 * if(formattedFieldName.startsWith(YAMLCompntIdentifier.calc_.name())){
							 * answerVariable = "calculations."; }
							 */

							String answerVariable = appendYAMLVariableType(formattedFieldName,"");
							String variableName = "( bc.risk.descendants("+ (expressions.size() - 1) +").filter(type__name='"+coverageName+"').get("+answerVariable+formattedFieldName+") if bc.risk.descendants("+(expressions.size() - 1)+").filter(type__name='"+coverageName+"').count() == 1 else "+elseValue +" )";

							//System.out.println(variableName);
							return variableName;
						}
						else {
							return "";
						}


					}
				}

			}
		}

		return characterContent;
	}

	/**
	 * Method used to identify the YAML variable type based on the access type.
	 * @param formattedFieldName
	 * @return
	 */
	private String appendYAMLVariableType(String formattedFieldName ,String accesstype) {

		String answerVariable="";
		if(accesstype.equals("filter")) {
			//String answerVariable = "field_answers__";
			answerVariable = "fields__";
			if(formattedFieldName.startsWith(YAMLCompntIdentifier.calc_.name())){
				answerVariable = "calculations__";
			}

		}
		else {
			answerVariable = "bc.fields.";
			if(formattedFieldName.startsWith(YAMLCompntIdentifier.calc_.name())){
				answerVariable = "bc.calculations.";
			}
		}
		return answerVariable;
	}

	/**
	 * Identify parent class with current class name and parent path count.
	 * @param className
	 * @param parentPathCount
	 * @return
	 */
	private String getParentClassName(String className,List<String> expressions) {
		String parentClass="";
		if(expressions.size() > 1) {

			parentClass= expressions.get(expressions.size() -2);
			/**
			 * Xpath is accessing direct parent variable so need to identify the coverage class for the variable
			 */

			if(parentClass.equals("..")) {	
				int parentPathCount = expressions.size() -1;
				RiskItem riskItem = null;
				RiskType riskType = (RiskType) getYamlObject(className, YAMLObjectType.RiskType);
				if(riskType == null) {
					riskItem = (RiskItem) getYamlObject(className, YAMLObjectType.RiskItem);								
				}

				for(int i = 0; i < parentPathCount ; i++) {
					if(riskType == null) {
						riskType = getParentRiskType(riskItem);
					}
					else {
						riskType = getParentRiskType(riskType);
					}
				}

				if(riskType == null) {
					return parentClass;
				}
				else {
					parentClass =riskType.getLabel();			

				}
				return parentClass;
			}
		}
		else {
			return parentClass;
		}
		return parentClass;
	}

	private RiskType getParentRiskType(RiskItem riskItem) {

		return riskItem.getParentRiskType();
	}

	private RiskType getParentRiskType(RiskType riskType) {

		return riskType.getParentRisk();
	}

	/**
	 * Get Variable Type from DS table based on class name and variable name
	 * @param className
	 * @param variableName
	 * @return
	 */
	private String getVariableType(String className, String variableName) {

		String[] variableNames = null;
		String tempClassName = className;
		String tempVariableName=variableName;
		if(variableName.contains("/")) {
			variableNames = variableName.split("/");
		}
		else {
			variableNames = variableName.split("\\.");
		}

		if (variableNames.length == 2) {
			// format should be - variable name + class name
			tempClassName =variableNames[0] ;
			tempVariableName = variableNames[1] ;
		}

		Table dsTable =dsTables.get(tempClassName);

		if(dsTable != null) {
			List<Column> columnList = dsTable.getColumnList();

			for(Column column : columnList) {

				if(column.getName().equalsIgnoreCase(tempVariableName)) {
					return column.getDataType();				
				}
			}
		}
		else {
			//System.out.println("className : " +className);
		}

		return "";

	}

	/**
	 * Append variable type info in Variable value for making the variable name unique.
	 * @param className
	 * @param value
	 * @param variableType
	 * @param isRightEpression 
	 * @param leftExpressionField 
	 * @param leftExpressionFieldClass 
	 * @param isCoverageVariable 
	 * @return
	 */

	private String appendVariableIdentifier(String className, String value,String variableType, boolean isRightEpression, String leftExpressionField, String leftExpressionFieldClass, boolean isCoverageVariable, boolean isStateData, String pchName) {

		String fieldValue =value;
		if(variableType.equals(ALGVariableType.CONSTANT.name())) {
			
			if(value.equals("null")){

				return "None";
			}

			if(leftExpressionField.equals("EachOccLimit")) {
				//System.out.println("EachOccLimit");
			}
			String expressionValue = value.replace('"', ' ').trim();				
			boolean isNumeric = YAMLUtil.isNumeric(expressionValue);

			if(isRightEpression) {

				if(isNumeric) {		
					expressionValue = expressionValue.replace(",", "");
					if(leftExpressionField.trim().length() > 0) {
						Field field =getRiskField(leftExpressionFieldClass, leftExpressionField, isStateData);
						if(field != null) {
							if(field.getType().equalsIgnoreCase(RCFieldType.SELECT.name())){
								isNumeric =false;
							}
						}
					}

				}
				if( expressionValue.trim().length() > 0  && !isNumeric && !isCoverageVariable){		
					String expressionFieldType = getVariableType(leftExpressionFieldClass, leftExpressionField, variableType, isStateData);

					String formattedVariableName1 = formatVariableName(leftExpressionField, className, expressionFieldType,pchName);//revisit
					String type ="calculations";
					if(expressionFieldType.equals("field") || expressionFieldType.equals(ALGVariableType.UI.toString())){
						type ="field";
					}
					String formattedVariableName = formattedVariableName1;
					if(!isMatchLengthCriteria(formattedVariableName1)) {
						MappingRow mappingRow = getMappingName(className, type, leftExpressionField, formattedVariableName1);
						formattedVariableName = mappingRow.getMappedTypeName();
					}
					if(expressionFieldType.equals("field")) {
						// creating name of the Risk field option value 
						return getRiskFieldOptionValueName(className,leftExpressionField,formattedVariableName,expressionValue,isStateData);
					}
					else {
						return "'"+expressionValue+"'";
					}

				}
			}
			else {

			}

			if(!isNumeric) {		
				return "'"+expressionValue+"'";
			}
			return value ;
		}

		String actualVariableType =getVariableType(className, value, variableType,isStateData);
		String formattedName = formatVariableName(fieldValue, className, actualVariableType, pchName); 
		if(!isMatchLengthCriteria(formattedName)) {
			MappingRow mappingRow = getMappingName(className, actualVariableType, fieldValue, formattedName);
			return mappingRow.getMappedTypeName() ;//revisit
		}
		return formattedName;

	}

	/**
	 * Converting ALG specific variable type to Briteline specific variable type.
	 * @param className
	 * @param variableValue
	 * @param variableType
	 * @return
	 */
	private String getVariableType(String className , String variableValue, String variableType, boolean isStateData) {
		
		checkPchExist(className, variableValue);

		if(variableType.equals("UI")) {
			return "field";
		}
//		else if(checkPchExist(className, variableValue)) {
//			return "calculations";
//		}
		else if(checkFieldExist(className, variableValue, isStateData)) {
			return "field";
		}
		else {
			return "calculations";
		}
	}
	private boolean checkPchExist(String className, String variableValue) {
		List<ClassComponent> classComponents = flowClassComponents.get(className);
		Lob lobDetails = (Lob) flowClassReference.getParent();
		if (classComponents != null) {
			for (ClassComponent classComponent : classComponents) {
				if (classComponent.getVariables() != null) {

					Reference matchedReference = lobDetails.getReferenceFromDbTablesAndType(className, classComponent.getType());
					for (FlowVariable flowVariable : classComponent.getVariables()) {	

						if(!flowVariable.getName().equals("PremiumIndicator")){		 // No need to add Premium Indicator in Calculations

							Pch matchedPch = matchedReference.getScope(className, flowVariable.getPass())
									.getPch(flowVariable.getName());
							String pchName = flowVariable.getName();
							if(pchName.equals(variableValue)) {
								return true;
							}
						}
					}
				}
				
			}
		}
		return false;
	}

	/**
	 * Method used to get the formatted value of the field opt
	 * @param className
	 * @param leftExpressionField
	 * @param formattedFieldName
	 * @param value
	 * @return
	 */
	private String getRiskFieldOptionValueName(String className, String leftExpressionField, String formattedFieldName, String value, boolean isStateData) {
		//RiskType riskType = (RiskType) getYamlObject(className, YAMLObjectType.RiskType);
		String fieldValue = value.replace('"', ' ').trim();
		if(fieldValue.trim().length() > 0) {

			Form form = rcForms.get(className);
			Field rcField =null;
			if(form != null) {				

				if(form.getType().equals("Summary")) {
					List<Forms> formsList = form.getFormsList();

					for(Forms formsDetail : formsList) {
						Form formDetail =formsDetail.getForm();
						if(formDetail != null && formDetail.getType().equals("Detail")) {
							form = formDetail;
						}
					}
				}


				List<Field> formFields = form.getFieldList();
				if(formFields != null) {
					for(Field field : formFields) {
						if(field.getColumnName().equals(leftExpressionField) ) {
							//if(!field.getType().equals("summary")) {
							rcField =field ;
							break;
							//}
						}

					}
				}
			}

			if(rcField != null) {
				DomainTable domainTable = rcField.getDomainTable();
				if (domainTable == null) { // Why domain table is null, need to check later. Eldho
					if(isStateData) {
						domainTable = rcDomainTables.get(rcField.getDomainTableName());
					}else {
						domainTable = rcDomainTablesCW.get(rcField.getDomainTableName());
					}
				}

				if (domainTable != null) {

					List<DomainTableEntry> domainTableEntries = domainTable.getDomainTableEntryList();

					for (DomainTableEntry domainTableEntry : domainTableEntries) {

						if(domainTableEntry.getDisplayValue().equals(fieldValue)) {
							String enumDataValue = YAMLUtil.trimAllWhitespace(domainTableEntry.getDataValue().replaceAll(",", ""));			

							String formattedOptionValue = YAMLUtil.generateDomainOptionNameValue( formattedFieldName ,enumDataValue,null);
							return "'"+formattedOptionValue+"'";


						}

					}
				}		
			}
		}
		return "'"+formattedFieldName+"_"+fieldValue+"'";
	}

	/**
	 * Method used to handle "function" type expressions
	 *   <function type="Count">
             <arg number="1">BOPTenantsLiability</arg>
         </function>
	 * @param function
	 * @return
	 */
	private String handleFunctionExpression(Function function,String className) {

		String commaSeperatedArgs = "";
		List<Argument> args=function.getArgs();
		for (Argument arg : args) {
			if (commaSeperatedArgs.length() == 0) {
				commaSeperatedArgs += createValueForFunctionExpression(function,arg,className);
			} else {
				commaSeperatedArgs += ", "  + createValueForFunctionExpression(function,arg,className);
			}
		}
		return commaSeperatedArgs;
		// TODO Auto-generated method stub

	}


	/**
	 * Method used to create calculation value for "Function" expression.
	 * @param function
	 * @param arg
	 * @return
	 */
	private String createValueForFunctionExpression(Function function,Argument arg,String className) {

		String functionType =function.getType();
		String[] arguments = arg.getCharacterContent().split("/");

		//boolean parentArgument =false;
		String variableName="";
		String countClass= arguments[arguments.length -1];
		String countClassName = YAMLUtil.uncapitalizeValue(countClass);

		if(functionType.equals(ERCFunctionType.Count.toString())) {					

			int descendantCount = getHierarchyLevelofChildClass(className, countClass);

			return  "( bc.risk.descendants("+descendantCount+").filter(type__name='"+countClassName+"').count() )";

		}

		return variableName;

	}

	/**
	 * Method used to add calculation to the given RiskType.
	 * @param riskType
	 * @param calculationValue
	 * @param variableName
	 */

	private void addCalculationToRiskType(RiskType riskType, String calculationValue,String variableName) {
		
		if(null!=variableName && variableName.length() > 250) {
			List<String> msgs = new ArrayList<String>();
			msgs.add("Calculation");
			msgs.add(variableName);
			msgs.add(riskType.getLabel());
			msgs.add("Calculation name length > 250");
			logs.put(variableName, msgs);
		}

		if(!checkRiskTypeEntitiesOrderExist(riskType, EntityOrderType.CALCULATION, variableName)) {

			Calculation calculation = new Calculation();
			calculation.setCalculation(calculationValue.trim());//AMF calculation.setCalculation("1");
			calculation.setDeleted(false);
			calculation.setName(variableName);
			riskType.addCalculation(calculation);
			addRiskTypeEntitiesOrder(riskType, EntityOrderType.CALCULATION, variableName);

		}
	}


	/**
	 * Update RateTable details for the PCH in corresponding RiskType class.
	 * 
	 * @param rateTable
	 * @param className
	 * @param pchName
	 */

	private com.nest.erc.yaml.domain.RateTable generateRateTableforRisk(Ratetable rateTable, String className, String pchName, boolean isStateData) {
		
		String rateTableName = rateTable.getCode().trim();
		
		if(null != rateTablemap.get(rateTableName+className)) {
			//System.out.println("here");
		}else {
			rateTablemap.put(rateTableName+className, rateTableName);
		}


		String formattedRateTableName = formatRateTable(rateTableName, className, pchName);

		com.nest.erc.yaml.domain.RateTable yamlRateTable = new com.nest.erc.yaml.domain.RateTable();

		if (rateTable.getArgs() != null) {
			yamlRateTable.setSources(addRateTableSource(rateTableName, rateTable.getArgs(), className, isStateData, pchName));
		}
        
		if(null!=formattedRateTableName && formattedRateTableName.length() > 250) {
			List<String> msgs = new ArrayList<String>();
			msgs.add("Rate Table Name");
			msgs.add(formattedRateTableName);
			msgs.add(className);
			msgs.add("Rate Table name length > 250");
			logs.put(formattedRateTableName, msgs);
		}
		
		yamlRateTable.setName(formattedRateTableName);
		yamlRateTable.setLabel(rateTableName);
		yamlRateTable.setDeleted(false);
		yamlRateTable.setData_file(rateTableName + ".json");

		return yamlRateTable;

	}


	private String formatRateTable(String rateTableName,String className,String pchName) {

		//return YAMLCompntIdentifier.rt_.name()+rateTableName +"_"+ pchName +"_"+className;//revisit
		
		String formattedName = YAMLCompntIdentifier.rt_.name()+rateTableName +"_"+ pchName +"_"+className;
		if(!isMatchLengthCriteria(formattedName)) {
			MappingRow mappingRow =  getMappingName(className, "RateTable", rateTableName, formattedName);
			return mappingRow.getMappedTypeName();
		}
		return formattedName;
	}

	private List<RateTableSource> addRateTableSource(String rateTableName, List<Argument> arguments, String className, boolean isStateData, String pchName) {

		List<RateTableSource> rateTableSources = new ArrayList<RateTableSource>();
		int i = 0;
		for (Argument argument : arguments) {
			String coverageClass = className;
			RateTableSource rateTableSource = new RateTableSource();
			String forattedSourceName="";
			String originalSourceName = argument.getCharacterContent().trim();
			String sourceName = originalSourceName;
			boolean domainTableExist=false;

			List<String> sourceList = extractSourceNames(sourceName);
			if (sourceList.size() == 1) { //Direct field or one of its Parent's field
				sourceName = sourceList.get(0);
			} else {			

				coverageClass= getParentClassName(className, sourceList);
				sourceName = sourceList.get(sourceList.size() -1);				

			}

			if (argument.getVariableType().equals(ALGVariableType.UI.toString())) {
				String forattedSourceName1 = formatVariableName(sourceName, coverageClass, ALGVariableType.UI.toString(),"");//revisit
				forattedSourceName = forattedSourceName1;
				if(!isMatchLengthCriteria(forattedSourceName1)) {
					MappingRow mappingRow = getMappingName(coverageClass, "field", sourceName, forattedSourceName1);
					forattedSourceName = mappingRow.getMappedTypeName();
				}
				rateTableSource.setName(forattedSourceName);
			} else if (argument.getVariableType().equals(ALGVariableType.CONSTANT.toString())) {

				sourceName = sourceName.replace('"', ' ').trim();				
				//add constant variable
				forattedSourceName = YAMLCompntIdentifier.calc_constantkey_.name()+ rateTableName;

				String regEx ="[+-]?\\d+";
				Pattern pattern =Pattern.compile(regEx);
				boolean isInt = pattern.matcher(sourceName).matches();

				rateTableSource.setName(forattedSourceName);
				String calculation="";
				if(!isInt) { //&& sourceName.length() == 1 commented this checking constant have more than one length eg: Other Than Collision
					calculation= "'"+sourceName+"'";
				}				
				else {
					calculation= sourceName;
				}
				RiskType riskType = (RiskType) getYamlObject(firstHierarchicalClass, YAMLObjectType.RiskType);
				addCalculationToRiskType(riskType,calculation,forattedSourceName);
				addTierValuesForRateTable(rateTableSource, rateTableName, i);
				rateTableSource.setResolution(RateTableDefault.map.toString());

			}
			// This code is for holding xpath rate table argument when we write all coverage
			else if (argument.getVariableType().equals(ALGVariableType.XPATH.toString()) || xPathVariableType.contains(argument.getVariableType())) {
				//get the root class of xpath expression
				

				String coverageLevel =getCoverageLevel(className, originalSourceName);
				/**
				 * If the coverage is sibling then we need to write the calculation in TOPMOST class.
				 * The calculation name should have "sbl" value appended
				 */
				if(coverageLevel.equals(CoverageLevelType.SIBLING.name())) {
					
					
					int parentCount = 0;
					List<String> expressions = extractSourceNames(argument.getCharacterContent());
					for(String value : expressions ) {
						if(value.trim().equals("..")) {
							parentCount++;
						}
					}
					String hierarchicalClass = getHierarchicalParent(className, parentCount);
					//RiskType riskType = (RiskType)getYamlObject(firstHierarchicalClass, YAMLObjectType.RiskType); // commented for sibling logic change, instead of putting in top class find the parent class and assign
					RiskType riskType = (RiskType)getYamlObject(hierarchicalClass, YAMLObjectType.RiskType);
					
					String loopClass = getTheIterated(originalSourceName);
					String filterClass = getFilterClass(originalSourceName);
					//int descendantCount = getHierarchyLevelofChildClass(firstHierarchicalClass, loopClass);// commented for sibling logic change, instead of putting in top class find the parent class and assign
					int descendantCount = getHierarchyLevelofChildClass(hierarchicalClass, loopClass);
					String loopCalVariableName = YAMLCompntIdentifier.calc_.name()+YAMLCompntIdentifier.sbl_.name()+sourceName+"_"+filterClass;	
					rateTableSource.setName(loopCalVariableName);
					rateTableSource.setResolution(RateTableDefault.map.toString());
					addTierValuesForRateTable(rateTableSource, rateTableName, i);
					addRateTableReferenceCalculation(filterClass, descendantCount, sourceName,"\"\"", riskType);
					
					//addCalculationToRiskType(riskType, loopCondition, loopCalVariableName);
					//return loopCalVariableName;
				}else {
					
					forattedSourceName = appendVariableIdentifier(coverageClass, sourceName, argument.getVariableType().toString(), false, "","", false, isStateData,pchName);
					rateTableSource.setName(forattedSourceName);
					rateTableSource.setResolution(RateTableDefault.map.toString());
				}
				
			}
			else {
				forattedSourceName = appendVariableIdentifier(coverageClass, sourceName, argument.getVariableType().toString(), false, "","", false, isStateData, pchName);
				rateTableSource.setName(forattedSourceName);
				rateTableSource.setResolution(RateTableDefault.map.toString());
				if(forattedSourceName.startsWith(YAMLCompntIdentifier.calc_.toString())) {
					addTierValuesForRateTable(rateTableSource, rateTableName, i);
				}
			}

			/**
			 * Adding tier values for non "SELECT" UI field.
			 */


			Field field =getRiskField(coverageClass, sourceName, isStateData);			
			if(field != null) {
				if(field.getType().equals(RCFieldType.SELECT.name())) {
					domainTableExist = true;
				}
			}

			rateTableSource.setResolution(RateTableDefault.map.toString());
			if (!domainTableExist) {			
				addTierValuesForRateTable(rateTableSource, rateTableName, i);
				rateTableSource.setResolution(RateTableDefault.map.toString());
			}

			rateTableSources.add(rateTableSource);
			i++;

		}

		return rateTableSources;
	}
	/**
	 * create a new calculation which refer the value of field in sibling
	 * @param className
	 * @param descendantsCount
	 * @param fieldName
	 * @param defaultValue
	 * @param riskType
	 */
	private void addRateTableReferenceCalculation(String className,int descendantsCount, String fieldName, String defaultValue, RiskType riskType) {
		String calculatedValue = "bc.risk.descendants("+descendantsCount+").filter(type__name='"+YAMLUtil.uncapitalizeValue(className)+"').get(bc.fields."+fieldName+") if bc.risk.descendants("+descendantsCount+").filter(type__name='"+YAMLUtil.uncapitalizeValue(className)+"').count() == 0 else "+defaultValue+"";
	    Calculation calculation = new Calculation();
	    calculation.setName(YAMLCompntIdentifier.calc_.name()+YAMLCompntIdentifier.sbl_.name()+fieldName+"_"+className);
	    calculation.setCalculation(calculatedValue);
	    calculation.setDeleted(false);
	    riskType.getCalculations().add(calculation);
	    
	    String var = YAMLCompntIdentifier.calc_.name()+YAMLCompntIdentifier.sbl_.name()+fieldName+"_"+className;
	    if(null!=var && var.length() > 250) {
			List<String> msgs = new ArrayList<String>();
			msgs.add("Calculation");
			msgs.add(var);
			msgs.add(className);
			msgs.add("Calculation name length > 250");
			logs.put(var, msgs);
		}

	}
	private boolean is_field_exist(String fieldName, String className) {
		RiskType riskType = getRiskType(className);
		List<RiskField> fieldList = riskType.getFields();
		if(null!=fieldList) {
			for(RiskField riskField:fieldList) {
				if(riskField.getName().equals(fieldName)) {
					return true;
				}
			}
		}
		return false;
	}
	private boolean is_calculation_exist(String fieldName, String className) {
		RiskType riskType = getRiskType(className);
		List<Calculation> calculations = riskType.getCalculations();
		if(null!=calculations) {
			for(Calculation calculation:calculations) {
				if(calculation.getName().equals(fieldName)) {
					return true;
				}
			}
		}
		return false;
	}

	private List<String> extractSourceNames(String sourceName) {
		String[] sourceTempList = sourceName.split("/");
		List<String> sourceList = new ArrayList<String>();	
		for (String source : sourceTempList) {			
			sourceList.add(source);			
		}
		return sourceList;
	}

	private List<String> extractSourceNameForLoop(String sourceName, String loopVariable) {
		String[] sourceTempList = sourceName.split("/");
		List<String> sourceList = new ArrayList<String>();
		boolean canAddSource = false;
		for (String source : sourceTempList) {
			if (!source.equals("..")) {

				if(!loopVariable.equals(source)) {
					canAddSource = true;
				}
				else {
					canAddSource = false;
				}
				if(canAddSource) {
					sourceList.add(source);
				}


			}
		}
		return sourceList;
	}

	/**
	 * Duplicate checking for the RateTable
	 */
	private boolean canAddRateTable(RiskTypeEntitiesOrder entitiesOrder, String rateTableName) {

		if (entitiesOrder != null) {
			List<String> entityTables = entitiesOrder.getRate_tables();
			if (entityTables != null) {

				if (entityTables.contains(rateTableName)) {
					return false;
				} else {
					return true;
				}
			}
		}
		return true;
	}

	/**
	 * Setting tier values to Rate Table.
	 * @param rateTableSource
	 * @param rateTableName
	 * @param argument
	 */
	private void addTierValuesForRateTable(RateTableSource rateTableSource, String rateTableName, int argument) {
		//System.out.println("Adding tierValues rateTableName :" + rateTableName + "ArgumentName : " + argument);
		Map<Integer, List<String>> tierValuesMap = rcRateTableCodeList.get(rateTableName);
		if (tierValuesMap != null) {
			List<String> tierValues = tierValuesMap.get(argument);
			if (tierValues != null) {
				rateTableSource.setTier_values(tierValues);
			}
		}

	}

	/**
	 * 
	 * @param loop
	 * @return
	 */

	private String getReferenceFromLoopClass(Loop loop) {
		if (loop != null) {
			String through = loop.getThrough();
			return getTheIterated(through);
		}
		return null;
	}

	/**
	 * 
	 * @param iterated
	 * @return
	 */
	private String getTheIterated(String iterated) {
		if (iterated != null && iterated.trim().length() > 0) {
			String[] splitIterated = iterated.split("/");
			for(int i = splitIterated.length-1 ; i >=0 ; i-- ) {
				String className = splitIterated[i];
				Table  table = dsTables.get(className);
				if(table != null) {
					return className;
				}
			}
		}
		return "";
	}

	/**
	 * 
	 * @param args
	 * @return
	 */
	private String getCommaSeperatedArgs(List<Argument> args) {
		String commaSeperatedArgs = "";
		for (Argument arg : args) {
			if (commaSeperatedArgs.length() == 0) {
				commaSeperatedArgs += decoratingArguments(arg);
			} else {
				commaSeperatedArgs += ", "  + decoratingArguments(arg);
			}
		}
		return commaSeperatedArgs;
	}

	/**
	 * 
	 * @param arg
	 * @return
	 */
	private String decoratingArguments(Argument arg) {

		String referenceClass =xmlConstructUtils.findParentReference(arg).getDbTables(); 
		String referenceFromLoopClass = null; 
		Loop loop = null; 
		if (arg.getVariableType() !=null && arg.getVariableType().equals("XPATH") || xPathVariableType.contains(arg.getVariableType())) 
		{ 
			loop = xmlConstructUtils.findParentLoop(arg); 
			referenceFromLoopClass = getReferenceFromLoopClass(loop); 
		} 

		String reference =YAMLUtil.uncapitalizeValue(referenceClass); 
		String referenceFromLoop = YAMLUtil.uncapitalizeValue(referenceFromLoopClass);
		if(arg.getVariableType() == null && arg.getParent() instanceof Function) 
		{
			return "XpathNode.selectNodes(" + reference + ",\"" +arg.getCharacterContent().trim() + "\")"; 
		} 
		if (xPathVariableType.contains(arg.getVariableType())) 
		{ 
			if (loop != null)
			{ 
				if(arg.getCharacterContent().contains(loop.getThrough().trim())) 
				{ String newCharacterContent =arg.getCharacterContent().replace(loop.getThrough().trim() + "/", "").trim();

				return "XpathNode.selectNodeValue(" + referenceFromLoop + ",\"" +newCharacterContent + "\")"; 
				} 
			}

			return "XpathNode.selectNodeValue(" + reference + ",\"" + arg.getCharacterContent().trim() + "\")"; 
		} 
		else if(ordinaryVariables.contains(arg.getVariableType())) 
		{
			if(arg.getCharacterContent().trim().equals("Class")) 
			{ 
				return reference +".Clazz"; 
			} 
			return reference + "." + arg.getCharacterContent().trim(); 
		}
		else if (arg.getVariableType().equals(ALGVariableType.CONSTANT.name())) 
		{ 
			return arg.getCharacterContent().trim(); 
		} 
		else if(arg.getVariableType().equals("XPATH") && arg.getParent() instanceof	Ratetable) 
		{ 
			return "XpathNode.selectNodeValue(" + reference + ",\"" + arg.getCharacterContent().trim() + "\")";
		} 
		return arg.getCharacterContent().trim();

	}


	/**
	 * 
	 * @param functionalOperator
	 * @return
	 */
	private String functionalOperatorMapping(String functionalOperator) {

		Map<String, String> functionalOperatorMap = new HashMap<String, String>();
		//functionalOperatorMap.put("Round Up Dollar", "roundUpDoller");
		//functionalOperatorMap.put("Round To Hundredth", "roundToThousand");
		//functionalOperatorMap.put("Round To Thousandth", "roundToThousandth");
		//functionalOperatorMap.put("Round To Ten Thousandth", "roundToTenThousandth");
		//functionalOperatorMap.put("Round To Thousand Millionths", "roundToThousandMillionths");
		functionalOperatorMap.put("Not", "~");
		if (functionalOperatorMap.containsKey(functionalOperator)) {
			return functionalOperatorMap.get(functionalOperator);
		} else {
			//return functionalOperator;
			return "";
			// log error throw exception;
		}
	}

	/**
	 * Method used to verify whether the particular coverage needs to be included in
	 * the automation process based on the configuration provided.
	 * 
	 * @param className
	 * @return
	 */

	private boolean isClassAllowed(String className) {

		boolean iscoverageAllowed = true;

		if(className.trim().length() > 50) { //Eldho need to remove temp.
			//System.out.println("Class length exceeded 50 character, Class Name : " + className);
			//return false;
		}
		/** Issue fix for displaying the form not in cw**/
		
//		if(rateTablesMergedState.size()>0) {
//			tableNames.remove("BOPEmployeeDishtyCoverage");
//			rcForms.remove("BOPEmployeeDishtyCoverage");
//		}
		
//        if(null == tableNames.get(className)) {
//        	if(null == rcForms.get(className)) {
//        		return false;
//        	}
//        }
//        if(null != rcForms.get(className) && null != rcForms.get(className).getAddChangeDeleteFlag() && rcForms.get(className).getAddChangeDeleteFlag().equals("D")) {
//    		return false;
//    	}
		if (availableLOBCoverage != null) {

			iscoverageAllowed = availableLOBCoverage.isChekcCoverageAvailability();
			if (iscoverageAllowed) {
				List<String> availableCoverages = availableLOBCoverage.getAvailableCoverage();
				if (availableCoverages.contains(className)) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		}
		return iscoverageAllowed;
	}
	private boolean isClassAllowed(String className, String parentClassName, String type, boolean isStateData) {

		boolean iscoverageAllowed = true;

		/** Issue fix for displaying the form not in cw**/
		
//        if(null == tableNames.get(className)) {
//        	if(null == rcForms.get(className)) {
//        		return false;
//        	}
//        }
		// for form [risk type] tag deleted flag feature is not there in britecore. But for coverage [risk item]have a deleted a flag.
		// So we need to capture the risk items which is deleted in state and set the delete flag = true
		if(!type.equals(RC_CLASS_TYPE_COVERAGE) && !isCoverageReferenceExist(className, parentClassName, isStateData)) {
			return false;
		}
		
        if(null != rcForms.get(className) && null != rcForms.get(className).getAddChangeDeleteFlag() && rcForms.get(className).getAddChangeDeleteFlag().equals("D")) {
    		return false;
    	}
		if (availableLOBCoverage != null) {

			iscoverageAllowed = availableLOBCoverage.isChekcCoverageAvailability();
			if (iscoverageAllowed) {
				List<String> availableCoverages = availableLOBCoverage.getAvailableCoverage();
				if (availableCoverages.contains(className)) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		}
		return iscoverageAllowed;
	}


	/**
	 * Method used to add RiskType entities order for various fields.
	 * 
	 * @param riskType
	 */

	private void addRiskTypeEntitiesOrder(RiskType riskType, EntityOrderType entityOrderType, String entityOrderName) {

		RiskTypeEntitiesOrder riskTypeEntitiesOrder = riskType.getEntities_order();

		List<String> entiyOrderValues = null;

		if (riskTypeEntitiesOrder == null) {
			riskTypeEntitiesOrder = new RiskTypeEntitiesOrder();
			riskType.setEntities_order(riskTypeEntitiesOrder);
		}

		if (EntityOrderType.RISKFIELD.equals(entityOrderType)) {

			entiyOrderValues = riskTypeEntitiesOrder.getFields();

			if (entiyOrderValues == null) {
				entiyOrderValues = new ArrayList<String>();
				riskTypeEntitiesOrder.setFields(entiyOrderValues);			
			}

			ercVariableList.add(entityOrderName);

		} else if (EntityOrderType.CALCULATION.equals(entityOrderType)) {

			entiyOrderValues = riskTypeEntitiesOrder.getCalculations();

			if (entiyOrderValues == null) {
				entiyOrderValues = new ArrayList<String>();
				riskTypeEntitiesOrder.setCalculations(entiyOrderValues);
			}

			ercVariableList.add(entityOrderName);

		} else if (EntityOrderType.RATETABLE.equals(entityOrderType)) {

			entiyOrderValues = riskTypeEntitiesOrder.getRate_tables();		
			if (entiyOrderValues == null) {
				entiyOrderValues = new ArrayList<String>();
				riskTypeEntitiesOrder.setRate_tables(entiyOrderValues);
			}

		} else if (EntityOrderType.RISKITEM.equals(entityOrderType)) {

			entiyOrderValues = riskTypeEntitiesOrder.getItems();

			if (entiyOrderValues == null) {
				entiyOrderValues = new ArrayList<String>();
				riskTypeEntitiesOrder.setItems(entiyOrderValues);
			}

		}

		entiyOrderValues.add(entityOrderName);

	}


	/**
	 * Method used to Check whether RiskType entities order values already Exist.
	 * 
	 * @param riskType
	 */

	private boolean checkRiskTypeEntitiesOrderExist(RiskType riskType, EntityOrderType entityOrderType, String entityOrderName) {


		RiskTypeEntitiesOrder riskTypeEntitiesOrder = riskType.getEntities_order();

		List<String> entiyOrderValues = null;

		if (riskTypeEntitiesOrder == null) {
			return false;
		}

		if (EntityOrderType.RISKFIELD.equals(entityOrderType)) {

			entiyOrderValues = riskTypeEntitiesOrder.getFields();

		} else if (EntityOrderType.CALCULATION.equals(entityOrderType)) {

			entiyOrderValues = riskTypeEntitiesOrder.getCalculations();


		} else if (EntityOrderType.RATETABLE.equals(entityOrderType)) {

			entiyOrderValues = riskTypeEntitiesOrder.getRate_tables();


		} else if (EntityOrderType.RISKITEM.equals(entityOrderType)) {

			entiyOrderValues = riskTypeEntitiesOrder.getItems();
		}

		if (entiyOrderValues == null) {
			return false;
		}
		else {
			return entiyOrderValues.contains(entityOrderName);
		}


	}
	/**
	 * 
	 * @param currentClass
	 * @param childClass
	 * @return
	 */
	private int getHierarchyLevelofChildClass(String currentClass, String childClass) {

		int currentClassHierarchy = classHierarchy.get(currentClass);
		int childClassHierarchy =0;
		String classType = getClassType(currentClass);
		if(classType.equals(RiskTypes.coverage.name())) {
			currentClassHierarchy--;
		}
		if(childClass == null || childClass.trim().length() == 0) {
			//System.out.println("Child Class : " + childClass);
		}
		else {
			//System.out.println(childClass);

			childClassHierarchy = classHierarchy.get(childClass);

			classType = getClassType(childClass);
			if(classType.equals(RiskTypes.coverage.name())) {
				childClassHierarchy--;			
			}
		}
		return childClassHierarchy - currentClassHierarchy;

	}
	/**
	 * 
	 * @return
	 */
	private boolean importManualCalculationJsonFile(boolean isStateData) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			File importFile = null;
			if(!isStateData) {
				importFile = new File(projectYamlProperties.getInputFilelocation()+projectYamlProperties.getConvertedCalculations());
			}else {
				return false;
			}
			if(importFile.exists()) {
			    InputStream fileInputStream = new FileInputStream(importFile);
			    MappingCalculations mappingCalculations= mapper.readValue(fileInputStream, MappingCalculations.class);
			    processManualCalculation(mappingCalculations);
			    fileInputStream.close();
			}
		}catch(Exception ex) {
			return false;
		}

		return true;
	}
	/**
	 * 
	 * @param mappingCalculations
	 * @return
	 */
	private boolean processManualCalculation(MappingCalculations mappingCalculations) {
		if(null != mappingCalculations) {
			List<MappingCalculation> mappingCalculationList = mappingCalculations.getMappingCalculations();
			if(null != mappingCalculationList && mappingCalculationList.size() > 0) {
				for(MappingCalculation mappingCalculation:mappingCalculationList) {
					String className = mappingCalculation.getClassName();
					RiskType riskTypeYamlObject = (RiskType) getYamlObject(className, YAMLObjectType.RiskType);
					if(riskTypeYamlObject == null ) {
						RiskItem riskItem = (RiskItem) getYamlObject(className, YAMLObjectType.RiskItem);			
						if(riskItem != null) {
							riskTypeYamlObject = riskItem.getParentRiskType();				
						}
					}
					addManualCalculations(mappingCalculation, riskTypeYamlObject);
					addManualRateTables(mappingCalculation, riskTypeYamlObject);
					
				}
			}
		}
		return true;
	}
	/**
	 * 
	 * @param mappingCalculation
	 * @param riskTypeYamlObject
	 */
	private void addManualCalculations(MappingCalculation mappingCalculation, RiskType riskTypeYamlObject) {
		List<Calculation> calculations = riskTypeYamlObject.getCalculations();
		List<Calculation> manualCalculations = mappingCalculation.getCalculations();
		if(null != manualCalculations && manualCalculations.size() > 0) {
			for(Calculation manualCalculation:manualCalculations) {
				boolean isCalculationExist = false;
				for(Calculation calculation:calculations ) {
					if(null != manualCalculation.getName() && manualCalculation.getName().equals(calculation.getName())) {
						calculation.setCalculation(manualCalculation.getCalculation());
						isCalculationExist = true;
					}
				}
				if(!isCalculationExist) {
					calculations.add(manualCalculation);
					if(!checkRiskTypeEntitiesOrderExist(riskTypeYamlObject, EntityOrderType.CALCULATION, manualCalculation.getName())) {
						riskTypeYamlObject.getEntities_order().getCalculations().add(manualCalculation.getName());
					}
				}
				
			}
		}
	}
	/**
	 * 
	 * @param mappingCalculation
	 * @param riskTypeYamlObject
	 */
	private void addManualRateTables(MappingCalculation mappingCalculation, RiskType riskTypeYamlObject) {
		List<com.nest.erc.yaml.domain.RateTable> rateTables = riskTypeYamlObject.getRate_tables();
		List<com.nest.erc.yaml.domain.RateTable> manualRateTables = mappingCalculation.getRateTables();
		if(null != manualRateTables && manualRateTables.size() > 0) {
			for(com.nest.erc.yaml.domain.RateTable manualRateTable:manualRateTables) {
				rateTables.add(manualRateTable);
				if(null != riskTypeYamlObject.getEntities_order() && null != riskTypeYamlObject.getEntities_order().getRate_tables()) {
					if(!checkRiskTypeEntitiesOrderExist(riskTypeYamlObject, EntityOrderType.RATETABLE, manualRateTable.getName())) {
						riskTypeYamlObject.getEntities_order().getRate_tables().add(manualRateTable.getName());
					}
				}
			}
		}
	}


}
