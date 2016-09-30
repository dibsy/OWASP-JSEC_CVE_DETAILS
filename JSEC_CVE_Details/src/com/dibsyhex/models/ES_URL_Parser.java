package com.dibsyhex.models;

import java.io.PrintStream;

public class ES_URL_Parser {
    private String url;
    private String queryParams;
    private int type;

    public ES_URL_Parser(String queryParams, int type) {
        this.queryParams = queryParams;
        this.type = type;
    }

    public ES_URL_Parser() {
        this.url = "http://www.exploitsearch.net/json.php";
    }

    public void processURL() {
        try {
            this.url = "http://www.exploitsearch.net/json.php";
            this.url = String.valueOf(this.url) + "?q=" + this.queryParams + "&e=0";
        }
        catch (Exception e) {
            System.out.println("Error in processURL() in URL_Parser  " + e.toString());
        }
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getQueryParams() {
        return this.queryParams;
    }

    public void setQueryParams(String queryParams) {
        this.queryParams = queryParams;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

