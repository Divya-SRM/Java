    import java.util.*;   
    class Palindrome 
    {  
       public static void main(String args[])
{
	int count=0;  	
	String arr[]={"divya","madam","malayalam"};
	for(int j=0;j<arr.length;j++)
	{
          String original, reverse = "";        
	original=arr[j];  
          int length = original.length();   
          for ( int i = length - 1; i >= 0; i-- )  
             reverse = reverse + original.charAt(i);  
          if (original.equals(reverse)) 
		  {			  
             count++; 
			 System.out.println(original);
		  }
            
       }  
	System.out.println(count);
   	 }  
	}