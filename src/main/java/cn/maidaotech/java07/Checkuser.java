package cn.maidaotech.java07;

import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.zip.Checksum;

public class Checkuser {
public static void main(String[] args) {
    System.out.println("请输入用户名");
    Scanner input=new Scanner(System.in);
    String checkuser=input.next();
        if(checkuser.length() >= 8 && checkuser.length() <=20){
            String check="[A-Z][A-Za-z0-9]*";
            boolean u=checkuser.matches(check);
            System.out.println(checkuser+"当前用户名合法");
            }else
            {
            System.out.println(checkuser+"当前用户名不合法");



            

        }
    }
    
}

    
