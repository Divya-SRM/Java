    import java.net.*;  
    import java.io.*;  
    class MyClient{  
    public static void main(String a[])throws Exception{  
	String server =a[0];
	int port=Integer.parseInt(a[1]);
    Socket s=new Socket(server,port);  
    DataInputStream din=new DataInputStream(s.getInputStream());  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
      
    String str="",str2="";  
    while(!str.equals("stop")){  
    str=br.readLine();  
    dout.writeUTF(str);  
    dout.flush();  
    str2=din.readUTF();  
    System.out.println("Server says: "+str2);  
    }  
      
    dout.close();  
    s.close();  
    }}  