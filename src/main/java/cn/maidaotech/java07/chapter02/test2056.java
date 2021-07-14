package cn.maidaotech.java07.chapter02;

import java.util.Scanner;

public class test2056 {
    public static void main(String[] args) {
        isLeapYear(2018);
        isLeapYear(2019);
        isLeapYear(2020);
    }
    public static void isLeapYear(int year){
        if(year<0||year>3000){
            System.out.println("年份有误！");
        }
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"不是闰年");
        }
    }

}
