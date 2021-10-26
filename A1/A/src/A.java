import java.sql.SQLClientInfoException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        ArrayList<student> b=new ArrayList();
        Scanner a=new Scanner(System.in);
        lo:   while (true){
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            String aa=a.next();
            switch (aa){
                case "1":
                    System.out.println("添加学生");
                    add(b);
                    break ;
                 case "2":
                    delete(b);
                    break ;
                  case "3":
                   update(b);
                    break ;
                 case "4":
                    System.out.println("查看学生");
                    chakan(b);
                    break ;
                case "5":
                    System.out.println("感谢您的使用");
                    break lo ;
                default:
                    System.out.println("您输入有误");
                    break ;
            }
        }
    }



    public static int getindex(ArrayList<student>b,String sid){
        int index=-1;
    for (int i = 0; i < b.size(); i++) {
        student qqq=b.get(i);
        String  id =qqq.getSid();
        if (id.equals(sid)){
            index=i;
        }
    }
    return  index;
}
    public static void update(ArrayList<student> b) {
        System.out.println("请输入您要删除的学生学号：");
        Scanner q = new Scanner(System.in);
        String sid = q.next();
        int index = getindex(b, sid);
        if (index == -1) {
            System.out.println("查无信息，请重新输入");
        } else {
            System.out.println("请输入新的学生姓名");
            String name=q.next();
            System.out.println("请输入新的学生年龄");
            int age=q.nextInt();
            System.out.println("请输入新的学生生日");
            String birthday=q.next();
            student ww=new student(sid,name,age,birthday);
            b.set(index,ww);
            System.out.println("修改成功");
        }
    }
    public static void delete(ArrayList<student> b) {
        System.out.println("请输入您要删除的学生学号：");
        Scanner q=new Scanner(System.in);
        String sid=q.next();
        int index=getindex(b,sid);
        if (index==-1){
            System.out.println("查无信息，请重新输入");
        }else {
            b.remove(index);
            System.out.println("删除成功");
        }

    }

    private static void chakan(ArrayList<student> b) {
        if (b.size()==0){
            System.out.println("无信息，请添加后重新查询");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t生日");
        for (int i = 0; i < b.size(); i++) {
            student d=b.get(i);
            System.out.println(d.getSid()+"\t"+d.getName()+"\t"+d.getAge()+"\t"+d.getBirthday());
        }
    }

    public static void add(ArrayList<student> b) {
        Scanner a=new Scanner(System.in);
        String sid;
        while (true){
            System.out.println("请输入学号");
            sid=a.next();
            int index=getindex(b,sid);
            if (index==-1){
                break;
            }else {
                System.out.println(sid+"学号已经存在");
            }
        }
        System.out.println("请输入姓名");
        String name=a.next();
        System.out.println("请输入年龄");
        int age=a.nextInt();
        System.out.println("请输入生日");
        String birthday=a.next();
        student bb=new student(sid,name,age,birthday);
        b.add(bb);
        System.out.println("添加成功");
    }
}