package cn.maidaotech.java07.work.chapter08.question14;

public class Test {
    public static void main(String[] args) {
        createImageDownloadThread ("https://www.sohu.com/a/478393753_100142761?scm=1007.88.0.0.0&_f=index_pagefocus_1&spm=smpc.content.fspic.2.1627466277681ioFULyq", "F:\\d");
    }

    //创建并执行线程，获取图片
    private static void createImageDownloadThread(String url, String path)
    {
        new Thread(new DownloadPictures(url, path)).start();
    }

}
