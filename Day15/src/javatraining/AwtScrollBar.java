package javatraining;

import java.awt.event.AdjustmentEvent;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.AdjustmentListener;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JFrame;



class SetScrollBar extends JFrame implements AdjustmentListener {
    private JLabel labelRed, labelGreen, labelBlue;
    private JScrollBar sBarRed, sBarGreen, sBarBlue;

    public SetScrollBar(){

        setLayout(new FlowLayout());


        labelRed = new JLabel("Adjust :");
        labelGreen = new JLabel("Adjust :");
        labelBlue = new JLabel("Adjust :");

        //initializing scrollbar
        sBarRed = new JScrollBar(JScrollBar.HORIZONTAL,0,20,0,255);
        sBarGreen = new JScrollBar(JScrollBar.HORIZONTAL,0,20,0,255);
        sBarBlue = new JScrollBar(JScrollBar.HORIZONTAL,0,30,0,255);


        sBarRed.addAdjustmentListener(this);
        sBarGreen.addAdjustmentListener(this);
        sBarBlue.addAdjustmentListener(this);


        add(labelRed);
        add(sBarRed);
        add(labelGreen);
        add(sBarGreen);
        add(labelBlue);
        add(sBarBlue);
    }

    public void adjustmentValueChanged(AdjustmentEvent event){
        int cRed, cGreen, cBlue;
        cRed = sBarRed.getValue();
        cBlue = sBarBlue.getValue();
        cGreen = sBarGreen.getValue();

        getContentPane().setBackground(new Color(cRed,cBlue,cGreen));
    }
}

public class AwtScrollBar{
    public static void main(String[] args){
        SetScrollBar demo = new SetScrollBar();
        demo.setSize(600,300);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        demo.setVisible(true);
    }
}
