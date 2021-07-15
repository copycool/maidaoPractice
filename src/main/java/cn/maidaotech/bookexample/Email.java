package cn.maidaotech.bookexample;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        scanner.close();
        String emailaddress = "^[1][3|5|6|7|8|9]{1}[0-9]{9}$";
        
        if(email.matches(emailaddress)){
            System.out.println("输入的邮箱无误");
        }else{
            System.out.println("输入的邮箱有误！");
        }
    }
}