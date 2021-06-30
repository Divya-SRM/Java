package javatraining;


import java.util.Collections;
import java.util.HashMap;

public class HashMapKVClass {
	public static void main(String args[])
	{
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        map.put(1, 50);
        map.put(2, 60);
        map.put(3, 30);
        map.put(4, 60);
        map.put(5, 60);
        int minValueInMap=(Collections.min(map.values()));  
        System.out.println("Smallest Value in HashMap : "+minValueInMap);
        int maxValueInMap=(Collections.max(map.keySet()));  
        System.out.println("Largest Key in HashMap    : "+maxValueInMap);
        

	}

}
