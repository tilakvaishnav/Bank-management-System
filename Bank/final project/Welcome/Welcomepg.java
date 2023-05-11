package Welcome;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class Welcome extends Frame{
    Welcome(){
        Frame f = new Frame();
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/sd.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 500, 550);
        JLabel l1;
        l1 = new JLabel("Welcome to MAHAKAL Bank");
        l1.setBounds(100, 250, 350, 30);
        l1.setBackground(Color.green);
        l1.setFont(new Font("Raleway", Font.BOLD, 25));
        Panel p=new Panel();
        p.setBounds(100,250,350,40);
        p.add(l1);
        f.add(p);
        
        Button b1=new Button("Click here to Continue");
        b1.setBounds(130, 300, 300, 50);
        f.add(b1);
        b1.setFont(new Font("Raleway", Font.BOLD, 25));
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               f.dispose();
               new Secpg();
            }
        });
        
        b1.setBackground(Color.yellow);
        Button b2=new Button("Exit");
        b2.setBounds(190, 360, 100, 50);
        b2.setForeground(Color.white);
        f.add(b2);
        b2.setFont(new Font("Raleway", Font.BOLD, 25));
        b2.setBackground(Color.RED);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        f.add(l3);
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
}
public class Welcomepg{
    public static void main(String[] args) {
        new Welcome();
    }
}
