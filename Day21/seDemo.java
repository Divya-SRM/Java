import java.io.*;
class Employee implements Serializable
{
private int eno;
private String ename;
Employee(int eno,String ename)
{
this.eno=eno;
this.ename=ename;
}
public String toString()
{
return("Emp no:"+eno+"Emp Name:"+ename);
}
}
class seDemo
{
public static void main(String args[])
{
try{
Employee e1=new Employee(101,"Divya");
System.out.println("Objec :"+e1);
FileOutputStream fos=new FileOutputStream("emp.txt");
ObjectOutputStream os=new ObjectOutputStream(fos);
os.writeObject(e1);
os.flush();
os.close();}catch(IOException ie){}
try{FileInputStream fin=new FileInputStream("emp.txt");
ObjectInputStream ois=new ObjectInputStream(fin);
Employee e=(Employee)ois.readObject();
ois.close();
System.out.println("Object :"+e);
}catch(Exception ie){}
}
}


