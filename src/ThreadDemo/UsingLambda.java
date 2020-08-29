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
public class UsingLambda {
    public static void main(String[] args) {
        try {
            Thread t1=new Thread(()-> {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println("Hello");
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(UsingLambda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            Thread t2=new Thread(()->
            {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println("Hii");
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(UsingLambda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            t1.start();
            Thread.sleep(50);
            t2.start();
            
            
        } catch (Exception e) {
        }
    }
}
