package pk;
import javax.swing.* ;
import java.awt.* ;
public class Login{
    public static void main(String args[]) {
//create JFrame
        JFrame w = new JFrame();
        w.setSize(220, 120);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//create components
        JLabel l_username = new JLabel("用户名");
        JLabel l_password = new JLabel("密码");
        JTextField t_username = new JTextField();
        JPasswordField t_password = new JPasswordField();
        JButton b_login = new JButton("登录");
        JButton b_reg = new JButton("注册");
        JButton b_cancel = new JButton("取消");
//create input panel
        JPanel P_input = new JPanel();
        P_input.setLayout(new GridLayout(2, 2));
        P_input.add(l_username);
        P_input.add(t_username);
        P_input.add(l_password);
        P_input.add(t_password);
//create button panel
        JPanel P_button = new JPanel();
        P_button.setLayout(new FlowLayout());
       P_button.add(b_login);
        P_button.add(b_reg);
       P_button.add(b_cancel);
//frame
        w.setLayout(new BorderLayout());
        w.add(P_input,BorderLayout.CENTER);
        w.add(P_button,BorderLayout.SOUTH);
        w.setVisible(true);
    }
}
