package Welcome;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.WindowListener;
import java.util.concurrent.locks.Lock;

class thpg extends Frame {
    TextField t1;
    TextField t2;
    TextField t3;
    TextField t4;
    TextField t5;
    thpg() {
        Frame f = new Frame("SIGN UP");
        JLabel l1, l2,l3,l4,l5,l6;
        t1 = new TextField();
        t1.setBounds(120, 50, 150, 30);
        f.add(t1);
        JPasswordField pf = new JPasswordField();
        l2 = new JLabel("Password");
        l2.setBounds(30, 100, 100, 30);
        pf.setBounds(120, 100, 150, 30);
        f.add(pf);
        f.add(l2);
        t3 = new TextField();
        t3.setBounds(120, 150, 150, 30);
        f.add(t3);
        t4 = new TextField();
        t4.setBounds(120, 200, 150, 30);
        f.add(t4);
        l5 = new JLabel("Edit/Modify Details");
        l5.setBounds(100, 20, 150, 40);
        f.add(l5);
        l1 = new JLabel("Name:");
        l1.setBounds(30, 50, 100, 30);
        l3 = new JLabel("Email Id:");
        l3.setBounds(30, 150, 100, 30);
        l4 = new JLabel("Ph.No:");
        l4.setBounds(30, 200, 100, 30);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        Button b1 = new Button("SAVE");
        b1.setBounds(80, 250, 80, 30);
        f.add(b1);
        b1.setBackground(Color.GREEN);
        Button b2 = new Button("Back");
        b2.setBounds(80, 300, 80, 30);
        f.add(b2);
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

public class Editpg {
    public static void main(String[] args) {
        new thpg();
    }
}