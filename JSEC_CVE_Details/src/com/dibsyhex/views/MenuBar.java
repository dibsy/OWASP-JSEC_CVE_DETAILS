package com.dibsyhex.views;

import com.dibsyhex.views.DeveloperMessage;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuBar
implements ActionListener {
    public JMenuBar getMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu aboutMenu = new JMenu("About");
        JMenuItem aboutCVE = new JMenuItem("About CVE Details");
        JMenuItem aboutExploitSearch = new JMenuItem("About ExploitSearch");
        JMenuItem aboutJSEC = new JMenuItem("About JSEC CVE Details");
        JMenuItem developer = new JMenuItem("Developer");
        aboutCVE.addActionListener(this);
        aboutCVE.setActionCommand("aboutCVE");
        aboutJSEC.addActionListener(this);
        aboutJSEC.setActionCommand("aboutJSEC");
        developer.addActionListener(this);
        developer.setActionCommand("developer");
        aboutExploitSearch.addActionListener(this);
        aboutExploitSearch.setActionCommand("aboutES");
        aboutMenu.add(aboutCVE);
        aboutMenu.add(aboutJSEC);
        aboutMenu.add(aboutExploitSearch);
        aboutMenu.add(developer);
        jMenuBar.add(aboutMenu);
        jMenuBar.setBackground(new Color(255, 204, 143));
        return jMenuBar;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DeveloperMessage developerMessage = new DeveloperMessage();
        String cmd = e.getActionCommand();
        if (cmd.equals("aboutCVE")) {
            JOptionPane.showMessageDialog(null, developerMessage.getCveMessage());
        } else if (cmd.equals("aboutJSEC")) {
            JOptionPane.showMessageDialog(null, developerMessage.getJsecMessage());
        } else if (cmd.equals("developer")) {
            JOptionPane.showMessageDialog(null, developerMessage.getDeveloper());
        } else if (cmd.equals("aboutES")) {
            JOptionPane.showMessageDialog(null, developerMessage.getExploitMessage());
        }
    }
}

