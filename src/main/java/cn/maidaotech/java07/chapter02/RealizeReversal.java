package cn.maidaotech.java07.chapter02;

public class RealizeReversal {
    //写一个方法，实现字符串的反转，如：输入abcd，输出dcba
    public static void main(String[] args) {
        String[] str = {"a","b","c","d","e"};
    
        for (int i = str.length-1; i >= 0; i--) {
            System.out.println(str[i]);
        }
    }
    
}