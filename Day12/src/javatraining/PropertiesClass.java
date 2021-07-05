package javatraining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
	public static void main(String args[]) throws IOException
	{
			Properties pt=new Properties();
			pt.put("name", "Anu");
			pt.put("id", "D1222");
			pt.put("Designation", "Developer");	
			pt.put("Age", "24");
			
			try {
				FileOutputStream fout=new FileOutputStream("p.dat");
				pt.store(fout,"Employee Details");
				
			}
			catch(FileNotFoundException e) {
				
			}
			System.out.println("Property Details are stored");
			try {
				FileInputStream fin=new FileInputStream("p.dat");
				pt.load(fin);
				
			}
			catch(FileNotFoundException e)
			{
				
			}
			System.out.println(pt.getProperty("name"));
			System.out.println(pt.getProperty("id"));
			System.out.println(pt.getProperty("Designation"));
			System.out.println(pt.getProperty("Age"));
	}

}
