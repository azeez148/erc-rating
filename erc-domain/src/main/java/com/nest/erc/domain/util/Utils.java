package com.nest.erc.domain.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nest.erc.domain.alg.Rule;
import com.nest.erc.domain.alg.ds.Column;
import com.nest.erc.domain.alg.ds.DSWrapper;
import com.nest.erc.domain.alg.ds.Table;
import com.nest.erc.domain.alg.ds.Tables;
import com.nest.erc.domain.alg.impl.Pch;
import com.nest.erc.domain.alg.impl.Scope;
import com.nest.erc.domain.alg.impl.executable.Assign;
import com.nest.erc.domain.alg.rc.Field;
import com.nest.erc.domain.alg.rc.Form;
import com.nest.erc.domain.alg.rc.Forms;
import com.nest.erc.domain.alg.re.constructs.impl.PojoClassConstruct;
import com.nest.erc.domain.alg.re.constructs.impl.PojoVariablesConstruct;

public class Utils {

    static Logger logger = Logger.getLogger(Utils.class);
    static Properties property = null;
    static Map<String, Table> dsTables = new HashMap<String, Table>();

    /*public Map<String,String> getXmlElmentAttributeValue(Iterator<Attribute> attributes){
		Map<String,String> attributesMap = new HashMap<String,String>();
		while (attributes.hasNext()) {
			Attribute attribute = (attributes.next());
			attributesMap.put(attribute.getName().getLocalPart(), attribute.getValue());
		}
		return attributesMap;
	}*/

