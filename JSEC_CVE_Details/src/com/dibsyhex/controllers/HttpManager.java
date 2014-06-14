/*
 *  HTTP Manager controller does 2 activities
 *  1.Writes a json response to a file 
 *  2.Parses the json response from a file into a JSON Array object 
 */

package com.dibsyhex.controllers;

import javax.json.JsonArray;

import com.dibsyhex.models.HttpJsonResponse;
import com.dibsyhex.models.JsonContainer;

public class HttpManager {
	private String url;
	private JsonArray jsonArray;
	
	public HttpManager(String url){
		this.url=url;
	}
	
	public void process(){
		
		//HttpJsonResponse makes a request and stores the json response in a json file
		HttpJsonResponse httpJsonResponse=new HttpJsonResponse();
		httpJsonResponse.setUrl(url);
		httpJsonResponse.process();
		
		JsonContainer jsonContainer=new JsonContainer();
		jsonContainer.process();
		jsonArray=jsonContainer.getJsonArray();		
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public JsonArray getJsonArray() {
		return jsonArray;
	}

	public void setJsonArray(JsonArray jsonArray) {
		this.jsonArray = jsonArray;
	}
	
}
