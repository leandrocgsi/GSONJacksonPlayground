package br.com.uol.vericad.jackson;

import org.junit.Test;

public class PrettyPrintJSONTest {

	private PrettyPrintJSON prettyPrintJSON = new PrettyPrintJSON();

	@Test
	public void test() {
		String jsonString = "{\"age\":29,\"name\":\"mkyong\"}";
		System.out.println(prettyPrintJSON.toPrettyFormat(jsonString));;
	}
}
