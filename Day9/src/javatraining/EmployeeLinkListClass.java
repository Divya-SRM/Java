package javatraining;

import java.util.Collections;
import java.util.LinkedList;

public class EmployeeLinkListClass {
	public static void main(String[] args) {
        Employee e1 = new Employee( "Divya", 121, "Developer");
        Employee e2 = new Employee("Hari", 122, "TeadLead");
        Employee e3 = new Employee("Mani", 123, "Project Manager");
        Employee e4 = new Employee("Heera", 124, "Developer");
 
        LinkedList<Employee> employees = new LinkedList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        for(int i=0; i< employees.size(); i++)
        {
          System.out.println(employees.get(i));
        }
	}

}
class Employee 
{
    private String Name = null;
    private int empNo = 0;
    private String Designation = null;
 
    public Employee( String Name, int empNo,String Designation) {
        
        this.Name = Name;
        this.empNo = empNo;
        this.Designation = Designation;
    }
    public String toString() {
        return "Employee Name : " + Name + "    Emp No:  "+empNo+"   Designation: " + Designation +"\n";
    }
}
