package com.srm.training.day7;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
	public static void main(String args[])
    {
  
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(80);
        arr.add(8);
        arr.add(3);
        arr.add(21);
        arr.add(1);
        System.out.println("Array List: "+arr);
        System.out.println("Maximum is : " + Collections.min(arr));
        System.out.println("Minimum is : " + Collections.max(arr));
    }

}
