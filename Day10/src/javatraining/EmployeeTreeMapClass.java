package javatraining;

import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EmployeeTreeMapClass {
	public static void main(String args[])
	{
        TreeMap<Integer,Employee> employees = new TreeMap<Integer,Employee>();
        employees.put(121,new Employee("Divya","Developer"));
        employees.put(122,new Employee("Mani","Developer"));
        employees.put(123,new Employee("Prabhu","Developer"));
        Set<Entry<Integer, Employee>> s=employees.entrySet();
        for(Map.Entry<Integer,Employee> me:s)
        {
        	System.out.println("Emp No: "+me.getKey()+" "+me.getValue());
        }
        
	}
}
class Employee 
{
    private String name = null;
    private String designation = null;
 
    public Employee( String name, String designation) {
        
        this.name = name;
        this.designation=designation;
        
    }
    public String toString() {
        return "Employee Name : " + name +"   Designation: " + designation +"\n";
    }
}

