import java.util.*;
class SumofNumber
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int sum=0;
int a=0;
while(n!=0)
{
a=n%10;
n=n/10;
sum=sum+a;
}
System.out.println(sum);
}}