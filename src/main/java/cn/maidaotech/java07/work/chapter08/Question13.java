package cn.maidaotech.java07.work.chapter08;


import java.io.File;

public class Question13 {
    public static void main(String[] args) {
        File file = new File("F:\\aasofts\\erlang\\doc");
        getAllFile(file);
    }

    //定义一个方法。参数传递file类型的目录，方法中对目标进行遍历
    public static void getAllFile(File dir){
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file:files) {
            if (file.isDirectory()){   //file.isDirectory()判断一个文件是不是目录
                //f是一个文件夹，则继续遍历这个文件夹
                //我们发现getAllFile方法就是传递文件夹，遍历文件夹的方法
                getAllFile(file);
            }else {
                System.out.println(file);
            }
        }
    }
}
