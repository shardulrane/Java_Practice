/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadDemo;

/**
 *
 * @author DELL
 */
class Counter{
    int cnt;
    public synchronized void increment()
    {
        cnt+=1;
    }
    
}
public class ThreadSync {
    public static void main(String[] args) {
        try {
            Counter c=new Counter();
            Thread t1=new Thread(()->
            {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
                
            }
            );
            Thread t2=new Thread(()->
            {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
            );
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println(c.cnt);
            
            
            
        } catch (Exception e) {
        }
    }
}
