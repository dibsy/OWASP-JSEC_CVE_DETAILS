package com.dibsyhex.models;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;

public class ES_JsonContainer {
    private JsonArray jsonArray;

    public void process() {
        try {
            System.out.println("ES JSON Container Called");
            File file = new File("ESJsonResponse.json");
            FileInputStream inputStream = new FileInputStream(file);
            JsonReader jsonReader = Json.createReader((InputStream)inputStream);
            this.jsonArray = jsonReader.readArray();
        }
        catch (Exception e) {
            System.out.println("Error in process() in JsonContainer:" + e.toString());
        }
    }

    public JsonArray getJsonArray() {
        return this.jsonArray;
    }
}

