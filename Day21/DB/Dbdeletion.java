
import java.sql.*;  
    class Dbdeletion{  
    public static void main(String args[]){  
    try{  
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","divya");  
    
    Statement stmt=con.createStatement(); 
     stmt.executeUpdate("delete from studentdetails where RegNo=7001");
  
            
     System.out.println("deleted"); 
    con.close();  
    }catch(Exception e){ System.out.println(e);
System.out.println("database not connected");}  
    }  
    }  