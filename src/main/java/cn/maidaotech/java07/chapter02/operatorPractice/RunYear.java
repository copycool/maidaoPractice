package cn.maidaotech.java07.chapter02.operatorPractice;

import java.util.Scanner;

public class RunYear {
    public static void main(String[] args) {
            Scanner a = new Scanner(System.in);
            int i = a.nextInt();
            a.close();
            if (i%4==0||i%400==0){
                System.out.println(i+"是闰年");
            }else {
                System.out.println(i+"不是闰年");
            }

        
    }
}
