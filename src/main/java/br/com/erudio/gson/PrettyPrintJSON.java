package br.com.erudio.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class PrettyPrintJSON {
	
	public String toPrettyFormat(String jsonString) {
		JsonParser parser = new JsonParser();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		JsonElement el = parser.parse(jsonString);
		return gson.toJson(el);
	}
}