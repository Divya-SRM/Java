package javatraining;


import java.util.ArrayList;

interface Addable{  
    int add(int a,int b);  
  
}  
  
public class LambdaClass{  
    public static void main(String[] args) {  
           
        Addable ad1=(a,b)->(a+b);  
        System.out.println("Multiple parameters :"+ad1.add(10,20));  
        Addable ad2=(int a,int b)->(a+b);  
        System.out.println("parameters with data type: "+ad2.add(100,200));  
        
        Addable ad3=(int a,int b)->{  
            return (a+b);   
            };  
        System.out.println("With return type :"+ad2.add(100,100));  
        
        
        ArrayList<String> list=new ArrayList<String>();  
        System.out.println("using foreach");  
        list.add("one");  
        list.add("two");  
        list.add("three");  
        list.add("four");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
        
       
    }  
}