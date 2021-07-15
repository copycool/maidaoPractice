package cn.maidaotech.bookexample;

import java.util.Scanner;

public class StudentNumber {
    // 分段输出数字内容
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("该生年份" + number / 10000);
        System.out.println("该生期号" + number % 10000 / 100);
        System.out.println("该生序号" + number % 100);
        scanner.close();
    }
}