package javatraining;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class AnonymousInnerClasses extends JFrame
{
    AnonymousInnerClasses()
    {
        addWindowListener(new WindowAdapter()
        {
            public void WindowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        }) ;
    }
}
class AnonymousInnerClasses1
{
    public static void main(String args[])
    {
        AnonymousInnerClasses frame = new AnonymousInnerClasses();
        frame.setTitle("Anonymous Inner Classes ");
        frame.setBounds(200,150,250,300);
        frame.setVisible(true);
    }
}