    public String getPropertyValue(String propertyName) {
        if (property == null) {
            try {
                property = loadProperties();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return property.getProperty(propertyName);
    }

    public void writeToFile(String fileName, String outputFolder, String ruleFileContent) {

        Path directoryPath = Paths.get(outputFolder).toAbsolutePath().normalize();
        try {
            Files.createDirectories(directoryPath);
            Path filePath = directoryPath.resolve(fileName);
            try (FileOutputStream out = new FileOutputStream(filePath.toFile())) {
                out.write(ruleFileContent.getBytes(StandardCharsets.UTF_8));
            }
        } catch (FileNotFoundException e) {
            logger.error("Unable to create file for output: " + e.getMessage(), e);
        } catch (IOException e) {
            logger.error("Failed to write output file: " + e.getMessage(), e);
        }

    }

    public Properties loadProperties() throws IOException, FileNotFoundException {
        //FileReader reader;
        InputStream inputStream;
        Properties p = null;
        inputStream = getClass().getClassLoader().getResourceAsStream("arecConfig.properties");
        p = new Properties();
        p.load(inputStream);
        return p;
    }

    public boolean writeObjectToJson(String fileName, String directory, Object object) {
        ObjectMapper mapper = new ObjectMapper();
        Path directoryPath = Paths.get(directory).toAbsolutePath().normalize();
        try {
            Files.createDirectories(directoryPath);
            Path filePath = directoryPath.resolve(fileName);
            mapper.writeValue(filePath.toFile(), object);
            return true;
        } catch (JsonProcessingException e) {
            logger.error("Failed to serialize object to JSON: " + e.getMessage(), e);
        } catch (IOException e) {
            logger.error("Failed to write JSON file: " + e.getMessage(), e);
        }
        return false;
    }

    public boolean isAlphanumericString(String testString) {
        if (testString == null) {
            throw new NullPointerException();
        }
        return testString.matches("[A-Za-z0-9]*");
    }

    public boolean isVariableConsistent(String testString) {
        if (testString == null) {
            throw new NullPointerException();
        }
        return testString.matches("[A-Za-z0-9_ ]*");
    }

    public boolean isXPathWithOnlySlashAndDot(String testString) {
        if (testString == null) {
            throw new NullPointerException();
        }
        return testString.matches("[A-Za-z0-9_/. ]*");
    }

    public static String handleSpecialVariable(String varName) {
        varName = getConverertedVaribaleName(varName);
        varName = varName.substring(0, 1).toUpperCase() + varName.substring(1);
        return varName;
    }

    public static String handleXPathSpecialVariable(String varName) {

        if (varName.contains("/")) {
            int index = varName.lastIndexOf("/");
            String modVarName = varName.substring(0, index + 1);
            String lastVarName = varName.substring(index + 1, varName.length());
            modVarName = modVarName + getConverertedVaribaleName(lastVarName);
            return modVarName;
        } else {
            return getConverertedVaribaleName(varName);
        }
    }

    private static String getConverertedVaribaleName(String varName) {
        if (varName.contains(".")) {
            varName = varName.replace(".", "_");
        }
        if (varName.equals("Class")) {
            varName = "Classs";
        }
        if (varName.equals("Limit")) {
            varName = "dsLimit";
        }
        if (varName.equals("NumEmployees")) {
            varName = "dsNumEmployees";
        }
        return varName;
    }

    public static String getDSVariableType(DSWrapper dsWrapper, String tableName, String columnName) {
        generateDsTableMap(dsWrapper.getTables());
        Table table = dsTables.get(tableName);
        if (null != table) {
            List<Column> columnList = table.getColumnList();
            if (null != columnList && columnList.size() > 0) {
                for (Column column : columnList) {
                    if (column.getName().equals(columnName)) {
                        return column.getDataType();
                    }
                }
            }
        }
        return "";
    }

    public static void generateDsTableMap(Tables tables) {
        Table table = tables.getTable();
        if (null != table) {
            dsTables.put(table.getName(), table);
        }
        List<Tables> tablesList = table.getTablesList();
        if (null != tablesList && tablesList.size() > 0) {
            for (Tables tablesData : tablesList) {
                generateDsTableMap(tablesData);
            }
        }
    }

    public static boolean isMethodReference(String content, PojoClassConstruct pojoClassConstruct, Pch currentPch) {
        Map<String, PojoVariablesConstruct> instanceVariableMap = pojoClassConstruct.getInstanceVariableMap();
        if (null != instanceVariableMap) {
            PojoVariablesConstruct pojoVariablesConstruct = instanceVariableMap.get(content);
            if (null == pojoVariablesConstruct) {
                Scope currentScope = (Scope) currentPch.getParent();
                if (null != currentScope && null != currentScope.getPchs() && currentScope.getPchs().size() > 0) {
                    for (Pch pch : currentScope.getPchs()) {
                        if (pch.getName().equals(content)) {
                            return true;
                        }
                    }
                }
            }
        }
        if (null != content && content.contains("()")) {
            return true;
        }
        Matcher m = Pattern.compile("\\((.*?)\\)").matcher(content);
        while (m.find()) {
            return true;
        }
        return false;
    }

    public static void addRateTableExceptions(Set<String> exceptions) {
        exceptions.add("NumberFormatException");
        exceptions.add("LookupException");
    }

    public static void addParseExceptions(Set<String> exceptions) {
        exceptions.add("ParseException");
    }

    public static String getJavaVariableType(String algType) {
        Map<String, String> algTypeToJavaType = new HashMap<String, String>();
        algTypeToJavaType.put("LV_DOUBLE", "double");
        algTypeToJavaType.put("LV_INTEGER", "double");
        algTypeToJavaType.put("COLUMN_NUMERIC", "double");
        algTypeToJavaType.put("COLUMN_STRING", "String");
        algTypeToJavaType.put("LV_STRING", "String");
        algTypeToJavaType.put("LV_DATE", "Date");
        algTypeToJavaType.put("LV_TIMESPAN", "Date");
        algTypeToJavaType.put("LV_BOOLEAN", "boolean");
        algTypeToJavaType.put("XPATH_STRING", "String");
        algTypeToJavaType.put("XPATH_DATE", "Date");
        algTypeToJavaType.put("XPATH_NUMERIC", "double");
        return algTypeToJavaType.get(algType);
    }

    public static String getAssignCastingType(Assign assignExp, DSWrapper dsWrapper, String currentRule, String fieldName) {
        String varType = "";
        if (null != assignExp.getVariableType() && assignExp.getVariableType().startsWith("LV_")) {
            varType = assignExp.getVariableType();
        } else {
            varType = Utils.getDSVariableType(dsWrapper, currentRule, fieldName);
        }
        return getCastType(varType);
    }

    public static String getCastType(String varType) {
        if (null != varType && varType.matches("LV_DOUBLE|decimal|float")) {
            return "MathHelper.getDoubleValue";
        } else if (null != varType && varType.matches("LV_INTEGER|integer|int")) {
            return "MathHelper.getIntegerValue";
        } else if (null != varType && varType.matches("LV_BOOLEAN")) {
            return "MathHelper.getBooleanValue";
        } else if (null != varType && varType.matches("LV_TIMESPAN")) {
            return "MathHelper.getLongValue";
        } else if (null != varType && varType.matches("datetime|LV_DATE|XPATH_DATE")) {
            return "MathHelper.getDateValue";
        } else {
            return "MathHelper.getStringValue";
        }
    }

    public static String getXPathVarType(Rule rule, String variableName, DSWrapper dsWrapper) {
        String castingType = "";
        if (null != variableName && variableName.contains("/")) {
            Rule parentRule = rule;
            String[] splitVariables = variableName.split("/");
            List<String> validVariables = new ArrayList<String>();
            for (String variable : splitVariables) {
                if (variable.equals("..")) {
                    if (null != parentRule) {
                        parentRule = parentRule.getParent();
                    }
                    continue;
                } else {
                    validVariables.add(variable);
                }
            }
            String dataType = "";
            if (validVariables.size() >= 2) {
                dataType = getDSVariableType(dsWrapper, validVariables.get(validVariables.size() - 2), validVariables.get(validVariables.size() - 1));
                castingType = Utils.getCastType(dataType);
            }
            if (validVariables.size() == 1 && null != parentRule) {
                dataType = getDSVariableType(dsWrapper, parentRule.getName(), validVariables.get(validVariables.size() - 1));
                castingType = Utils.getCastType(dataType);
            }
            if (validVariables.size() == 1 && null == parentRule) {
                castingType = getCommonPolicyVarType(validVariables.get(validVariables.size() - 1));
            }
        }
        return castingType;
    }

    public static String getCommonPolicyVarType(String varName) {
        if (null != varName && varName.equals("EffDate")) {
            return "MathHelper.getDateValue";
        } else if (null != varName && varName.equals("ExpDate")) {
            return "MathHelper.getDateValue";
        }
        return "";
    }

}
