/*
 * 	The SplashScreen displays the software banner for some given seconds and then starts the application
 */

package com.dibsyhex.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.Timer;

public class SplashScreen extends JWindow  {
	
	public SplashScreen(){
		super(new JFrame());
		setSize(500, 350);
		setVisible(true);
		setLocationRelativeTo(null);
		//JLabel image=new JLabel(new ImageIcon("JSEC_CVE_DETAILS.png"));
		JLabel image=new JLabel(new ImageIcon(getClass().getResource("JSEC_CVE_DETAILS.png")));
		add(image);		
	}

	public void open(int seconds) {
       
		Timer timer=new Timer(Integer.MAX_VALUE,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 ((Timer) e.getSource()).stop();
	                close();
			}
		});
		
		 	timer.setInitialDelay(seconds);
	        timer.start();
	        setVisible(true);
		
    }
	
    public void close() {
        setVisible(false);
        dispose();
        
        //Once the JWindow is disposed create an object of the Mainframe to start the GUI application
        
        new MainFrame();
    }
    

}
