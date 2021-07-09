package javatraining;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

 class Temperature extends JFrame implements ActionListener {
	 JTextField jTextField = new JTextField("", 20);
     
	 JRadioButton rb1,rb2;
	 JFrame f=new JFrame(); 
	 JRadioButton r1=new JRadioButton("Convert Fahrenheit to Centigrate");    
	 JRadioButton r2=new JRadioButton("Convert Centigrate to Fahrenheit");    
	 JLabel result=new JLabel("Result");
	 

    public Temperature() {
    	setLayout(null);
    	jTextField.setBounds(75,50,100,30);
    	result.setBounds(75,100,100,30);
    	add(result);
    	add(jTextField);
    	r1.setBounds(75,150,250,80);    
   	 r2.setBounds(75,200,250,80);    
   	 ButtonGroup bg=new ButtonGroup();    
   	 bg.add(r1);bg.add(r2); 
   	 add(r1);
   	 add(r2);
   	 r1.addActionListener(this);
   	r2.addActionListener(this);
       


    }

    public void actionPerformed(ActionEvent e) {
        try {
        	DecimalFormat decimalFormat = new DecimalFormat("#.##");
            double value = Double.parseDouble(jTextField.getText());
            double answer = 0.0;
        	if(r1.isSelected()){   
        		answer = ((5.0 / 9.0) * (value - 32.0));
        		result.setText(String.valueOf(decimalFormat.format(answer))+" centigrate");
        		  
        		}    
        		if(r2.isSelected()){
        			answer = (9/5)*(value+32);
        			result.setText(String.valueOf(decimalFormat.format(answer))+" Fahrenheit");
        		    
        		}    
            

            

            
        } catch (NumberFormatException ex) {
            System.out.println("invalid try again");
        }
    }
}
class TemperatureConverter {
        public static void main(String[] args) {
            Temperature t = new Temperature();
            t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            t.setSize(400, 250);
            t.setVisible(true);
            t.setLocationRelativeTo(null);
        }
    }
