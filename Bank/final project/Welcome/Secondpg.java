package Welcome;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class Secpg extends Frame{
    Secpg(){
        Frame f = new Frame("Secondpg");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/sd.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l7 = new JLabel(i3);
        l7.setBounds(0, 0, 500, 550);
        JLabel L1=new JLabel("MAHAKAL BANK");
        L1.setBounds(110,100,200,30);
        L1.setForeground(Color.red);
        L1.setFont(new Font("Raleway", Font.BOLD, 25));
        Panel p=new Panel();
        p.setBounds(110,150,230,50);
        p.add(L1);
        f.add(p);
        Button b1=new Button("ADMIN");
        b1.setBounds(150, 230, 100, 60);
        f.add(b1);
        b1.setFont(new Font("Raleway", Font.BOLD, 25));
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 f.dispose();
                 new  Ffthpg();
            }
        });
        b1.setBackground(Color.GREEN);
        Button b2=new Button("CUSTOMER");
        b2.setBounds(130, 300, 180, 60);
        f.add(b2);
        b2.setBackground(Color.cyan);
        b2.setFont(new Font("Raleway", Font.BOLD, 25));
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               f.dispose();
               new Thrdpg();
            }
        });
        Button b3=new Button("Exit");
        b3.setBounds(150, 370, 120, 60);
        b3.setForeground(Color.white);
        f.add(b3);
        b3.setBackground(Color.red);
        b3.setFont(new Font("Raleway", Font.BOLD, 25));
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JLabel l9;
        l9=new JLabel("Designed and Developed by @#TILAK VAISHNAV");
        l9.setBounds(10,100,50,05);
        l9.setForeground(Color.red);
        l9.setFont(new Font("Raleway", Font.BOLD, 15));
        Panel p7= new Panel();
        p7.setBounds(10,450,450,30);
        p7.add(l9);
        f.add(p7);
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
}
public class Secondpg{
    public static void main(String[] args) {
        new Secpg();
    }
}

