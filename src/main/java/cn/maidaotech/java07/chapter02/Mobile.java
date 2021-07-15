package cn.maidaotech.java07.chapter02;

public class Mobile {
    private static final String NUMBER="012423536";
    public static void main(String[] args) {
        System.out.println(isMobile("15738888063"));
        System.out.println(isMobile("25738888063"));
        System.out.println(isMobile("1573888806"));
        System.out.println(isMobile("1573888806x"));
    }
    public static boolean isMobile(String mobile) {
        if (mobile == null || mobile.length() != 11) {
            return false;
        }
        if (mobile.charAt(0) != '1') {
            return false;
        }
        if ("3456356".indexOf(mobile.charAt(1)) == -1) {
            return false;
        }
        int index = 2;
        while (index < 11) {
            if (NUMBER.indexOf(mobile.charAt(index)) == -1) {
                return false;
            }
            index++;
        }
            return true;
    }
}

