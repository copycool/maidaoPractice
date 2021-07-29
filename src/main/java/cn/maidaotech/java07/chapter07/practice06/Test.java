package cn.maidaotech.java07.chapter07.practice06;

public class Test {
    public static void main(String[] args) {
        for(int i = 1;i <= 5;i ++){
            Thread thread = new Thread(new ThreadDemo(),"thread" +  i);
            thread.start();
        }
    }   
}