package javatest;

public class SquareCal{
	public void square()
	 { 
	System.out.println("No Parameter Method Called");
	 } 
	public int square( int number )
	 {
	int square = number * number;
	
	return square; 
	}
	public float square( float number ) 
	{
	 float square = number * number;
	 
	return square; 
	}
	public static void main(String[] args)
	  {
	    SquareCal obj = new SquareCal();
	    obj.square();
	    System.out.println("Method with Integer Argument Called:"+obj.square(5));
	    System.out.println("Method with float Argument Called:"+obj.square(3.4f));
	     
	  }

}
