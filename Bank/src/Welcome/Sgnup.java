package Welcome;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

import java.util.concurrent.locks.Lock;

class Frthpg extends Frame {
    TextField t1;
    TextField t2;
    TextField t3;
    TextField t4;
    TextField t5;
    Frthpg() {
        Frame f = new Frame("SIGN UP");
        JLabel l1, l2,l3,l4,l5,l6;
        t1 = new TextField();
        t1.setBounds(120, 50, 150, 30);
        f.add(t1);
        JPasswordField pf = new JPasswordField();
        pf.setBounds(120, 100, 150, 30);
        f.add(pf);
        l2 = new JLabel("Password");
        l2.setBounds(30, 100, 100, 30);
        f.add(l2);
        t3 = new TextField();
        t3.setBounds(120, 150, 150, 30);
        f.add(t3);
        t4 = new TextField();
        t4.setBounds(120, 200, 150, 30);
        f.add(t4);
        t5 = new TextField();
        t5.setBounds(120, 250, 150, 30);
        f.add(t5);
        l5 = new JLabel("Sign Up");
        l5.setBounds(120, 20, 150, 40);
        f.add(l5);
        l1 = new JLabel("Name:");
        l1.setBounds(30, 50, 100, 30);
        l3 = new JLabel("Email Id:");
        l3.setBounds(30, 150, 100, 30);
        l4 = new JLabel("Ph.No:");
        l4.setBounds(30, 200, 100, 30);
        l6 = new JLabel("Amt. to Deposit:");
        l6.setBounds(30, 250, 100, 30);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l6);
        Button b1 = new Button("SIGNUP");
        b1.setBounds(80, 300, 80, 30);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 String s1 = t1.getText();
            	 String s2 =new String(pf.getPassword());
            	 String s3 = t3.getText();
            	 String s4 = t4.getText();
            	 String s5 = t5.getText();
            	   try {
            		   Class.forName("com.mysql.cj.jdbc.Driver");
                       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "root");
            	        String sql = "insert into signup values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "')";
            	        Statement stmt = con.createStatement(); 
            	        int i = stmt.executeUpdate(sql);
            	        if (i > 0) {
            	            System.out.println("SUCESSFULLY INSERTED");
            	            b1.addActionListener(new ActionListener() {
            	                public void actionPerformed(ActionEvent e) {
            	                   f.dispose();
            	                   new Ffthpg ();
            	                }
            	            });
            	        } else {
            	            System.out.println("INSERTION FAILED");
            	        }
            	    } catch (Exception s) {
            	        System.out.println(s);
            	    }

            	}
            }
        );
        Button b2=new Button("Exit");
        b2.setBounds(80, 350, 80, 30);
        f.add(b2);
        b2.setBackground(Color.RED);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        b1.setBackground(Color.GREEN);
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

public class Sgnup {
    public static void main(String[] args) {
        new Frthpg();
    }
}


