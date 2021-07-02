package javatraining;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneDirectoryClass {
	public static void main(String args[])
	{
		TreeMap<String, Integer> treemap = new TreeMap<String, Integer>();
		treemap.put("Divya",98347845);
		treemap.put("Heera",8778908);
        treemap.put("Mani",4563245);
        treemap.put("Akash",4567319);
        treemap.put("Raiza",9809835);  
        System.out.println("****Phone Directory*****");
       for ( Map.Entry<String,Integer> entry : treemap.entrySet() )
           System.out.println( entry.getKey() + ":  " + entry.getValue() );
        System.out.println("************************");
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the name to find number");
       String name=in.next();
       System.out.println("Phone number for "+name+" : "+treemap.get(name));
       System.out.println("Enter the name to Replace number");
       String name1=in.next();
       System.out.println("Enter new phone number:");
       treemap.put(name1, in.nextInt());
       System.out.println("****Phone Directory*****");
       for ( Map.Entry<String,Integer> entry : treemap.entrySet() )
           System.out.println( entry.getKey() + ":  " + entry.getValue() );
        System.out.println("************************");
       
      }
       
	}


