package javatraining;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String args[])
	{
		 // Objects of String class  
		String orginal[]=new String[4];
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter 4 Strings");
	      for(int i=0;i<4;i++)
	      {
	    	  orginal[i]=in.next();
	      }  
	      for(String str:orginal)
	      {
	    	  String  reverse = ""; 
	      int length = str.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + str.charAt(i);  
	      if (str.equals(reverse))  
	         System.out.println(str+" is a palindrome.");   
	}

}
}
