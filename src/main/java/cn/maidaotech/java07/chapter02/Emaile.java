package cn.maidaotech.java07.chapter02;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Emaile {
    public static void main(String[] args) {
        System.out.println(checkEmail("Like2020@maidaotech.cn"));
        System.out.println(checkEmail("Li_ke@maidaotech.cn"));
        System.out.println(checkEmail("like2020@maidaotech.cn"));
        System.out.println(checkEmail("like@maidaotech.cn"));
        System.out.println(checkEmail("123fff@qq.com"));

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



