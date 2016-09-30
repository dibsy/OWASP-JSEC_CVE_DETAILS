package com.dibsyhex.models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class ESX_HttpJsonResponse {
    private String url;
    private final String USER_AGENT = "Mozilla/5.0";

    public void process() {
        try {
            String response;
            URL urlObject = new URL(this.url);
            HttpURLConnection httpURLConnection = (HttpURLConnection)urlObject.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            File file = new File("ESXJsonResponse.json");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            while ((response = bufferedReader.readLine()) != null) {
                bufferedWriter.write(response);
            }
            bufferedWriter.close();
        }
        catch (Exception e) {
            System.out.println("Error in process() in HttpJsonResponse:" + e.toString());
        }
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

