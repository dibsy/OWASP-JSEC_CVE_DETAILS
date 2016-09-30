package com.dibsyhex.controllers;

import com.dibsyhex.controllers.ESXHttpManager;
import com.dibsyhex.models.ESX_URL_Parser;
import javax.json.JsonArray;

public class ESXController {
    private String url;
    private JsonArray jsonArray;

    public ESXController(String query) {
        ESX_URL_Parser esxurlParser = new ESX_URL_Parser(query, 1);
        esxurlParser.processURL();
        this.url = esxurlParser.getUrl();
    }

    public void process() {
        ESXHttpManager esxhttpManager = new ESXHttpManager(this.url);
        esxhttpManager.process();
        this.jsonArray = esxhttpManager.getJsonArray();
    }

    public JsonArray getJsonArray() {
        return this.jsonArray;
    }

    public void setJsonArray(JsonArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

