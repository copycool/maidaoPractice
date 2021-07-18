package cn.maidaotech.java07;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数：");
        int c = sc.nextInt();
        int temp;
        if(a>b){
            temp = a;
        }
        else{
            temp = b;
        }
        int max;
        if(temp>c){
            max =temp;
        }
        else{
            max = c;
        }
        System.out.println("最大值为："+max);
    }
    
}