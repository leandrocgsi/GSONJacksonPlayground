package br.com.erudio.jackson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONToHashMapList {
	
	public List<HashMap<String, Object>> jsonToObjectList(String jsonString) {
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		try {
			list = mapper.readValue(jsonString, new TypeReference<Map<String, Object>>(){});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
