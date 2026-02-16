package com.nest.erc.parser;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.alg.inter.Expressional;
import com.nest.erc.domain.alg.ds.Column;
import com.nest.erc.domain.alg.ds.DSWrapper;
import com.nest.erc.domain.alg.ds.Table;
import com.nest.erc.domain.alg.ds.Tables;
import com.nest.erc.domain.alg.impl.Argument;
import com.nest.erc.domain.alg.impl.ClassComponent;
import com.nest.erc.domain.alg.impl.ColumnNode;
import com.nest.erc.domain.alg.impl.FlowClass;
import com.nest.erc.domain.alg.impl.FlowVariable;
import com.nest.erc.domain.alg.impl.Reference;
import com.nest.erc.domain.alg.impl.TableName;
import com.nest.erc.domain.alg.impl.executable.Assign;
import com.nest.erc.domain.alg.impl.expressional.Bracket;
import com.nest.erc.domain.alg.impl.expressional.Expression;
import com.nest.erc.domain.alg.impl.expressional.Function;
import com.nest.erc.domain.alg.impl.expressional.Ratetable;
import com.nest.erc.domain.alg.re.constructs.impl.AlgParserOutput;
import com.nest.erc.domain.alg.re.constructs.impl.PojoClassConstruct;
import com.nest.erc.domain.alg.re.constructs.impl.PojoVariablesConstruct;
import com.nest.erc.domain.util.Utils;
import com.nest.erc.domain.util.XmlConstructUtils;

public class PojoGenerator {
	Map<String, PojoClassConstruct> classesMap;
	XmlConstructUtils xmlConstructUtils = null;
	Utils utils = null;
	Set<String> assignTypes = new HashSet<String>();
	AlgParserOutput algParserOutput;
	PojoClassConstruct apexClass;
	Set<String> dsDatatype = new HashSet<String>();
	Map<String,String>classDataTypes = new HashMap<String,String>();

	public PojoGenerator() {
		classesMap = new HashMap<String, PojoClassConstruct>();
		xmlConstructUtils = new XmlConstructUtils();
		utils = new Utils();
	}

	public void processReference(Reference reference) {
		if(reference.getDbTables() == null) {
			//System.out.println("*****No DbTables******"+reference.getName());
		}
		getPojoClassObject(reference.getDbTables());
	}

	
	
	


	

	public void initialize(AlgParserOutput algParserOutput, DSWrapper dsWrapper) {
		this.algParserOutput = algParserOutput;
		processTableName(algParserOutput.getTables().getTableNames(), null);
		processFlowChart(algParserOutput.getFlowChart().getClasses());
		processDs(dsWrapper);
		/*
		 * for(FlowVariable variable:apexClass.getInstanceVariableMap().) {
		 * 
		 * }
		 */
		//System.out.println(apexClass.getInstanceVariableMap().containsKey("limit_1"));// numHoursComparison_1
		//System.out.println(apexClass.getInstanceVariableMap().containsKey("bOPFunctlBusnPrsnlPropValtnCoveragePremium_1"));
		//System.out.println(apexClass.getInstanceVariableMap().containsKey("limit_1"));// classCodePhotography_1
		//System.out.println(apexClass.getInstanceVariableMap().containsKey("classCodePhotography_1"));
	}

	private void processDs(DSWrapper dsWrapper) {
		processTables(dsWrapper.getTables());
		
	}

	private void processTables(Tables tables) {
		processTable(tables.getTable());
		
	}

	private void processTable(Table table) {
		for(Column column:table.getColumnList()) {
			processColumn(column, table);
		}
		if(table.getTablesList() != null) {
		for(Tables tables:table.getTablesList()) {
			processTables(tables);
		}
		}
		
	}
	
