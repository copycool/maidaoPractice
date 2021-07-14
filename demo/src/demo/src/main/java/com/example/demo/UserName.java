package com.example.demo;

import javax.swing.Spring;

import org.apache.tomcat.util.buf.Ascii;

public class UserName {
    public static void main(String[] args) {
     
        System.out.println(check("zhangsan1234"));
        System.out.println(check("zhangsa*n1234"));
    }
    public static boolean check(String userName){
        if (userName == null) {
            return false;
            
        }
        if (userName.length() <8) {
            return false;
        }
        if (userName.length() >11) {
            return false;
        }

        for (int i = 0; i < userName.length(); i++) {
            char c = userName.charAt(i);
            if(i==0 && !isAlpha(c)){
                return false;
            }
            if(!isAlpahNumber(c)){
                return false;
            }
        }
        return true;

    }

    private static boolean isAlpha(char c){

    }

    private static boolean isAlpahNumber(char c){

    }
}