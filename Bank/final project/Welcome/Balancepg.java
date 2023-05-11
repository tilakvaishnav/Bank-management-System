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
    	 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/sd.jpg"));
         Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel l7 = new JLabel(i3);
         l7.setBounds(0, 0, 500, 550);
         Frame f = new Frame();
        JLabel l1,l2,l3,l4,l5;
        JLabel l8;
        l8=new JLabel("Welcome To Balance Enquiry page");
        l8.setBounds(10,100,50,05);
        l8.setFont(new Font("Raleway", Font.BOLD, 25));
        l8.setForeground(Color.blue);
        Panel p8= new Panel();
        p8.setBounds(05,50,500,40);
        p8.add(l8);
        f.add(p8);
        p8.setBackground(Color.yellow);
        l1=new JLabel("Enter Password");
        l1.setBounds(60,200,200,30);
        l1.setFont(new Font("Raleway", Font.BOLD, 25));
        l1.setForeground(Color.blue);
        Panel p= new Panel();
        p.setBounds(60,200, 200, 40);
        p.add(l1);
        f.add(p);
        l2=new JLabel("Name :");
        l2.setBounds(80,250,150,30);
        l2.setForeground(Color.blue);
        l2.setFont(new Font("Raleway", Font.BOLD, 25));
        Panel p2= new Panel();
        p2.setBounds(80,250, 150, 40);
        p2.add(l2);
        f.add(p2);
        l3=new JLabel("Balance :");
        l3.setBounds(80,300,150,30);
        l3.setForeground(Color.blue);
        l3.setFont(new Font("Raleway", Font.BOLD, 25));
        Panel p3= new Panel();
        p3.setBounds(80,300, 150, 40);
        p3.add(l3);
        f.add(p3);
        l4=new JLabel();
        l4.setBounds(280,250,150,30);
        l4.setForeground(Color.blue);
        l4.setFont(new Font("Raleway", Font.BOLD, 25));
        Panel p4= new Panel();
        p4.setBounds(280,250, 200, 40);
        p4.add(l4);
        f.add(p4);
        l5=new JLabel();
        l5.setBounds(280,300,150,30);
        l5.setFont(new Font("Raleway", Font.BOLD, 25));
        l5.setForeground(Color.blue);
        Panel p5= new Panel();
        p5.setBounds(280,300, 150, 40);
        p5.add(l5);
        f.add(p5);
        JPasswordField pf = new JPasswordField();
        pf.setBounds(280, 200, 200, 40);
        f.add(pf);
        Button b1 = new Button("Back");
        b1.setBounds(120, 350, 80, 40);
        b1.setFont(new Font("Raleway", Font.BOLD, 25));
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               f.dispose();
               new Thdpg();
            }
        });
        f.add(b1);
        Button b2 = new Button("Show Balance");
        b2.setBounds(220, 350, 190, 40);
        b2.setFont(new Font("Raleway", Font.BOLD, 25));
        f.add(b2);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	   try {
            		   String s1 =new String(pf.getPassword());
            		   Class.forName("com.mysql.cj.jdbc.Driver");
            	       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "root");
            	        Statement stmt =con.createStatement();
            	         String s2="select amt  from signup where password=('"+s1+"')";
            	         ResultSet rs = stmt.executeQuery(s2);
            	         while (rs.next())
            	        {
            	        	String s3=rs.getString("amt");
            	        	l5.setText(s3);            	        	
            	        }
            	         String s4="select name from signup where password=('"+s1+"')";
            	         ResultSet rs1=stmt.executeQuery(s4);
            	         while(rs1.next()){
         	        	String s5=rs1.getString("name");
         	        	l4.setText(s5);
            	         }
            	   }
            	   catch(Exception f)
            	   {
            		   System.out.println(f);
            	   }
            }
        }
        );
        JLabel l6;
        l6=new JLabel("Designed and Developed by @#TILAK VAISHNAV");
        l6.setBounds(10,100,50,05);
        l6.setFont(new Font("Raleway", Font.BOLD, 15));
        l6.setForeground(Color.RED);
        Panel p6= new Panel();
        p6.setBounds(10,500,500,30);
        p6.add(l6);
        f.add(p6);
        p6.setBackground(Color.yellow);
        f.add(l7);
        f.setBackground(Color.cyan);
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

public class Balancepg {
    public static void main(String[] args) {
        new rhpg();
    }
}