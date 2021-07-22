package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// // 从控制台输入一段英文，将其中的单词按照字母排序后打印输出
public class EnglishLetter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一段英文：");
        String target = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (String temp : target.split(" ")) {
            list.add(temp);
        }
        Collections.sort(list);
        for (String temp : list) {
            System.out.println(temp + "");
        }
       scanner.close();

    }

}