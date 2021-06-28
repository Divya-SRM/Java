package com.srm.training.day6;

public class exam {
	 public static <T extends Comparable<T>> T maximum(T[] elements) {
		    T max = elements[0]; 
		    for(T ele:elements)
		    {
		    if (ele.compareTo(max) > 0)
		      max = ele;     
		    }
		    return max; 
		  } 

		  public static void main(String args[]) {
			  Integer[] numbers = {1, 2, 3,78,10};
			  Double[] dobnumber= {6.6,8.8, 7.7};
			  String[] str= {"pear", "apple", "orange","welcome"};
			  
		    System.out.println("Maximum of Integer value: "+maximum(numbers));
		    System.out.println("Maximum of Double:  "+maximum(dobnumber));
		    System.out.println("Maximum of String:  "+ maximum(str));
		  }
}
