package cn.maidaotech.java07.syncaddlock.chapter08;

import java.io.*;

public class Test03 implements AutoCloseable {


    public static void main(String[] args) {
//        copyByTWR("hello.txt","hello4.txt");
        copyFile("hello.txt","hello5.txt");
    }

    public static void copyByTWR(String srcPath, String destPath){
        try(FileInputStream fis = new FileInputStream(srcPath);
            FileOutputStream fos = new FileOutputStream(destPath)){
            byte[] byt = new byte[1024 * 1024];
            int len = 0; while ((len = fis.read(byt)) != -1) {
                fos.write(byt, 0, len);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void copyFile(String srcPath, String destPath){
        // 打开输入流，输出流
        try {
            FileInputStream fis = new FileInputStream(srcPath);
            FileOutputStream fos = new FileOutputStream(destPath);
            // 使用缓冲流
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int len = 0;
            while ((len = bis.read()) != -1){
                bos.write(len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws Exception {

    }

    /**
     * 1. 时间: 8.835s
     * 2.时间: 9.489s
     * 3.
     */
}
