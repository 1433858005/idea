import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class A extends JFrame implements ActionListener{
    private JTextField ShoWAnswer;
    private JTextField Input1,Input2;
    private JButton Ok;
    public A(){
        super("3205强攀攀");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        Input1=new JTextField(4);
        Input2=new JTextField(4);
        ShoWAnswer=new JTextField(4);
        Ok=new  JButton("计算");
        c.add(new JLabel("请输入两整数以求最大公因数: "));
        c.add(Input1);
        c.add(Input2);
        c.add(new JLabel("最大公因数"));
        c.add(ShoWAnswer);
        c.add(Ok);
        Ok.addActionListener(this);
    }
    public static void main(String args[]) {
        A J_T = new A();
        J_T.setSize(310, 100);
        J_T.setVisible(true);
        J_T.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        int num1=Integer.parseInt(Input1.getText());
        int num2=Integer.parseInt(Input2.getText());
        if(num1<0) num1=-1*num1;
        if(num2<0) num2=-1*num2;
        if(num1<num2) {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        do {
            int x;
            x = num2;
            num2 = num1 % num2;
            num1 = x;
        }while(num2!=0);
        ShoWAnswer.setText(String.valueOf(num1));
    }
}