package javatraining;

import java.util.ArrayList;

public class ArraylistMinimumValue {
	public static void min(ArrayList<Integer> array) {
	    int minIndex = 0;
	    
	    for (int i = 1; i < array.size(); i++) {
	        if (array.get(minIndex) > array.get(i)) {
	            minIndex = i;
	        }
	    }
	    
	    int minValue = array.remove(minIndex);
	    array.add(0, minValue);
	}
public static void main(String args[])
{
	ArrayList<Integer> arrli= new ArrayList<Integer>();
	arrli.add(3);
	arrli.add(8);
	arrli.add(92);
	arrli.add(4);
	arrli.add(2);
	arrli.add(17);
	arrli.add(19);
	System.out.println("Elements in Array list ");
	for(Integer s:arrli)
	{
		System.out.print(s+"  ");
	}
	min(arrli);
	System.out.println();
	System.out.println("Elements in Array list (After shift minimum value to the front");
	System.out.println();
	for(Integer s:arrli)
	{
		System.out.print(s+"  ");
	}
	
	
}

}
