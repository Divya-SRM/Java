package javatraining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {
	public static void main(String args[])
	{
		List<String> items = new ArrayList<>();
        Collections.addAll(items, "Java","JavaSript","SQL","React","Angular");
        System.out.println("***Elements in List***");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + " ");
        }
        System.out.println("Minimum value in the list    :"+Collections.min(items));
        System.out.println("Maximum value in the list    :"+Collections.max(items));
        Collections.sort(items);
        System.out.println("***After Sorting***");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + " ");
        }
        System.out.println("Binary Search: "+Collections.binarySearch(items,"React"));
	}

}
