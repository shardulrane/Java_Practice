/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadDemo;

import sun.audio.AudioPlayer;

/**
 *
 * @author DELL
 */
class Q
{
    int num;
    boolean isthere=false;

    public synchronized void produce(int num) {
        while (isthere)
        {
            try{ wait();}catch(Exception e){};
        }
        System.out.println("Produced: "+num);
        this.num = num;
        isthere=true;
        notify();
    }
    public synchronized void consume() {
        while(!isthere)
        {
            try{ wait();}catch(Exception e){};
        }
        System.out.println("Consumed: "+num);
        isthere=false;
        notify();
    }
}   

class Producer implements Runnable
{
    Q q=new Q();

    public Producer(Q q) {
        this.q=q;
        Thread t=new Thread(this,"Prodcuer");
        t.start();
    }
    
    public void run() {
        int i=0;
        while(true)
        {
           q.produce(i++);
           try{ Thread.sleep(1000);}catch(Exception e){};
        }
    }
}
class Comsumer implements Runnable
{
    Q q=new Q();

    public Comsumer(Q q) {
        this.q=q;
        Thread t=new Thread(this,"Consumer");
        t.start();
    }
    
    public void run() {
        int i=0;
        while(true)
        {
           q.consume();
           try{ Thread.sleep(1000);}catch(Exception e){};
        }
    }
}


public class ProducerConsumer {
    public static void main(String[] args) {
        Q q=new Q();
        new Producer(q);
        new Comsumer(q);
    }
}
