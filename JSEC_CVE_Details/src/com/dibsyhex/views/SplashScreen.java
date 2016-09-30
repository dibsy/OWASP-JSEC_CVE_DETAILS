package com.dibsyhex.views;

import com.dibsyhex.views.MainFrame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.Timer;

public class SplashScreen
extends JWindow {
    public SplashScreen() {
        super(new JFrame());
        this.setSize(600, 600);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 255, 0, 0));
        JLabel image = new JLabel(new ImageIcon(this.getClass().getResource("JSEC_CVE_DETAILS.png")));
        this.add(image);
    }

    public void open(int seconds) {
        Timer timer = new Timer(Integer.MAX_VALUE, new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                ((Timer)e.getSource()).stop();
                SplashScreen.this.close();
            }
        });
        timer.setInitialDelay(seconds);
        timer.start();
        this.setVisible(true);
    }

    public void close() {
        this.setVisible(false);
        this.dispose();
        new com.dibsyhex.views.MainFrame();
    }

}

