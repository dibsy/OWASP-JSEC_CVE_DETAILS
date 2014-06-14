package com.dibsyhex.testing;

import javax.json.JsonArray;
import javax.json.JsonObject;

import com.dibsyhex.controllers.HttpManager;

public class HttpManager_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpManager httpManager=new HttpManager("http://www.cvedetails.com/json-feed.php?numrows=30&vendor_id=0&product_id=0&version_id=0&hasexp=1&opec=0&opov=0&opcsrf=0&opfileinc=0&opgpriv=0&opsqli=0&opxss=0&opdirt=0&opmemc=0&ophttprs=0&opbyp=0&opginf=0&opdos=0&orderby=3&cvssscoremin=0");
		httpManager.process();
		JsonArray jsonArray=httpManager.getJsonArray();
		
		for (JsonObject result : jsonArray.getValuesAs(JsonObject.class)) {
	         System.out.println(result.getString("summary"));
	         
	     }
	}

}
