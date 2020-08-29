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
class Hi1 implements Runnable{
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(300);
            } catch (Exception ex) {
            }
            
        }
    }
}
class Hello1 implements Runnable{
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(300);
            } catch (Exception ex) {
            }
        }
    }
}

public class UsingInterface {
    public static void main(String[] args) {
        try {
            Hello1 obj1=new Hello1();
            Hi obj2=new Hi();
            Thread t1=new Thread(obj1);
            Thread t2=new Thread(obj2);
            t1.start();
            Thread.sleep(50);
            t2.start();
        } catch (Exception ex) {
            Logger.getLogger(UsingInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
    }
}
