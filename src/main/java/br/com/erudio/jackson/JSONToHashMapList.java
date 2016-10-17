package br.com.erudio.jackson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

public class JSONToHashMapList {
	
	public List<HashMap<String, Object>> jsonToObjectList(String jsonString) {
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		try {
			list = mapper.readValue(jsonString, TypeFactory.collectionType(List.class, HashMap.class));
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
