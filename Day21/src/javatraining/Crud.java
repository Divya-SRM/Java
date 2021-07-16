package javatraining;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Crud extends JFrame{
 JLabel JL_fname,JL_lname,JL_age,JL_id,JL_Title;
 JTextField JT_fname,JT_lname,JT_age,JT_id;
 PreparedStatement pst;
 JButton btn_insert,btn_update,btn_delete,btn_view;
 String[] columnNames = {"Student Id", "Name", "Date of Birth", "Department"};
 static JTable table;
 JFrame frame1;
 Connection con;
 String from;
 public Crud(){
     super("Student Information");
     JL_Title=new JLabel("STUDENT APPLICATION");
     JL_id = new JLabel("Student Id:");
     JL_fname = new JLabel("Student Name:");
     JL_lname = new JLabel("Date of Birth:");
     JL_age = new JLabel("Department:");
     JL_Title.setBounds(100, 0, 150, 30);
     JL_id.setBounds(50, 20, 100, 20);
     JL_fname.setBounds(50, 50, 100, 20);
     JL_lname.setBounds(50, 80, 100, 20);
     JL_age.setBounds(50, 110, 100, 20);
     
     JT_id = new JTextField(20);
     JT_fname = new JTextField(20);
     JT_lname = new JTextField(20);
     JT_age = new JTextField(20);
     
     JT_id.setBounds(150,20,150,20);
     JT_fname.setBounds(150, 50, 150, 20);
     JT_lname.setBounds(150, 80, 150, 20);
     JT_age.setBounds(150, 110, 150, 20);
     btn_insert = new JButton("Insert");
     btn_update = new JButton("Update");
     btn_delete = new JButton("Delete");
     btn_view=new JButton("View");
     btn_insert.setBounds(100, 140, 100, 20);
     btn_update.setBounds(220, 140, 100, 20);
     btn_delete.setBounds(340, 140, 100, 20);
     btn_view.setBounds(440,140,100,20);
     
     
     setLayout(null);
     add(JL_Title);
     add(JL_id);
     add(JL_fname);
     add(JL_lname);
     add(JL_age);
     add(JT_id);
     add(JT_fname);
     add(JT_lname);
     add(JT_age);
     add(btn_insert);
     add(btn_update);
     add(btn_delete);
     add(btn_view);
     
     btn_view.addActionListener(new  ActionListener() {

         public void actionPerformed(ActionEvent e) {
         try{
        	 frame1 = new JFrame("Database Search Result");
             frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             frame1.setLayout(new BorderLayout());
             DefaultTableModel model = new DefaultTableModel();
             model.setColumnIdentifiers(columnNames);
             table = new JTable();
             table.setModel(model);
             table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
             table.setFillsViewportHeight(true);
             JScrollPane scroll = new JScrollPane(table);
             scroll.setHorizontalScrollBarPolicy(
                     JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
             scroll.setVerticalScrollBarPolicy(
                     JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
             String uname = "";
             String email = "";
             String pass = "";
             String cou = "";
             try {
            	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "divya");
                 pst = con.prepareStatement("select * from studentdb");
                 ResultSet rs = pst.executeQuery();
                 int i = 0;
                 if (rs.next()) {
                     uname = rs.getString("id");
                     email = rs.getString("name");
                     pass = rs.getString("dob");
                     cou = rs.getString("dept");
                     model.addRow(new Object[]{uname, email, pass, cou});
                     i++;
                 }
                 if (i < 1) {
                     JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
                 }
                 if (i == 1) {
                     System.out.println(i + " Record Found");
                 } else {

                     System.out.println(i + " Records Found");
                 }

             } catch (Exception ex) {

                 JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

             }

             frame1.add(scroll);

             frame1.setVisible(true);

             frame1.setSize(400, 300);
         }
         catch(Exception ex){}
         }
     });

   //button insert
    btn_insert.addActionListener(new  ActionListener() {

         public void actionPerformed(ActionEvent e) {
         try{
             theQuery("insert into studentdb (id,name,dob,dept) values('"+JT_id.getText()+"','"+JT_fname.getText()+"','"+JT_lname.getText()+"','"+JT_age.getText()+"')");
         }
         catch(Exception ex){}
         }
     });
    
        //button update
        btn_update.addActionListener(new  ActionListener() {

         public void actionPerformed(ActionEvent e) {
         try{
         
           theQuery("update studentdb set name = '"+JT_fname.getText()+"',dob = '"+JT_lname.getText()+"', dept = '"+JT_age.getText()+"' where id = "+JT_id.getText());
         }
         catch(Exception ex){}
         }
     });
       
         //button delete
        btn_delete.addActionListener(new  ActionListener() {

         public void actionPerformed(ActionEvent e) {
         try{
          
             theQuery("delete from studentdb where id = "+JT_id.getText());
         }
         catch(Exception ex){}
         }
     });
     
     
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);
     setLocationRelativeTo(null);
     setSize(700,500);
    
 }
 


 //function to execute the insert update delete query
  public void theQuery(String query){
      Connection con = null;
      Statement st = null;
      try{
          con = DriverManager.getConnection("jdbc:mysql://localhost/student","root","divya");
          st = con.createStatement();
          st.executeUpdate(query);
          JOptionPane.showMessageDialog(null,"Query Executed");
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      }
  }
 
 
     public static void main(String[] args){
     
         new  Crud();
     }
}