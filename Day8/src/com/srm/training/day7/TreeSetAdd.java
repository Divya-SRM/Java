package com.srm.training.day7;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetAdd {
	public static int sum3=0;
	public static void forSum(TreeSet<Integer> ts1)
	{ 
		int sum=0;
		for(int i:ts1)
        	sum=sum+i;   
        System.out.println("Sum = "+sum);
		
	}
	public static void whileSum(TreeSet<Integer> ts1)
	{
		int sum1=0;
		Iterator<Integer> itr=ts1.iterator();  
        while(itr.hasNext()){  
         sum1=sum1+itr.next();  
        }                
        System.out.println("Sum = "+sum1);
		
	}
	public static int sum(Integer a[],int n)
	{
		if (n<=0)
		{
			return n;
		}
		else
		{
			return (sum(a,n-1)+a[n-1]);
		}
		
	}
	
	public static void main(String[] args)
    {
        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(1);
        ts1.add(2);
        ts1.add(3);
        ts1.add(4);
        forSum(ts1);
        whileSum(ts1);
        Integer val[]=new Integer[ts1.size()];
        ts1.toArray(val);
        int length=val.length;
        System.out.println("Sum = "+sum(val,length));
        
        
    }
	 

}
