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
        Frame f = new Frame();
        Button b1=new Button("Withdraw");
        b1.setBounds(100, 110, 100, 40);
        f.add(b1);
        b1.setBackground(Color.green);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               f.dispose();
               new Fithpg();
            }
        });
        Button b2=new Button("Deposit");
        b2.setBounds(100, 160, 100, 40);
        f.add(b2);
        b2.setBackground(Color.CYAN);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               f.dispose();
               new  Fhpg();
            }
        });
        Button b3=new Button("Check Balance");
        b3.setBounds(100, 210, 100, 40);
        f.add(b3);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               f.dispose();
               new  rhpg();
            }
        });
        b3.setBackground(Color.blue);
        Button b4=new Button("Edit Details");
        b4.setBounds(100, 260, 100, 40);
        f.add(b4);
        b4.setBackground(Color.CYAN);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               f.dispose();
               new  thpg();
            }
        });
        Button b5=new Button("Exit");
        b5.setBounds(100, 310, 100, 40);
        f.add(b5);
        b5.setBackground(Color.red);
        b5.addActionListener(new ActionListener() {
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
}
public class Menupg{
    public static   void main(String[] args) {
        new Thdpg();
    }
}
