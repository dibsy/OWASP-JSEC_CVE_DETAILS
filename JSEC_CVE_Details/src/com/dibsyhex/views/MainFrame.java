package com.dibsyhex.views;

import java.awt.BorderLayout;

import javax.json.JsonArray;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

	public MainFrame() {
		
		super("JSEC CVE Details");
		setSize(900,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setResizable(false);
		
		VulnerabilityPanel vulnerabilityPanel=new VulnerabilityPanel();
		MenuBar menuBar=new MenuBar();
		final ResponsePanel responsePanel=new ResponsePanel();//
		add(vulnerabilityPanel,BorderLayout.WEST);
		add(menuBar.getMenuBar(),BorderLayout.NORTH);
		add(responsePanel,BorderLayout.CENTER);
		
		vulnerabilityPanel.setStringListener(new JsonListener() {
			
			@Override
			public void returnedText(JsonArray jsonArray) {
				// TODO Auto-generated method stub
				responsePanel.printPreety(jsonArray);
			}
		});
		
		
	}
}
