package cn.maidaotech.java07.work;

/**
 * 校验邮箱是否符合规则 i. 只能由字母、数字、下划线组成； ii. 只能以字母开头 iii. 至少包含大写字母、小写字母、数字、下划线中的三种
 * b.host 中必须包含字符“.”，且“.”不能在 host 部分的两头
 */
public class CheckEmail {
    public static boolean check(String email) {
        if (email == null) {
            return false;
        }
        if (Character.isDigit(email.charAt(0))) {
            return false;
        }

        email.endsWith("@qq.com");
        return true;
    }
}

class s {
    public static void main(String[] args) {
        String s = "s2";
        System.out.println(s.toLowerCase());
        System.out.println(Character.isDigit(s.charAt(0)));
    }
}