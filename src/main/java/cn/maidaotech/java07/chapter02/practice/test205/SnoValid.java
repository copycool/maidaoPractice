package cn.maidaotech.java07.chapter02.practice.test205;

public class SnoValid {
    public static void valid(int sno) {
        int year = sno / 10000;
        System.out.println("入學年份：  " + year);
        
        int periodicalNum = sno % 10000 / 100;
        System.out.println("期数：  " + periodicalNum);

        int order = sno % 100;
        System.out.println("序号：  " + order);
    }
}