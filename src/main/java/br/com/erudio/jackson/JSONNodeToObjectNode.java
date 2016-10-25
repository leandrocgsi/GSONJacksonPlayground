package br.com.erudio.jackson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JSONNodeToObjectNode {
	
	public ObjectNode getAsJsonObject(JsonNode jsonNode) {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode jsonTreeObject = mapper.createObjectNode();
		jsonTreeObject = (ObjectNode) jsonNode;
		return jsonTreeObject;
	}
}