package com.dibsyhex.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;


public class ResponsePanel extends JPanel{
	private JTextArea response;
	private JsonArray jsonArray;
	
	public ResponsePanel(){
		response=new JTextArea();
		setLayout(new BorderLayout());
		add(new JScrollPane(response));
		response.setEnabled(false);
		response.setDisabledTextColor(Color.BLACK);
		
		response.setBackground(new Color(255,255,204));
		
		
		
		Border innerBorder = BorderFactory.createTitledBorder("Result");
		Border outerBorder = BorderFactory.createEmptyBorder(15, 15, 15, 15);
		setBorder(BorderFactory.createCompoundBorder(innerBorder, outerBorder));
		
		setFont(new Font("Serif",Font.PLAIN,4));
		
		setBackground(new Color(229,255,204));
		
		
		
	}

	
	public JTextArea getResponse() {
		return response;
	}


	public void setResponse(JTextArea response) {
		this.response = response;
	}


	public JsonArray getJsonArray() {
		return jsonArray;
	}


	public void setJsonArray(JsonArray jsonArray) {
		this.jsonArray = jsonArray;
	}


	public void printPreety(JsonArray jsonArray) {
		//System.out.println("okay");
		//response.append("Okay Tested\n");
		//response.append(""+jsonArray.size());
		
		response.setText("");
		
		for (JsonObject result : jsonArray.getValuesAs(JsonObject.class)) {
	         //System.out.println(result.getString("summary"));
			 response.append("CVE-ID : ");
			 response.append(result.getString("cve_id"));
			 response.append("\n");
			 
			 response.append("CWE-ID : ");
			 response.append(result.getString("cwe_id"));
			 response.append("\n");
			 
			 response.append("SUMMARY : ");
			 response.append(result.getString("summary"));
			 response.append("\n");
			 
			 response.append("CVSS_SCORE : ");
			 response.append(result.getString("cvss_score"));
			 response.append("\n");
			 
			 response.append("EXPLOIT-COUNT : ");
			 response.append(result.getString("exploit_count"));
			 response.append("\n");
			 
			 response.append("PUBLISH-DATE : ");
			 response.append(result.getString("publish_date"));
			 response.append("\n");
			 
			 response.append("UPDATE-DATE : ");
			 response.append(result.getString("update_date"));
			 response.append("\n");
			 
			 response.append("URL : ");
			 response.append(result.getString("url"));
	         response.append("\n\n\n");
	     }
		
		
	}

}
