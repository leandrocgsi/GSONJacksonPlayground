package br.com.uol.vericad;

import org.junit.Test;

import br.com.uol.vericad.jackson.CreateJSONObject;
import br.com.uol.vericad.pojo.User;


public class CreateJSONObjectTest {

	private CreateJSONObject createJSONObject = new CreateJSONObject();
	
	@Test
	public void testCreateJSONObject() {
		User user = new User();
		user.setName("Foo Bar");
		user.setAge(28);
		System.out.println(createJSONObject.createJSONObject(user));
	}

}
