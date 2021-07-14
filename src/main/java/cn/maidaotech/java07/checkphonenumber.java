package cn.maidaotech.java07;

import java.util.Scanner;

import ch.qos.logback.core.joran.conditional.ElseAction;

public class checkphonenumber{

    public static void main(String[] args) {
        System.out.println("请输入手机号");
        Scanner input=new Scanner(System.in);
        String phone=input.next();
         
       String check="^1[3,5,6,7,8]\\d{9}$";
       Boolean p=phone.matches(check);
       if (p){
        System.out.println(phone+"手机号正确");}
   else
      {    System.out.println(phone+"手机号不正确");
    
}

        
            
        
        
    }
    
}