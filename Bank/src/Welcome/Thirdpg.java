package Welcome;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Thrdpg extends Frame{
    Thrdpg(){
        Frame f = new Frame();
        Button b1=new Button("Already a User ??");
        b1.setBounds(100, 110, 100, 40);
        f.add(b1);
        b1.setBackground(Color.green);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               f.dispose();
               new Ffthpg();
            }
        });
        Button b2=new Button("New User");
        b2.setBounds(100, 160, 100, 40);
        f.add(b2);
        b2.setBackground(Color.CYAN);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               f.dispose();
               new Frthpg();
            }
        });
        Button b3=new Button("Exit");
        b3.setBounds(100, 210, 100, 40);
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
public class Thirdpg{
    public static   void main(String[] args) {
        new Thrdpg();
    }
}