package javatraining;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class IteratorClass {
	public static void main(String args[])
	{
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 System.out.println("Enter number of elements");
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 
		    for(int i=0;i<n;i++)
		    {
		    	list.add(sc.nextInt());
		    }
     
		    Iterator<Integer> itr = list.iterator();
		    
	        System.out.println("Iterator:");
	        System.out.println("Forward traversal: ");
	  
	        while (itr.hasNext())
	            System.out.print(itr.next() + " ");
	  
	        System.out.println();
	        ListIterator<Integer> i = list.listIterator();
	  
	        System.out.println("ListIterator:");
	        System.out.println("Forward Traversal : ");
	  
	        while (i.hasNext())
	            System.out.print(i.next() + " ");
	  
	        System.out.println();
	  
	        System.out.println("Backward Traversal : ");
	  
	        while (i.hasPrevious())
	            System.out.print(i.previous() + " ");
	  
	        System.out.println();

}
}
