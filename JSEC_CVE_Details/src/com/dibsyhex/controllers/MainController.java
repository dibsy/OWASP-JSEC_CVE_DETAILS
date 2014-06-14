package com.dibsyhex.controllers;

import java.util.Map;

import javax.json.JsonArray;

import com.dibsyhex.models.URL_Parser;

public class MainController {
	private String url;
	private JsonArray jsonArray;
	//private 
	public MainController(Map queryParams,int numRows){
		
		URL_Parser urlParser=new URL_Parser();
		urlParser.setNumRows(numRows);
		urlParser.setQueryParams(queryParams);
		urlParser.processURL();
		url=urlParser.getUrl();
		
	}
	
	public void process(){

		HttpManager httpManager=new HttpManager(url);	
		httpManager.process();
		jsonArray=httpManager.getJsonArray();
	
	}
	
	public JsonArray getJsonArray() {
		return jsonArray;
	}



	public void setJsonArray(JsonArray jsonArray) {
		this.jsonArray = jsonArray;
	}



	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
