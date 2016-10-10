package br.com.uol.vericad.jackson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

import br.com.uol.vericad.pojo.User;

public class JSONToObjectList {
	
	public List<User> jsonToObjectList(String jsonString) {
		ObjectMapper mapper = new ObjectMapper();
		List<User> list = new ArrayList<User>();
		try {
			list = mapper.readValue(jsonString, TypeFactory.collectionType(List.class, User.class));
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
