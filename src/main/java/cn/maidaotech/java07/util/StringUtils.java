package cn.maidaotech.java07.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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

    /**
     * 将字符串根据首字母按照字典顺序排序
     * 
     * @param str       源字符串
     * @param delimiter 界定符
     * @return 排序后的字符串
     */
    public static String sortAlpha(String str, String delimiter) {
        if (str == null || str.length() == 0) {
            return "";
        }
        List<String> list = Arrays.asList(str.toLowerCase().split(" "));

        list.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1 == null || o2 == null) {
                    return -1;
                }
                if (o1 == o2) {
                    return 0;
                }

                if (o1.charAt(0) < o2.charAt(0)) {
                    return -1;
                } else if (o1.charAt(0) > o2.charAt(0)) {
                    return 1;
                }
                return 0;
            }
        });
        String res = String.join(delimiter, list);
        return res;
    }
}