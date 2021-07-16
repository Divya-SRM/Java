package javatraining;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNamePassword {
	public static boolean isValidUsername(String name)
    {
		
        String regex = "^[A-Za-z]\\w{5,29}$";
        Pattern p = Pattern.compile(regex);
        if (name == null) {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }
	public static boolean isValidPassword(String password)
    {
  
       
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);
        return m.matches();
    }
	public static void main(String[] args)
    {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Username");
		String username=s.next();
		System.out.println("Enter Password");
		String password=s.next();
        System.out.println("username :"+isValidUsername(username));
        
        System.out.println("password :"+isValidPassword(password));
        s.close();
        
    }

}
