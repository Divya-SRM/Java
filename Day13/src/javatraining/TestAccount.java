package javatraining;

class Employee{  
int emp_no;  
String name; 
double basicsalary;
double HRA,DA,GS,incometax,netsalary;
Employee(int emp_no,String name,double basicsalary)
{
	this.emp_no=emp_no;
	this.name=name;
	this.basicsalary=basicsalary;
}
public void calculate()  
{
   HRA=(10*basicsalary)/100;
   DA=(73*basicsalary)/100;
   GS=basicsalary+DA+HRA;
   incometax=(30*GS)/100;
   netsalary=GS-incometax;
}
public void display()  
{
   System.out.println("Employeeid  :  "+emp_no+"\n"+"Employename  :  "+name+"\n"+"Employee basic salary :  "+basicsalary+"\n"+"HRA  :  "+HRA+"\n"+"DA  :  "+DA+"\n"+"GS  :  "+GS+"\n"+"Incometax  :  "+incometax+"\n"+"netsalary  :  "+netsalary);
}
}    
class TestAccount{  
public static void main(String[] args){  
Employee a1=new Employee(121,"Divya",10000);  
a1.calculate(); 
a1.display();    
}}   
