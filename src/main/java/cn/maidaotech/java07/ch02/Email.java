package cn.maidaotech.java07.ch02;

import cn.maidaotech.java07.ch02.StringUtils;

public class Email {
    public static void main(String[] args) {
        System.out.println(check("sjbcjsjj"));
        System.out.println(check("sjb@cd"));
        System.out.println(check("sj3bc@.com"));
        System.out.println(check("sjb8_cj@qq.com"));

        System.out.println(check("SmkfE@1938.com"));
        System.out.println(check("A_vnj@com."));
        System.out.println(check("7392@12.com"));
        System.out.println(check("S_12m@qq.com"));
        System.out.println(check("Jmc09@_.m"));

    }

    private static boolean check(String email) {
        // if(email==null||email.length()==0){
        // return false;
        // }
        if (StringUtils.isEmpty(email)) {
            return false;
        }
        String[] parts = email.split("@");
        if (parts.length != 2 || StringUtils.isEmpty(parts[0]) || StringUtils.isEmpty(parts[1])) {
            return false;
        }
        if (!checkName(parts[0]) || !checkHost(parts[1])) {
            return false;
        }
        return true;
    }

    private static boolean checkName(String name) {

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasLine = false;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (i == 0 && !StringUtils.isAlpha(c)) {
                return false;
            }
            if (!StringUtils.isAlphaNumberUnderline(c)) {
                return false;
            }
            if (StringUtils.isUpperCase(c)) {
                hasUpper = true;
            }
            if (StringUtils.isLowerCase(c)) {
                hasLower = true;
            }
            if (StringUtils.isNumber(c)) {
                hasNumber = true;
            }
            if (c == '_') {
                hasLine = true;
            }
        }

        int kind = 0;
        if (hasUpper) {
            kind++;
        }
        if (hasLower) {
            kind++;
        }
        if (hasNumber) {
            kind++;
        }
        if (hasLine) {
            kind++;
        }
        if (kind < 3) {
            return false;
        }
        return true;
    }

    private static boolean checkHost(String host) {
        int index = host.indexOf(".");
        if (index > 0 && index < host.length() - 1) {
            return true;
        }
        // if(host.startsWith(".")||host.endsWith(".")){
        // return false;
        // }
        return false;
    }

}
