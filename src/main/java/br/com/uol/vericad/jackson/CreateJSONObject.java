package br.com.uol.vericad.jackson;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;


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
