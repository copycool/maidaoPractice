package cn.maidaotech.java07.chapter02.comprehensive;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CheckEmail {
    // 验证邮箱是否符合规则：name@host，满足一下规则：
    // name
    // 只能由字母、数字、下划线组成；
    // 只能以字母开头
    // 至少包含大写字母、小写字母、数字、下划线中的三种
    // host中必须包含字符“.”，且“.”不能在host部分的两头

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int jg1 = checkName(str);
        int jg2 = checkAte(str);
        int jg3 = checkHost(str);
        if (jg1 == 1 && jg2 == 3 && jg3 == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scan.close();
    }

    public static int checkName(String str1) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z' || str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z'
                    || str1.charAt(i) >= '0' && str1.charAt(i) <= '9' || str1.charAt(i) == '_' || str1.charAt(i) == '@'
                    || str1.charAt(i) == '.') {
                count = 1;
            } else {
                count = 2;
                break;
            }
        }
        return count;
    }

    public static int checkAte(String str1) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == '@') {
                count = 1;
            }
        }
        while (count == 1) {
            int i = str1.indexOf('@');
            if (((str1.charAt(i - 1) >= 'a' && str1.charAt(i - 1) <= 'z')
                    || (str1.charAt(i - 1) >= 'A' && str1.charAt(i - 1) <= 'Z')
                    || (str1.charAt(i - 1) >= '0' && str1.charAt(i - 1) <= '9'))
                    && ((str1.charAt(i + 1) >= 'a' && str1.charAt(i + 1) <= 'z')
                            || (str1.charAt(i + 1) >= 'A' && str1.charAt(i + 1) <= 'Z')
                            || (str1.charAt(i + 1) >= '0' && str1.charAt(i + 1) <= '9'))) {
                count = 3;
            } else {
                count = 2;
            }
        }
        return count;
    }

    public static int checkHost(String str1) {
        int count = 0;
        if (str1.charAt(str1.length() - 4) == '.' && str1.charAt(str1.length() - 3) == 'c'
                && str1.charAt(str1.length() - 2) == 'o' && str1.charAt(str1.length() - 1) == 'm') {
            count = 1;
        } else {
            count = 2;
        }
        return count;
    }
}