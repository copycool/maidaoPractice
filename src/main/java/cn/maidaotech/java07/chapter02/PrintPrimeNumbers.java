package cn.maidaotech.java07.chapter02;

import java.util.Scanner;

public class PrintPrimeNumbers {
    // 判断101-200之间有多少个素数，并输出所有素数。
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;// 判断是否为质数
        int count = 0;

        for (int i = 101; i < 201; i++) {

            if (i % 2 == 0) {
                break;
            } else {
                for (int j = 3; j < i + 1 / 2; i++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                    if (j == i + 1 / 2) {
                        flag = true;
                    }
                }
            }
            if (flag) {
                System.out.println(i + "是质数");
                count++;
                System.out.println(count);
            }
        }
    }
}
