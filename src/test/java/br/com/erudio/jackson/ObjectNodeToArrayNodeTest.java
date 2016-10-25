package br.com.erudio.jackson;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import br.com.erudio.pojo.User;

public class ObjectNodeToArrayNodeTest {

	private ObjectNodeToArrayNode objectNodeToArrayNode = new ObjectNodeToArrayNode();

	@Test
	public void test() throws JsonProcessingException, IOException {
		String jsonString = "{\"persons\": [{\"age\":27,\"name\":\"Flavio\"},{\"age\":31,\"name\":\"Leandro\"},{\"age\":58,\"name\":\"Geraldo\"},{\"age\":54,\"name\":\"Vera\"}]}";
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(jsonString);
		ArrayNode list = objectNodeToArrayNode.getChildrenList((ObjectNode) jsonNode);
		List<User> users = mapper.readValue(list.toString(), new TypeReference<List<User>>(){});
		for (User user : users) {
			System.out.println(user.getName() + " - " + user.getAge());
		}
	}

}
