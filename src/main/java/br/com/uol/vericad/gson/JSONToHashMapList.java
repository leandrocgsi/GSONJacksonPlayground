package br.com.uol.vericad.gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;

public class JSONToHashMapList {
	
	@SuppressWarnings("unchecked")
	public List<HashMap<String, Object>> jsonToObjectList(String jsonString) {
		Gson gson = new Gson();
		List<HashMap<String, Object>> list = gson.fromJson(jsonString, ArrayList.class);
		return list;
	}
}
