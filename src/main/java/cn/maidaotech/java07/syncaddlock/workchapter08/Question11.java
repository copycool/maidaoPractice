package cn.maidaotech.java07.syncaddlock.workchapter08;

import java.io.*;

public class Question11 {

    public static void main(String[] args) throws IOException {
        //必须保证根目录下存在 hello.txt 文件
//        copyFile("hello.txt","hello6.txt");
        copyFile2("hello.txt","hello8.txt");

    }


    //拷贝

    /**
     * 字节流实现方式
     * @param origin
     * @param target
     * @throws IOException
     */
    public static void copyFile(String origin,String target) throws IOException {

        //获取文件的流
        FileInputStream fis = new FileInputStream(origin);
        //缓冲区
        BufferedInputStream bis = new BufferedInputStream(fis);

        //写入文件的流
        FileOutputStream fos = new FileOutputStream(target);
        //缓冲区
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] buffer = new byte[100];
        int len = 0;

        //拷贝文件
        while ((len = bis.read(buffer)) != -1){
            bos.write(buffer,0,buffer.length);
            bos.flush();
        }

        bos.close();
        fos.close();
        bis.close();
        fis.close();

        System.out.println("拷贝完成");
    }


    /**
     * 字符流
     * @param origin
     * @param target
     * @throws IOException
     */
    public static void copyFile2(String origin,String target) throws IOException {
        //获取文件字节流
        FileInputStream fis = new FileInputStream(origin);
        //转换为字符流
        InputStreamReader isr = new InputStreamReader(fis);
        //打开缓冲区
        BufferedReader br = new BufferedReader(isr);

        int len = 0;

        //输出文件
        FileOutputStream fos = new FileOutputStream(target);
        //转换为字符流
        OutputStreamWriter osp = new OutputStreamWriter(fos);
        //打开缓冲区
        BufferedWriter bw = new BufferedWriter(osp);

        while ((len = br.read()) != -1){
            bw.write(len);
            bw.flush();
        }

        br.close();
        isr.close();
        fis.close();
        bw.close();
        osp.close();
        fos.close();
    }


}