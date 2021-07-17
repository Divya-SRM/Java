package javatraining;

interface DispRecord{  
    void record();  
} 

interface Constr{
	Msg getMsg(String msg);
}

class Msg
{
	Msg(String msg)
	{
		System.out.print(msg);
	}
}
public class MethodRefTypes 
{
	public static void empRecord()
	{  
        System.out.println("EmpNo: 1001  EmpName: Sofia  Age: 25");  
        System.out.println("EmpNo: 1002  EmpName: Augre  Age: 28"); 
        System.out.println("EmpNo: 1003  EmpName: Zen  Age: 25"); 
    }  
	 
    public void empRec()
    {  
        System.out.println("Non-static method.");  
    }  
    public static void main(String[] args) 
    {  
      
        DispRecord print = MethodRefTypes::empRecord;  
        System.out.println("\nMethod Reference using Static Method");
        System.out.println("**************");
        print.record();  
        System.out.println("\nMethod Reference using Instance Method");
        System.out.println("**************");
        MethodRefTypes mr=new MethodRefTypes();
        DispRecord dp=mr::empRec;
        dp.record();
        System.out.println("\nMethod Reference using Constructor");
        System.out.println("**************");
        Constr c=Msg::new;
        c.getMsg("Constructor Message");  
	}
}
