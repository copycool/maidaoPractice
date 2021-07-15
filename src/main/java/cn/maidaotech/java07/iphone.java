package cn.maidaotech.java07;

import java.util.Scanner;

public class iphone {
    public static void main(String[] args) {
        Scanner Sca = new Scanner(System.in);
        System.out.println("请输入您的手机号");
        String mobil = Sca.next();
        System.out.println("您输入的手机号为：" + mobil);
        boolean b = validateMobile(mobil);
        if (b == true) {
            System.out.println("输入正确");
        } else {
            System.out.println("非法输入");
        }
        Sca.close();
    }

    public static boolean validateMobile(String mobil) {
        char firstchar = mobil.charAt(0);
        char secondchar = mobil.charAt(1);
        boolean flag = false;
        if (mobil.length() == 11 && firstchar == '1' && (secondchar == '3' || secondchar == '5' || secondchar == '6'
                || secondchar == '7' || secondchar == '8' || secondchar == '9')) {
            flag = true;
            for (int i = 2; i < mobil.length(); i++) {
                char c = mobil.charAt(i);
                if (c < '0' || c > '9') {
                    flag = false;
                    return flag;
                }
            }
        }
        return flag;
    }
}
