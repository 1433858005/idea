package ceshi;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            if (i==3){
                System.out.println("你的3次机会已用完");
                return;
            }
            int b=aa.nextInt();
            if(b==123){
                System.out.println("回答正确");
            }
            else{
                System.out.println("回答错误");
            }
        }

    }
    }

