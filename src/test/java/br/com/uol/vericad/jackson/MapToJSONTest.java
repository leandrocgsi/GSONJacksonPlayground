package br.com.uol.vericad.jackson;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapToJSONTest {
	
	MapToJSON mapToJSON = new MapToJSON();

	@Test
	public void testMapToJSON() {
		Map<String,String> payload = new HashMap<String, String>();
		payload.put("key1","value1");
		payload.put("key2","value2");
		
		String mapToJSON2 = mapToJSON.mapToJSON(payload);
		System.out.println(mapToJSON2);
	}
}