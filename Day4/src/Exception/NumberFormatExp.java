package Exception;

import java.util.Scanner;

public class NumberFormatExp
{
	public static void main(String args[])
	{
		int count=0;
		for(int i=0;i<args.length;i++)
		{
		try {	
				int j=Integer.parseInt(args[i]);
				count++;
			}
		catch(NumberFormatException e)
		{
			System.out.println("Number format exception");
	
		}
		
		}
		System.out.println(count);
			
			

	}
}
