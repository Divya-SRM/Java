import java.io.File;
class FileDemo {

public static void main(String args[ ]) {
File f1 = new File(args[0]);
if(f1.exists())
{
System.out.println("File Exist");
System.out.println("File Name: " + f1.getName());
System.out.println("Abs Path: " + f1.getAbsolutePath());
System.out.println(f1.canWrite() ? "File is writeable" : "is not writeable");
System.out.println(f1.canRead() ? "File is readable" : "is not readable");
System.out.println("File size: " + f1.length() + " Bytes");
}
else
{ 
System.out.println("File not exist");}
}
}