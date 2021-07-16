package javatraining;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherMethod {
	static void findMethod(String a)
    { 	
    	System.out.println("\nFIND METHOD:");
    	System.out.println("_____________");
    	Pattern pattern =Pattern.compile("java*", Pattern.CASE_INSENSITIVE);
        Matcher m = pattern.matcher(a);
        while (m.find())
        {
    		System.out.println("Pattern found from " + m.start() +" to " + (m.end()-1));
        }
    }
    
	
    static void groupMethod()
    {
    	System.out.println("\nGROUP METHOD:");
    	System.out.println("________________");
    	 Pattern p=Pattern.compile("a(bb)");  
         Matcher m=p.matcher("aabbabbabbaaa");  
         while(m.find())  
         {
        	 int i=0;
        	 System.out.println("Start :"+m.start()+", End : "+m.end()+", Group "+m.group(i));  
        	 i++;
         }
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		findMethod(s);
		groupMethod();
		
	}

}
