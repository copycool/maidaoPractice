package cn.maidaotech.java07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class IdentityUtils {
    /*必须以数字1至9开头
    出生年份只能是19**或20**年的数组
    出生月份只能是01至12月的数字
    出生日两位数字只能是01至31的数字
    15到17位可以是任意数字
    第18位必须是是数字0-9和字母‘X’
    */
    //正则表达式
   
    private static final Pattern IDENTITY_CHECKER = 
    Pattern.compile("^[1-9]\\d{5}(19|20)\\d{2}(0[1-9]|10|11|12)(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]");
    public static void main(String[] args) {
        System.out.println(checkIdentity("41022419870616263X"));
        System.out.println(checkIdentity("410224198706162639"));
    }
    public static boolean checkIdentity(String s){
        if(s==null || s.length() != 18){
            return false;
        }
        Matcher matcher = IDENTITY_CHECKER.matcher(s);
        if(!matcher.matches()){//matches:整个匹配，只有整个字符序列完全匹配成功，才返回True，
            //否则返回False。但如果前部分匹配成功，将移动下次匹配的位置。
            return false;
        }
        int[] w ={7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1};
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch  = s.charAt(i);
            int num = (ch == 'x' || ch == 'X') ? 10 : Integer.parseInt(String.valueOf(ch));
            sum+=num*w[i];
        }
        if(sum % 11 !=1){
            return false;
        }
        return true;





    }

}