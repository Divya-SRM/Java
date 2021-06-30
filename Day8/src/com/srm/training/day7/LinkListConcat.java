package com.srm.training.day7;

import java.util.LinkedList;

public class LinkListConcat {
	public static void main(String[] args) {
		  // create an empty linked list
		  LinkedList <String> c1 = new LinkedList <String> ();
		  
		          c1.add("java");
		          c1.add("C Prog");
		          c1.add("C++");
		          c1.add("Python");
		          c1.add("JavaScript");
		          System.out.println("List of first linked list: " + c1);
		         LinkedList <String> c2 = new LinkedList <String> ();
		          c2.add("SQL");
		          c2.add("React");
		          c2.add("Angular");
		          c2.add("MySql");
		          System.out.println("List of second linked list: " + c2);
		        
		      
		        LinkedList <String> a = new LinkedList <String> ();
		        a.addAll(c1);
		        a.addAll(c2);
		        System.out.println("New linked list: " + a);
		             }

}
