package Welcome;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Panel;
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
   	 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/sd.jpg"));
     Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel l7 = new JLabel(i3);
     l7.setBounds(0, 0, 500, 550);
        JLabel l1, l2,l3,l4,l5,l6;
        t1 = new TextField();
        t1.setBounds(200, 100, 150, 30);
        f.add(t1);
        JPasswordField pf = new JPasswordField();
        pf.setBounds(200, 150, 150, 30);
        f.add(pf);
        l2 = new JLabel("Password");
        l2.setBounds(50, 150, 150, 30);
        Panel p4= new Panel();
        p4.setBounds(20,150,145,35);
        p4.add(l2);
        f.add(p4);
        l2.setForeground(Color.red);
        l2.setFont(new Font("verdana", Font.BOLD, 25));
        t3 = new TextField();
        t3.setBounds(200, 200, 150, 30);
        f.add(t3);
        t4 = new TextField();
        t4.setBounds(200,250,150, 30);
        f.add(t4);
        t5 = new TextField();
        t5.setBounds(200, 300, 150, 30);
        f.add(t5);
        l5 = new JLabel("Sign Up");
        l5.setBounds(140, 50, 150, 40);
        l5.setForeground(Color.blue);
        l5.setFont(new Font("verdana", Font.BOLD, 25));
        Panel p1= new Panel();
        p1.setBounds(140,50,150,45);
        p1.add(l5);
        f.add(p1);
        l1 = new JLabel("Name");
        l1.setBounds(50, 100, 100, 30);
        l1.setForeground(Color.red);
        l1.setFont(new Font("VERDANA", Font.BOLD, 25));
        Panel p2= new Panel();
        p2.setBounds(20,100,100,40);
        p2.add(l1);
        f.add(p2);
        l3 = new JLabel("Email Id");
        l3.setBounds(50, 200, 150, 30);
        l3.setForeground(Color.red);
        l3.setFont(new Font("verdana", Font.BOLD, 25));
        Panel p3= new Panel();
        p3.setBounds(10,200,150,35);
        p3.add(l3);
        f.add(p3);
        l4 = new JLabel("Ph.No");
        l4.setBounds(50, 250, 100, 30);
        l4.setForeground(Color.red);
        l4.setFont(new Font("verdana", Font.BOLD, 25));
        Panel p5= new Panel();
        p5.setBounds(30,250,100,35);
        p5.add(l4);
        f.add(p5);
        l6 = new JLabel("Deposit amt.");
        l6.setBounds(30, 300, 150, 30);
        l6.setForeground(Color.red);
        l6.setFont(new Font("verdana", Font.BOLD, 25));
        Panel p6= new Panel();
        p6.setBounds(10,300,180,35);
        p6.add(l6);
        f.add(p6);     
        Button b1 = new Button("SIGNUP");
        b1.setBounds(100, 350, 100, 30);
        b1.setFont(new Font("Raleway", Font.BOLD, 25));
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 String s1 = t1.getText();
            	 String s2 =new String(pf.getPassword());
            	 String s3 = t3.getText();
            	 String s4 = t4.getText();
            	 String s5 = t5.getText();
            	  if(s1.equals("") && s2.equals("")){
                      JOptionPane.showMessageDialog(null, "Fill all the required fields");
                  }
            	  else
            	  {
            	   try {
            		   Class.forName("com.mysql.cj.jdbc.Driver");
                       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "root");
            	        String sql = "insert into signup values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "')";
            	        Statement stmt = con.createStatement(); 
            	        int i = stmt.executeUpdate(sql);
            	        if (i > 0) {
            	                   f.dispose();
            	                   new Ffthpg ();
            	                }
            	          else {
            	            System.out.println("INSERTION FAILED");
            	        }
            	    } catch (Exception s) {
            	        System.out.println(s);
            	    }

            	}
            }
            }
        );
        Button b2=new Button("Exit");
        b2.setBounds(220, 350, 80, 30);
        b2.setForeground(Color.white);
        b2.setFont(new Font("Raleway", Font.BOLD, 25));
        f.add(b2);
        b2.setBackground(Color.RED);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JLabel l9;
        l9=new JLabel("Designed and Developed by @#TILAK VAISHNAV");
        l9.setBounds(10,100,50,05);
        l9.setForeground(Color.red);
        l9.setFont(new Font("Raleway", Font.BOLD, 15));
        Panel p7= new Panel();
        p7.setBounds(10,500,500,30);
        p7.add(l9);
        f.add(p7);
        f.add(l7);
        b1.setBackground(Color.GREEN);
        f.setBackground(Color.white);
        f.setSize(500,550);
        f.setLocation(500,120);
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


