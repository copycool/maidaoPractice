

 
package cn.maidaotech.java07.chapter02.zonghe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 验证身份证号的合法性，
// 身份证号必须满足以下规则 
//     必须以数字 1 至 9 开头 
//     出生年份只能是 19**或 20**年的数组 
//     出生月份只能是 01 至 12 月的数字 
//     出生日两位数字只能是 01 至 31 的数字 
//     15 到 17 位可以是任意数字 
//     第 18 位必须是是数字 0-9 和字母‘X


public class CheckID {
    private static final Pattern IDENTITY_CHECKER = Pattern
            .compile("^[1-9]\\d{5}(19|20)\\d{2}((0[1-9])|10|11|12)(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]");

    public static void main(String[] args) {
        System.out.println(checkIdentity("41022419870616263X"));
        System.out.println(checkIdentity("410224198706162639"));
    }

    public static boolean checkIdentity(String s) {
        if (s == null || s.length() != 18) {
            return false;
        }
        Matcher matcher = IDENTITY_CHECKER.matcher(s);
        if (!matcher.matches()) {
            return false;
        }
        int[] w = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1};
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int num = (ch == 'x' || ch == 'X') ? 10 : Integer.parseInt(String.valueOf(ch));// '4' -> "4" -> 4
            sum += num * w[i];
        }
        if (sum % 11 != 1) {
            return false;
        }
        return true;
    }
}
