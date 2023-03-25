package Welcome;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

import java.util.concurrent.locks.Lock;
class rhpg extends Frame {
    TextField t1;
    rhpg() {
        
        Frame f = new Frame();
        t1=new TextField();
        t1.setBounds(100,50, 150, 40);
        f.add(t1);
        JLabel l1, l2,l3,l4,l5,l6;
        l5 = new JLabel("A/C No. is:______");
        l5.setBounds(30, 20, 150, 40);
        f.add(l5);
        l1 = new JLabel("Balance is");
        f.add(l1);
        l1.setBounds(30,50,150,40);
        Button b1 = new Button("Back");
        b1.setBounds(80, 100, 80, 30);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               f.dispose();
               new  Thdpg();
            }
        });
        Button b2 = new Button("Show Balance");
        b2.setBounds(180, 100, 80, 30);
        f.add(b2);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	   try {
            		   Class.forName("com.mysql.cj.jdbc.Driver");
            	       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "root");
            	        Statement stmt =con.createStatement();
            	         String sql;
            	         sql = "select amt from signup where name='tilak'";
            	         ResultSet rs = stmt.executeQuery(sql);
            	         String s2=t1.setText(sql);
            	        while (rs.next())
            	        {
            	        	System.out.println("login successfully");
            	}
            	   }
            	   catch(Exception f)
            	   {
            		   System.out.println(f);
            	   }
            }
        }
        );
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

public class Balancepg {
    public static void main(String[] args) {
        new rhpg();
    }
}