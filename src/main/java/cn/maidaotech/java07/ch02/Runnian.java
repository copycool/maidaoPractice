package cn.maidaotech.java07.ch02;
import java.util.Scanner;
public class Runnian {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int x=in.nextInt();


       if((x%4==0&&x%100!=0)||(x%400==0)){
          

        System.out.println(x+"年是一个闰年");
       }else{
           System.out.println(x+"年是一个平年");
       }
    }
     
}
