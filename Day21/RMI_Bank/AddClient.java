import java.rmi.*;
import java.util.*;
public class AddClient
{
public static void main(String a[])
{
try{
String url="rmi://"+a[0]+"/AddServer";
AddServerIntf ai=(AddServerIntf)Naming.lookup(url);
Scanner s=new Scanner(System.in);
int ch;
do{
	System.out.println("\n\t1.Withdraw\t2.Balance\t3.Exit");
System.out.println("\nEnter your choice:");
 ch=s.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter Withdraw Amount");
Double d=s.nextDouble();
System.out.println("Transaction done successfully!!..");
System.out.println("Your Account Balance is "+ai.withdraw(d));
break;
case 2:
System.out.println("Account Balance"+ai.balanceCheck());
break;
case 3:
ch=-1;
default:
break;
}
}while(ch!=-1);
}catch(Exception e){}
}
}
