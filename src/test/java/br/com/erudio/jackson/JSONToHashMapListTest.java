package br.com.erudio.jackson;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import br.com.erudio.jackson.JSONToHashMapList;

public class JSONToHashMapListTest {

	private  JSONToHashMapList jsonToHashMapList = new  JSONToHashMapList();

	@Test
	public void test() {
		String jsonString = "[{\"age\":27,\"name\":\"Flávio\"},{\"age\":31,\"name\":\"Leandro\"}]";
		List<HashMap<String, Object>> list = jsonToHashMapList.jsonToObjectList(jsonString);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}

}
