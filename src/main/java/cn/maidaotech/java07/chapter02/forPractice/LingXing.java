package cn.maidaotech.java07.chapter02.forPractice;

import java.util.Scanner;

public class LingXing {
    public static void main(String[] args) {
        test9();
    }

    public static void test9() {
        Scanner scanner = new Scanner(System.in);
        //行数
        int i = scanner.nextInt();
        for (int j = 0; j < i; j++) {
            //  空白
            for (int k = 0; k < Math.abs(i / 2 - j); k++) {
                System.out.print(" ");
            }
            //  *
            for (int k = 0; k < i - 2 * Math.abs(i / 2 - j); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
