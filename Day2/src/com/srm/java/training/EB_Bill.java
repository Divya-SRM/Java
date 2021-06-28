package com.srm.java.training;

import java.util.Scanner;

public class EB_Bill {
	int Consumer_No;
	String Consumer_Name;
	int Previous_reading;
	int Current_reading;
	String Connection_type;
	int actUnit=0;
	double amt=0;
	EB_Bill(int Consumer_No,String Consumer_Name,int Previous_reading,int Current_reading,String Connection_type)
	{
		this.Consumer_No=Consumer_No;
		this.Consumer_Name=Consumer_Name;
		this.Previous_reading=Previous_reading;
		this.Current_reading=Current_reading;
		this.Connection_type=Connection_type;
	}
	public void calc()
	{
		actUnit=Current_reading-Previous_reading;
		if(Connection_type.equalsIgnoreCase("domestic"))
		{
			if(actUnit<=100)
			{
				amt+=actUnit*1;
			}
			else if(actUnit>101 && actUnit<200)
			{
				amt+=actUnit*2.50;
			}
			else if(actUnit>201 && actUnit<500)
			{
				amt+=actUnit*4.00;
			}
			else if(actUnit>501)
			{
				amt+=actUnit*6;
			}
			else
			{
				System.out.println("Provide valid units");
			}
		}
		else if(Connection_type.equalsIgnoreCase("commercial"))
		{
			if(actUnit<=100)
			{
				amt=amt+(actUnit*2);
			}
			else if(actUnit>101 && actUnit<200)
			{
				amt=amt+(actUnit*4.50);
			}
			else if(actUnit>201 && actUnit<500)
			{
				amt=amt+(actUnit*6.00);
			}
			else if(actUnit>501)
			{
				amt=amt+(actUnit*7);
			}
			else
			{
				System.out.println("Provide valid units");
			}
		}
		
	}
	void display()
	
	{
		System.out.println("*******Electricity Bill********");
		System.out.println("Consumer Number :"+Consumer_No+"\nConsumer Name   :"+Consumer_Name+"\nUnit Used        :"+actUnit+"\nAmount           :Rs."+amt);
		System.out.println("*******THANK YOU***************");
	}
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Consumer Number");
		int Consumer_No=s.nextInt();
		System.out.println("Enter Consumer Name");
		String Consumer_Name=s.next();
		System.out.println("Enter Previous Reading");
		int Previous_reading=s.nextInt();
		System.out.println("Enter Current Reading");
		int Current_reading=s.nextInt();
		System.out.println("Enter Connection Type");
		String Connection_type=s.next();
		EB_Bill Bill=new EB_Bill(Consumer_No,Consumer_Name,Previous_reading,Current_reading,Connection_type);
		Bill.calc();
		Bill.display();
		s.close();
		
		
	}
	

}
