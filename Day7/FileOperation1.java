import java.io.*;
class FileOperation1
{
public static void main(String[] args)
 {
	
	int vowels = 0, characters = 0;
	String[] words=null;    //Intialize the word Array
     int wc=0;
	try{
		BufferedReader in = new BufferedReader(new FileReader("prog.txt"));
		String line = in.readLine();
		while(line != null)
		{
		line = line.toLowerCase();
		words=line.split(" ");
		wc=wc+words.length;
    for (int i = 0; i < line.length(); ++i) {
      char ch = line.charAt(i);
      
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
	  {
        ++vowels;
	  }
      
       if ((ch >= 'a' && ch <= 'z'))
	 {
        ++characters;
      }
     
	  
	  
		}
line = in.readLine();

	}
	System.out.println("Vowels: "+vowels);
	System.out.println("Characters : "+characters);
	System.out.println("Words : "+wc);
	}
	
	catch(IOException e)
	{
		System.out.println("Exception occured");
	}
}
}