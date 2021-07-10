package javatraining;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TabbedPane {
    public static void main(String[] args) {
        createWindow();
    }

    private static void createWindow() {
        JFrame frame = new JFrame("Swing Tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI(frame);
        frame.setSize(560, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void createUI(final JFrame frame){
    	JTextArea tArea = new JTextArea(10,10);
      //  JScrollPane scrollPane = new JScrollPane(tArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        JScrollPane scrollPane1 = new JScrollPane(tArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        String data[][]={ {"101","Divya","670000"},    
                {"102","Mani","780000"},    
                {"101","Preethi","700000"}};  
        
        String column[]={"ID","NAME","SALARY"};         
        JTable jt=new JTable(data,column);
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel panel1 = new JPanel(false);
        JLabel filler = new JLabel("Scroll Panel");
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel1.setLayout(new GridLayout(1, 1));
        panel1.add(filler);
        panel1.add(scrollPane1);
        tabbedPane.addTab("Scroll", null, panel1,"Tab 1 tooltip");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        
        
        
        JPanel panel2 = new JPanel(false);
        JLabel filler2 = new JLabel("Table");
        filler2.setHorizontalAlignment(JLabel.CENTER);
        panel2.setLayout(new GridLayout(1, 1));
      //  panel2.add(filler2);
        panel2.add(jt);
        tabbedPane.addTab("Table", null, panel2,"Tab 2 tooltip");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_2);
        frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
        // Combo Box
        JPanel panel3 = new JPanel(false);
        tabbedPane.addTab("Combo Box", null, panel3,"Tab 1 tooltip");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        String languages[]={"BCA","MCA","B.Sc","M.Sc","BBA"};        
        final JComboBox cb=new JComboBox(languages);
        panel3.add(cb);
        JPanel panel4 = new JPanel(false);
        tabbedPane.addTab("JTree", null, panel4,"Tab 1 tooltip");
        
        DefaultMutableTreeNode root, parent1, parent2, child,child1, child2;
        root = new DefaultMutableTreeNode("Course");
        parent1 = new DefaultMutableTreeNode("BCA");
        child = new DefaultMutableTreeNode("Section A");
        child1 = new DefaultMutableTreeNode("Section B");
        parent2 = new DefaultMutableTreeNode("MCA");
        child2 = new DefaultMutableTreeNode("Section A");
        parent1.add(child);
        parent1.add(child1);
        parent2.add(child2);
        root.add(parent1);
        root.add(parent2);
        root.add(parent1);
        root.add(parent2);
        JTree tree = new JTree(root);
        panel4.add(tree);
    }
}