	private void processColumn(Column column, Table table) {
		PojoClassConstruct pojoClass = getPojoClassObject(table.getName());
		PojoVariablesConstruct pojoVariable = getPojoVariable(column.getName(), pojoClass.getName());
		pojoVariable.setDsVariableType(column.getDataType());
		//Datatype here
		dsDatatype.add(column.getDataType());
	}

	private void processFlowChart(List<FlowClass> classes) {
		if (classes != null) {
			for (FlowClass clazz : classes) {
				processFlowClass(clazz);
			}
		}

	}

	private void processFlowClass(FlowClass clazz) {
		PojoClassConstruct currentClass = getPojoClassObject(clazz.getName());
		if(clazz.getSubComponents() != null) {
			for (XmlConstruct subComponent : clazz.getSubComponents()) {
				if (subComponent instanceof FlowClass) {
					processFlowClass((FlowClass) subComponent);
				} else if (subComponent instanceof ClassComponent) {
					processClassComponent((ClassComponent) subComponent, currentClass);
				}
			}
		}
	}

	private void processClassComponent(ClassComponent subComponent, PojoClassConstruct currentClass) {
		if(subComponent == null || subComponent.getVariables() == null) {
			//System.out.println("null , class name : " +currentClass.getName());
		}
		else {
		for (FlowVariable variable : subComponent.getVariables()) {
			currentClass.addInstanceVariable(getPojoVariableFrom(variable));
		}
		}

	}

	

	

	private void processTableName(List<TableName> tableNames, PojoClassConstruct parentPojoClass) {
		if (tableNames != null) {
			for (TableName tableName : tableNames) {
				PojoVariablesConstruct pojoVariablesFromTableName = null;
				

				// Set parent
				PojoClassConstruct pojoClass = getPojoClassObject(tableName.getName());

				if (parentPojoClass != null) {
					pojoVariablesFromTableName = getPojoVariableFrom(tableName);
					parentPojoClass.addInstanceVariable(pojoVariablesFromTableName);
					pojoClass.setParent(parentPojoClass);
					parentPojoClass.addDirectChild(pojoClass);

				} else {
					apexClass = pojoClass;
				}

				processTableName(tableName.getTableNames(), pojoClass);
				for (ColumnNode columnNode : tableName.getColumnNodes()) {
					PojoVariablesConstruct instanceVariable = getPojoVariableFrom(columnNode);
					pojoClass.addInstanceVariable(instanceVariable);
				}
			}
		}
	}



	

	

	public void extractFromExpression(Expression expression) {
		if (expression.getVariableType() != null && !((expression.getVariableType().equals("RT")) || (expression
				.getVariableType().equals("CONSTANT")))/* && (!expression.getVariableType().equals("XPATH")) */) {
			extractTypeFromExpressional(expression);
		}
		if (expression.getLeftExpression() != null) {
			extractFromExpression(expression.getLeftExpression());
		}
		if (expression.getRightExpression() != null) {
			extractFromExpression(expression.getRightExpression());
		}if(expression.getExpressions() != null){
		for(Expressional expressional:expression.getExpressions()) {
			if(expressional instanceof Expression) {
				extractFromExpression((Expression)expressional);
			}else if(expressional instanceof Bracket){
				Bracket bracket = (Bracket)expressional;
				extractFromExpression(bracket.getExpression());
			}else if(expressional instanceof Function){
				Function function = (Function)expressional;
				extractFromArguments(function.getArgs());
			}else if(expressional instanceof Ratetable) {
				Ratetable ratetable = (Ratetable)expressional;
				extractFromArguments(ratetable.getArgs());
			}
		}
	}
	}

	private void extractFromArguments(List<Argument> args) {
		for(Argument arg:args) {
			extractTypeFromExpressional(arg);
		}
		
	}
	
