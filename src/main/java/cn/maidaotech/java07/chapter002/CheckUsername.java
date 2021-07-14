package cn.maidaotech.java07.chapter002;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
长度8到20个字符
只能英文字母、数字
必须以大写字母开头
*/
public class CheckUsername {
    private static boolean CheckUsername(String username) {
        Pattern Username_Pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-zA-Z])(.{8,20})$");
        Matcher matcher = Username_Pattern.matcher(username);
        Pattern firstPattern = Pattern.compile("[A-Z]*");
        Matcher isBiger = firstPattern.matcher(username.charAt(0)+"");
        if (matcher.matches() && isBiger.matches()) {
            return true;
        }
        return false;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("请输入用户名：");
       String username = sc.nextLine();
       if (CheckUsername(username)) {
           System.out.println("用户名和法");
       }else{
        System.out.println("用户名不合法");
       }
       
    }
}

