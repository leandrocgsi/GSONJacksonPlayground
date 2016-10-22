package br.com.erudio.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PrettyPrintJSON {
	
	public String toPrettyFormat(String jsonString) {
		ObjectMapper mapper = new ObjectMapper();
		String formatedJSON = "";
		try {
			Object json = mapper.readValue(jsonString, Object.class);
			formatedJSON = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);
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