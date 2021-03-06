package cn.maidaotech.java07.chapter02.answer;

public class CheckEmail {
    public static void main(String[] args) {
        System.out.println(check("asdfjhgfg"));
        System.out.println(check("email@host"));
        System.out.println(check("_email@126.com"));
        System.out.println(check("asc@.com"));
        System.out.println(check("asc@qq.com"));
        System.out.println(check("Gasc@qq.com"));
        System.out.println(check("Gasc123@qq.com"));
        System.out.println(check("G_asc@qq.com"));
        System.out.println(check("Gasc_123@qq.com"));
    }

    private static boolean check(String email) {
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
        return false;
        // if(host.startsWith(".") || host.endsWith(".")){
        // return false;
        // }
    }
}
