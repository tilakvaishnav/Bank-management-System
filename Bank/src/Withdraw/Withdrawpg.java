package Withdraw;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.WindowListener;

class Fthpg extends Frame {
    TextField t1;
    TextField t2;
    Fthpg() {
        Frame f = new Frame();
        t1 = new TextField();
        t1.setBounds(100, 50, 100, 30);
        f.add(t1);
        JLabel l1, l2,l5;
        l5 = new JLabel("WITHDRAW");
        l5.setBounds(100, 20, 100, 30);
        f.add(l5);
        l1 = new JLabel("Enter Amount");
        l1.setBounds(20, 50, 100, 30);
        f.add(l1);
        Button b1 = new Button("Withdraw");
        b1.setBounds(100, 100, 80, 30);
        f.add(b1);
        Button b2 = new Button("Back");
        b2.setBounds(100, 150, 80, 30);
        f.add(b2);
        b1.setBackground(Color.GREEN);
        l2=new JLabel("Balance is:");
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

public class Withdrawpg {
    public static void main(String[] args) {
        new Fthpg();
    }
}