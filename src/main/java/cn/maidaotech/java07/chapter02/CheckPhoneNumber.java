package cn.maidaotech.java07.chapter02;

import java.util.Scanner;

public class CheckPhoneNumber {
    private static boolean checkPhoneNumber(String number){
        if (number.length() != 11) {
            return false;
        }
        for (int i = 0; i < number.length(); i++) {
            char c = number .charAt(i);
            if (i == 0 && c != '1') {
                return false;
            }
            if (i == 1 && !checkSecondChar(c) ) {
                return false;
            }
            
        }
        return true;
    }
    private static boolean checkSecondChar(char c){
       switch (c) {
           case '3':
           case '5':
           case '6':
           case '7':
           case '8':
           case '9':
            return true;
           default:
            return false;
       }
        
    } 
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("请输入手机号：");
        // String phoneNumber = sc.nextLine();
       
        if (checkPhoneNumber("13545678999")) {
            System.out.println("手机号："+"13545678999"+"合法");
        }else{
            System.out.println("手机号："+"13545678999"+"不合法");
        }
        
    }
}
