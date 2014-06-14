package com.dibsyhex.models;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;

public class JsonContainer {
	private JsonArray jsonArray;
	
	public JsonContainer(){
		
	}

	public void process() {
		try{
			File file=new File("JsonResponse.json");
			InputStream inputStream=new FileInputStream(file);
			JsonReader jsonReader=Json.createReader(inputStream);
			jsonArray=jsonReader.readArray();
		}catch(Exception e){
			System.out.println("Error in process() in JsonContainer:"+e.toString());
		}
		
	}

	public JsonArray getJsonArray() {
		return jsonArray;
	}

}
