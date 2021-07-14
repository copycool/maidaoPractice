package cn.maidaotech.java07;
/*
从键盘输入学生学号，例如2019年01期12号，输入20190112，
使用“/”和“%”运算符分解学号获得年份、期数和序号，并分别输出。
*/
import java.util.Scanner;

public class StudentNumberTest {
    public static void main(String[] args) {
        System.out.println("请输入学号： ");
        Scanner scanner = new Scanner(System.in);
        String sca = scanner.next();
        //String str = "123456";
        //Integer ii = new Integer(str);
        //int i2 = ii.intValue();
        int a=Integer.parseInt(sca);//String强转为int

        System.out.println(a/10000+"年"+"0"+(a- a/10000*10000)/100 
        +"期"+(a- a/10000*10000)%100+"号");

    }
}