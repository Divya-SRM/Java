package javatest;

import java.util.Scanner;

public class Rectangle 
{
	private double length;
	private double breadth;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double length,double breadth) {
		super();
		this.length=length;
		this.breadth=breadth;
	}
    public double getArea()
    {
    	double area=length*breadth;
    	return area;
    }
	
    public double getPerimeter()
    {
    	double perimeter=2 * (length + breadth);
    	return (perimeter);
    }

	public static void main(String[] args) 
	{
		double l, b, perimeter, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of rectangle:");
        l = s.nextInt();
        System.out.print("Enter breadth of rectangle:");
        b = s.nextInt();
		Rectangle r=new Rectangle();
		Rectangle r1=new Rectangle(l,b);
		System.out.println("The Perimeter of Rectangle:"+r1.getPerimeter());
		double rad=r1.getArea();
		System.out.println("The Area of Rectangle: "+rad);
	}
}
