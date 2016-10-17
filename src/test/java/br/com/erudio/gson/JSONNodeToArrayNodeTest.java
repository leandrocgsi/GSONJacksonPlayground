package br.com.erudio.gson;

import org.junit.Test;

import br.com.erudio.jackson.JSONNodeToArrayNode;

public class JSONNodeToArrayNodeTest {

	private  JSONNodeToArrayNode jsonNodeToArrayNode = new  JSONNodeToArrayNode();

	@Test
	public void test() {
		String jsonString = "{\"objects\" : [\"One\", \"Two\", \"Three\"]}";
		jsonNodeToArrayNode.jsonNodeToArrayNode(jsonString);
	}

}
