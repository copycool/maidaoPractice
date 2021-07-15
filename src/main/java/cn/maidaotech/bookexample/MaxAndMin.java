package cn.maidaotech.bookexample;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.print("最大的数字为：");
        if (number1 >= number2 && number1 >= number3) {
            System.out.println(number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }
        System.out.print("最小的数字为：");
        if (number1 <= number2 && number1 <= number3) {
            System.out.println(number1);
        } else if (number2 <= number1 && number2 <= number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }
        scanner.close();
    }
}
