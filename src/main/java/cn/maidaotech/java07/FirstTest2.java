package cn.maidaotech.java07;
import java.util.Scanner;
public class FirstTest2 {
 public static void main(String[] args) {
    //任意声明3个整数，求出这3个数中的最大值和最小值，并输出到控制台
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的数字；" );
        int a = scan.nextInt();
        System.out.println("请输入你的数字；" );
        int b = scan.nextInt();
        System.out.println("请输入你的数字；" );
        int c = scan.nextInt();
        int max;
        int min;
        if(a>b){
            max=a;
            min=b;
        }else{
            max=b;
            min=a;
        }
        if (max<c){
            max=c;
            if(min>c){
                min=c;
            }
         } 
         System.out.println(max);
         System.out.println(min);
    }
}

