import java.util.*;
class PrimeNumber
{
public static void main(String args[])
{
int i;
boolean flag=true;      
  Scanner in=new Scanner(System.in);
System.out.println("Enter the Number");
int n=in.nextInt();
       
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<n;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=false;      
     break;      
    }      
   }      
   if(flag)  { System.out.println(n+" is prime number"); }  
  }  
}    
}   
