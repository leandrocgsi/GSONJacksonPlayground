package br.com.erudio.jackson;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;

public class PrettyPrintJSON {
	
	public String toPrettyFormat(String jsonString) {
		ObjectMapper mapper = new ObjectMapper();
		String formatedJSON = "";
		try {
			Object json = mapper.readValue(jsonString, Object.class);
			mapper.configure(Feature.INDENT_OUTPUT, true);
			formatedJSON = mapper.writeValueAsString(json);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return formatedJSON;
	}
}