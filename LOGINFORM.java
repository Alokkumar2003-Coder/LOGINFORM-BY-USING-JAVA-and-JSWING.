import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Myframe extends JFrame implements ActionListener
{ 
    Container c;
    JLabel label1,label2;
    JButton btn;
    JTextField user;
    JPasswordField pass;
    
    Myframe()
    {
        setTitle("LoginForm");
        setSize(400,300);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        label1 = new JLabel("Username");
        label2 = new JLabel("Password");
        label1.setBounds(10,50,100,20);
        label2.setBounds(10,100,100,20);
        c.add(label1);
        c.add(label2);

        user = new JTextField();
        user.setBounds(120,50,120,20);
        c.add(user);

        pass = new JPasswordField();
        pass.setBounds(120,100,120,20);
        c.add(pass);

        btn = new JButton("Login");
        btn.setBounds(100,150,70,20);
        c.add(btn);

        btn.addActionListener(this);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Username :"+ user.getText());
        System.out.println("Username :"+ new String(pass.getText()));

    }
}
public class LOGINFORM
{
    public static void main(String[] args)
    {
        Myframe frame = new Myframe();
    }
    
}
