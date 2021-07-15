package cn.maidaotech.bookexample;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        scanner.close();
        String emailaddress = "^[A-Za-z]{1}@+.$";
        
        if(email.matches(emailaddress)){
            System.out.println("输入的邮箱无误");
        }else{
            System.out.println("输入的邮箱有误！");
        }
    }
}