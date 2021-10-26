package A1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;//事件发生库
public class c extends JFrame implements ActionListener{
    //extends JFrame ；继承Java的JFrame类，JFrame 是Java的窗体类，继承它可以重写它的一些方法达到更方便编程的作用
   // 此时在该类中就可以调用JFrame类中非private的方法
    // implements ActionListener ；是实现 ActionListener 接口，为动作监听接口，是Java swing 监听窗体动作的一个接口
    private JTextField ShoWAnswer;//peivate私有的   私有文本框  showanswer
    private JTextField Input1,Input2;
    private JButton Ok;//私有按钮
    public c(){
        super("5656");//super() 用在构造方法中，是调用父类的构造方法。
        Container c=getContentPane();//初始化一个容器命名该容器为c
        //getContentPane()这个方法有返回值，返回的是Container对象
        c.setLayout(new FlowLayout());//布局   流式布局
        Input1=new JTextField( 4);//设置文本框宽度  columns  指定列的宽度
        Input2=new JTextField(4);
        ShoWAnswer=new JTextField(4);
        Ok=new  JButton("计算");
        c.add(new JLabel("请输入两整数以求最大公因数: "));//显示文字
        c.add(Input1);
        c.add(Input2);
        c.add(new JLabel("最大公因数"));
        c.add(ShoWAnswer);
        c.add(Ok);
        Ok.addActionListener(this);//actionListener起到对用户动作的监听作用，在控件上可以添加动作监听addActionListener，
        // 如单击一个按钮，这时加在该按钮上的actionListener就能够获取这一动作，然后执行actionPreform动作，
    }
    public static void main(String args[]) {
        c J_T = new c();
        J_T.setSize(310, 100);
        J_T.setVisible(true);
        J_T.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        //如果要求按钮执行一些动作，可以在这个方法中添加、修改、删除以及判断
        //这是接口ActionListener里面定义的一个抽象方法，所有实现这个接口的类都要重写这个方法。
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