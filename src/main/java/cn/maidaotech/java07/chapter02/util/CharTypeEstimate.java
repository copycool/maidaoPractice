package cn.maidaotech.java07.chapter02.util;

public class CharTypeEstimate {
    public static Boolean upperCaseEstimate(char c) {
        if (c < 'A' || c > 'Z')
            return false;
        return true;
    }

    public static Boolean lowerCaseEstimate(char c) {
        if (c < 'a' || c > 'z')
            return false;
        return true;
    }

    public static Boolean letterEstimate(char c) {
        return upperCaseEstimate(c) || lowerCaseEstimate(c);
    }

    public static Boolean numberEstimate(char c) {
        if (c < '0' || c > '9')
            return false;
        return true;
    }

    public static Boolean isEmpty(String str) {
        if (str == null)
            return true;
        if (str.length() < 1)
            return true;
        return false;
    }
}