	private void extractTypeFromExpressional(XmlConstruct expressional) {
		Reference reference = xmlConstructUtils.findParentReference(expressional);
		String variableContainer = null;
		String variableType = null;
		if(expressional instanceof Assign) {
			Assign assign = ((Assign)expressional);
			variableContainer = assign.getlValue();
			variableType = assign.getVariableType();
		}else if(expressional instanceof Argument){
			Argument arg = (Argument)expressional;
			variableContainer = arg.getCharacterContent();
			variableType = arg.getVariableType();
		} else if(expressional instanceof Expression) {
			Expression expression = (Expression)expressional;
			variableContainer = expression.getCharacterContent();
			variableType = expression.getVariableType();
		}
		if(variableType != null) {
		if(!variableType.equals("CONSTANT")) {
			//../../../../EffDate
		if (utils.isVariableConsistent(variableContainer)) {
			PojoClassConstruct pojoClassConstruct = getPojoClassObject(reference.getDbTables());
			PojoVariablesConstruct pojoVariablesConstruct = getPojoVariable(variableContainer,pojoClassConstruct.getName());
			pojoVariablesConstruct = setPojoVariableType(pojoVariablesConstruct,
					variableType);
			pojoClassConstruct.addInstanceVariable(pojoVariablesConstruct);
		}
		else if(utils.isXPathWithOnlySlashAndDot(variableContainer)){
			
					String variableSplit[] = variableContainer.split("/");
					// if(utils.isVariableConsistent(variableSplit[variableSplit.length-2])) {
					//
					// }
					String parent = findParentFromXpath(reference.getDbTables(), variableSplit,
							expressional.getCharacterContent() + "<<>>" + reference.getDbTables());
					//System.out.println("***" + expressional.getCharacterContent() + "------->" + parent);
					PojoClassConstruct pojoClassConstruct = getPojoClassObject(parent);
					PojoVariablesConstruct pojoVariablesConstruct = getPojoVariable(variableSplit[variableSplit.length-1], parent);
					if(null!= pojoVariablesConstruct.getVariableType() && !pojoVariablesConstruct.getVariableType().equals(pojoVariablesConstruct.getVariableName())){
						pojoVariablesConstruct = setPojoVariableType(pojoVariablesConstruct,
								variableType);
					}  else if(null== pojoVariablesConstruct.getVariableType() && null != pojoVariablesConstruct.getVariableName()){
						pojoVariablesConstruct = setPojoVariableType(pojoVariablesConstruct,
								variableType);
					}
					pojoClassConstruct.addInstanceVariable(pojoVariablesConstruct);


		} else {
			//System.out.println("Bad else case***" + variableContainer );
		}}
		else {
			//System.out.println(" constants***" + variableContainer );
		}}else {
			//System.out.println("null types***" + variableContainer );
		}
		/*
		else {
			if (!variableContainer.equals("../State[Id=../StateId]/Name")) {
				if (variableContainer.contains("/")) {
					String variableSplit[] = variableContainer.split("/");
					// if(utils.isVariableConsistent(variableSplit[variableSplit.length-2])) {
					//
					// }
					String parent = findParentFromXpath(reference.getDbTables(), variableSplit,
							expressional.getCharacterContent() + "<<>>" + reference.getDbTables());
					//System.out.println("***" + expressional.getCharacterContent() + "------->" + parent);
					PojoClassConstruct pojoClassConstruct = getPojoClassObject(parent);
					PojoVariablesConstruct pojoVariablesConstruct = getPojoVariable(variableSplit[variableSplit.length-1],
							variableType);
					pojoClassConstruct.addInstanceVariable(pojoVariablesConstruct);
				}
			}

		}*/

	}
	/*
	private PojoVariablesConstruct setPojoVariableType(PojoVariablesConstruct pojoVariablesConstruct,
			String variableType) {
		// TODO Auto-generated method stub
		return null;
	}
	*/
	private String findParentFromXpath(String reference, String[] variableSplit, String main) {
		try {
			if (variableSplit.length == 1) {
				return reference;
			} else {
				String[] newVarSplit = Arrays.copyOfRange(variableSplit, 1, variableSplit.length);
				if (utils.isVariableConsistent(variableSplit[0])) {
					return findParentFromXpath(variableSplit[0], newVarSplit, main);
				} else if (variableSplit[0].trim().equals("..")) {
					String newReference = classesMap.get(reference).getParent()==null?"Policy":classesMap.get(reference).getParent().getName();
					
					return findParentFromXpath(newReference, newVarSplit, main);
				} else {
					//System.out.println("Else*********" + variableSplit[0]);
					return "NULL_Check_This";
				}
			}
		} catch (Exception e) {
			
			//System.out.println(e+"Error---->" + main);
		}
		return "NULL_Check_This";//Policies
	}
	
