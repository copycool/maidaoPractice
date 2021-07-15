package cn.maidaotech.bookexample;

import java.util.Scanner;

public class TelephoneNumber {
    // 基于正则表达式的手机号验证
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String telephone = scanner.nextLine();
        scanner.close();
        String telephoneNumber = "^[1][3|5|6|7|8|9]{1}[0-9]{9}$";
        System.out.println(telephone.matches(telephoneNumber));
        if (telephone.matches(telephoneNumber)) {
            System.out.println("输入的手机号很好");
        } else {
            System.out.println("输入的手机号有误！");
        }
    }
}