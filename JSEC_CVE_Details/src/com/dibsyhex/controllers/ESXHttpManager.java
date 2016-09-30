package com.dibsyhex.controllers;

import com.dibsyhex.models.ESX_HttpJsonResponse;
import com.dibsyhex.models.ESX_JsonContainer;
import javax.json.JsonArray;

public class ESXHttpManager {
    private String url;
    private JsonArray jsonArray;

    public ESXHttpManager(String url) {
        this.url = url;
    }

    public void process() {
        ESX_HttpJsonResponse esxhttpJsonResponse = new ESX_HttpJsonResponse();
        esxhttpJsonResponse.setUrl(this.url);
        esxhttpJsonResponse.process();
        ESX_JsonContainer esxjsonContainer = new ESX_JsonContainer();
        esxjsonContainer.process();
        this.jsonArray = esxjsonContainer.getJsonArray();
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

