package com.dibsyhex.views;

import com.dibsyhex.views.SplashScreen;
import javax.swing.SwingUtilities;

public class JSEC {
    public static void main(String[] args) {
        try {
            SwingUtilities.invokeLater(new Runnable(){

                @Override
                public void run() {
                    SplashScreen splashScreen = new SplashScreen();
                    splashScreen.open(5000);
                }
            });
        }
        catch (Exception e) {
            // empty catch block
        }
    }

}

