package cn.maidaotech.java07.chapter02.practice.test205;

public class LeepYear {
    public static Boolean valid(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 40 == 0 && year % 100 != 0)
            return true;
        return false;
    }
}