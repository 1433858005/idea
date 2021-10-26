import java.util.ArrayList;

public class B {

   private  student2[] student2s;
    private int maxlength;
    private int length;
    public  B(int maxlength){
        initiate(maxlength);
    }
    private  void initiate(int maxlength){
        student2s =new student2[maxlength];
        this.maxlength=maxlength;
    }
    public int length(){
        return length;
    }
    public int Maxlength(){
        return maxlength;
    }
    //*******************
    public  boolean insert(int index,student2 student){
        boolean suc=false;
        if (index<0 ||index>length){
            System.out.println("插入位置错误！");
            return suc;
        }
        if (length+1>maxlength){
            System.out.println("线性表已经满了");
            return suc;
        }
        length++;
        for (; index<length;index++){
            student2 stunext= student2s[index];//student 类型    名为stunext
            suc=true;
        }
        return suc;
    }
    public static void main(String[] args) {
        ArrayList<student2> qq=new ArrayList();
        studentlist aaa=new studentlist(1);
//        private int id;
//        private String nane;
//        private char genger;
//        private int age;
       // private  String nativeplace;
        student2 q=new student2(23,"张三",'男',23,"北京");
        student2 w=new student2(24,"张三",'男',23,"北京");
        student2 e=new student2(25,"张三",'男',23,"北京");
        qq.add(q);
        qq.add(w);
        qq.add(e);
        //boolean qqq=insert(2,qq);
        System.out.println();
    }
}