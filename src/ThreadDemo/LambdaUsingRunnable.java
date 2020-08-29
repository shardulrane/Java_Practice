/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadDemo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class LambdaUsingRunnable {
    public static void main(String[] args) {
        try {
            Runnable r1=()->{
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println("Kaise ho");
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(LambdaUsingRunnable.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            };
            Runnable r2=()->{
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println("Thik hun");
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(LambdaUsingRunnable.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            };
            Thread t1=new Thread(r1);
            Thread t2=new Thread(r2);
            
            t1.start();
            Thread.sleep(50);
            t2.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(LambdaUsingRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
