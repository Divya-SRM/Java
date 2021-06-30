package com.srm.training.day7;


import java.util.LinkedList;


public class LinkedListClass {
	public static void main(String[] args)
    {
        
        LinkedList<String> name = new LinkedList<String>();
        name.add("Divya");
        name.add("Hari");
        name.add("Kavi");
        name.add("Mani");
        name.add("Heera");
        System.out.println(name.contains("Hari")); 
        System.out.println(name.contains("Java")); 
    }

}
