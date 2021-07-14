package cn.maidaotech.java07;
//
import java.util.Scanner;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder  sb = new StringBuilder("abcd");
        System.out.println(sb.reverse().toString());
        StringBuilder build = new StringBuilder();
        String str =build.append("迈道").append("科技").toString();
        System.out.println(str);//迈道科技

        //编写程序，将“I follow Bill Gate Tome Gate John Gate”中的“Gate”全部替换为“Gates”
        String build1= new String("I follow Bill Gate Tome Gate John Gate");
        System.out.println("没有替换前是 ："+build1);
        System.out.println("替换后是： "+build1.replace("Gate","Gates"));

        

    }
    
}