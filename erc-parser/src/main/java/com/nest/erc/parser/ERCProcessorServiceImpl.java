package com.nest.erc.parser;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.nest.erc.domain.ERCProcessorOutput;
import com.nest.erc.domain.alg.alg.inter.HasExecutable;
import com.nest.erc.domain.alg.alg.inter.RatingExecutable;
import com.nest.erc.domain.alg.ds.DSWrapper;
import com.nest.erc.domain.alg.impl.Condition;
import com.nest.erc.domain.alg.impl.ElsePart;
import com.nest.erc.domain.alg.impl.Lob;
import com.nest.erc.domain.alg.impl.Pch;
import com.nest.erc.domain.alg.impl.Reference;
import com.nest.erc.domain.alg.impl.Scope;
import com.nest.erc.domain.alg.impl.ThenPart;
import com.nest.erc.domain.alg.impl.executable.Assign;
import com.nest.erc.domain.alg.impl.executable.IfAndElse;
import com.nest.erc.domain.alg.impl.executable.Loop;
import com.nest.erc.domain.alg.impl.expressional.Expression;
import com.nest.erc.domain.alg.re.constructs.impl.AlgParserOutput;
import com.nest.erc.domain.alg.re.constructs.impl.PojoClassConstruct;
import com.nest.erc.domain.alg.re.constructs.impl.PojoVariablesConstruct;
import com.nest.erc.domain.util.Utils;
import com.nest.erc.domain.util.XmlConstructUtils;



@Component
public class ERCProcessorServiceImpl implements ERCProcessorService {
	Set<String> validReferencesTypes = new HashSet<String>();

	// PojoExtractor
	PojoGenerator pojoGenerator = new PojoGenerator();
	//Map<String, PojoClassConstruct> classesMap;
	AlgParserOutput algParserOutput = null;
	Map<String, PojoClassConstruct> classesMap;
	// PojoExtractor
	Utils utils = new Utils();
	
	ERCProcessorOutput ercProcessorOutput = new ERCProcessorOutput();
	
	
	@Override
	public void processErc(AlgParserOutput algParserOutput, DSWrapper dsWrapper, String lobName) {
		this.algParserOutput = algParserOutput;
		//
		validReferencesTypes.addAll(Arrays.asList("Premium Calculation", "Common Rating"));
		//
		pojoGenerator.initialize(algParserOutput, dsWrapper);
		
		
		processLob();
		classesMap = pojoGenerator.getClassMap();
		setDSVariableType(dsWrapper);
		
		PojoClassConstruct pojoClassConstruct = classesMap.get(lobName);
		 Map<String, PojoVariablesConstruct>  PojoVariablesConstructMap= pojoClassConstruct.getInstanceVariableMap();
		 PojoVariablesConstruct PojoVariablesConstruct = PojoVariablesConstructMap.get("PropDamageLiabDedType");

		utils.writeObjectToJson("classMap.json", "./output/", classesMap);
		

	}
	private void setDSVariableType(DSWrapper dsWrapper) {
		for(Map.Entry<String, PojoClassConstruct> entry:classesMap.entrySet()) {
			PojoClassConstruct pojoClassConstruct = entry.getValue();
			Map<String, PojoVariablesConstruct> instanceVariableMap = pojoClassConstruct.getInstanceVariableMap();
			for(Map.Entry<String, PojoVariablesConstruct> entryVar:instanceVariableMap.entrySet()) {
				PojoVariablesConstruct pojoVariablesConstruct = entryVar.getValue();//PropDamageLiabDedType
				if(null== pojoVariablesConstruct.getDsVariableType()) {
					String dsVarType = Utils.getDSVariableType(dsWrapper, entry.getKey(), entryVar.getKey());
					if(null==pojoVariablesConstruct.getDsVariableType()) {
						pojoVariablesConstruct.setDsVariableType(dsVarType);
					}
				}
			
			}
		}
	}

	private void processLob() {
		Lob lob = algParserOutput.getXmlDetails();
		for (Reference reference : lob.getReferences()) {
			processReference(reference);
		}
	}

	private void processReference(Reference reference) {
		
		if (validReferencesTypes.contains(reference.getType())) {
			 processReferenceCRandP(reference);
		}
		
	}
	private void processReferenceCRandP(Reference reference) {
		
			pojoGenerator.processReference(reference);
			for(Scope scope:reference.getScopes()) {
				processScope(scope);
			}
	}

	private void processScope(Scope scope) {
		for(Pch pch:scope.getPchs()) {
			processPch(pch);
			
		}
		
	}

	private void processPch(Pch pch) {
		XmlConstructUtils xmlConstructUtils = new XmlConstructUtils();
		if(pch.getName().contains("(") && pch.getName().contains(")")) {
			//System.out.println("********TroubleSome Pch:"+pch.getName()+"<<>>"+xmlConstructUtils.findParentReference(pch).getDbTables());
		}
		processHasExecutable(pch);
		
	}

	private void processHasExecutable(HasExecutable hasExecutable) {
		
		if (hasExecutable != null && hasExecutable.getExecutables() != null) {
			for (RatingExecutable ratingExecutable : hasExecutable.getExecutables()) {
				if (ratingExecutable instanceof IfAndElse) {
					processIfAndElse((IfAndElse) ratingExecutable);
				} else if (ratingExecutable instanceof Loop) {
					processLoop((Loop) ratingExecutable);
				} else if (ratingExecutable instanceof Assign) {
					processAssign((Assign) ratingExecutable);
				}
			}
		}
	}

	private void processAssign(Assign assign) {
		pojoGenerator.extractFromAssign(assign);
		processExpression(assign.getExpression());
		//pojoGenerator.extractFromExpression(expression);
		
	}

	private void processLoop(Loop loop) {
		// TODO Auto-generated method stub
		processHasExecutable(loop);
	}

	private void processIfAndElse(IfAndElse ifAndElse) {
		if (ifAndElse.getCondition() != null) {
			processCondition(ifAndElse.getCondition());
		}
		
		if (ifAndElse.getThenPart() != null) {
			processThenPart(ifAndElse.getThenPart());
		}
		
		if (ifAndElse.getElsePart() != null) {
			processElsePart(ifAndElse.getElsePart());
		}
		
		
		
		
	}

	private void processElsePart(ElsePart elsePart) {
		processHasExecutable(elsePart);
		
	}

	private void processThenPart(ThenPart thenPart) {
		processHasExecutable(thenPart);
		
	}

	private void processCondition(Condition condition) {
		processExpression(condition.getTheCondition());
		
	}

	private void processExpression(Expression expression) {
		//Create two different method for pojo extraction and expression evaluation
		//Function, Ratetable and Arguments should be handled here. 
		pojoGenerator.extractFromExpression(expression);
		
	}
	
	public ERCProcessorOutput getErcProcessorOutput(){
		ercProcessorOutput.setClassesMap(pojoGenerator.getClassMap());
		return ercProcessorOutput;
	}
	
	public Map<String, PojoClassConstruct> getClassMap(){
		return pojoGenerator.getClassMap();
	}


	public AlgParserOutput getAlgParserOutput() {
		return algParserOutput;
	}


	
}
