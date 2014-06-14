package com.dibsyhex.views;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuBar implements ActionListener{
	public JMenuBar getMenuBar(){
		
		JMenuBar jMenuBar=new JMenuBar();
		
		JMenu fileMenu=new JMenu("File");
//		JMenuItem item1=new JMenuItem("Export Data");
//		JMenuItem item2=new JMenuItem("Import Data");
//		JMenuItem item3=new JMenuItem("Exit");
//		
//		fileMenu.add(item1);
//		fileMenu.add(item2);
//		fileMenu.add(item3);
		
		JMenu aboutMenu=new JMenu("About");
		JMenuItem aboutCVE=new JMenuItem("About CVE Details");
		JMenuItem aboutJSEC=new JMenuItem("About JSEC CVE Details");
		JMenuItem developer=new JMenuItem("Developer");
		
		
		aboutCVE.addActionListener(this);
		aboutCVE.setActionCommand("aboutCVE");
		
		aboutJSEC.addActionListener(this);
		aboutJSEC.setActionCommand("aboutJSEC");
		
		developer.addActionListener(this);
		developer.setActionCommand("developer");
		
		aboutMenu.add(aboutCVE);
		aboutMenu.add(aboutJSEC);
		aboutMenu.add(developer);
		
		jMenuBar.add(fileMenu);
		jMenuBar.add(aboutMenu);
		
		jMenuBar.setBackground(new Color(255,204,143));
		
		return jMenuBar;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		DeveloperMessage developerMessage=new DeveloperMessage();
		
		String cmd=e.getActionCommand();
		if(cmd.equals("aboutCVE"))
			JOptionPane.showMessageDialog(null,developerMessage.getCveMessage());
		else if(cmd.equals("aboutJSEC"))
			JOptionPane.showMessageDialog(null,developerMessage.getJsecMessage());
		else if(cmd.equals("developer"))
			JOptionPane.showMessageDialog(null,developerMessage.getDeveloper());
			
			
	}
	
}
