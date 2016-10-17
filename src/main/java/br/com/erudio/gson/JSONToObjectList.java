package br.com.erudio.gson;

import java.util.List;

import com.google.gson.Gson;

import br.com.erudio.pojo.User;

public class JSONToObjectList {
	
	@SuppressWarnings("unchecked")
	public List<User> jsonToObjectList(String jsonString) {
		Gson gson = new Gson();
		List<User> list = gson.fromJson(jsonString, List.class);
		return list;
	}
}
