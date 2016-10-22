package br.com.erudio.jackson;

import org.junit.Test;

import br.com.erudio.jackson.PrettyPrintJSON;

public class PrettyPrintJSONTest {

	private PrettyPrintJSON prettyPrintJSON = new PrettyPrintJSON();

	@Test
	public void test() {
		String jsonString = "{\"age\":31,\"name\":\"Leandro\"}";
		System.out.println(prettyPrintJSON.toPrettyFormat(jsonString));;
	}
}
