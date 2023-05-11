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
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/sd.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l7 = new JLabel(i3);
        l7.setBounds(0, 0, 500, 550);
        t1 = new TextField();
        t1.setBounds(300, 250, 100, 30);
        f.add(t1);
        JLabel l6,l1, l2,l5,l3,l8;
        l6 = new JLabel("Enter Password");
        l6.setBounds(100, 200, 200, 30);
        l6.setForeground(Color.BLUE);
        l6.setFont(new Font("Raleway", Font.BOLD, 25));
        Panel p2= new Panel();
        p2.setBounds(100, 200, 190, 40);
        p2.add(l6);
        f.add(p2);
        
        JPasswordField pf = new JPasswordField();
        pf.setBounds(300, 200, 100, 30);
        f.add(pf);
        l8=new JLabel("Welcome To Amount Withdraw page");
        l8.setBounds(10,100,50,05);
        l8.setForeground(Color.RED);
        l8.setFont(new Font("Raleway", Font.BOLD, 25));
        Panel p8= new Panel();
        p8.setBounds(05,50,500,40);
        p8.add(l8);
        f.add(p8);
        l5 = new JLabel("WITHDRAW");
        l5.setBounds(200, 150, 180, 30);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Raleway", Font.BOLD, 25));
        Panel p= new Panel();
        p.setBounds(200, 150, 180, 40);
        p.add(l5);
        f.add(p);
        l1 = new JLabel("Enter Amount");
        l1.setBounds(100, 250, 200, 30);
        l1.setForeground(Color.BLUE);
        Panel p1= new Panel();
        p1.setBounds(100, 250, 180, 40);
        p1.add(l1);
        f.add(p1);
        l1.setFont(new Font("Raleway", Font.BOLD, 25));
        l2=new JLabel("Balance is:");
        l2.setBounds(50,350, 100, 30);
        Panel p3= new Panel();
        p3.setBounds(50,350, 100, 40);
        p3.add(l2);
        f.add(p3);
        l3=new JLabel();
        l3.setBounds(100, 350, 100, 30);
        f.add(l3);
        Panel p4= new Panel();
        p4.setBounds(130, 350, 100, 40);
        p4.add(l3);
        f.add(p4);
        Button b1 = new Button("Withdraw");
        b1.setBounds(200, 300, 120, 40);
        f.add(b1);
        b1.setFont(new Font("Raleway", Font.BOLD, 25));
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        try {
        	String s1= t1.getText();
        	 String s2= new String(pf.getPassword());
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "root");
            Statement stmt = con.createStatement();
            String s3="select amt from signup where password=('"+s2+"')";
            int num1 = Integer.parseInt(s1);
            ResultSet rs = stmt.executeQuery(s3);
            int num;
            String tnh="";
	        while (rs.next()) {
	        	num=rs.getInt("amt");
	        	 int num2=num-num1;
	             String s5 = String.valueOf(num2);
	              tnh = "update signup set amt=('"+s5+"')where password=('"+s2+"')" ;   
	              l3.setText(s5);
	        }
            int i = stmt.executeUpdate(tnh);
	        if (i > 0) {
	        	 JOptionPane.showMessageDialog(null, "Amount is Withdraw Successfully");
	        } else {
	            System.out.println("updation FAILED");
	        }
	    } catch (Exception s) {
	        System.out.println(s);
	    }

            }
        }
        );

        Button b2 = new Button("Back");
        b2.setBounds(310, 300, 120, 40);
        b2.setFont(new Font("Raleway", Font.BOLD, 25));
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               f.dispose();
               new Thdpg();
            }
        });
        f.add(b2);
        b1.setBackground(Color.GREEN);
        JLabel l9;
        l9=new JLabel("Designed and Developed by @#TILAK VAISHNAV");
        l9.setBounds(10,100,50,05);
        l9.setForeground(Color.red);
        l9.setFont(new Font("Raleway", Font.BOLD, 15));
        Panel p6= new Panel();
        p6.setBounds(10,500,500,30);
        p6.add(l9);
        f.add(p6);
        f.add(l7);
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

public class Withdrawpg{
    public static void main(String[] args) {
        new Fithpg();
    }
}
