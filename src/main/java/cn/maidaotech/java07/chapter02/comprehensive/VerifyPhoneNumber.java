package cn.maidaotech.java07.chapter02.comprehensive;

import java.util.Scanner;

public class VerifyPhoneNumber {
    //运行不成功，先放一下
    // 编写一个方法验证用户输入的手机号，
    // 要求：11位数字、只能以数字1开头，
    // 第二位可以是数字3、5、6、7、8、9。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的手机号码");
        String mobil = sc.next();
        boolean b = validateMobile(mobil);
        if (b == true) {
            System.out.println("输入的手机号是合法的");
        } else {
            System.out.println("输入的手机号是非法的");
        }
    }

    public static boolean validateMobile(String mobil) {
        char firstchar = mobil.charAt(0);
        char secondchar = mobil.charAt(1);
        boolean flag = true;
        if (mobil.length() == 11 && firstchar == '1'
                && (secondchar == '3' || secondchar == '5' 
                || secondchar == '7' || secondchar == '9')) {
            flag = true;
            // for (int i = 2; i < mobil.length(); i++) {
            //     char c = mobil.charAt(i);
            //     if (c < '0' || c > '9') {
            //         flag = false;
            //         return flag;
            //     }
            // }
        }else{
            flag = false;
        }
        return flag;
    }
}