package javatraining;

import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class SwingJtree extends JFrame {
    JTree tree;
    DefaultMutableTreeNode root, parent1, parent2, child,child1, child2;

    SwingJtree() {
        super("JTree Demo");

        root = new DefaultMutableTreeNode("Course");
        parent1 = new DefaultMutableTreeNode("BCA");
        child = new DefaultMutableTreeNode("Section A");
        child1 = new DefaultMutableTreeNode("Section B");
        parent2 = new DefaultMutableTreeNode("MCA");
        child2 = new DefaultMutableTreeNode("Section A");

        // Adding child nodes to parent
        parent1.add(child);
        parent1.add(child1);
        parent2.add(child2);

        // Adding parent nodes to root
        root.add(parent1);
        root.add(parent2);
        root.add(parent1);
        root.add(parent2);

        // Adding root to JTree
        tree = new JTree(root);

        // Adding root to JTree
        tree = new JTree(root);

        getContentPane().add(new JScrollPane(tree));
        setSize(300, 300);
        setVisible(true);
    }
}

class JTreeDemo {
    public static void main(String args[]) throws Exception {
        UIManager
                .setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        new SwingJtree();
    }
}