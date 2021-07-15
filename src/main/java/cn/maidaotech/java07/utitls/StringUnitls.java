package cn.maidaotech.java07.utitls;

public class StringUnitls {

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isAlpha(char c) {
        if (isUpperCase(c) || isLowerCase(c)) {
            return true;
        }
        return false;
    }

    public static boolean isUpperCase(char c) {
        if (c > 'Z' || c < 'A') {
            return false;
        }
        return true;
    }

    public static boolean isAlphaNumberUnderline(char c) {
        if (isAlpha(c) || isNumber(c) || c == '_') {
            return true;
        }
        return false;
    }

    public static boolean isLowerCase(char c) {
        if (c < 'a' || c > 'z') {
            return false;
        }
        return true;
    }

    public static boolean isNumber(char c) {
        if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }
}
