package javatraining;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	 public static void main(String args[]){  
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter Email id");
		 String email=s.next();
	        
	      String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
	        
	        Pattern pattern = Pattern.compile(regex);  
	         
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	            s.close();
	 
	    }  

}
