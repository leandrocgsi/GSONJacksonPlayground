package br.com.erudio.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

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
