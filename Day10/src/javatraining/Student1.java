package javatraining;

import java.io.*;
import java.lang.*;
import java.util.*;
  
// A class to represent a student.
class Student {
    int rollno;
    String name, address;
    public Student(int rollno, String name, String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    public String toString()
    {
        return "Roll No: "+this.rollno + " Name: " + this.name + " Address "
            + this.address;
    }
}
  
class Sortbyroll implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}
  
class Sortbyname implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}
public class Student1 {
    public static void main(String[] args)
    {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "Divya", "Mumbai"));
        ar.add(new Student(131, "Yogi", "chennai"));
        ar.add(new Student(121, "Mani", "Tanjore"));
  
        System.out.println("Unsorted");
        for(Student s:ar)
        	System.out.println(s);
  
        Collections.sort(ar, new Sortbyroll());
  
        System.out.println("*****Sorted by rollno*****");
        for(Student s:ar)
        	System.out.println(s);
  
        Collections.sort(ar, new Sortbyname());
  
        System.out.println("*****Sorted by name******");
        for(Student s:ar)
        	System.out.println(s);
    }
}