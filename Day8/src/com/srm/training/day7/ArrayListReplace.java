package com.srm.training.day7;

import java.util.ArrayList;

public class ArrayListReplace {
	public static void main(String[] args)
    {
       
            ArrayList<String> list = new ArrayList<>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");
            System.out.println(list);
            list.set(2, "Fifth");
            System.out.println(list);
            
      
    }

}
