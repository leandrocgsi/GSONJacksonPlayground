package br.com.erudio.jackson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.erudio.pojo.User;

public class JSONToObjectList {
	
	public List<User> jsonToObjectList(String jsonString) {
		ObjectMapper mapper = new ObjectMapper();
		List<User> list = new ArrayList<User>();
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
