
		import java.io.*;  
		import java.util.*;  
    class Copyfile {  
     public static void main(String arg[]) throws Exception {  
      Scanner sc = new Scanner(System.in);  
      System.out.print("Provide source file name :");  
      String sfile = sc.next();  
      System.out.print("Provide destination file name :");  
      String dfile = sc.next();
	  FileReader fin=null;
	  FileWriter fout =null;
		try
		{	  
			   fin = new FileReader(sfile); 
				fout = new FileWriter(dfile, true);  
			  int c;  
			  while ((c = fin.read()) != -1) {  
			   fout.write(c);  
				}  
				System.out.println("Copy finish...");  			   
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not available");
		}
		finally
		{
			if(fin!=null)
				fin.close();
			if(fout!=null)
				fout.close();
		}
      
       
      
     }  
    }   
