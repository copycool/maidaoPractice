package cn.maidaotech.java07.chapter02.stringPractice;

public class TestEmailName {
    public static void main(String[] args) {
        System.out.println(checkEmail("Like2020@mai#daotech.cn"));
        System.out.println(checkEmail("Li_ke@maidaotech.cn"));
        System.out.println(checkEmail("like2020@maidaotech.cn"));
        System.out.println(checkEmail("like@maidaotech.cn"));
        System.out.println(checkEmail("123fff@qq.com"));

    }

    public static boolean checkEmail(String email) {
        if (email == null || email.indexOf('@') == -1) {
            return false;
        }
        String[] namehost = email.split("@");
        boolean hasline = false;
        boolean haslow = false;
        boolean hasupper = false;
        boolean hasnum = false;
        for (int i = 0; i < namehost[0].length(); i++) {
            char c = namehost[0].charAt(i);
            if (i == 0 && !StringUtils.Alpha(c)) {
                return false;
            }
            if (!StringUtils.AlphaAndNum(c) && c != 95) {
                return false;
            }
            if (StringUtils.UnderLine(c)) {
                hasline = true;
            }
            if (StringUtils.isLowerCase(c)) {
                haslow = true;
            }
            if (StringUtils.isUpperCase(c)) {
                hasupper = true;
            }
            if (StringUtils.isNum(c)) {
                hasnum = true;
            }
        }
            int count = 0;
            if (hasline) {
                count++;
            }
            if (haslow) {
                count++;
            }
            if (hasupper) {
                count++;
            }
            if (hasnum) {
                count++;
            }
            if (count < 3) {
                return false;
            }
            int j = namehost[1].indexOf('.');
            if (j <= 0 || j == namehost[1].length() - 1) {
                return false;
            }
            return true;
        }
    
}
