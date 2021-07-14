package cn.maidaotech.java07.chapter02.section256;
import java.util.Scanner;
//判断某一年是否为闰年。
// 能被4整除且不能被100整除的或者能被400整除的年是闰年
public class LeapYear {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("请输入年份");
    int year=in.nextInt();
    if((year%4==0&&year%100!=0)||(year%400==0)){
    System.out.println(year+"是一个闰年");
    }else{
    System.out.println(year+"是一个平年");
    }
}
}