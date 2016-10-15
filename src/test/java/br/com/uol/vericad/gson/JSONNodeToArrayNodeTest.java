package br.com.uol.vericad.gson;

import org.junit.Test;

import br.com.uol.vericad.jackson.JSONNodeToArrayNode;

public class JSONNodeToArrayNodeTest {

	private  JSONNodeToArrayNode jsonNodeToArrayNode = new  JSONNodeToArrayNode();

	@Test
	public void test() {
		String jsonString = "{\"objects\" : [\"One\", \"Two\", \"Three\"]}";
		jsonNodeToArrayNode.jsonNodeToArrayNode(jsonString);
	}

}
