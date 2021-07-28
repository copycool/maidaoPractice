package cn.maidaotech.java07.syncaddlock.chapter08.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test  {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("hello.txt");
        pw.println("飞雪连天射白鹿");
        pw.println("金庸小说我都爱看");
        System.out.println("写出完毕！");
        pw.close();
//        BufferedWriter br = new BufferedWriter(pw);

    }
}