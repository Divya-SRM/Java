package javatraining;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
 class LoginFrame extends Frame implements ActionListener {
 
    Label userLabel = new Label("USERNAME");
    Label passwordLabel = new Label("PASSWORD");
    TextField userTextField = new TextField();
    TextField passwordField = new TextField();
    Button loginButton = new Button("LOGIN");
    Button resetButton = new Button("RESET");	
    
   
    LoginFrame() {
    	
        
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
 
    }
 
   
 
    public void setLocationAndSize() {
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);
 
 
    }
 
    public void addComponentsToContainer() {
        add(userLabel);
        add(passwordLabel);
        add(userTextField);
        add(passwordField);
       
        add(loginButton);
        add(resetButton);
    }
 
    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("divya") && pwdText.equalsIgnoreCase("12345")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
 
        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
      
 
 
        }
    }
 

 
public class Login {
    public static void main(String[] a) {
        LoginFrame frame = new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setResizable(false);
 
    }
 
}
