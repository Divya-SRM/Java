package com.srm.java.training;

public class Number {
	int number;
	public Number()
	{
		number=49;
	}
	public boolean isZero ( )
    {
        if (number == 0)
            return true;
        else
            return false;
    }
	public boolean isPositive ( )
    {
        if(number > 0)
            return true;
        else
            return false;
    }
	public boolean isNegative ( )
    {
        if (number < 0)
            return true ;
        else
            return false;
    }
	public boolean isodd( )
    {
        System.out.println(number);
        if (number % 2 != 0.0)
            return true;
        else return false;
    }
	public boolean isEven ( )
    {
        if (number % 2 == 0.0)
            return true ;
        else return false;
    }
	public boolean isPrime ( )
    {
        int i, lastn;

        double a;
        boolean flag;
        a = Math.sqrt(number);
        lastn = (int)a;
        flag = true;
        for (i=2; i<lastn; i++)
        {
            if (number != i)
            {
                if( number % i ==0)
                {
                    flag = false;
                    break;
                }
            }
        }
        if (flag)
            return true;
        else return false;
    }
	public boolean isAmstrong( ) 
	{
		int num=number;
	       int temp,total = 0;
	       while (num != 0) {
	           temp = num % 10;
	           total = total + (temp * temp * temp);
	           num /= 10;
	       }
	           if (total == number)
	               return true;
	           else
	               return false;
	    
	  }
	public double getFactorial ( )
    {
		double i,fact=1;  
		  int num1=number;  
		  for(i=1;i<=num1;i++){    
		      fact=fact*i;    
		  }    
		  return fact;
    }
	public double getReverse ( )
    {
		int num2=number;
        double d =0;
        int temp;
        while (num2!=0)
        {
            temp = num2%10;
            d = d * 10 + temp;
            num2 = num2/10;
        }
        
        return d;
    }
	public double sumDigits ( ) {
        int temp;
        double e=0;
        int num3=number;
        while (num3!=0) {
            temp = num3 % 10;
            e = e + temp;
            num3 = num3 / 10;
        }
        return e;
        
    }
	public double square() {
		int num4=number;
		double sq=num4*num4;
		return sq;
	}
	public double Squareroot()
	{
		int num5=number;
		return Math.sqrt(num5);
	}
	
	public static void main(String args[])
	{
		Number mynum = new Number( );
        System.out.println("");
        System.out.println ("isZero" + "="+ mynum.isZero() );
        System.out.println ("isPositive"+ "="+  mynum. isPositive());
        System.out.println ("isNegative" + "=" + mynum.isNegative() );
        System.out.println ("isOdd" + "="+mynum.isodd());
        System.out.println ("isEven"+ "="+mynum.isEven());
        System.out.println ("isPrime"+"="+mynum.isPrime());
        System.out.println ("getAmstrong" + "="+mynum.isAmstrong( ));
        System.out.println ("getFactorial"+"="+ mynum.getFactorial());
        System.out.println ("getReverse" + "="+mynum.getReverse( ));
        System.out.println ("sumDigits" + "="+ mynum.sumDigits( ));
        System.out.println ("getSquare" + "="+ mynum.square( ));
        System.out.println ("getSquareRoot" + "="+ mynum.Squareroot( ));
	}

}
