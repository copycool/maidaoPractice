package cn.maidaotech.java07.work;

import cn.maidaotech.java07.util.StringUtils;

public class CheckUserName {
    public static void main(String[] args) {
        System.out.println(check("Agdhs123"));
        System.out.println(check("a12314"));
        System.out.println(check("gfugfyuguygyu"));
        System.out.println(check("1dasfafa"));
        System.out.println(check("Djh456546"));
    }

    public static boolean check(String userName) {
        if (userName == null) {
            return false;
        }

        if (userName.length() < 8 || userName.length() > 20) {
            return false;
        }

        for (int i = 0; i < userName.length(); i++) {
            char item = userName.charAt(i);

            if (i == 0 && !StringUtils.isUppperCase(item)) {
                return false;
            }
            if (!(StringUtils.isAlphaNumber(item) || StringUtils. isEnglish(item))) {
                return false;
            }

        }
        return true;
    }
}