package com.srm.java.training;

public class Room {
	int Room_no;
	String Room_type;
	String Room_area;
	Boolean AC_Machine;
void setdata(int Room_no,String Room_type,String Room_area,Boolean AC_Machine)
{
	this.Room_no=Room_no;
	this.Room_type=Room_type;
	this.Room_area=Room_area;
	this.AC_Machine=AC_Machine;
	
}
	void display()
	{
		System.out.println("Room No :"+Room_no+"\nRoom Type :"+Room_type+"\nRoom area :"+Room_area+"\nAC_Machine :"+AC_Machine);
	}

public static void main(String args[])
{
	Room Obj=new Room();
	Obj.setdata(123,"Single","chennai",true);
	Obj.display();
}
}
