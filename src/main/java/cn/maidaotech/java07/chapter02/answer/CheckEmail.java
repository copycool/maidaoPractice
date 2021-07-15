package cn.maidaotech.java07.chapter02.answer;

public class CheckEmail {
    static boolean hasUpper;
    static boolean hasLower;
    static boolean hasNumer;
    static boolean hasUnderLine;

    // 只能由字母、数字、下划线组成；
    // 只能以字母开头
    // 至少包含大写字母、小写字母、数字、下划线中的三种
    public static void main(String[] args) {
        System.out.println(check("123456"));
        System.out.println(check("123@456"));
        System.out.println(check("a34@56"));
        System.out.println(check("a123@456."));
        System.out.println(check("a2A_45@6"));
        System.out.println(check("a23Aa@456c.77"));

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
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (i == 0 && !StringUtils.isAlpha(c)) {
                return false;
            }
            if (!StringUtils.isAlphaNumberUnderLine(c)) {
                return false;
            }
            if (StringUtils.isUpperCase(c)) {
                hasUpper = true;
            }
            if (StringUtils.isLowerCase(c)) {
                hasLower = true;
            }
            if (StringUtils.isNumber(c)) {
                hasNumer = true;
            }
            if (StringUtils.isUnderLine(c)) {
                hasUnderLine = true;
            }

        }
        int sum = 0;
        if (hasUpper) {
            sum++;
        }
        if (hasLower) {
            sum++;
        }
        if (hasNumer) {
            sum++;
        }
        if (hasUnderLine) {
            sum++;
        }
        if (sum < 3) {
            return false;
        }
        return true;
    }

    private static boolean checkHost(String host) {
        int index = host.indexOf(".");
        // 判断点在中间
        if (index > 0 && index < host.length() - 1) {
            return true;
        }
        return false;
        // if(host.indexOf(".")==-1){
        // return false;
        // }
        // if(host.startsWith(".")||host.endsWith(".")){
        // return false;
        // }
    }
}
