package cn.maidaotech.java07;

import java.util.Scanner;

public class StuentNumber {
    public static void main(String[] args) {
        System.out.println("请输入8位学号：");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
		num.close();
        int num2 = num1/10000;
        System.out.println(num2+"年");

        int num3 = (num1/100)%100;
        System.out.println(num3+"期");

        int num4 = num1%100;
        System.out.println(num4+"号");
	}
}
