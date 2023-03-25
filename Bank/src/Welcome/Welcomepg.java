package Welcome;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class Welcome extends Frame{
    Welcome(){
        Frame f = new Frame();
        JLabel l1;
        l1 = new JLabel("Welcome to MAHAKAL Bank");
        l1.setBounds(90, 150, 200, 30);
        f.add(l1);
        l1.setBackground(Color.green);
        Button b1=new Button("Click here to Continue");
        b1.setBounds(70, 200, 200, 30);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               f.dispose();
               new Secpg();
            }
        });
        
        b1.setBackground(Color.green);
        Button b2=new Button("Exit");
        b2.setBounds(70, 250, 100, 30);
        f.add(b2);
        b2.setBackground(Color.RED);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        f.setBackground(Color.yellow);
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
public class Welcomepg{
    public static void main(String[] args) {
        new Welcome();
    }
}