	public Map<String, PojoClassConstruct> getClassMap() {
		//System.out.println(dsDatatype);
		return classesMap;
	}
	
	private PojoClassConstruct getPojoClassObject(String className) {
		className = className.trim();
		PojoClassConstruct pojoClass = null;
		if (classesMap.containsKey(className)) {
			pojoClass = classesMap.get(className);
		} else {
			pojoClass = new PojoClassConstruct();
			pojoClass.setName(className);
			classesMap.put(pojoClass.getName(), pojoClass);
		}
		return pojoClass;
	}
	

	
	private PojoVariablesConstruct setPojoVariableType(PojoVariablesConstruct pojoVariablesConstruct, String variableType) {
		pojoVariablesConstruct.setVariableType(variableType);
		return pojoVariablesConstruct;
	}
	

	

	
	private PojoVariablesConstruct getPojoVariableFrom(XmlConstruct xmlConstruct) {
		PojoVariablesConstruct pojoVariablesConstruct = null;
		if(xmlConstruct instanceof ColumnNode) {
			ColumnNode columnNode = (ColumnNode)xmlConstruct;
			TableName tableName = (TableName)columnNode.getParent();
			pojoVariablesConstruct = getPojoVariable(columnNode.getCharacterContent(), tableName.getName());
		}
		else if(xmlConstruct instanceof TableName) {
			TableName tableName = (TableName)xmlConstruct;
			TableName parentTableName = (TableName)tableName.getParent();
			pojoVariablesConstruct = getPojoVariable(tableName.getName(), parentTableName.getName());
			pojoVariablesConstruct.setVariableType(tableName.getName());
			pojoVariablesConstruct.setAdditionalDataStructure("List");
		}
		else if(xmlConstruct instanceof FlowVariable) {
			FlowVariable flowVariable = (FlowVariable)xmlConstruct;
			FlowClass flowClass = (FlowClass)flowVariable.getParent().getParent();
			pojoVariablesConstruct = getPojoVariable(flowVariable.getName(), flowClass.getName());

		}else {
			//System.out.println("Some thing wrong in getPojoVariable");
			
		}
		return pojoVariablesConstruct;
	}
	
	private PojoVariablesConstruct getPojoVariable(String name, String parentPojoClass) {
		PojoClassConstruct pojoClassConstruct = getPojoClassObject(parentPojoClass);
		
		PojoVariablesConstruct pojoVariablesConstruct = null;
		if(pojoClassConstruct.getInstanceVariableMap() == null) {
			pojoClassConstruct.setInstanceVariableMap(new HashMap<String, PojoVariablesConstruct>());
		}
		if (pojoClassConstruct.getInstanceVariableMap().containsKey(name)) {
			pojoVariablesConstruct = pojoClassConstruct.getInstanceVariableMap().get(name);
		} else {
			pojoVariablesConstruct = new PojoVariablesConstruct();
			pojoVariablesConstruct.setVariableName(name.trim());
			pojoClassConstruct.getInstanceVariableMap().put(pojoVariablesConstruct.getVariableName(), pojoVariablesConstruct);
		}
		return pojoVariablesConstruct;
	}

	public void extractFromAssign(Assign assign) {
		extractTypeFromExpressional(assign);
		
	}
	

}
