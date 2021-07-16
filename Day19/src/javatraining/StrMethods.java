package javatraining;

import java.util.Scanner;

public class StrMethods {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Email id");
		String email=s.next();
		System.out.println("Enter Address");
		String address=s.next();
		System.out.println("*******After Split********");
        String[] arrOfStr = email.split("@", 2);
        for (String a : arrOfStr)
            System.out.println(a);
       System.out.println("*******Address********");
        String[] spAddress = address.split(",");
        for (String a : spAddress)
            System.out.println(a);
        s.close();
	}

}
