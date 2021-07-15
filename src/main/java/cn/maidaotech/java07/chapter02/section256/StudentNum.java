package cn.maidaotech.java07.chapter02.section256;

import java.util.Scanner;

// 从键盘输入学生学号，例如 2019 年 01 期 12 号，
// 输入 20190112，使用“/”除和“%”余运算符分解学号 
// 获得年份、期数和序号，并分别输出。 
public class StudentNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的学号:");
		String sid = sc.next();

		int num = Integer.valueOf(sid).intValue();//字符串转整形
		int year = num / 10000;        //取商数
		int period = num / 100 % 100;  
		int id = num % 100;            //除一百除不尽剩余数

		System.out.println("年份" + year);
		System.out.println("期数" + period);
		System.out.println("序号" + id);

	}
}