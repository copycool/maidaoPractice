package cn.maidaotech.java07;

import java.util.Scanner;


public class CheckId {
    public static final String rule = "^[1-9]\\d{5}(19|20)\\d{2}((0[1-9])|10|11|12)(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入身份证号码用于校验:");
        String id_card=input.next();
        boolean check= checkID(id_card);
        System.out.println("您输入的身份证号码:"+id_card+"为"+check);
    }


    private static boolean checkID(String id) {
        boolean phone=id.matches(rule);
        if (phone) {
        return true;
        }
        
        return false;

    }

}