package cn.maidaotech.java07;

import java.util.Scanner;

public class PhoneNumberTest {
    
    
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入手机号码： ");
        String number = sca.next();
        char c = number.charAt(0);
        char d =number.charAt(1);
        if(c=='1' && (d=='3'|| d=='5' || d=='6' || d=='7' || d=='8' || d=='9')){
            System.out.println("输入正确");
            System.out.println("您的手机号码是："+number);
        }else{
            System.out.println("输入错误");
        }

    }
    

}