package javatraining;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");
        System.out.println("Mappings of HashMap hm1 are : "+ hm1);
        hm1.remove(2);
        System.out.println("HashMap after Remove :"+hm1);
        System.out.println("Contains (key =1) :"+hm1.containsKey(1));
        System.out.println("Contains (value= one) :"+hm1.containsValue("one"));
        System.out.println("Get Key 3:"+hm1.get(3));
        System.out.println("Size :"+hm1.size());
	}

}
