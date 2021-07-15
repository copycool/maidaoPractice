package cn.maidaotech.java07.work;

import cn.maidaotech.java07.util.StringUtils;

/**
 * 
 * 
 * 验证邮箱是否符合规则： name@host，满足一下规则：name只能由字母、数字、下划线组成； 只能以字母开头
 * 至少包含大写字母、小写字母、数字、下划线中的三种 host中必须包含字符“.”，且“.”不能在host部分的两头
 * 
 * 
 * 
 */
public class CheckEmail {
    public static void main(String[] args) {
        System.out.println(check("Like2020@maidaotech.cn"));
        System.out.println(check("Li_ke@maidaotech.cn"));
        System.out.println(check("like2020@maidaotech.cn"));
        System.out.println(check("like@maidaotech.cn"));
        System.out.println(check("123fff@qq.com"));

    }

    public static boolean check(String email) {

        if (email == null || email.length() < 1 || email.indexOf("@") == -1) {
            return false;
        }

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasUnderline = false;

        String[] res = email.split("@");

        for (int i = 1; i < res[0].length(); i++) {
            char temp = res[0].charAt(i);
            if (i == 0 && !StringUtils.isEnglish(temp)) {
                return false;
            }
            if (!StringUtils.isAlphaNumber(temp) && temp != 95 && !StringUtils.isEnglish(temp)) {
                return false;
            }
            if (StringUtils.isUppperCase(temp)) {
                hasUpper = true;
            }
            if (StringUtils.isLowerCase(temp)) {
                hasLower = true;
            }
            if (StringUtils.isAlphaNumber(temp)) {
                hasNumber = true;
            }
            if (StringUtils.isUnderline(temp)) {
                hasUnderline = true;
            }
        }
        int count = 0;
        if (hasUpper) {
            count++;
        }
        if (hasLower) {
            count++;
        }
        if (hasNumber) {
            count++;
        }
        if (hasUnderline) {
            count++;
        }
        if (count < 3) {
            return false;
        }


        if (res[1].startsWith(".") || res[1].endsWith(".")) {
            return false;
        }
        return true;
    }

    
}
