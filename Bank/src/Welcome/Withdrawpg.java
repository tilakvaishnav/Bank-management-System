package Welcome;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

class Fithpg extends Frame {
    TextField t1;
    TextField t2;
    Fithpg() {
        Frame f = new Frame();
        t1 = new TextField();
        t1.setBounds(100, 50, 100, 30);
        f.add(t1);
        t2 = new TextField();
        t2.setBounds(100, 100, 100, 30);
        f.add(t2);
        JLabel l1, l2,l5;
        l5 = new JLabel("WITHDRAW");
        l5.setBounds(100, 20, 100, 30);
        f.add(l5);
        l1 = new JLabel("Enter name");
        l1.setBounds(20, 50, 100, 30);
        f.add(l1);
        l2 = new JLabel("Enter Amount");
        l2.setBounds(20, 100, 100, 30);
        f.add(l2);
        Button b1 = new Button("Withdraw");
        b1.setBounds(100, 150, 80, 30);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 String s1 = t1.getText();
            	 String s2 = t2.getText();
            	   try {
            		   Class.forName("com.mysql.cj.jdbc.Driver");
            	       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "root");
            	        Statement stmt =con.createStatement();
            	         String sql;
            	         sql = "select * from signup where name=('" + s1 + "')";
            	         String s3="select amt from signup where name=('"+s1+"')";
            	         float num = Float.parseFloat(s2);
        	             float num1 = Float.parseFloat(s3);
            	         if(num<num1)
            	         {
            	        	 float num2=num1-num;
            	        	 String s4= String.valueOf(num2);
            	         }
            	         ResultSet rs = stmt.executeQuery(sql);
            	        while (rs.next())
            	        	System.out.println("login successfully");
            	        con.close();
            	}
            	   catch(Exception f)
            	   {
            		   System.out.println(f);
            	   }
            }
        }
        );
        Button b2 = new Button("Back");
        b2.setBounds(100, 150, 80, 30);
        f.add(b2);
        b1.setBackground(Color.GREEN);
        l5=new JLabel("Balance is:_______");
        l5.setBounds(30, 200, 100, 30);
        f.add(l5);
        f.setBackground(Color.YELLOW);
        f.setSize(400, 450);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
};

public class Withdrawpg {
    public static void main(String[] args) {
        new Fithpg();
    }
}
