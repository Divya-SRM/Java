package javatest;

import java.util.HashSet;
import java.util.Scanner;

public class Question3 {
public static void main(String args[])
{
	HashSet<String> hs = new HashSet<String>();
	System.out.println("Enter 4 items");
	Scanner s=new Scanner(System.in);
	for(int i=0;i<4;i++)
	{
		 hs.add(s.next());
		
	}
   
    System.out.println("HashSet content: ");
    System.out.println(hs);
    String[] strArr = new String[hs.size()];
    hs.toArray(strArr);
    System.out.println("Copied array content:");
    for(String str:strArr){
        System.out.println(str);
    }
}
}
