package com.dibsyhex.testing;

import javax.json.JsonArray;
import javax.json.JsonObject;

import com.dibsyhex.models.JsonContainer;

public class JsonContainer_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonContainer jsonContainer=new JsonContainer();
		jsonContainer.process();
		JsonArray jsonArray=jsonContainer.getJsonArray();
		
		for (JsonObject result : jsonArray.getValuesAs(JsonObject.class)) {
	         System.out.println(result.getString("summary"));
	         
	     }
	}

}
