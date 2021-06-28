package Exception;

import java.util.Scanner;

public class ExceptionClass 
{
	public static void main(String args[]) throws MarkOutofBoundException
	{
	int rollno,mark;
	String name;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Roll No:");
	rollno=s.nextInt();
	System.out.println("Enter Name:");
	name=s.next();
	System.out.println("Enter Marks:");
	mark=s.nextInt();
	student student1=new student(rollno,name,mark);
	student1.calc();
	
	}

}
class student{
	int RollNo;
	String Name;
	int Marks;
	student(int RollNo,String Name,int Marks)
	{
		this.RollNo=RollNo;
		this.Name=Name;
		this.Marks=Marks;
	}
	void calc() throws MarkOutofBoundException 
	{
	if(Marks<0)
	{
		String str="Incorrect Mark value";
		throw new MarkOutofBoundException(str);
	}
	else
	{
		System.out.println("Name  :"+Name);
		System.out.println("Roll No: "+RollNo);
		System.out.println("Marks :"+Marks);
	
 }
}
}
 class MarkOutofBoundException extends Exception
{
	public MarkOutofBoundException(String s)
	{
		
		System.out.println(s);
		
	}
	
}
