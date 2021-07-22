package cn.maidaotech.java07.work4;

import java.util.Scanner;

public class Rabbit {
    public static void main(String[] args) {

        System.out.println("第一个月有一对兔子，请输入月份：");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("第" + n + "个月有" + Fib1(n) + "对兔子");
    }

    private static int Fib1(int n) {// 递归实现
        if (n == 1 || n == 2)
            return 1;
        else
            return Fib1(n - 1) + Fib1(n - 2);
    }
}
