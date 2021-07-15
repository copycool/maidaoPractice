package cn.maidaotech.java07.util;

public class StringUtils {
    /**
     * 判断是否是字母`不区分大小写`
     * 
     * @param item 判断字符
     * @return 是字母`true`不是字母`false`
     */
    public static boolean isEnglish(char item) {
        if (isUppperCase(item) || isLowerCase(item)) {
            return true;
        }
        return false;
    }

    /**
     * 判断是否是大写字母
     * 
     * @param item 判断字符
     * @return 是：`true` 不是：`false`
     */
    public static boolean isUppperCase(char item) {
        if (item < 'A' || item > 'Z') {
            return false;
        }
        return true;
    }

    /**
     * 判断是否是小写字母
     * 
     * @param item 判断字符
     * @return 是：`true` 不是：`false`
     */
    public static boolean isLowerCase(char item) {
        if (item < 'a' || item > 'z') {
            return false;
        }
        return true;
    }

    /**
     * 判断是否是数值
     * 
     * @param item 判断字符
     * @return 是：`true` 不是：`false`
     */
    public static boolean isAlphaNumber(char item) {
        if (item < '0' || item > '9') {
            return false;
        }
        return true;
    }

    /**
     * 判断是否是下滑线
     * 
     * @param item 判断字符
     * @return 是：`true` 不是：`false`
     */
    public static boolean isUnderline(char item) {
        if (item != '_') {
            return false;
        }
        return true;
    }
}