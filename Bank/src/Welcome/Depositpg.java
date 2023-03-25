package Welcome;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;

class Fhpg extends Frame {
    TextField t1;
    TextField t2;
    Fhpg() {
        Frame f = new Frame();
        t1 = new TextField();
        t1.setBounds(100, 50, 100, 30);
        f.add(t1);
        JLabel l1, l2,l5;
        l5 = new JLabel("DEPOSIT");
        l5.setBounds(100, 20, 100, 30);
        f.add(l5);
        l1 = new JLabel("Enter Amount");
        l1.setBounds(20, 50, 100, 30);
        f.add(l1);
        Button b1 = new Button("Deposit");
        b1.setBounds(100, 100, 80, 30);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        try {
        	String s1= t1.getText();
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "root");
            Statement stmt = con.createStatement();
            String s2="select amt from signup";
            float num = Float.parseFloat(s1);
            float num1 = Float.parseFloat(s2);
            float num2=num+num1;
            String s3 = String.valueOf(num2);
            String tnh = "update signup set amt=('"+s3+"')where name='tilak'" ;
            int i = stmt.executeUpdate(tnh);
	        if (i > 0) {
	            System.out.println("SUCESSFULLY updated");
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
        b2.setBounds(100, 150, 80, 30);
        f.add(b2);
        b1.setBackground(Color.GREEN);
        l2=new JLabel("Balance is:_______");
        l2.setBounds(30, 200, 100, 30);
        f.add(l2);
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

public class Depositpg {
    public static void main(String[] args) {
        new Fhpg();
    }
}
