package javatraining;

import java.util.Scanner;

public class ReplaceString {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=in.nextLine(); 
		System.out.println("Find String");
		String s2=in.next();
		System.out.println("Replace String");
		String s3=in.next();
		String replaceString=s1.replaceAll(s2,s3);
		System.out.println(replaceString);
		String replaceStringfirst=s1.replaceFirst(s2,s3);
		System.out.println(replaceStringfirst);
		in.close();
	}

}
