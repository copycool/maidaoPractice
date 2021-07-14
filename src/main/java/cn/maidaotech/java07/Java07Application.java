package cn.maidaotech.java07;

import java.time.Year;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.management.InstanceAlreadyExistsException;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.beans.BulkBean;

@SpringBootApplication
public class Java07Application {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(Java07Application.class, args);
		System.out.println("请输入手机号用于判断:");
		String number=input.next();//获取输入的手机号
		System.out.println(number);
		String regex = "1[356789]\\d{9}";//正则表达式规则
		boolean phone=number.matches(regex);
		System.out.println(number+"判断结果为:"+phone);
	}

{
	System.out.println("请输入要检查的年份:");
	int year=input.nextInt();
	isLeapYear(year);

}

private void isLeapYear(int i) {
	if(i%4==0 && i/100!=0 || i%400==0){
    System.out.println("输入数值是闰年");
	}
	else{
    System.out.println("输入数值不是闰年");
	}
}

{
	System.out.println("请输入要解析的学号:");
	int year=input.nextInt();
	number(year);
}
    private void number(int number){
	if(number<=10000000){
	System.out.println("输入学号错误！");
    return;
	}
	int year=number/10000;//年份
	int periods=number/100%100;//期数
	int sequence=number%100;//序列
	System.out.println("年份为:"+year);
	System.out.println("期数为:"+periods);
	System.out.println("序列为:"+sequence);
	}
{
  
}

}
