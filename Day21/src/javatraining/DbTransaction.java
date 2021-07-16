package javatraining;

import java.sql.*;
import java.util.Scanner;

public class DbTransaction {
	public static void main(String a[]) {
		Connection c=null;
		PreparedStatement ps1=null,ps2=null;
		Scanner s=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			c =DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "divya");  
			ps1=c.prepareStatement("update useraccount set balance=balance-? where accountno=?");
			ps2=c.prepareStatement("update useraccount set balance=balance+? where accountno=?");
			
		    }
		    catch(ClassNotFoundException ce) {
			System.out.println("unable to load Driver");
		    }
	        catch(SQLException sql) {
	        	System.out.println("unable to establish connection");
	        }
		try {	
			System.out.println("Enter Account number");
			int n=s.nextInt();
			System.out.println("Enter amount to withdraw");
			int b=s.nextInt();
			ps1.setInt(1,b);
			ps1.setInt(2,n);
			System.out.println("Enter Account number");
			int n1=s.nextInt();
			System.out.println("Enter amount to Deposit");
			int b1=s.nextInt();
			ps2.setInt(1,b1);
			ps2.setInt(2,n1);
			int k1=ps1.executeUpdate();
			int k2=ps2.executeUpdate();
			if(k1>0&&k2>0) 
				System.out.println("Transaction Success");
			
			else 
				System.out.println("Transaction failure");
			
		    c.close();
		    }
		    catch(Exception e) {
		    	System.out.println(e);
		}
		
	}

}


