package com.dibsyhex.controllers;

import com.dibsyhex.controllers.ESHttpManager;
import com.dibsyhex.models.ES_URL_Parser;
import javax.json.JsonArray;

public class ESController {
    private String url;
    private JsonArray jsonArray;

    public ESController(String query) {
        ES_URL_Parser esurlParser = new ES_URL_Parser(query, 0);
        esurlParser.processURL();
        this.url = esurlParser.getUrl();
    }

    public void process() {
        ESHttpManager eshttpManager = new ESHttpManager(this.url);
        eshttpManager.process();
        this.jsonArray = eshttpManager.getJsonArray();
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

