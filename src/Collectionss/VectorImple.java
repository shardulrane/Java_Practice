/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collectionss;

import java.util.Vector;

/**
 *
 * @author DELL
 */
//Vector 1.0 se hai
//Vector increases the capacity by double i.e 100%
//kab use karna hai???? Vector->100% and Arraylist-->50%
// theory wise Vector is threadsafe and slow

public class VectorImple {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(4);
        v.add(8);
        v.add(9);
        v.add(4);
        v.add(8);
        v.add(9);
        v.add(4);
        v.add(8);
        v.add(9);
        v.add(4);
        v.add(8);
        v.add(9);   
        v.forEach(System.out::println);
        
    }
}
