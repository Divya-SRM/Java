    import java.sql.*;  
    class Dbupdate{  
    public static void main(String args[]){  
    try{  
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","divya");  
    
    Statement stmt=con.createStatement(); 
    stmt.executeUpdate("update studentdetails SET Name='Krithika' WHERE RegNo=7002");
  System.out.println("Updated...");
         
    con.close();  
    }catch(Exception e){ System.out.println(e);
System.out.println("database not connected");}  
    }  
    }  