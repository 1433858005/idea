package A1;
import javax.swing.*;
import java.awt.*;
public class Login {
    public static void main(String[] args) {
        JFrame a=new JFrame();
        a.setSize(1000,500);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel B=new JLabel("账号");
        JLabel C=new JLabel("密码");
        JTextField D=new JTextField();
        JTextField E=new JTextField();
        JButton F=new JButton("登录");
        JButton G=new JButton("注册");
        JPanel H=new JPanel();
        H.setLayout(new GridLayout(2,2));
        H.add(B);
        H.add(D);
        H.add(C);
        H.add(E);
        JPanel I=new JPanel();
        I.setLayout(new FlowLayout());
        I.add(F);
        I.add(G);
        a.setLayout(new BorderLayout());
        a.add(H,BorderLayout.CENTER);
        a.add(I,BorderLayout.SOUTH);
        a.setVisible(true);
    }
}