package cn.maidaotech.java07.syncaddlock.chapter08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
//        writeTxtFile("hello.txt");
        copyFile2("hello.txt","F:\\hello3.txt");
    }

    public static void writeTxtFile(String path) throws IOException {
        FileOutputStream fos = new FileOutputStream(path,true);
        byte[] buffer = "java".getBytes();
        fos.write(buffer);
        fos.close();
    }

    //拷贝
    public static void copyFile(String srcPath, String destPath) throws IOException {
        FileOutputStream fos = new FileOutputStream(destPath);
        FileInputStream fis = new FileInputStream(srcPath);

        //读取写入信息
        int len  = 0;
        //使用字节数组做缓存
        byte[] buffer = new byte[1024];
        while ((len = fis.read(buffer)) != -1){
            fos.write(buffer,0,len);
        }
        fos.close();
        fis.close();
    }

    //拷贝
    public static void copyFile2(String srcPath, String destPath)  {
        FileOutputStream fos = null;
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(srcPath);
            fos = new FileOutputStream(destPath);
            //读取写入信息
            int len  = 0;
            //使用字节数组做缓存
            byte[] buffer = new byte[1024];
            while ((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
