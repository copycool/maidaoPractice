package cn.maidaotech.java07.chapter02;

import cn.maidaotech.java07.utitls.StringUnitls;

/**
 * 要求 验证邮箱是否符合规则; name@host: 满足以下规则; name只能由字母、数字、下划线组成; 只能以字母开头;
 * 至少包含大写字母、小写字母、数字、下划线中的三种 ; host中必须包含字符“.”，且“.”不能在host部分的两头;
 */
public class CheckEmail {
    private static boolean checkEmail(String email) {
        if (email.equals(null) || email.indexOf("@") == -1) {
            return false;
        }
        String[] parts = email.split("@");// 从@分割name和host
        if (checkPartOne(parts[0]) && checkPartTwo(parts[1])) {
            return true;
        }
        return false;
    }

    // 检查name
    private static boolean checkPartOne(String part) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasLine = false;
        char[] partOneChar = separateString(part);
        for (int i = 0; i < partOneChar.length; i++) {
            if (i == 0 && !StringUnitls.isAlpha(partOneChar[i])) {
                return false;
            }
            if (!StringUnitls.isAlphaNumberUnderline(partOneChar[i])) {
                return false;
            }
            if (hasLine || partOneChar[i] == '_') {
                hasLine = true;
            }
            if (hasLower || StringUnitls.isLowerCase(partOneChar[i])) {
                hasLower = true;
            }
            if (hasNumber || StringUnitls.isNumber(partOneChar[i])) {
                hasNumber = true;
            }
            if (hasUpper || StringUnitls.isUpperCase(partOneChar[i])) {
                hasUpper = true;
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

    // 检查host
    private static boolean checkPartTwo(String part) {
        int index = part.indexOf(".");
        if (index == -1) {
            return false;
        }
        if (part.startsWith(".") || part.endsWith(".")) {
        return false;
        }
        return true;
    }
   /** 
    *int index = host.indexOf(".");
    *index > 0 && index < host.length() - 1
    *上述判断条件在判断‘qq.com.’时会时index提前赋值为2导致不能检测最后一位是‘.’
    */ 
    private static char[] separateString(String str) {
        char[] character = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            character[i] = str.charAt(i);
        }
        return character;
    }

    public static void main(String[] args) {
        
        System.out.println(checkEmail("G_asc@qq.com"));
        System.out.println(checkEmail("Asc@qq.com"));
        System.out.println(checkEmail("Asc1@qq.com"));
        System.out.println(checkEmail("a_sc1@qq.com"));
        System.out.println(checkEmail("a_sc1@qq.com."));
    }
}
