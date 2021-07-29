package cn.maidaotech.java07.chapter07.practice07;

public class Test {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            Thread thr = new Thread(new CreateThread());
            thr.start();
        }
    }
    
}