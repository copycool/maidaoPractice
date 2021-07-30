package cn.maidaotech.java07;

import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.zip.Checksum;

public class Checkuser {
    public static void main(final String[] args) {
        System.out.println("请输入用户名");
        final Scanner input = new Scanner(System.in);
        final String checkuser = input.next();
        if (checkuser.length() >= 8 && checkuser.length() <= 20) {
            final String check = "[A-Z][A-Za-z0-9]*";
            final boolean u = checkuser.matches(check);
            System.out.println(checkuser + "当前用户名合法");
        } else {
            System.out.println(checkuser + "当前用户名不合法");
        }
    }

    public static boolean check(final String username) {
        if (username == null)
            return false;
        if (username.length() < 8 || username.length() > 20)
            return false;
        for (int i = 0; i < username.length(); i++) {
            final char c = username.charAt(i);
            if (i == 0 && !isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isUpperCase(final char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

}
