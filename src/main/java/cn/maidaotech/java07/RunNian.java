package cn.maidaotech.java07;

import java.util.Scanner;
public class RunNian {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ner=new Scanner(System.in );
		System.out.println("请输入一个 年份");
		long year=ner.nextLong();
		if(year % 4== 0 && year%100!=0||year%400==0)
		{
			System.out.println(year+"是闰年！");
		}
		else
		{
			System.out.println(year+"不是闰年！");
		}
 
	}
 
}