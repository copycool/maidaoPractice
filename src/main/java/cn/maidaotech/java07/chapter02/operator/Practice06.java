package cn.maidaotech.java07.chapter02.operator;

import java.util.Scanner;

public class Practice06 {
    //判断某一年是否为闰年。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要判断的年份：");
        int num = scanner.nextInt();

        if (num % 4 == 0 && num % 100 != 0) {
            System.out.println("yse");
        }
        if (num % 400 == 0) {
            System.out.println("yse");
        }else{
            System.out.println("no");
        }

        scanner.close();
    }
}