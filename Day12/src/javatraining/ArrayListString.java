package javatraining;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListString {
	public static void main(String args[])
	{
		ArrayList<String> arrli= new ArrayList<String>();
		arrli.add("Divya");
		arrli.add("Kavitha");
		arrli.add("Viji");
		arrli.add("balaji");
		arrli.add("krithi");
		System.out.println("Elements in Arraylist");
		System.out.println(arrli+"\n");
		System.out.println("Element in Arraylist (After remove even length words)");
		
		Iterator<String> itr=arrli.iterator();
		while(itr.hasNext())
		{
			int n=itr.next().length();
			if(n%2==0)
				itr.remove();
		}
		System.out.println(arrli);
	
		
	}

}
