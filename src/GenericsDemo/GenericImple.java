/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsDemo;

import java.util.*;
/**
 *
 * @author Shardul
 */
/// Collections 1.2 Generics 1.5 mein aaya and woh
// Container<Integer> obj=new Container<>();
//             2nd time mention karne ki jarurat nahi hai yeh 1.7 se aaya
class Container<S extends Number>
{
    S value;
    public void show()
    {
        System.out.println(value.getClass().getName());
    }
    public void demo(ArrayList<? extends S> obj)
    {
    
    }
    public void demo1(ArrayList<? super S> obj)
    {
    
    }
}
public class GenericImple {
    public static void main(String[] args) {
        int value=5;
        List<Integer> values=new ArrayList<>();
        values.add(7);
        values.add(8);
        values.add(9);
        values.add(15);
        System.out.println(values.get(1));
        //Container obj=new Container();
        Container<Integer> obj=new Container<>();
        obj.value=5366;
        obj.show();
    }
}
