    import java.sql.*;  
    class Dbinsertion{  
    public static void main(String args[]){  
    try{  
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","divya");  
    
    Statement stmt=con.createStatement(); 
     int result = stmt.executeUpdate("insert into studentdetails(RegNo,Name,Department) values(7003,'rachel','sanjai')");
  
            
            if (result > 0)
                System.out.println("successfully inserted");
  
            else
                System.out.println(
                    "unsucessful insertion ");  
    con.close();  
    }catch(Exception e){ System.out.println(e);
System.out.println("database not connected");}  
    }  
    }  