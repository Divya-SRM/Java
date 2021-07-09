package javatraining;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FrameClass extends Frame implements ItemListener {
	
	CheckboxGroup grp = new CheckboxGroup();		
	Label msg= new Label("");
	Checkbox redLight = new Checkbox("Red", grp, false);
	Checkbox yellowLight = new Checkbox("Yellow", grp, false);
	Checkbox greenLight = new Checkbox("Green", grp, false);
	
	
	FrameClass(String t)
	{
		super(t);
		setLayout(new FlowLayout());
		add(redLight);
		add(yellowLight);
		add(greenLight);
		add(msg);
		msg.setFont(new Font("Serif", Font.BOLD, 15));
		redLight.addItemListener(this);
		yellowLight.addItemListener(this);
		greenLight.addItemListener(this);
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		redLight.setForeground(Color.BLACK);
		yellowLight.setForeground(Color.BLACK);
		greenLight.setForeground(Color.BLACK);
		
		if(redLight.getState() == true) {
			redLight.setForeground(Color.RED);
			msg.setBackground(Color.RED);
			msg.setForeground(Color.white);
			msg.setText("STOP");
		}
		else if(yellowLight.getState() == true) {
			yellowLight.setForeground(Color.YELLOW);
			msg.setBackground(Color.YELLOW);
			msg.setForeground(Color.black);
			msg.setText("READY");
		}
		else{
			greenLight.setForeground(Color.GREEN);
			msg.setBackground(Color.GREEN);
			msg.setForeground(Color.black);
			msg.setText("GO");
		}	
	}
	
		
		
		
	
	public static void main(String args[])
	{
		FrameClass f=new FrameClass("Traffic Light");
		f.setSize(300, 300);
		f.setVisible(true);
		//f.setBounds(10, 10, 600, 600);
		
	}
	

}
