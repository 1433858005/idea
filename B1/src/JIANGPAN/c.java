package JIANGPAN;

import java.util.Random;
public class c {
    public static void main(String[] args) {
        Random a=new Random();
        int b=a.nextInt(10)+1;
        //范围限制·【1,10） 只是0+1 后面的10不变，不包括10
        int c=a.nextInt(10);
        //范围限制·【0,10）包括0 不包括10
        System.out.println(b);
        System.out.println(c);
    }
}
