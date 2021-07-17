package javatraining;
import java.awt.Color;

import javax.swing.*;

public class EventLambda extends JFrame {

 public static void main(String [] args)
 {
  new EventLambda();
 }
 private JButton button1;
 public EventLambda()
 {
  this.setSize(300,150);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setTitle("I’m Listening");
  JPanel panel1 = new JPanel();
  button1 = new JButton("Click Me!");
  button1.setBackground(Color.MAGENTA);
  button1.setForeground(Color.WHITE);
  button1.addActionListener(e -> button1Click() );
  panel1.add(button1);
  this.add(panel1);
  this.setVisible(true);
 }
 private int clickCount = 0;
 public void button1Click()
 {
  clickCount++;
  if (clickCount == 1)
   button1.setText("Button clicked!");
  else
   button1.setText("Button clicked "
    + clickCount + " times!");
 }
}
