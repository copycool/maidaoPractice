package cn.maidaotech.java07.chapter02.stringPractice;

import java.util.Scanner;

public class TestUsername {
    public static void main(String[] args) {
        int i = judgeUsername("Abfd12312");
        if (i ==0){
            System.out.println("不合法");
        }
        if (i ==1){
            System.out.println("合法");
        }
    }

    private static int judgeUsername(String username) {

        if (username.length() >= 8 && username.length() <= 20){
            if (username.charAt(0)>= 'A' &&username.charAt(0) <= 'Z'){
                    if (username.contains(username)) {

                        return 1;
                    } else {
                        System.out.println("用户名包含非数字或者字母！");
                    }
            }else {
                System.out.println("首字母没有大写！");
            }

        }else {
            System.out.println("用户名小于8或者大于20");
        }

        return 0;
    }


}
