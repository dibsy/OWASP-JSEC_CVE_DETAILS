/* The URL_Parser Class generates a query URL using a url and the list of query parameters stored in the HashMap
 * 
 * 
*/
package com.dibsyhex.models;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class URL_Parser {
	private String url;//Final url that will be returned
	private Map queryParams;//Contains all the parameters of the query to be processed
	private int numRows;//Number of results that will be returned by the api call. 
	
	
	public URL_Parser(Map queryParams,int numRows){
		this.numRows=numRows;
		url="http://www.cvedetails.com/json-feed.php";
		url=url+"?numrows="+numRows;//Generate a url like http://www.cvedetails.com/json-feed.php?numrows=30
		this.queryParams=queryParams;//		
		
		
	}
	
	public URL_Parser(){
		url=new String();
		url="http://www.cvedetails.com/json-feed.php";
	}
	
	public void processURL(){
		
		try{			
			url=url+"?numrows="+numRows;//Generate a url like http://www.cvedetails.com/json-feed.php?numrows=30
			
			Set setKeys=queryParams.keySet();
			Iterator iterator=setKeys.iterator();
			while(iterator.hasNext()){
				String key=(String)iterator.next();
				String value=(String)queryParams.get(key);
				url=url+"&"+key+"="+value;				
			}
			//System.out.println(url);
			
		}catch(Exception e){
			System.out.println("Error in processURL() in URL_Parser  "+e.toString());
		}
		
		
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Map getQueryParams() {
		return queryParams;
	}

	public void setQueryParams(Map queryParams) {
		this.queryParams = queryParams;
	}

	public int getNumRows() {
		return numRows;
	}

	public void setNumRows(int numRows) {
		this.numRows = numRows;
	}
	
	
	

}
