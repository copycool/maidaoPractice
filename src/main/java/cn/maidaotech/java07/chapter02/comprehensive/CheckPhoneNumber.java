package cn.maidaotech.java07.chapter02.comprehensive;

import java.util.Scanner;

public class CheckPhoneNumber {
    // 编写一个方法验证用户输入的手机号，
    // 要求：11位数字、只能以数字1开头，
    // 第二位可以是数字3、5、6、7、8、9。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的手机号码");
        String mobil = sc.nextLine();
        System.out.println(check(mobil));
    }

    public static boolean check(String mobil) {
        if (mobil.length() != 11) {
            return false;
        }
        if (mobil.charAt(0) != '1') {
            return false;
        }
        if (mobil.charAt(1) != '3' && mobil.charAt(1) != '5' && mobil.charAt(1) != '7' && mobil.charAt(1) != '8'
                && mobil.charAt(1) != '9') {
            return false;
        }
        for (int i = 0; i < mobil.length()-1; i++) {
            if (mobil.charAt(i)<'0'||mobil.charAt(i)>'9') {
                return false;
            }
        }
        return true;

    }
}