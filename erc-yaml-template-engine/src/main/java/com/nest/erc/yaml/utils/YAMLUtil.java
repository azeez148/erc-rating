package com.nest.erc.yaml.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.nest.erc.yaml.formatter.YAMLFactory;

public class YAMLUtil {

	private static ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

	private static String htmlRegEx = "<[^>]*>";

	public static void printYAML(Object obj) throws JsonGenerationException, JsonMappingException, IOException {
		mapper.writeValue(System.out, obj);
	}

	public static String getYAML(Object obj) throws JsonProcessingException {
		return mapper.writeValueAsString(obj);
	}

	public static <T> T getObject(String yaml, Class<T> clazz)
			throws JsonParseException, JsonMappingException, IOException {
		return mapper.readValue(yaml, clazz);

	}

	public static <T> List<T> getListOfObjects(String yaml, Class<T> clazz)
			throws JsonParseException, JsonMappingException, IOException {
		CollectionType listType = mapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz);
		List<T> ts = mapper.readValue(yaml, listType);
		return ts;
	}

	public static <K, V> Map<K, V> getMapOfObjects(String yaml, Class<K> keyClazz, Class<V> valueClazz)
			throws JsonParseException, JsonMappingException, IOException {
		TypeFactory typeFactory = mapper.getTypeFactory();
		MapType mapType = typeFactory.constructMapType(HashMap.class, keyClazz, valueClazz);
		return mapper.readValue(yaml, mapType);
	}


	public static String conertToLowerCamelCase(String input) {

		return StringUtils.uncapitalize(input);

	}

	public static boolean hasLength(@Nullable String str) {
		return (str != null && !str.isEmpty());
	}

	public static String trimTrailingWhitespace(String str) {
		if (!hasLength(str)) {
			return str;
		}

		StringBuilder sb = new StringBuilder(str);
		while (sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1))) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}

	/**
	 * Trim leading whitespace from the given {@code String}.
	 * @param str the {@code String} to check
	 * @return the trimmed {@code String}
	 * @see java.lang.Character#isWhitespace
	 */
	public static String trimLeadingWhitespace(String str) {
		if (!hasLength(str)) {
			return str;
		}

		StringBuilder sb = new StringBuilder(str);
		while (sb.length() > 0 ) {

			int charType =  Character.getType(sb.charAt(0));
			if(charType == 12) {
				sb.deleteCharAt(0);
			}
			else {
				return sb.toString();
			}

		}
		return sb.toString();
	}

	/**
	 * Method used to remove the HTMl characters from the Display Label value
	 * @param labelValue
	 * @param optioanlValue
	 * @return
	 */
	public static String beautifyLabelValue(String labelValue, String optioanlValue) {
		if(labelValue != null) {
			String value = trimLeadingWhitespace(labelValue);
			value = value.replaceAll(htmlRegEx, "");
			return value;
		}
		return optioanlValue;
	}

	public static String uncapitalizeValue(String value) {
		return StringUtils.uncapitalize(value);
	}

	/**
	 * Format domain name value for making it unique.
	 * @param displayValue
	 * @param dataValue
	 * @param domainTableKeyNames
	 * @return
	 */
	public static String generateDomainOptionNameValue(String displayValue,String dataValue,List<String> domainTableKeyNames) {
		String value="";

		dataValue = org.springframework.util.StringUtils.trimAllWhitespace(dataValue);
		dataValue= dataValue.replace("'", "");
		String tempValue = dataValue.replace("%", "");
		
		if(isNumeric(tempValue)) {
			dataValue= dataValue.replace("%", "percentage");
			dataValue= dataValue.replace("-", "negative");
		}
		else {

			dataValue= dataValue.replace("%", "");
			dataValue= dataValue.replace("-", "");
		}		

		value = uncapitalizeValue( displayValue+"_"+dataValue);		
		if(domainTableKeyNames != null) {
			for(String domainKeyValue : domainTableKeyNames) {
				if(domainKeyValue.trim().length() > 0) {
					domainKeyValue =domainKeyValue.replaceAll(",", "");
					domainKeyValue =  org.springframework.util.StringUtils.trimAllWhitespace(domainKeyValue);
					value = value+ "_"+domainKeyValue;
				}
			}
		}	

		return value;

	}


	public static String trimAllWhitespace(String value) {

		String convertedValue =  value;
		convertedValue=	org.springframework.util.StringUtils.trimAllWhitespace(convertedValue);		
		return convertedValue;
	}

	public static boolean isNumeric(String strNum) {

		if (strNum == null) {
			return false;
		}
		strNum =strNum.replace(",", "");
		try {
			double d = Double.parseDouble(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static double getNumericValue(String strNum) {
		if (strNum == null) {
			return 0;
		}
		strNum =strNum.replace(",", "");
		try {
			return Double.parseDouble(strNum);
		} catch (NumberFormatException nfe) {
			return 0;
		}	   
	}



}
