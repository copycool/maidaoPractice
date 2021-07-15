package cn.maidaotech.bookexample;

import java.util.Scanner;

public class CheckoutUserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        scanner.close();
        if (check(username)) {
            System.out.println("用户名合法！");
        } else {
            System.out.println("用户名不合法！");
        }
    }

    private static boolean check(String username) {
        String userName = "^[A-Z][A-Za-z0-9]{7,19}$";//首字母进行判断[A-Z],其余需要占位7-19位
        if (username.matches(userName)) {
            return true;
        }
        return false;
    }
}