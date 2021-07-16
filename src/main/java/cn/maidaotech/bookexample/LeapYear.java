package cn.maidaotech.bookexample;

import java.util.Scanner;

public class LeapYear {
    // 闰年判断
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year+"年是闰年");
        } else {
            System.out.println(year+"年是平年");
        }
        scanner.close();
    }
}