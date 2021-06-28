package com.srm.java.training;

public class RectangleClass {
	public static void main(String args[])
	{
		Rectangle rect=new Rectangle(10,20);
		System.out.println("**Square**");
		square s=new square(10);
		s.printarea();
		s.printperimeter();
		System.out.println("**Rectangle**");
		rect.printarea();
		rect.printperimeter();
		
		
	}
}
	class Rectangle{
		int length;
		int breadth;
		public Rectangle(int length, int breadth)
		{
			this.length=length;
			this.breadth=breadth;
			
		}
		void printarea()
		{
			System.out.println("Area   :"+length*breadth);
		}
		void printperimeter()
		{
			System.out.println("Perimeter  : "+2*(length+breadth));
		}
	}
	class square extends Rectangle
	{
		
		square(int side)
		{
			super(side,side);
		}
		
	}


