package com.example.demo.two;

import com.example.demo.StringUntil;

public class IdNumber {
    public static void main(String[] args) {
        System.out.println(checkNum("411323199806100051"));
    }
    private static boolean checkNum(String idNumber){
        
        for(int index = 0;index <= 16;index++){
        char c = idNumber.charAt(index);
        if (idNumber == null||idNumber.length() != 18) {
            return false;
        }
        if (!StringUntil.isNumber(c)) {
            return false;
        }
        if (idNumber.charAt(6) != 1 ||idNumber.charAt(6) != 2) {
            return false;
        }
        if (idNumber.charAt(7) != 9 ||idNumber.charAt(7) != 0) {
            return false;   
        }
        if (idNumber.charAt(10)!= 0 ||idNumber.charAt(10) != 1 ) {
            return false;   
        }
        if (idNumber.charAt(10)==0 && idNumber.charAt(11) != 0) {
            
        }
        if (idNumber.charAt(10) == 1 && idNumber.charAt(11) >2) {
            return false;   
        }
        
      
        if (idNumber.charAt(17) != 'X'|| !StringUntil.isNumber(idNumber.charAt(17))) {
            return false;   
        }
        
        } return true;   
    }
}