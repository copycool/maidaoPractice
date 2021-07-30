package cn.maidaotech.java07;

import java.util.Scanner;

import ch.qos.logback.core.joran.conditional.ElseAction;

public class checkphonenumber {

    // public static void main(String[] args) {
    // System.out.println("请输入手机号");
    // Scanner input=new Scanner(System.in);
    // String phone=input.next();

    // String check="^1[3,5,6,7,8]\\d{9}$";
    // Boolean p=phone.matches(check);
    // if (p){
    // System.out.println(phone+"手机号正确");}
    // else
    // { System.out.println(phone+"手机号不正确");

public static class CheckPhoneNumber {
    private static boolean checkPhoneNumber(final String number){
        if (number.length() != 11) {
            return false;
        }
        for (int i = 0; i < number.length(); i++) {
            final char c = number .charAt(i);
            if (i == 0 && c != '1') {
                return false;
            }
            if (i == 1 && !checkSecondChar(c) ) {
                return false;
            }
            
        }
        return true;
    }
    private static boolean checkSecondChar(final char c){
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
   
        public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        final String phoneNumber = sc.nextLine();
       
        if (checkPhoneNumber(phoneNumber)) {
            System.out.println("手机号："+phoneNumber+"合法");
        }else{
            System.out.println("手机号："+phoneNumber+"不合法");
        }
    }
  

}
}