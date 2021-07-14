package cn.maidaitech.shui966;

import java.util.Scanner;

public class char2 {
    public static void main(String[] args) {
        System.out.println("请输入要查询的年份：");
        Scanner year = new Scanner(System.in);
        int year1 = year.nextInt();
        if(year1%4==0){
            System.out.println(year+"是闰年。");

        }
        else
        System.out.println(year+"不是闰年。");


    }
    
}