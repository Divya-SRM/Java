package javatest;
import java.util.Scanner;
import java.util.regex.*;  

public class Question2 {
	public static void main(String args[])
	{
		String phoneNumber;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Phone Number");
		phoneNumber=s.next();
	      String regex = "(0/91)?[7-9][0-9]{9}";
	      System.out.println("The phone number is: " + phoneNumber);
	     if(phoneNumber.matches(regex)) {
	    	 System.out.println("Valid phone number");
	     }
	     else {
	    	 System.out.println("phone number not valid");
	    	 
	     }
}

}
