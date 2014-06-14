


package com.dibsyhex.models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpJsonResponse {
	private String url;
	private final String USER_AGENT = "Mozilla/5.0";

	
	
	public void process(){
		try{
			URL urlObject=new URL(url);
			//System.out.println(url);
			HttpURLConnection httpURLConnection=(HttpURLConnection)urlObject.openConnection();
			
			httpURLConnection.setRequestMethod("GET");
			httpURLConnection.setRequestProperty("User-Agent",USER_AGENT);
			
			
			
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			File file=new File("JsonResponse.json");//Make sure to delete the file
			
			if(!file.exists()){
				file.createNewFile();
			}
			
			FileWriter fileWriter=new FileWriter(file.getAbsoluteFile());
			BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

			
			String response;
			
			while((response=bufferedReader.readLine())!=null){
				bufferedWriter.write(response);
				//System.out.println(response);
			}
			bufferedWriter.close();
			
		}catch(Exception e){
			System.out.println("Error in process() in HttpJsonResponse:"+e.toString());
		}
		finally{
			
		}
		
		
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
}
