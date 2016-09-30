package com.dibsyhex.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.util.List;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class ResponsePanel
extends JPanel {
    private JTextArea response = new JTextArea();
    private JsonArray jsonArray;

    public ResponsePanel() {
        this.setLayout(new BorderLayout());
        this.add(new JScrollPane(this.response));
        this.response.setEnabled(false);
        this.response.setDisabledTextColor(Color.BLACK);
        this.response.setBackground(new Color(255, 255, 204));
        TitledBorder innerBorder = BorderFactory.createTitledBorder("Result");
        Border outerBorder = BorderFactory.createEmptyBorder(15, 15, 15, 15);
        this.setBorder(BorderFactory.createCompoundBorder(innerBorder, outerBorder));
        this.setFont(new Font("Serif", 0, 4));
        this.setBackground(new Color(229, 255, 204));
    }

    public JTextArea getResponse() {
        return this.response;
    }

    public void setResponse(JTextArea response) {
        this.response = response;
    }

    public JsonArray getJsonArray() {
        return this.jsonArray;
    }

    public void setJsonArray(JsonArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    public void printPreety(JsonArray jsonArray) {
        this.response.setText("");
        System.out.println(jsonArray.toString());
        
        int size = jsonArray.size();
        int i=0;
        while(i<size){
        	JsonObject result=jsonArray.getJsonObject(i);
        	this.response.append("CVE-ID : ");
            this.response.append(result.getString("cve_id"));
            this.response.append("\n");
            this.response.append("CWE-ID : ");
            this.response.append(result.getString("cwe_id"));
            this.response.append("\n");
            this.response.append("SUMMARY : ");
            this.response.append(result.getString("summary"));
            this.response.append("\n");
            this.response.append("CVSS_SCORE : ");
            this.response.append(result.getString("cvss_score"));
            this.response.append("\n");
            this.response.append("EXPLOIT-COUNT : ");
            this.response.append(result.getString("exploit_count"));
            this.response.append("\n");
            this.response.append("PUBLISH-DATE : ");
            this.response.append(result.getString("publish_date"));
            this.response.append("\n");
            this.response.append("UPDATE-DATE : ");
            this.response.append(result.getString("update_date"));
            this.response.append("\n");
            this.response.append("URL : ");
            this.response.append(result.getString("url"));
            this.response.append("\n\n\n");
        	i++;
        }
        
        
        /*
        for (JsonObject result : jsonArray.getValuesAs(JsonObject.class)) {
            this.response.append("CVE-ID : ");
            this.response.append(result.getString("cve_id"));
            this.response.append("\n");
            this.response.append("CWE-ID : ");
            this.response.append(result.getString("cwe_id"));
            this.response.append("\n");
            this.response.append("SUMMARY : ");
            this.response.append(result.getString("summary"));
            this.response.append("\n");
            this.response.append("CVSS_SCORE : ");
            this.response.append(result.getString("cvss_score"));
            this.response.append("\n");
            this.response.append("EXPLOIT-COUNT : ");
            this.response.append(result.getString("exploit_count"));
            this.response.append("\n");
            this.response.append("PUBLISH-DATE : ");
            this.response.append(result.getString("publish_date"));
            this.response.append("\n");
            this.response.append("UPDATE-DATE : ");
            this.response.append(result.getString("update_date"));
            this.response.append("\n");
            this.response.append("URL : ");
            this.response.append(result.getString("url"));
            this.response.append("\n\n\n");
        }
        */
    }
}

