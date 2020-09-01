/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collectionss;

/**
 *
 * @author Shardul
 */
///Collection(I)--> List(I)--> Class

import java.util.*;
public class CImplement {
    public static void main(String[] args) {
        Collection values=new ArrayList();
      //Interface             Class
        values.add(3);
        values.add(5);
        values.add("ABSS");
        Iterator i=values.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        } 
        for (Object value : values) {
            System.out.println(value);
        }
   
        
        List<Integer> val=new ArrayList<>();
      //Interface             Class
        val.add(3);
        val.add(5);
        val.add(1,9);
        val.add(89);
        
        Iterator j=val.iterator();
        while(j.hasNext())
        {
            System.out.println(j.next());
        } 
        for (int value : val) {
            System.out.println(value);
        }
        Collections.sort(val);
        val.forEach(System.out::print);// Stream API java 1.8 ....Lambda Expression
    }
}
