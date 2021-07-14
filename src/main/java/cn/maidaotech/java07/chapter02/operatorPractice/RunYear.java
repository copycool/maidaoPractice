package cn.maidaotech.java07.chapter02.operatorPractice;

import java.util.Scanner;

public class RunYear {
    public static void main(String[] args) {
        for (int j = 0; j < 10; j++) {
            Scanner a = new Scanner(System.in);
            int i = a.nextInt();
            if (i%4==0){
                System.out.println(i+"是闰年");
            }else {
                System.out.println(i+"不是闰年");
            }

        }
    }
}
