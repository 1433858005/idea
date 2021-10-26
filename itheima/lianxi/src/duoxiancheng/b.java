package duoxiancheng;
//获取线程名称
public class b {
    //线程是有默认名字的·thread-编号
    public static void main(String[] args) {
        //第二种方式
        threadbbb a=new threadbbb ("小明");
        threadbbb b=new threadbbb ("小花");
        // 第一种方式
       //  a.setName ( "小明" );
       //  b.setName ( "小花" );
        a.start ();
        b.start ();
    }
}
