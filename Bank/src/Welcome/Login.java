package Welcome;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

class Ffthpg extends Frame {
    TextField t1;
    TextField t2;
    Ffthpg() {
        Frame f = new Frame();
        t1 = new TextField();
        t1.setBounds(100, 50, 100, 30);
        f.add(t1);
        JLabel l1, l2,l5;
        l5 = new JLabel("Login");
        l5.setBounds(100, 20, 100, 30);
        f.add(l5);
        l1 = new JLabel("Name:");
        l1.setBounds(30, 50, 100, 30);
        JPasswordField pf = new JPasswordField();
        l2 = new JLabel("Password:");
        l2.setBounds(30, 100, 100, 30);
        pf.setBounds(100,100,100,30);
        f.add(pf);
        f.add(l1);
        f.add(l2);
        Button b1 = new Button("LOGIN");
        b1.setBounds(80, 150, 80, 30);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 String s1 = t1.getText();
            	 String s2= new String(pf.getPassword());
            	   try {
            		   Class.forName("com.mysql.cj.jdbc.Driver");
            	       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "root");
            	        Statement stmt =con.createStatement();
            	         String sql;
            	         sql = "select * from signup where name=('" + s1 + "') and  password=('" + s2 + "')";
            	         ResultSet rs = stmt.executeQuery(sql);
            	        while (rs.next())
            	        	System.out.println("login successfully");
            	       se();
            	}
            	   catch(Exception f)
            	   {
            		   System.out.println(f);
            	   }
            }
        }
        );
        b1.setBackground(Color.GREEN);
        Button b2=new Button("Exit");
        b2.setBounds(80, 200, 100, 30);
        f.add(b2);
        b2.setBackground(Color.RED);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
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

public class Login {
    public static void main(String[] args) {
        new Ffthpg();
    }
}