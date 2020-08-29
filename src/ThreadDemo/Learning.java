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
public class Learning {
   public static void main(String[] args) {
        try {
            Thread t1=new Thread(()-> {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println("-> "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
                        Thread.sleep(2000);
                    } catch (Exception ex) {}
                }
            },"Hello Thread");
            Thread t2=new Thread(()->
            {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println("-> "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
                        Thread.sleep(1900);
                    } catch (Exception ex) {}
                }
            },"Hii Thread");
            t1.start();
            Thread.sleep(1000);
            t2.start();
            t1.join();
            t2.join();
            System.out.println("Bye");
        } catch (Exception ex) {}
    } 
}
