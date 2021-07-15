package cn.maidaotech.java07.zuoye;

public class StringUtils {
    private final static String ALL_UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//检查是否为空
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
//检查字母数字下划线
    public static boolean isAlphaNumberUnderline(char c) {
        if (isAlpha(c) || isNumber(c) || c == '_') {
            return true;
        }
        return false;
    }
//检查数字字母
    public static boolean isAlphaNumber(char c) {
        if (isAlpha(c) || isNumber(c)) {
            return true;
        }
        return false;
    }
//检查数字
    public static boolean isNumber(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }
    //检查下划线
    public static boolean isline(char c) {
        if (c =='_') {
            return true;
        }
        return false;
    }
//检查是否有字母
    public static boolean isAlpha(char c) {
        if (isUpperCase(c) || isLowerCase(c)) {
            return true;
        }
        return false;
    }

    // 检查字母是否小写
    public static boolean isLowerCase(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        return false;
    }

    // 检查字母是否大写
    public static boolean isUpperCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        // if (c >= 65 && c <= 97) {
        // return true;
        // }
        // if(ALL_UPPER_CASE.indexOf(c)!=-1){
        // return true;
        // }
        return false;
    }
}
