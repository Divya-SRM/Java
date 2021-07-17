package javatest;

class Java{
	  
	   public void Test()
	   {
	      System.out.println("Java Test");
	   }
	}
	class Training extends Java{
		public void assignment()
		{
			System.out.println("Training assignment");
			super.Test();
		}
	   public void Test(){
		   
	      System.out.println("Training Test");
	   }
	   public static void main( String args[]) {
	      Training obj = new Training();
	      
	      obj.assignment();
	   }
	}
