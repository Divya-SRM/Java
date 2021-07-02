package javatraining;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapAccountClass {
	public static void main(String args[])
	{
		TreeMap<Integer, Integer> treem = new TreeMap<Integer, Integer>();
		treem.put(121001,10000);
		treem.put(121002,200000);
        treem.put(121006,3000000);
        treem.put(121004,2000);
        treem.put(121009,980000);  
        System.out.println("**************Account Details*************");
       for ( Map.Entry<Integer,Integer> entry : treem.entrySet() )
           System.out.println( "Account Number: "+entry.getKey() + "   Balance:  " + entry.getValue() );
        System.out.println("******************************************");
        System.out.println("Enter Account Number to View Balance");
        Scanner s=new Scanner(System.in);
        System.out.println("Balance for given account number :"+treem.get(s.nextInt()));
	}

}
	