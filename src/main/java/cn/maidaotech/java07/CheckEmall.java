package cn.maidaotech.java07;
import java.util.Scanner;
public class CheckEmall {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入邮箱用于判断:");
        String emall = input.next();// 获取输入邮箱
        boolean check = checkEmail(emall);
        System.out.println("是否正确:" + check);
    }

    public static boolean checkEmail(String email) {
        if (email == null || email.indexOf("@") == -1) {
            return false;
        }
        String[] nameHost = email.split("@");
        int index = 0;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasUnderline = false;
        while (index < nameHost[0].length()) {
            char c = nameHost[0].charAt(index);
            if (index == 0 && !isAlpha(c)) {
                return false;
            }
            if (!isAlphaOrNumber(c) && c != 95) {
                return false;
            }
            if (isLowerAlpha(c)) {
                hasLower = true;
            }
            if (isUpperAlpha(c)) {
                hasUpper = true;
            }
            if (isNumber(c)) {
                hasNumber = true;
            }
            if (c == 95) {
                hasUnderline = true;
            }
            index++;
        }
        int types = 0;
        if (hasLower) {
            types++;
        }
        if (hasUpper) {
            types++;
        }
        if (hasUnderline) {
            types++;
        }
        if (hasNumber) {
            types++;
        }
        if (types < 3) {
            return false;
        }
        int dotIndex = nameHost[1].indexOf('.');
        if (dotIndex <= 0 || dotIndex == nameHost[1].length() - 1) {
            return false;
        }
        return true;
    }

    private static boolean isAlphaOrNumber(char c) {
        if (isAlpha(c) || isNumber(c)) {
            return true;
        }
        return false;
    }

    private static boolean isAlpha(char c) {
        if (isLowerAlpha(c) || isUpperAlpha(c)) {
            return true;
        }
        return false;
    }

    private static boolean isUpperAlpha(char c) {
        if (c >= 65 && c <= 90) {
            return true;
        }
        return false;
    }

    private static boolean isLowerAlpha(char c) {
        if (c >= 97 && c <= 122) {
            return true;
        }
        return false;
    }

    private static boolean isNumber(char c) {
        if (c >= 48 && c <= 57) {
            return true;
        }
        return false;
    }


}