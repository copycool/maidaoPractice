package cn.maidaotech.java07.chapter04;

import java.util.Arrays;
import java.util.Scanner;

//从控制台输入一段英文，将其中的单词
//按照字母排序后打印输出
public class LetterRank {
    public static void main(String[] args) {
        System.out.println("请输入您要排序的一段英文：");
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println("字母排序后为");
        for(int i=0; i<chars.length; i++){
            System.out.print(chars[i]+"——");
        }
    }   
}