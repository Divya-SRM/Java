import java.io.*;
class FileOperation2
{
public static void main(String[] args)
 {
	
	int vowels = 0, consonants = 0, digits = 0;
	OutputStream out1=null;
	OutputStream out2=null;
	try{
		BufferedReader in = new BufferedReader(new FileReader("prog.txt"));
		 out1=new FileOutputStream("resultnew1.txt");
		out2=new FileOutputStream("resultnew2.txt");
		String line = in.readLine();
		while(line != null)
		{	
		line = line.toLowerCase();
		out1.write((line+"\n").getBytes());
		line=line.toUpperCase();
		out2.write((line+"\n").getBytes());
		line=in.readLine();
		
		}
	}
	
	catch(IOException e)
	{
		
	System.out.println("IO Exception");	
	}
	finally{
		try{
		if(out1!=null)
			out1.close();
		if(out2!=null)
			out2.close();
		}
		catch(IOException e)
	{}
	}
	
}
}