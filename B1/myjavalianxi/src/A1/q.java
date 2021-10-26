package A1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//复选按钮·单选按钮
public class q extends JFrame implements ItemListener{
    JCheckBox a=new JCheckBox("北京");
    JCheckBox b=new JCheckBox("上海");
    JCheckBox c=new JCheckBox("广州");
    JCheckBox d=new JCheckBox("深圳");
    ButtonGroup  i=new ButtonGroup();
    JRadioButton e=new JRadioButton("男");
    JRadioButton f=new JRadioButton("女");
    JLabel g=new JLabel();
    public q(){
        super("软件3205强攀攀");
      Container h= getContentPane();
        h.setLayout(new FlowLayout());
        h.add(g);
        h.add(a);
        h.add(b);
        h.add(c);
        h.add(d);
        i.add(e);
        i.add(f);
        h.add(e);
        h.add(f);
        a.addItemListener(this);
        b.addItemListener(this);
        c.addItemListener(this);
        d.addItemListener(this);
        a.addItemListener(this);
        e.addItemListener(this);
        f.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent k){
        String l=g.getText();
        if(k.getSource() instanceof JCheckBox)
        {
            if(a.isSelected())
            {
                g.setText(a.getText());
            }
            if(b.isSelected())
            {
                g.setText(b.getText());
            }
            if(c.isSelected())
            {
                g.setText(c.getText());
            }
            if(d.isSelected())
            {
                g.setText(d.getText());
            }
        }
        if(k.getSource() instanceof JRadioButton) {
            if (e.isSelected()) {
                g.setText(e.getText());
            }
            if (f.isSelected()) {
                g.setText(f.getText());
            }
        }
    }
    public static void main(String[] args) {
        q m = new q();
        m.setSize(400, 100);

        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
