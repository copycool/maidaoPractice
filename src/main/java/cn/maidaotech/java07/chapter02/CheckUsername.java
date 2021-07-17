package cn.maidaotech.java07.chapter02;

public class CheckUsername {

    public static void main(String[] args) {
        System.out.println(check("username123"));
        System.out.println(check("Username123"));
        System.out.println(check("Username_123"));
    }

    public static boolean check(String username) {
        if (username == null) {
            return false;
        }
        if (username.length() < 8 || username.length() > 20) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (i == 0 && !StringUtils.isUpperCase(c)) {
                return false;
            }
            if (!StringUtils.isAlphaNumber(c)) {
                return false;
            }
        }
        return true;
    }

}
