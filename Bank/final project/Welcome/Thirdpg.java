package Welcome;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Thrdpg extends Frame{
    Thrdpg(){
        Frame f = new Frame("Third page");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/sd.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l7 = new JLabel(i3);
        l7.setBounds(0, 0, 500, 550);
        Button b1=new Button("Already a User ??");
        b1.setBounds(100, 200, 250, 40);
        b1.setFont(new Font("Raleway", Font.BOLD, 25));
        f.add(b1);
        b1.setBackground(Color.green);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               f.dispose();
               new Ffthpg();
            }
        });
        Button b2=new Button("New User");
        b2.setBounds(150, 250, 150, 40);
        b2.setFont(new Font("Raleway", Font.BOLD, 25));
        f.add(b2);
        b2.setBackground(Color.CYAN);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               f.dispose();
               new Frthpg();
            }
        });
        Button b3=new Button("Exit");
        b3.setBounds(180, 300, 100, 40);
        b3.setForeground(Color.white);
        b3.setFont(new Font("Raleway", Font.BOLD, 25));
        f.add(b3);
        b3.setBackground(Color.red);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
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
public class Thirdpg{
    public static   void main(String[] args) {
        new Thrdpg();
    }
}