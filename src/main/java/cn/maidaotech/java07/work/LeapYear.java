package cn.maidaotech.java07.work;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        isLeapYear(year);
        input.close();
    }

    /**
     * 判断传入数据年份呢是否是闰年
     * 
     * @param year ：指定年份呢
     */
    private static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }

}