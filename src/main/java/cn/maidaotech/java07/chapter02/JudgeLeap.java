package cn.maidaotech.java07.chapter02;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class JudgeLeap {
    //判断某一年是否为闰年。
    //普通年能被4整除且不能被100整除的为闰年。（如2004年就是闰年，1900年不是闰年）
    //世纪年能被400整除的是闰年。（如2000年是闰年，1900年不是闰年）
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year+"为普通闰年");
        }else if(year % 400 == 0){
            System.out.println(year+"为世纪闰年");
        }else{
            System.out.println(year+"不是闰年");
        }
    }
    
}