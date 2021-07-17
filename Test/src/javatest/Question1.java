package javatest;

import java.util.Scanner;

public class Question1 {
	public static void main(String args[])
	{
		
		int sum=0;
		int product=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 5 values");
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		for(int a1:a)
		{
			sum=sum+a1;
			product=product*a1;
		}
		  int maxValue = a[0];
		  for(int i=1;i < a.length;i++){
		    if(a[i] > maxValue){
		      maxValue = a[i];
		    }
		  }
		  int minValue = a[0];
		  for(int i=1;i<a.length;i++){
		    if(a[i] < minValue){
		      minValue = a[i];
		    }   
		  }
		  System.out.println("Minimum :"+minValue);
		    System.out.println("Maximum :"+maxValue);
		    System.out.println("Sum :"+sum);
		    System.out.println("Product :"+product);
	}

}
