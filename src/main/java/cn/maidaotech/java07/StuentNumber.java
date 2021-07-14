package cn.maidaotech.java07;

import java.util.Scanner;

public class StuentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {
		System.out.println("请输入您的学号:");
		String sid = sc.next();

		int num = Integer.valueOf(sid).intValue();
		int year = num / 10000;
		int period = num / 100 % 100;
		int id = num % 100;

		System.out.println("年份" + year);
		System.out.println("期数" + period);
		System.out.println("序号" + id);
    }
    }
    
}
