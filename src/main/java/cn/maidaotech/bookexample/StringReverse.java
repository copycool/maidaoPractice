package cn.maidaotech.bookexample;

//import java.util.ArrayList;
import java.util.Scanner;

public class StringReverse {
    // 字符串反转
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuffer strreverse = new StringBuffer(str);
        str = strreverse.reverse().toString();
        System.out.println(str);
        //注释部分为老方法，非注释部分为调用stringbuffer实现反转
        // char[] strlist= str.toCharArray();
        // for (int i = str.length()-1; i >= 0; i--) {
        // System.out.print(strlist[i]);
        // }
        scanner.close();
    }
}