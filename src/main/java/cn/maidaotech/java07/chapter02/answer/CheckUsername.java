package cn.maidaotech.java07.chapter02.answer;

import java.util.regex.Matcher;

public class CheckUsername {
    // 编程检测用户名的合法性，用户名需满足以下条件：
    // 长度8到20个字符
    // 只能英文字母、数字必须以大写字母开头

    // 所有的常量都要写在最上面，就是声明类的下面
    private final static String AllUpperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        System.out.println(check("username12345"));
    }

    public static boolean check(String username) {
        if (username == null) {
            return false;
        }
        if (username.length() < 8 || username.length() > 20) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (i == 0 && !isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    // 判断是不是字母和数字
    private static boolean isAlphaNumber(char c) {
        if (isAlpha(c) || isNumber(c)) {
            return true;
        }
        return false;
    }

    // 判断是不是字母（大小写字母）
    private static boolean isAlpha(char c) {
        if (isUpperCase(c) || isLowerCase(c)) {
            return true;
        }
        return false;
    }

    // 判断是不是数字
    private static boolean isNumber(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    // isUpperCase判断是不是大写字母
    private static boolean isUpperCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        //或
        // if (c >= 65 && c <= 97) {
        //     return true;
        // }
        //或
        // if (AllUpperCase.indexOf(c) != -1) {
        //     return true;
        // }
        return false;
    }

    // isUpperCase判断是不是小写字母
    private static boolean isLowerCase(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        return false;
    }
}