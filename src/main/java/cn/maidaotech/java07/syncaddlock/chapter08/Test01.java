package cn.maidaotech.java07.syncaddlock.chapter08;

import java.io.FileInputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
//        showContent("hello.txt");
//          showContent2("hello.txt");
        showContent3("hello.txt");
    }

    public static  void showContent(String path) throws IOException {
        //打开流
        FileInputStream fis = new FileInputStream(path);
        int len;

        while ((len = fis.read()) != -1){
            System.out.println(len);
        }
        //关闭流
        fis.close();
    }

    public static void showContent2(String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        byte[] buffer = new byte[1024];

        int len  = fis.read(buffer);

        for (int i = 0; i < len; i++) {
            System.out.println(buffer[i]);
        }

        //关闭流
        fis.close();
    }
    private static void showContent3(String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        byte[] byt = new byte[1024];
        int len = 0;
        while ((len = fis.read(byt)) != -1) {
            System.out.println(new String(byt, 0, len));
        }
        fis.close();
    }
}