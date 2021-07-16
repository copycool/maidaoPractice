package cn.maidaotech.java07.chapter02;

import java.util.regex.Pattern;

        //验证身份证

public class IDverify {
    private static final Pattern IDENTITY_CHECKER = Pattern
            .compile("^[1-9]\\d{5}(19|20)\\d{2}((0[1-9])|10|11|12)(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]");

    public static void main(String[] args) {
        System.out.println(checkIdentity("41022419870616263X"));
        System.out.println(checkIdentity("410224198706162639"));
    }

    public static boolean checkIdentity(String s){
        if(s==null||s.length()!=18){
            return false;
        }
        java.util.regex.Matcher matcher = IDENTITY_CHECKER.matcher(s);
            if(!matcher.matches()){
            return false;
        }
        int[] w = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1 };
        int sum = 0;
        for (int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            int num = (ch == 'x' || ch == 'X') ? 10 : Integer.parseInt(String.valueOf(ch));// '4' -> "4" -> 4
            sum += num * w[i];
        }
        if(sum%11!=1) {
            return false;
        }
        return true;
    }

}
