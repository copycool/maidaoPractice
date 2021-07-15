package cn.maidaotech.java07.zuoye;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
 */
public class ChecktId {
//正则表达
    private static final Pattern IDENTITY_CHECKER = Pattern
            .compile("^[1-9]\\d{5}(19||20)\\d{2}((0[0-9])|10|11|12)(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]");
                  //("^[1-9]\\d{5}(19|20)\\d{2}((0[1-9])|10|11|12)(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]")
    public static void main(String[] args) {
        System.out.println(checkIdentity("411322199710014911"));
        System.out.println(checkIdentity("41022419870616263X"));
    }

    public static boolean checkIdentity(String s) {
        if (s == null || s.length() != 18) {
            return false;
        }
        Matcher matcher = IDENTITY_CHECKER.matcher(s);
        if (!matcher.matches()) {
            return false;
        }
        int[] w = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1 };
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int num = (ch == 'x' || ch == 'X') ? 10 : Integer.parseInt(String.valueOf(ch));
            sum += num * w[i];
        }
        if (sum % 11 != 1) {
            return false;
        }
        return true;
    }
}
