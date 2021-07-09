package javatraining;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PalindromeAWT extends Frame implements ActionListener {
	Label str=new Label("Enter String");
	TextField strValue=new TextField();
	 Button bt = new Button("Check Palindrome");
	 Label res1=new Label();
	 Label l=new Label();
	 PalindromeAWT(){
		 str.setBounds(50, 150, 100, 30);
			strValue.setBounds(150, 150, 150, 30);
			bt.setBounds(50, 250, 100, 30);
			res1.setBounds(50,300,100,30);
			
			add(str);
			add(strValue);
			add(bt);
			add(res1);
			
			
			bt.addActionListener(this);
	 }

	 @Override
		public void actionPerformed(ActionEvent e) {
			String original=strValue.getText();
			String reverse="";
			int length = original.length();   
		      for ( int i = length - 1; i >= 0; i-- )  
		         reverse = reverse + original.charAt(i);  
		      if (original.equals(reverse)) { 
		           res1.setText("Palindrome");
		      res1.setFont(new Font("Serif", Font.BOLD, 20));
		      res1.setForeground(Color.green);}
		      
		      else { 
		    	  res1.setText("Not Palindrome");
		    	  res1.setFont(new Font("Serif", Font.BOLD, 20));
		    	  res1.setForeground(Color.red);}
		          
			
	}
		public static void main(String args[])
		{
			PalindromeAWT frame = new PalindromeAWT();
	        frame.setTitle("FIND PALINDORME");
	        frame.setVisible(true);
	        frame.setBounds(10, 10, 370, 600);
	        frame.setResizable(false);
		}
	}
