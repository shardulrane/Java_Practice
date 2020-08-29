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
class Hi extends Thread{
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(300);
            } catch (Exception ex) {
                Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
class Hello extends Thread{
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(300);
            } catch (Exception ex) {
                Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Hi obj1=new Hi();
        Hello obj2=new Hello();
        obj1.start();
        try {
                Thread.sleep(10);
            } catch (Exception ex) {
                Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
            }
        obj2.start();
        
    }
    
}
