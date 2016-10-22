package br.com.erudio.jackson;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateJSONObject {

	public String createJSONObject(Object obj) {
		ObjectMapper mapper = new ObjectMapper();
		String json = "";
		try {
			json = mapper.writeValueAsString(obj);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return json;
	}
}
