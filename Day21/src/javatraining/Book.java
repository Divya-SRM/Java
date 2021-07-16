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

public class Book extends JFrame{
 JLabel JL_id,JL_Title;
 JTextField JT_id;
 PreparedStatement pst;
 JButton btn_view;
 String[] columnNames = {"Book Id", " Book Name", "Author Name", "Date of Publication"};
 static JTable table;
 JFrame frame1;
 Connection con;
 String from;
 public Book(){
     super();
     JL_Title=new JLabel("Book Search");
     JL_id = new JLabel("Book Id:");
     
     JL_Title.setBounds(100, 0, 150, 30);
     JL_id.setBounds(50, 150, 100, 20);
    
     
     JT_id = new JTextField(20);
    
     
     JT_id.setBounds(150,40,150,20);
     
     btn_view=new JButton("View");
    
     btn_view.setBounds(150,100,100,20);
     
     
     setLayout(null);
     add(JL_Title);
     
    
    
     add(JT_id);
    
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
            	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "divya");
                 pst = con.prepareStatement("select * from book where id="+JT_id.getText());
                 ResultSet rs = pst.executeQuery();
                 int i = 0;
                 if (rs.next()) {
                     uname = rs.getString("id");
                     email = rs.getString("name");
                     pass = rs.getString("author");
                     cou = rs.getString("pdate");
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
          con = DriverManager.getConnection("jdbc:mysql://localhost/bookstore","root","divya");
          st = con.createStatement();
          st.executeUpdate(query);
          JOptionPane.showMessageDialog(null,"Query Executed");
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      }
  }
 
 
     public static void main(String[] args){
     
         new  Book();
     }
}