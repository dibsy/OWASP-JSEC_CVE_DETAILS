package com.dibsyhex.controllers;

import com.dibsyhex.models.ES_HttpJsonResponse;
import com.dibsyhex.models.ES_JsonContainer;
import java.io.PrintStream;
import javax.json.JsonArray;

public class ESHttpManager {
    private String url;
    private JsonArray jsonArray;

    public ESHttpManager(String url) {
        System.out.println("ES HttpManager Called");
        this.url = url;
    }

    public void process() {
        ES_HttpJsonResponse httpJsonResponse = new ES_HttpJsonResponse();
        httpJsonResponse.setUrl(this.url);
        httpJsonResponse.process();
        ES_JsonContainer jsonContainer = new ES_JsonContainer();
        jsonContainer.process();
        this.jsonArray = jsonContainer.getJsonArray();
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public JsonArray getJsonArray() {
        return this.jsonArray;
    }

    public void setJsonArray(JsonArray jsonArray) {
        this.jsonArray = jsonArray;
    }
}

