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
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/sd.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l7 = new JLabel(i3);
        l7.setBounds(0, 0, 700, 550);
        t1 = new TextField();
        t1.setBounds(250, 250, 150, 30);
        f.add(t1);
        JLabel l1, l2,l5,l6;
        l5 = new JLabel("LOGIN");
        l5.setBounds(200, 200, 150, 40);
        f.add(l5);
        l5.setFont(new Font("times new roman", Font.BOLD, 30));
        l5.setForeground(Color.RED);
        Panel p1= new Panel();
        p1.setBounds(200, 200, 160, 35);
        p1.add(l5);
        f.add(p1);
        l6 = new JLabel("WELCOME TO BANK MANAGEMENT SYSTEM ");
        l6.setBounds(20, 50, 660, 30);
        l6.setFont(new Font("verdana", Font.BOLD, 25));
        l6.setForeground(Color.red);
        Panel p6= new Panel();
        p6.setBounds(20, 50, 620, 40);
        p6.add(l6);
        p6.setBackground(Color.PINK);
        f.add(p6);
        l1 = new JLabel("Name:");
        l1.setBounds(120, 250, 100, 30);
        l1.setFont(new Font("fortan", Font.BOLD, 25));
        l1.setForeground(Color.RED);
        Panel p2= new Panel();
        p2.setBounds(120, 250, 120, 35);
        p2.add(l1);
        f.add(p2);
        JPasswordField pf = new JPasswordField();
        l2 = new JLabel("Password:");
        l2.setBounds(100, 300, 200, 30);
        l2.setFont(new Font("Raleway", Font.BOLD, 25));
        l2.setForeground(Color.RED);
        Panel p3= new Panel();
        p3.setBounds(100, 300, 140, 35);
        p3.add(l2);
        f.add(p3);
        pf.setBounds(250,300,150,30);
        f.add(pf);
        Button b1 = new Button("LOGIN");
        b1.setBounds(150, 350, 110, 30);
        f.add(b1);
        b1.setFont(new Font("Raleway", Font.BOLD, 25));
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 String s1 = t1.getText();
            	 String s2= new String(pf.getPassword());
            	  if(s1.equals("") && s2.equals("")){
                      JOptionPane.showMessageDialog(null, "Fill all the required fields");
                  }
            	  else {
            	   try {
            		   Class.forName("com.mysql.cj.jdbc.Driver");
            	       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "root");
            	        Statement stmt =con.createStatement();
            	         String sql;
            	         sql = "select * from signup where password=('" + s2 + "')";
            	         ResultSet rs = stmt.executeQuery(sql);
            	        while (rs.next())
            	        {
            	        	String s3=rs.getString("password");
            	        	if(s3.equals(s2))
            	        	{
            	                	f.dispose();
            	                	new  Thdpg();
            	        	}
            	        	else
            	        	{
            	        		JOptionPane.showMessageDialog(null, "Incorrect password");
            	        	}
            	        	}
            	                }
            	
            	   catch(Exception f)
            	   {
            		   System.out.println(f);
            	   }
            }
        }
        }
        );
        b1.setForeground(Color.white);
        b1.setBackground(Color.blue);
        Button b2=new Button("Exit");
        b2.setBounds(300, 350, 100, 30);
        f.add(b2);
        b2.setFont(new Font("Raleway", Font.BOLD, 25));
        b2.setForeground(Color.white);
        b2.setBackground(Color.RED);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        f.add(l7);
        f.setBackground(Color.cyan);
        f.setSize(660,550);
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

public class Login {
    public static void main(String[] args) {
        new Ffthpg();
    }
}