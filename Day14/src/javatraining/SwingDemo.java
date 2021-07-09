package javatraining;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

public class SwingDemo extends JFrame implements ActionListener {
	int count=0;
	JLabel jl=null;
	JButton bt=null;
	SwingDemo(){
		
		JFrame jf=new JFrame("Divya");
		jf.setSize(300,300);
		setLayout(new GridLayout(4,2));
		jl=new JLabel("this is label");
		 bt=new JButton("Click");
		bt.addActionListener(this);
		jf.add(jl);
		//jf.add(bt);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String args[]) {
		SwingDemo sw=new SwingDemo();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		count=count+1;
		jl.setText(String.valueOf(count));

		
	}

}
