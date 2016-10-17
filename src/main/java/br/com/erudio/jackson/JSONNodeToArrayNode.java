package br.com.erudio.jackson;

import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JSONNodeToArrayNode {
	
	public void jsonNodeToArrayNode(String jsonString) {

		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode arrNode = null;
		try {
			arrNode = objectMapper.readTree(jsonString).get("objects");
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (arrNode.isArray()) {
		    for (final JsonNode objNode : arrNode) {
		        System.out.println(objNode);
		    }
		}
	}
}
