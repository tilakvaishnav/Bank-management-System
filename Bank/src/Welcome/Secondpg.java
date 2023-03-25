package Welcome;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class Secpg extends Frame{
    Secpg(){
        Frame f = new Frame("Secondpg");
        JLabel L1=new JLabel("MAHALKAL BANK");
        L1.setBounds(100,100,150,30);
        f.add(L1);
        Button b1=new Button("ADMIN");
        b1.setBounds(100, 150, 100, 60);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 f.dispose();
                 new Thrdpg();
            }
        });
        b1.setBackground(Color.GREEN);
        Button b2=new Button("CUSTOMER");
        b2.setBounds(100, 220, 100, 60);
        f.add(b2);
        b2.setBackground(Color.cyan);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               f.dispose();
               new Thrdpg();
            }
        });
        Button b3=new Button("Exit");
        b3.setBounds(100, 290, 100, 60);
        f.add(b3);
        b3.setBackground(Color.red);
        b3.addActionListener(new ActionListener() {
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
public class Secondpg{
    public static void main(String[] args) {
        new Secpg();
    }
}

