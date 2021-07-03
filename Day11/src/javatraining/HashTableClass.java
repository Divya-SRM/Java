package javatraining;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableClass {
	public static void main(String args[]) {
		
			  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
			  
			  hm.put(100,"Divya");  
			  hm.put(102,"Heera");  
			  hm.put(101,"Mani");  
			  hm.put(103,"Vasanti");  
			  
			  for(Map.Entry m:hm.entrySet()){  
			   System.out.println("Emp No: "+m.getKey()+" Emp Name: "+m.getValue());  
			  }  
			  System.out.println("Enter the employee number to remove");
			  Scanner s=new Scanner(System.in);
			  int n=s.nextInt();
			  hm.remove(n);
			  System.out.println("After Removing Employee");
			  for(Map.Entry m:hm.entrySet()){  
				   System.out.println("Emp No: "+m.getKey()+" Emp Name: "+m.getValue());  
				  } 
			  
			 } 
	}

