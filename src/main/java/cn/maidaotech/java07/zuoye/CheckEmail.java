package cn.maidaotech.java07.zuoye;

import java.nio.file.WatchEvent.Kind;

/*验证邮箱是否符合规则：name@host，满足一下规则：
 a. name 
i. 只能由字母、数字、下划线组成；
ii. 只能以字母开头 
iii. 至少包含大写字母、小写字母、数字、下划线中的三种
 b. host 中必须包含字符“.”，
且“.”不能在 host 部分的两头 */

public class CheckEmail {
public static void main(String[] args) {
    System.out.println(check("asdasnja@host.c"));
    System.out.println(check("Aasdasnja@host.c"));
    System.out.println(check("as22nja@host.c"));
    System.out.println(check("Aasd22nja@host.c"));
    System.out.println(check("Aasd_snja@host.c"));
}
    private static boolean check(String email) {
        // 判断是否为空
        if (email == null || email.length() == 0) {
            return false;
        } // 截取字符串
        String[] parts = email.split("@");
        if (parts.length != 2 || StringUtils.isEmpty(parts[0]) || StringUtils.isEmpty(parts[1])) {
            return false;
        }
        // 判断name部分和host部分是否符合规则
        if (!checkName(parts[0]) || !checkName(parts[1])) {
            return false;
        }
        return true;
    }

    private static boolean checkName(String name) {
        boolean hasUpper = false;
        boolean haslower = false;
        boolean hasNumber = false;
        boolean hasLine = false;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            // 检查是为首字母开头
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
                haslower = true;
            }
            if (StringUtils.isNumber(c)) {
                hasNumber = true;
            }
            if (StringUtils.isline(c)) {
                hasLine = true;
            }
            return true;
        }
        int Kind = 0;
        if (hasLine) {
            Kind++;
        }
        if (hasNumber) {
            Kind++;
        }
        if (hasUpper) {
            Kind++;
        }
        if (haslower) {
            Kind++;
        }
        if(Kind<3){
            return false;
        }
        return true;
    }

    public static boolean cheeckHost(String host) {
        int index = host.indexOf(".");
        /*
         * 第一位和最后一位不能是. host.length()-1即为最后一位
         */
        if (index > 0 && index < host.length() - 1) {
            /* if (host.indexOf(".") == -1) { */
            return true;

        }
        // if (host.startsWith(".") || host.startsWith(".")) {
        return false;
    }

}
