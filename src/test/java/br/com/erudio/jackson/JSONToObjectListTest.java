package br.com.erudio.jackson;

import java.util.List;

import org.junit.Test;

import br.com.erudio.jackson.JSONToObjectList;
import br.com.erudio.pojo.User;

public class JSONToObjectListTest {

	private JSONToObjectList jsonToObjectList = new JSONToObjectList();

	@Test
	public void test() {
		String jsonString = "[{\"age\":27,\"name\":\"Flavio\"},{\"age\":31,\"name\":\"Leandro\"}]";
		List<User> list = jsonToObjectList.jsonToObjectList(jsonString);
		System.out.println(list.get(0).getName() + " - " + list.get(0).getAge());
		System.out.println(list.get(1).getName() + " - " + list.get(1).getAge());
	}

}
