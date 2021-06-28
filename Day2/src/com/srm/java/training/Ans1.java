package com.srm.java.training;

class Person{
	  String name;
	  int age;
	  String number;
	  String address;
	  int salary;

	  public void printSalary(){
		  System.out.println("Name: "+name);
		  System.out.println("Age: "+age);
		  System.out.println("Mob Number: "+number);
		  System.out.println("Address :"+address);
	    System.out.println("Salary :"+salary);
	  }

	}

	class Employee1 extends Person{
	  String specialization;
	}

	class Manager extends Person{
	  String department;
	}

	class Ans1{
	  public static void main(String[] args){
	    Employee1 e = new Employee1();
	    System.out.println("***Employee Details***");
	    e.name = "Divya";
	    e.age = 23;
	    e.number = "983456775";
	    e.address = "Chennai";
	    e.salary = 12310;
	    e.specialization = "xyzxyz";
	    e.printSalary();

	   Manager m = new Manager();
	   System.out.println("***Manager Details***");
	   m.name = "Haritha";
	    m.age = 22;
	    m.number = "90087890";
	    m.address = "chennai";
	    m.salary = 23100;
	    m.department = "sales";
	    m.printSalary();
	    //Same goes for Manager
	  }
	}	