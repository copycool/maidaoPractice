package com.example.two;

import com.example.StringUntil;

public class Email {
    public static void main(String[] args) {
        System.out.println(checkEmail("Like2020@maidaotech.cn"));
        System.out.println(checkEmail("Li_k123@maidaotech.cn"));
        System.out.println(checkEmail("like2020@maidaotech.cn"));
        System.out.println(checkEmail("like@maidaotech.cn"));
        System.out.println(checkEmail("123_fff@qq.com"));
        System.out.println(checkEmail("126425_7976@qq.com"));
        System.out.println(checkEmail("Like2020@maidaotech.cn"));

    }

    private static boolean checkEmail(String email){
        if (email == null || email.indexOf("@") == -1) {//定义email不为空或有@符号
            return false;
        }
        String[] nameHost = email.split("@");//分割namehost为两部分以@分开
        int index = 0;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasUnderline = false;
        while (index < nameHost[0].length()) {//小于namehost第一部分的长度
            char c = nameHost[0].charAt(index);//定义char类型赋值为namehost第一部分的第index个字
            if (index == 0 && !StringUntil.isAlpha(c)) {//index不为零或不等于字母；
                return false;
            }
            if (!StringUntil.isAlphaOrNumber(c) && c !=95) {//不等于字母或数字
                return false;
            }
            if (StringUntil.isUpperAlpha(c)) {//等于大写字母
                hasUpper = true;
                
            }
            if (StringUntil.isLowerAlpha(c)) {//等于小写字母
                hasLower = true;
                
            }
            if (StringUntil.isNumber(c)) {//等于数字
                hasNumber = true;
            }
            if (c == 95) {//等于下划线
                hasUnderline = true;
            }
            index++;
        }
        int types = 0;
        if (hasUnderline) {
            types++;
            
        }
        if (hasNumber) {
            types++;
        }
        if (hasLower) {
            types++;
        }
        if (hasUpper) {
            types++;
        }
        if (types < 3) {
            return false;
        }
        int dotIndex = nameHost[1].indexOf(".");
        if (dotIndex <= 0 || dotIndex == nameHost[1].length() - 1) {//若.在namehost第二部分的开头或者结尾
            return false;
        }
        return true;
    }
}