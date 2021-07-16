package com.example.demo;

public class StringUntil {
   
    public static boolean isAlphaOrNumber(char c) {
        if (isAlpha(c) || isNumber(c)) {
            return true;
        }
        return false;
    }
    public static boolean isAlpha(char c) {
        if (isLowerAlpha(c) || isUpperAlpha(c)) {
            return true;
        }
        return false;
    }
    public static boolean isUpperAlpha(char c) {
        if (c >= 65 && c <= 90) {
            return true;
        }
        return false;
    }

    public static boolean isLowerAlpha(char c) {
        if (c >= 97 && c <= 122) {
            return true;
        }
        return false;
    }

    public static boolean isNumber(char c) {
        if (c >= 48 && c <= 57) {
            return true;
        }
        return false;
    }

    
}