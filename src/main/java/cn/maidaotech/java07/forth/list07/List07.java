package cn.maidaotech.java07.forth.list07;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 从控制台输入一段英文，将其中的单词按照字母排序后打印输出。
public class List07 {
    public static void main(String[] args) {
        String str1="the early bord catches the worm";
        String[] str=str1.split(" ");
        List<String> list= Arrays.asList(str);
        Collections.sort(list);
        System.out.println(list);
    }
}
