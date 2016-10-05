package br.com.uol.vericad.gson;

import java.util.List;

import br.com.uol.vericad.pojo.User;

import com.google.gson.Gson;

public class JSONToObjectList {
	
	@SuppressWarnings("unchecked")
	public List<User> jsonToObjectList(String jsonString) {
		Gson gson = new Gson();
		List<User> list = gson.fromJson(jsonString, List.class);
		return list;
	}
}
