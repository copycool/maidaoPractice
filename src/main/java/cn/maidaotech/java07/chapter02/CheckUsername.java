package cn.maidaotech.java07.chapter02;

import java.nio.channels.Pipe;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 长度8到20个字符 只能英文字母、数字 必须以大写字母开头
 */
public class CheckUsername {
    private static boolean check(String username) {
        if (username.length() < 8 || username.length() > 20) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (i == 0 && !isUpperCase(c)) {
                return false;
            }
            if (!isLowerCase(c) && !isUpperCase(c) && !isNumeber(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isUpperCase(char c) {
        if (c > 'Z' || c < 'A') {
            return false;
        }
        return true;
    }

    private static boolean isLowerCase(char c) {
        if (c < 'a' || c > 'z') {
            return false;
        }
        return true;
    }

    private static boolean isNumeber(char c) {
        if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }

    // 正则表达式的检查方法
    private static boolean CheckUsername(String username) {
        Pattern Username_Pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-zA-Z])(.{8,20})$");
        Matcher matcher = Username_Pattern.matcher(username);
        Pattern firstPattern = Pattern.compile("[A-Z]*");
        Matcher isBiger = firstPattern.matcher(username.charAt(0) + "");
        if (matcher.matches() && isBiger.matches()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();

        if (check(username)) {
            System.out.println("用户名:" + username + "和法");
        } else {
            System.out.println("用户名:" + username + "不合法");
        }

    }
}
