package com.dibsyhex.views;

import com.dibsyhex.views.ExploitSearch;
import com.dibsyhex.views.JsonListener;
import com.dibsyhex.views.MenuBar;
import com.dibsyhex.views.ResponsePanel;
import com.dibsyhex.views.VulnerabilityPanel;
import com.dibsyhex.views.VulnerabilitySearch;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import javax.json.JsonArray;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainFrame
extends JFrame {
    private JTabbedPane tabbedPane;

    public MainFrame() {
        super("OWASP JSEC CVE Details v2.0");
        this.setSize(900, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        VulnerabilityPanel vulnerabilityPanel = new VulnerabilityPanel();
        MenuBar menuBar = new MenuBar();
        final ResponsePanel responsePanel = new ResponsePanel();
        this.add((Component)vulnerabilityPanel, "West");
        this.add((Component)menuBar.getMenuBar(), "North");
        this.add((Component)responsePanel, "Center");
        vulnerabilityPanel.setStringListener(new JsonListener(){

            @Override
            public void returnedText(JsonArray jsonArray) {
                responsePanel.printPreety(jsonArray);
            }
        });
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        this.getContentPane().add(topPanel);
        VulnerabilitySearch vulnerabilitySearch = new VulnerabilitySearch();
        ExploitSearch exploitSearch = new ExploitSearch();
        this.tabbedPane = new JTabbedPane();
        this.tabbedPane.addTab("Recent CVEs", responsePanel);
        this.tabbedPane.addTab("Search Vulnerabilities", vulnerabilitySearch);
        this.tabbedPane.addTab("Search Exploits", exploitSearch);
        topPanel.add((Component)this.tabbedPane, "Center");
    }

}

