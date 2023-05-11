package Welcome;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
class Thdpg extends Frame{
    Thdpg(){
    	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l7 = new JLabel(i3);
        l7.setBounds(0, 0, 960, 1080);
    	Frame f = new Frame();
    	
    	JLabel l1,l2,l3,l4,l5;
    	Button b1=new Button("Withdraw");
    	b1.setBounds(280, 340, 100, 40);
    	f.add(b1);
    	
    	b1.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	       f.dispose();
    	       new Fithpg();
    	    }
    	});
    	b1.setFont(new Font("System", Font.BOLD, 16));
    	Button b2=new Button("Deposit");
    	b2.setBounds(280, 390, 100, 40);
    	f.add(b2);
    	
    	b2.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	       f.dispose();
    	       new  Fhpg();
    	    }
    	});
    	b2.setFont(new Font("System", Font.BOLD, 16));
    	Button b3=new Button("Check Balance");
    	b3.setBounds(280, 440, 130, 40);
    	f.add(b3);
    	b3.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	       f.dispose();
    	       new  rhpg();
    	    }
    	});
    	b3.setFont(new Font("System", Font.BOLD, 16));

    	Button b5=new Button("Exit");
    	b5.setBounds(280, 550, 100, 40);
    	f.add(b5);
    	b5.setFont(new Font("System", Font.BOLD, 16));
    	b5.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        System.exit(0);
    	    }
    	});
    	f.add(l7);
    	f.setBackground(Color.cyan);
    	f.setSize(960,1080);
        f.setLocation(500,0);
    	f.setLayout(null);
    	f.setVisible(true);
    	f.addWindowListener(new WindowAdapter() {
    	   public void windowClosing(WindowEvent e) {
    	       System.exit(0);
    	   }
    	});
    	}
    	};
   
public class Menupg{
    public static   void main(String[] args) {
        new Thdpg();
    }
}

