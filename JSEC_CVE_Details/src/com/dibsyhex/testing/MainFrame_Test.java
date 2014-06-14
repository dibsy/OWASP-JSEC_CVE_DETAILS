package com.dibsyhex.testing;

import javax.swing.SwingUtilities;

import com.dibsyhex.views.SplashScreen;

public class MainFrame_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				//new MainFrame();
				
				final SplashScreen splashScreen=new SplashScreen();
				splashScreen.open(5000);
				//new MainFrame() in splashscreen;
				
				
				
				
				
				
				
				//new MainFrame();
			}
		});
		
	}

}
