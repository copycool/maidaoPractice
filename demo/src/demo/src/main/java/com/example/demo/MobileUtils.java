package com.example.demo;

public class MobileUtils {

    public static void main(String[] args) {
        System.out.println(check("1371321323"));
    }

    public static boolean check(String mobile){
        if(mobile == null){
            return false;
        }
        if(mobile.charAt(0)!='1'){
            return false;
        }
        if(mobile.length() !=11){
            return false;
        }
        if(mobile.charAt(1)!='3'){
            return false;
        }
        if(mobile.charAt(1)!='5'){
            return false;
        }
        if(mobile.charAt(1)!='6'){
            return false;
        }
        if(mobile.charAt(1)!='7'){
            return false;
        }
        if(mobile.charAt(1)!='8'){
            return false;
        }
        if(mobile.charAt(1)!='9'){
            return false;
        }
      
        return true;
    }
}