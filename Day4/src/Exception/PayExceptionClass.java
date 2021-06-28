package Exception;

import java.util.Scanner;

public class PayExceptionClass {
	public static void main(String args[]) throws PayOutofBoundException
	{
	int Empno,Bpay;
	String name;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Emp No:");
	Empno=s.nextInt();
	System.out.println("Enter Emp Name:");
	name=s.next();
	System.out.println("Enter Basic Pay:");
	Bpay=s.nextInt();
	Employee Emp1=new Employee(Empno,name,Bpay);
	Emp1.calc();
	
	}

}
class Employee{
	int EmpNo;
	String EmpName;
	int BasicPay;
	Employee(int RollNo,String Name,int Marks)
	{
		this.EmpNo=RollNo;
		this.EmpName=Name;
		this.BasicPay=Marks;
	}
	void calc() throws PayOutofBoundException 
	{
	if(BasicPay<=0)
	{
		String str="Basic Pay incorrect";
		throw new PayOutofBoundException(str);
	}
	else
	{
		System.out.println("Exployee Name  :"+EmpNo);
		System.out.println("Employee No: "+EmpName);
		System.out.println("Basic Pay:"+BasicPay);
	
 }
}
}
 class PayOutofBoundException extends Exception
{
	public PayOutofBoundException(String s)
	{
		
		System.out.println(s);
		
	}

}
