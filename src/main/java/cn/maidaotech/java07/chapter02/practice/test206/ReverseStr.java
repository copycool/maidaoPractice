package cn.maidaotech.java07.chapter02.practice.test206;

public class ReverseStr {
    public static String reverse(String str){
        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString();
    }
    
}