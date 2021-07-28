package cn.maidaotech.java07.syncaddlock.workchapter08;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Question12 {
    public static void main(String[] args) throws IOException {
        System.out.println(countStr("hello2.txt", "asdfghj"));
    }


    public static int countStr(String filePath,String subStr) throws IOException {
        
        //获取文件字节流
        FileInputStream fis = new FileInputStream(filePath);
        //打开缓冲区
        BufferedInputStream bis = new BufferedInputStream(fis);
        
        int len = 0;
        StringBuilder stringBuilder = new StringBuilder();
        
        while ((len = bis.read()) != -1){
            stringBuilder.append((char) len);
        }

        String str = stringBuilder.toString();

        return count(str,subStr);
    }


    public static int count(String str,String subStr){
        int count = 0;
        for (int i = 0; i < str.length()+1-subStr.length(); i++) {
            if (str.substring(i,subStr.length()+i).equals(subStr)){
                count++;
            }
        }
        return count;
    }
}
