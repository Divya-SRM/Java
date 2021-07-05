package javatraining;

import java.util.HashSet;
import java.util.Iterator;

class MyOwnClass {
    private String name;
    private int age;

    MyOwnClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
        public String toString()
        {
            
            return "Name :" + name + "   Age :" + age;
        }
    }

public class MyOwnHashSetClass {
	 public static void main(String args[]){
         HashSet<MyOwnClass> hs=new HashSet<MyOwnClass>();
         hs.add(new MyOwnClass("Divya",22));
         hs.add(new MyOwnClass("Mani",23));
         hs.add(new MyOwnClass("Preethi",21));
         hs.add(new MyOwnClass("Sanjai",24));
         Iterator<MyOwnClass> i=hs.iterator();
         while(i.hasNext()){
             System.out.println(i.next());
         }

     }

}
