package A1;
import javax.swing.*;
import java.awt.*;
public class main {
  public static void main(String[] args) {
    JFrame a=new JFrame();
    a.setSize(555,1000);
  a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  JLabel b=new JLabel("账号");
  JLabel c=new JLabel("密码");
  JTextField d=new JTextField();
  JPasswordField e=new JPasswordField();
  JButton f=new JButton("登录");
  JButton g=new JButton("注册");
  JPanel h=new JPanel();
  h.setLayout(new GridLayout(2,2));
  h.add(b);
  h.add(d);
  h.add(c);
  h.add(e);
  JPanel i=new JPanel();
  i.setLayout(new FlowLayout());
  i.add(f);
  i.add(g);
  a.setLayout(new BorderLayout());
  a.add(h,BorderLayout.CENTER);
  a.add(i,BorderLayout.SOUTH);
  a.setVisible(true);
  }
}