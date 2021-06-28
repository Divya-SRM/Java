package com.srm.java.training;
abstract class Telephone{
    abstract void lift();
    abstract void disconnected();
}

class SmartTelephone extends Telephone{
    void lift(){
       System.out.println("Lift");
   }
   void disconnected(){
       System.out.println("Disconnected");
   }
    
}
public class AbstractTelephoneClass {
	public static void main(String args[])
	{
		SmartTelephone s=new SmartTelephone();
		s.lift();
		s.disconnected();
	}
}
