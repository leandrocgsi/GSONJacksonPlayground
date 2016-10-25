package br.com.erudio.jackson;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JSONNodeToObjectNodeTest {

	JSONNodeToObjectNode jsonNodeToObjectNode = new JSONNodeToObjectNode();
	@Test
	public void test() throws JsonProcessingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree("{\"address\":{\"zip\":98040, \"city\":\"Mercer Island\"}}");
		ObjectNode address = jsonNodeToObjectNode.getAsJsonObject(jsonNode);
		JsonNode jsonNode2 = address.get("address");
		if (address != null && jsonNode2.has("zip") && jsonNode2.has("city")) {
			int zip = jsonNode2.get("zip").intValue();
			String city = jsonNode2.get("city").textValue();
			System.out.println(city);
			System.out.println(zip);
			System.out.println(address.toString());
		}
	}

}
